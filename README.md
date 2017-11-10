# `maven-code-quality-pom`

[![Greenkeeper badge](https://badges.greenkeeper.io/gregswindle/maven-code-quality-pom.svg)](https://greenkeeper.io/)
> Enforce and report code quality with JUnit, JaCoCo, Hamcrest, FindBugs, PMD, CodeNarc, Checkstyle (Google), Enforcer, Duplicate-Finder, JDepend, and more with this Maven POM.

[![License][license-badge-image]][license-url]
[![Third-party licenses][fossa-shield-badge]][fossa-shield-url]
[![Synk Vulnerabilities][snyk-vulnerabilities-badge-image]][snyk-vulnerabilities-url]
[![Build Status][travis-image]][travis-url]
[![Coveralls Status][coveralls-image]][coveralls-url]<br>
[![Dependency Status][dependencyci-badge-image]][dependencyci-url]
[![Dependency Status][depstat-image]][depstat-url]
[![DevDependency Status][depstat-dev-image]][depstat-dev-url]

## Table of contents
<!-- ⛔️ AUTO-GENERATED-CONTENT:START (TOC:excludeText=Table of contents) -->
- [1. Overview](#1-overview)
- [2. Prerequisite software](#2-prerequisite-software)
- [3. Installation](#3-installation)
- [4. Configuration](#4-configuration)
- [5. Usage](#5-usage)
  * [5.1. Generate site files](#51-generate-site-files)
  * [5.2. Launch the site on a Jetty web server](#52-launch-the-site-on-a-jetty-web-server)
  * [5.3. Export reports to SonarCloud.io](#53-export-reports-to-sonarcloudio)
  * [5.4. Run quality checks](#54-run-quality-checks)
    + [5.4.1. `mvn enforcer:display-info`](#541-mvn-enforcerdisplay-info)
    + [5.4.2. `mvn enforcer:display-info`](#542-mvn-enforcerdisplay-info)
    + [5.4.3. `mvn site`](#543-mvn-site)
    + [5.4.4. `mvn checkstyle:check`](#544-mvn-checkstylecheck)
    + [5.4.5. `mvn duplicate-finder:check`](#545-mvn-duplicate-findercheck)
    + [5.4.6. `mvn findbugs:check`](#546-mvn-findbugscheck)
    + [5.4.7. `mvn pmd:check`](#547-mvn-pmdcheck)
    + [5.4.8. `mvn pmd:cpd-check`](#548-mvn-pmdcpd-check)
- [6. Security](#6-security)
- [7. Semantic version and `CHANGELOG`](#7-semantic-version-and-changelog)
- [8. Contributing to `maven-code-quality-pom`](#8-contributing-to-maven-code-quality-pom)
- [9. License](#9-license)
<!-- ⛔️ AUTO-GENERATED-CONTENT:END -->


## 1. Overview

Enforce and report code quality with:

  1. **Checkstyle** with Google Java coding standards ([`maven-checkstyle-plugin`](http://maven.apache.org/plugins/maven-checkstyle-plugin/))
  1. **CodeNarc** ([`codenarc-maven-plugin`](http://mojo.codehaus.org/codenarc-maven-plugin))
  1. **Duplicate-Finder** ([`duplicate-finder-maven-plugin`](https://github.com/basepom/duplicate-finder-maven-plugin))
  1. **Enforcer** ([`maven-enforcer-plugin`](http://maven.apache.org/enforcer/maven-enforcer-plugin/))
  1. **FindBugs** ([`findbugs-maven-plugin`](http://gleclaire.github.io/findbugs-maven-plugin/))
  1. **Hamcrest** ([`hamcrest-junit`](https://github.com/hamcrest/hamcrest-junit))
  1. **JDepend** ([`jdepend-maven-plugin`](http://mojo.codehaus.org/jdepend-maven-plugin))
  1. **JUnit** ([`junit5`](http://junit.org/junit5/) with [`junit4`](http://junit.org/junit4/) backwards compatibility)
  1. **JaCoCo** ([`jacoco-maven-plugin`](http://www.eclemma.org/jacoco/trunk/doc/maven.html))
  1. **PMD** ([`maven-pmd-plugin`](https://maven.apache.org/plugins/maven-pmd-plugin/))
  1. **Report site** generation ([`maven-site-plugin`](https://maven.apache.org/plugins/maven-site-plugin/))

and more with this Maven POM.

---

The **purpose of the project** is to use the Maven Site Plugin to:

  1. Use the Maven Site Plugin to generate meaningful test and quality reporting artifacts
  2. Enforce test coverage thresholds and code standards
  3. Prevent source code that does not conform to standards from being merged into `master`.

## 2. Prerequisite software

[![Java logo](./docs/img/icon-java-logo.png)][java-jdk-dl-url]
[![Maven logo](./docs/img/icon-maven-logo.png)][maven-url]
[![Node.js logo](./docs/img/icons8/icon-nodejs-96.png)][nodejs-url]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
[![npm logo][npm-logo]][npmjs-url]

`maven-code-quality-pom` is written in Java, which must be installed prior to use. `maven-code-quality-pom` manages Java dependencies with Maven and NPM for JavaScript dependencies.

 1. **Java<sup>:tm:</sup> EE 8 SDK:** Either
    * [`oracle64-1.8.x1`][java-jdk-dl-url] or
    * [`openjdk:8-jdk-alpine`](https://github.com/docker-library/openjdk/blob/b4f29ba829765552239bd18f272fcdaf09eca259/8-jdk/alpine/Dockerfile)

 1. [**Maven**][maven-dl-url]
 1. [**Node.js**][nodejs-url], which includes the [node package manager (**npm**)][npmjs-url].


## 3. Installation
> :bulb: If you're working on macOS, we recommend installing or updating software with [Homebrew](https://brew.sh/).

  1. Fork or clone this repository.

  ```bash
  $ git clone https://github.com/gregswindle/maven-code-quality-pom.git
  $ cd maven-code-quality-pom
  ```

  1. Install with Maven:

  ```bash
  $ mvn clean install -DskipTests=true -Dmaven.javadocs.skip=true -B -V
  ```

  1. Install Node.js dependencies:

  ```bash
  $ npm install
  ```

## 4. Configuration

TBD.

## 5. Usage

### 5.1. Generate site files

To build the Maven reports site, open a Terminal and run:

```bash
$ mvn site
```

Then open `maven-code-quality-pom/target/site/index.html` in a Web browser.

### 5.2. Launch the site on a Jetty web server

Open a Terminal and run:

```bash
$ mvn site:run
```

Then open http://localhost:8080 in a browser.

### 5.3. Export reports to SonarCloud.io
[![SonarCloud logo][sonar-cloud-icon]][sonar-cloud-url]

> **Before you connect to SonarCloud, you need:**
>
>  * An active account on https://sonarcloud.io
>  * To set the `ENVIRONMENT` variable `$SONAR_TOKEN`
>
> [See "Using SonarCloud with Travis CI"](https://docs.travis-ci.com/user/sonarcloud) for details.

Open a Terminal and run:

```bash
$ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install sonar:sonar
```

> [View reports on SonarCloud](https://sonarcloud.io/dashboard?id=gregswindle-github).

### 5.4. Run quality checks

  * #### 5.4.1. `mvn enforcer:display-info`

    > Executes the defined enforcer-rules once per module.


  * #### 5.4.2. `mvn enforcer:display-info`

    > Displays the current platform information

  * #### 5.4.3. `mvn site`

    > Generates the site for a single project.

  * #### 5.4.4. `mvn checkstyle:check`

    > Performs Checkstyle analysis and outputs violations or a count of violations to the console, potentially failing the build.

  * #### 5.4.5. `mvn duplicate-finder:check`

    > Finds duplicate classes/resources on the classpath.


  * #### 5.4.6. `mvn findbugs:check`

    > Identify defect (bug) patterns in your Java source code.

  * #### 5.4.7. `mvn pmd:check`

    > Fail the build if there were any PMD violations in the source code.


  * #### 5.4.8. `mvn pmd:cpd-check`

    > Fail the build if there were any CPD violations in the source code.


## 6. Security

_Highlight important security issues/concerns in this section._

## 7. Semantic version and `CHANGELOG`

The latest version of `maven-code-quality-pom` is `0.0.1-SNAPSHOT`. View the [`CHANGELOG`][changelog-url] for details.

## 8. Contributing to `maven-code-quality-pom`
> [![Learn how to make a Pull Request with free training][prs-welcome-badge-image]][prs-welcome-url]
>
> We welcome contributors with [Pull Requests][prs-welcome-url]!

**[Read Contributing to `maven-code-quality-pom` to get started.][contributing-url]**

Contributions in the form of GitHub pull requests are welcome. Before embarking on a significant change, please adhere to the following guidelines:

  1. Read the [Code of Conduct][code-of-conduct-url].
  1. Create an issue to discuss the proposed change and ensure that it is likely to be merged:
      * [Report a defect][issues-new-defect-url] (aka "bug")
      * [Request a new feature][issues-new-feat-url]
  1. Follow [Contributing to `maven-code-quality-pom`][contributing-url]'s coding conventions and Git workflow if you're willing and able to program (or want to learn how).

## 9. License

[MIT][license-url] © [Greg Swindle][author-url].

[![FOSSA Status][fossa-large-badge]][fossa-large-url]


<!-- ⛔️ 📝 NOTE: PLEASE ALPHABETIZE LINK REFERENCES. 📝 ⛔️ -->

[author-url]: https://github.com/gregswindle
[changelog-url]: ./CHANGELOG.md
[code-of-conduct-url]: ./CODE_OF_CONDUCT.md
[contributing-url]: ./CONTRIBUTING.md
[coveralls-image]: https://img.shields.io/coveralls/gregswindle/maven-code-quality-pom/master.svg?style=flat-square
[coveralls-url]: https://coveralls.io/r/gregswindle/maven-code-quality-pom
[dependencyci-badge-image]: https://dependencyci.com/github/gregswindle/maven-code-quality-pom/badge
[dependencyci-url]: https://dependencyci.com/github/gregswindle/maven-code-quality-pom
[depstat-dev-image]: https://david-dm.org/gregswindle/maven-code-quality-pom/dev-status.svg?style=flat-square
[depstat-dev-url]: https://david-dm.org/gregswindle/maven-code-quality-pom#info=devDependencies
[depstat-image]: https://david-dm.org/gregswindle/maven-code-quality-pom.svg?style=flat-square
[depstat-url]: https://david-dm.org/gregswindle/maven-code-quality-pom
[fossa-large-badge]: https://app.fossa.io/api/projects/git%2Bgithub.com%2Fgregswindle%2Fmaven-code-quality-pom.svg?type=large
[fossa-large-url]: https://app.fossa.io/projects/git%2Bgithub.com%2Fgregswindle%2Fmaven-code-quality-pom?ref=badge_large
[fossa-shield-badge]: https://app.fossa.io/api/projects/git%2Bgithub.com%2Fgregswindle%2Fmaven-code-quality-pom.svg?type=shield
[fossa-shield-url]: https://app.fossa.io/api/projects/git%2Bgithub.com%2Fgregswindle%2Fmaven-code-quality-pom.svg?type=shield
[issues-new-defect-url]: /gregswindle/maven-code-quality-pom.git/issues/new?title=fix%28affected-scope%29%3A+subject-line-with-very-few-words&labels=Priority%3A+Medium%2CStatus%3A+Review+Needed%2CType%3A+Defect&body=%2A%2A%F0%9F%92%A1+TIP%3A%2A%2A+Select+the+%E2%86%96%EF%B8%8E%E2%8E%BE+Preview+%E2%8F%8B+Tab+above+help+read+these+instructions.%0D%0A%0D%0A%23%23+1.+Issue+type%0D%0A%3E%E2%8C%A6+Type+the+letter+%22x%22+in+the+%22checkbox%22+the+best+describe+this+issue.%0D%0A%0D%0A-+%5Bx%5D+__Feature%3A__+I%27m+requesting+a+product+enhancement.%0D%0A%0D%0A%23%23+2.+User+story+summary%0D%0A%3E%E2%8C%A6+Describe+what+you+want+to+accomplish%2C+in+what+role%2Fcapacity%2C+and+why+it%27s+important+to+you.%0D%0A%0D%0A%3E+__EXAMPLE%3A__%0D%0A%3E+As+a+Applicant%2C%0D%0A%3E+I+want+to+submit+my+resume%0D%0A%3E+In+order+to+be+considered+for+a+job+opening.%0D%0A%0D%0AAs+a+%7Brole%7D%2C%0D%0AI+must%2Fneed%2Fwant%2Fshould+%7Bdo+something%7D%0D%0AIn+order+to+%7Bachieve+value%7D.%0D%0A%0D%0A%23%23+3.+Acceptance+criteria%0D%0A%3E%E2%8C%A6+Replace+the+examples+below+with+your+own+imperative%2C+%22true%2Ffalse%22+statements+for+the+__behavior+you+expect__+to+see%2C+or+the+behavior+that+__would__+be+true+if+there+were+no+errors+%28for+defects%29.%0D%0A%0D%0A-+%5B+%5D+1.+Job+Applicants+receive+a+confirmation+email+after+they+submit+their+resumes.%0D%0A-+%5B+%5D+2.+An+Applicant%27s+resume+information+isn%27t+lost+when+errors+occur.%0D%0A-+%5B+%5D+3.+%7Bcriterion-three%7D%0D%0A-+%5B+%5D+4.+%7Bcriterion-four%7D%0D%0A%0D%0A%3C%21--+%E2%9B%94%EF%B8%8F++Do+not+remove+anything+below+this+comment.+%E2%9B%94%EF%B8%8F++--%3E%0D%0A%5Bicon-info-image%5D%3A+..%2Fdocs%2Fimg%2Ficons8%2Ficon-info-50.png%0D%0A
[issues-new-feat-url]: /gregswindle/maven-code-quality-pom.git/issues/new?title=feat%28affected-scope%29%3A+subject-line-with-very-few-words&labels=Priority%3A+Medium%2CStatus%3A+Review+Needed%2CType%3A+Feature&body=%2A%2A%F0%9F%92%A1+TIP%3A%2A%2A+Select+the+%E2%86%96%EF%B8%8E%E2%8E%BE+Preview+%E2%8F%8B+Tab+above+help+read+these+instructions.%0D%0A%0D%0A%23%23+1.+Issue+type%0D%0A%3E%E2%8C%A6+Type+the+letter+%22x%22+in+the+%22checkbox%22+the+best+describe+this+issue.%0D%0A%0D%0A-+%5Bx%5D+__Feature%3A__+I%27m+requesting+a+product+enhancement.%0D%0A%0D%0A%23%23+2.+User+story+summary%0D%0A%3E%E2%8C%A6+Describe+what+you+want+to+accomplish%2C+in+what+role%2Fcapacity%2C+and+why+it%27s+important+to+you.%0D%0A%0D%0A%3E+__EXAMPLE%3A__%0D%0A%3E+As+a+Applicant%2C%0D%0A%3E+I+want+to+submit+my+resume%0D%0A%3E+In+order+to+be+considered+for+a+job+opening.%0D%0A%0D%0AAs+a+%7Brole%7D%2C%0D%0AI+must%2Fneed%2Fwant%2Fshould+%7Bdo+something%7D%0D%0AIn+order+to+%7Bachieve+value%7D.%0D%0A%0D%0A%23%23+3.+Acceptance+criteria%0D%0A%3E%E2%8C%A6+Replace+the+examples+below+with+your+own+imperative%2C+%22true%2Ffalse%22+statements+for+the+__behavior+you+expect__+to+see%2C+or+the+behavior+that+__would__+be+true+if+there+were+no+errors+%28for+defects%29.%0D%0A%0D%0A-+%5B+%5D+1.+Job+Applicants+receive+a+confirmation+email+after+they+submit+their+resumes.%0D%0A-+%5B+%5D+2.+An+Applicant%27s+resume+information+isn%27t+lost+when+errors+occur.%0D%0A-+%5B+%5D+3.+%7Bcriterion-three%7D%0D%0A-+%5B+%5D+4.+%7Bcriterion-four%7D%0D%0A%0D%0A%3C%21--+%E2%9B%94%EF%B8%8F++Do+not+remove+anything+below+this+comment.+%E2%9B%94%EF%B8%8F++--%3E%0D%0A%5Bicon-info-image%5D%3A+..%2Fdocs%2Fimg%2Ficons8%2Ficon-info-50.png%0D%0A
[java-jdk-dl-url]: http://www.oracle.com/technetwork/java/javaee/downloads/index.html
[license-badge-image]: https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square
[license-choose-url]: https://choosealicense.com/
[license-no-license-url]: https://choosealicense.com/no-license/
[license-unlicense-url]: https://choosealicense.com/licenses/#unlicense
[license-url]: ./LICENSE
[maven-url]: https://maven.apache.org/
[maven-dl-url]: http://maven.apache.org/download.cgi
[nodejs-url]: https://nodejs.org
[npmjs-url]: https://www.npmjs.com/
[npm-logo]: ./docs/img/icons8/icon-npm-100.png
[prs-welcome-badge-image]: https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square
[prs-welcome-url]: http://makeapullrequest.com
[snyk-vulnerabilities-badge-image]: https://snyk.io/test/github/gregswindle/maven-code-quality-pom/badge.svg?style=flat-square
[snyk-vulnerabilities-url]: https://snyk.io/test/github/gregswindle/maven-code-quality-pom
[sonar-cloud-icon]: ./docs/img/logo-sonar-cloud.png
[sonar-cloud-url]: https://sonarcloud.io/dashboard?id=gregswindle-github
[travis-image]: https://img.shields.io/travis/gregswindle/maven-code-quality-pom/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/gregswindle/maven-code-quality-pom
[versioneye-badge-image]: https://www.versioneye.com/user/projects/5a012f2f2de28c58f8c7a10f/badge.svg?style=flat-square
[versioneye-url]: https://www.versioneye.com/user/projects/5a012f2f2de28c58f8c7a10f
