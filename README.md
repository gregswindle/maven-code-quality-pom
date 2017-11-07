# `spring-qa-dependencies`
> A spike Spring solution for providing Maven POMs with quality assurance features.

[![License][license-badge-image]][license-url]
[![Synk Vulnerabilities][snyk-vulnerabilities-badge-image]][snyk-vulnerabilities-url]
[![Build Status][travis-image]][travis-url]
[![Coveralls Status][coveralls-image]][coveralls-url]
[![Dependency Status][versioneye-badge-image]][versioneye-url]
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
  * [5.4. Goals for Apache Maven Site Plugin 3.6](#54-goals-for-apache-maven-site-plugin-36)
- [6. Security](#6-security)
- [7. Semantic version and `CHANGELOG`](#7-semantic-version-and-changelog)
- [8. Contributing to `spring-qa-dependencies`](#8-contributing-to-spring-qa-dependencies)
- [9. License](#9-license)
<!-- ⛔️ AUTO-GENERATED-CONTENT:END -->


## 1. Overview

The purpose of the project is to use the Maven Site Plugin to:

  1. Use the Maven Site Plugin to generate meaningful test and quality reporting artifacts
  2. Enforce test coverage thresholds and code standards
  3. Prevent source code that does not conform to standards from being merged into `master`.

## 2. Prerequisite software

`spring-qa-dependencies` is written in Java, which must be installed prior to use. `spring-qa-dependencies` manages Java dependencies with Maven and NPM for JavaScript dependencies.

 1. **Java<sup>:tm:</sup> EE 8 SDK:** Either
    * [`oracle64-1.8.0.121`](http://www.oracle.com/technetwork/java/javaee/downloads/index.html) or
    * [`openjdk:8-jdk-alpine`](https://github.com/docker-library/openjdk/blob/b4f29ba829765552239bd18f272fcdaf09eca259/8-jdk/alpine/Dockerfile)

 1. [**Maven**](http://maven.apache.org/)
 1. [**Node.js**](https://nodejs.org/en/) (which includes the node package manager (npm))


## 3. Installation
> :bulb: If you're working on macOS, we recommend installing or updating software with [Homebrew](https://brew.sh/).

  1. Fork or clone this repository.

  ```bash
  $ git clone https://github.com/gregswindle/spring-qa-dependencies.git
  $ cd spring-qa-dependencies
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

Then open `spring-qa-dependencies/target/site/index.html` in a Web browser.

### 5.2. Launch the site on a Jetty web server

Open a Terminal and run:

```bash
$ mvn site:run
```

Then open http://localhost:8080 in a browser.

### 5.3. Export reports to SonarCloud.io
> :warning: You need
>
>  * An active account on https://sonarcloud.io
>  * To set the `ENVIRONMENT` variable `$SONAR_TOKEN`
>
> [See "Using SonarCloud with Travis CI"](https://docs.travis-ci.com/user/sonarcloud) for details.

Open a Terminal and run:

```bash
$ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install sonar:sonar
```

### 5.4. Goals for Apache Maven Site Plugin 3.6
> :bulb: You can output these goals from a Terminal by running
>
> `mvn site:help`

This plugin has 9 goals:

1. **`site:attach-descriptor`**

    Adds the site descriptor (`site.xml`) to the list of files to be
    installed/deployed.

    For Maven-2.x this is enabled by default only when the project has pom
    packaging since it will be used by modules inheriting, but this can be enabled
    for other projects packaging if needed.

    This default execution has been removed from the built-in lifecycle of Maven
    3.x for pom-projects. Users that actually use those projects to provide a
    common site descriptor for sub modules will need to explicitly define this
    goal execution to restore the intended behavior.

2. **`site:deploy`**

    Deploys the generated site using wagon supported protocols to the site URL
    specified in the `<distributionManagement>` section of the POM.
    For `scp` protocol, the website files are packaged by wagon into zip archive,
    then the archive is transferred to the remote host, next it is un-archived
    which is much faster than making a file by file copy.

3. **`site:effective-site`**

    Displays the effective site descriptor as an XML for this build, after
    inheritance and interpolation of `site.xml`, for the first locale.

4. **`site:help`**

    Display help information on maven-site-plugin.
    Call `mvn site:help -Ddetail=true -Dgoal=<goal-name>` to display parameter
    details.

5. **`site:jar`**

    Bundles the site output into a JAR so that it can be deployed to a repository.

6. **`site:run`**

    Starts the site up, rendering documents as requested for faster editing. It uses Jetty as the web server.

7. **`site:site`**

    Generates the site for a single project.

    Note that links between module sites in a multi module build will not work,
    since local build directory structure doesn't match deployed site.

8. **`site:stage`**

    Deploys the generated site to a local staging or mock directory based on the
    site URL specified in the `<distributionManagement>` section of the POM.
    It can be used to test that links between module sites in a multi-module build
    work.

    This goal requires the site to already have been generated using the site
    goal, such as by calling `mvn site`.

9. **`site:stage-deploy`**

    Deploys the generated site to a staging or mock URL to the site URL specified
    in the `<distributionManagement>` section of the POM, using wagon supported
    protocols.

## 6. Security

_Highlight important security issues/concerns in this section._

## 7. Semantic version and `CHANGELOG`

The latest version of `spring-qa-dependencies` is `0.0.1-SNAPSHOT`. View the [`CHANGELOG`][changelog-url] for details.

## 8. Contributing to `spring-qa-dependencies`
> [![Learn how to make a Pull Request with free training][prs-welcome-badge-image]][prs-welcome-url]
>
> We welcome contributors with [Pull Requests][prs-welcome-url]!

**[Read Contributing to `spring-qa-dependencies` to get started.][contributing-url]**

Contributions in the form of GitHub pull requests are welcome. Before embarking on a significant change, please adhere to the following guidelines:

  1. Read the [Code of Conduct][code-of-conduct-url].
  1. Create an issue to discuss the proposed change and ensure that it is likely to be merged:
      * [Report a defect][issues-new-defect-url] (aka "bug")
      * [Request a new feature][issues-new-feat-url]
  1. Follow [Contributing to `spring-qa-dependencies`][contributing-url]'s coding conventions and Git workflow if you're willing and able to program (or want to learn how).

## 9. License

[MIT][license-url] © [Greg Swindle][author-url].


<!-- ⛔️ 📝 NOTE: PLEASE ALPHABETIZE LINK REFERENCES. 📝 ⛔️ -->

[author-url]: https://github.com/gregswindle
[changelog-url]: ./CHANGELOG.md
[code-of-conduct-url]: ./CODE_OF_CONDUCT.md
[contributing-url]: ./CONTRIBUTING.md
[coveralls-image]: https://img.shields.io/coveralls/gregswindle/spring-qa-dependencies/master.svg?style=flat-square
[coveralls-url]: https://coveralls.io/r/gregswindle/spring-qa-dependencies
[depstat-dev-image]: https://david-dm.org/gregswindle/spring-qa-dependencies/dev-status.svg?style=flat-square
[depstat-dev-url]: https://david-dm.org/gregswindle/spring-qa-dependencies#info=devDependencies
[depstat-image]: https://david-dm.org/gregswindle/spring-qa-dependencies.svg?style=flat-square
[depstat-url]: https://david-dm.org/gregswindle/spring-qa-dependencies
[issues-new-defect-url]: /gregswindle/spring-qa-dependencies.git/issues/new?title=fix%28affected-scope%29%3A+subject-line-with-very-few-words&labels=Priority%3A+Medium%2CStatus%3A+Review+Needed%2CType%3A+Defect&body=%2A%2A%F0%9F%92%A1+TIP%3A%2A%2A+Select+the+%E2%86%96%EF%B8%8E%E2%8E%BE+Preview+%E2%8F%8B+Tab+above+help+read+these+instructions.%0D%0A%0D%0A%23%23+1.+Issue+type%0D%0A%3E%E2%8C%A6+Type+the+letter+%22x%22+in+the+%22checkbox%22+the+best+describe+this+issue.%0D%0A%0D%0A-+%5Bx%5D+__Feature%3A__+I%27m+requesting+a+product+enhancement.%0D%0A%0D%0A%23%23+2.+User+story+summary%0D%0A%3E%E2%8C%A6+Describe+what+you+want+to+accomplish%2C+in+what+role%2Fcapacity%2C+and+why+it%27s+important+to+you.%0D%0A%0D%0A%3E+__EXAMPLE%3A__%0D%0A%3E+As+a+Applicant%2C%0D%0A%3E+I+want+to+submit+my+resume%0D%0A%3E+In+order+to+be+considered+for+a+job+opening.%0D%0A%0D%0AAs+a+%7Brole%7D%2C%0D%0AI+must%2Fneed%2Fwant%2Fshould+%7Bdo+something%7D%0D%0AIn+order+to+%7Bachieve+value%7D.%0D%0A%0D%0A%23%23+3.+Acceptance+criteria%0D%0A%3E%E2%8C%A6+Replace+the+examples+below+with+your+own+imperative%2C+%22true%2Ffalse%22+statements+for+the+__behavior+you+expect__+to+see%2C+or+the+behavior+that+__would__+be+true+if+there+were+no+errors+%28for+defects%29.%0D%0A%0D%0A-+%5B+%5D+1.+Job+Applicants+receive+a+confirmation+email+after+they+submit+their+resumes.%0D%0A-+%5B+%5D+2.+An+Applicant%27s+resume+information+isn%27t+lost+when+errors+occur.%0D%0A-+%5B+%5D+3.+%7Bcriterion-three%7D%0D%0A-+%5B+%5D+4.+%7Bcriterion-four%7D%0D%0A%0D%0A%3C%21--+%E2%9B%94%EF%B8%8F++Do+not+remove+anything+below+this+comment.+%E2%9B%94%EF%B8%8F++--%3E%0D%0A%5Bicon-info-image%5D%3A+..%2Fdocs%2Fimg%2Ficons8%2Ficon-info-50.png%0D%0A
[issues-new-feat-url]: /gregswindle/spring-qa-dependencies.git/issues/new?title=feat%28affected-scope%29%3A+subject-line-with-very-few-words&labels=Priority%3A+Medium%2CStatus%3A+Review+Needed%2CType%3A+Feature&body=%2A%2A%F0%9F%92%A1+TIP%3A%2A%2A+Select+the+%E2%86%96%EF%B8%8E%E2%8E%BE+Preview+%E2%8F%8B+Tab+above+help+read+these+instructions.%0D%0A%0D%0A%23%23+1.+Issue+type%0D%0A%3E%E2%8C%A6+Type+the+letter+%22x%22+in+the+%22checkbox%22+the+best+describe+this+issue.%0D%0A%0D%0A-+%5Bx%5D+__Feature%3A__+I%27m+requesting+a+product+enhancement.%0D%0A%0D%0A%23%23+2.+User+story+summary%0D%0A%3E%E2%8C%A6+Describe+what+you+want+to+accomplish%2C+in+what+role%2Fcapacity%2C+and+why+it%27s+important+to+you.%0D%0A%0D%0A%3E+__EXAMPLE%3A__%0D%0A%3E+As+a+Applicant%2C%0D%0A%3E+I+want+to+submit+my+resume%0D%0A%3E+In+order+to+be+considered+for+a+job+opening.%0D%0A%0D%0AAs+a+%7Brole%7D%2C%0D%0AI+must%2Fneed%2Fwant%2Fshould+%7Bdo+something%7D%0D%0AIn+order+to+%7Bachieve+value%7D.%0D%0A%0D%0A%23%23+3.+Acceptance+criteria%0D%0A%3E%E2%8C%A6+Replace+the+examples+below+with+your+own+imperative%2C+%22true%2Ffalse%22+statements+for+the+__behavior+you+expect__+to+see%2C+or+the+behavior+that+__would__+be+true+if+there+were+no+errors+%28for+defects%29.%0D%0A%0D%0A-+%5B+%5D+1.+Job+Applicants+receive+a+confirmation+email+after+they+submit+their+resumes.%0D%0A-+%5B+%5D+2.+An+Applicant%27s+resume+information+isn%27t+lost+when+errors+occur.%0D%0A-+%5B+%5D+3.+%7Bcriterion-three%7D%0D%0A-+%5B+%5D+4.+%7Bcriterion-four%7D%0D%0A%0D%0A%3C%21--+%E2%9B%94%EF%B8%8F++Do+not+remove+anything+below+this+comment.+%E2%9B%94%EF%B8%8F++--%3E%0D%0A%5Bicon-info-image%5D%3A+..%2Fdocs%2Fimg%2Ficons8%2Ficon-info-50.png%0D%0A
[license-badge-image]: https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square
[license-choose-url]: https://choosealicense.com/
[license-no-license-url]: https://choosealicense.com/no-license/
[license-unlicense-url]: https://choosealicense.com/licenses/#unlicense
[license-url]: ./LICENSE
[license-url]: ./LICENSE
[nodejs-url]: https://nodejs.org
[npmjs-url]: https://www.npmjs.com/
[prs-welcome-badge-image]: https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square
[prs-welcome-url]: http://makeapullrequest.com
[travis-image]: https://img.shields.io/travis/gregswindle/spring-qa-dependencies/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/gregswindle/spring-qa-dependencies
[snyk-vulnerabilities-badge-image]: https://snyk.io/test/github/gregswindle/spring-qa-dependencies/badge.svg?style=flat-square
[snyk-vulnerabilities-url]: https://snyk.io/test/github/gregswindle/spring-qa-dependencies
[versioneye-badge-image]: https://www.versioneye.com/user/projects/5a012f2f2de28c58f8c7a10f/badge.svg?style=flat-square
[versioneye-url]: https://www.versioneye.com/user/projects/5a012f2f2de28c58f8c7a10f
