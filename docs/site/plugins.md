## maven-code-quality-pom

-----

  - Last Published: 2017-11-10|
  - Version: 0.0.1-SNAPSHOT

<!-- end list -->

  - Code Quality Reports
  - [Unit Tests](surefire-report.md "Unit Tests")
      - [Code Coverage
        (JaCoCo)](jacoco/index.md "Code Coverage (JaCoCo)")
      - [Results (Surefire)](surefire-report.md "Results (Surefire)")
      - [Unit Test
        Javadocs](testapidocs/index.md "Unit Test Javadocs")
      - [Unit Test Source
        Code](xref-test/index.md "Unit Test Source Code")
  - [Coding Standards](checkstyle.md "Coding Standards")
      - [Checkstyle](checkstyle.md "Checkstyle")
      - [CPD](cpd.md "CPD")
      - [FindBugs](findbugs.md "FindBugs")
      - [JDepend](jdepend-report.md "JDepend")
      - [PMD](pmd.md "PMD")
  - [Dependencies](dependency-updates-report.md "Dependencies")
  - [Security Vulnerabilities](codenarc.md "Security Vulnerabilities")
  - [Source Code](xref/index.md "Source Code")
      - [Java](xref/index.md "Java")
      - [Javadocs](apidocs/index.md "Javadocs")
  - Contributions
  - [Change Log](changelog.md "Change Log")
  - [Contributors](dev-activity.md "Contributors")
  - [Commits/Changes](file-activity.md "Commits/Changes")
  - Project Documentation
  - [Project Information](project-info.md "Project Information")
      - [About](index.md "About")
      - [CI Management](integration.md "CI Management")
      - [Dependencies](dependencies.md "Dependencies")
      - [Dependency
        Convergence](dependency-convergence.md "Dependency Convergence")
      - [Dependency
        Information](dependency-info.md "Dependency Information")
      - [Issue Management](issue-tracking.md "Issue Management")
      - [Licenses](license.md "Licenses")
      - [Plugin Management](plugin-management.md "Plugin Management")
      - [Plugins](#)
      - [Team](team-list.md "Team")
      - [Source Code
        Management](source-repository.md "Source Code Management")
      - [Summary](project-summary.md "Summary")
  - [Project Reports](project-reports.md "Project Reports")

-----

[![Built by
Maven](./images/logos/maven-feather.png)](http://maven.apache.org/ "Built by Maven")

## Project Build Plugins

| GroupId                  | ArtifactId                                                                                                 | Version       |
| ------------------------ | ---------------------------------------------------------------------------------------------------------- | ------------- |
| com.versioneye           | [versioneye-maven-plugin](https://github.com/versioneye/versioneye_maven_plugin)                           | 3.11.4        |
| org.apache.maven.plugins | [maven-changelog-plugin](http://maven.apache.org/plugins/maven-changelog-plugin/)                          | 2.3           |
| org.apache.maven.plugins | [maven-checkstyle-plugin](http://maven.apache.org/plugins/maven-checkstyle-plugin/)                        | 2.17          |
| org.apache.maven.plugins | [maven-clean-plugin](http://maven.apache.org/plugins/maven-clean-plugin/)                                  | 2.5           |
| org.apache.maven.plugins | [maven-compiler-plugin](http://maven.apache.org/plugins/maven-compiler-plugin/)                            | 3.1           |
| org.apache.maven.plugins | [maven-dependency-plugin](http://maven.apache.org/plugins/maven-dependency-plugin/)                        | 2.10          |
| org.apache.maven.plugins | [maven-deploy-plugin](http://maven.apache.org/plugins/maven-deploy-plugin/)                                | 2.7           |
| org.apache.maven.plugins | [maven-enforcer-plugin](http://maven.apache.org/enforcer/maven-enforcer-plugin/)                           | 3.0.0-M1      |
| org.apache.maven.plugins | [maven-install-plugin](http://maven.apache.org/plugins/maven-install-plugin/)                              | 2.5.2         |
| org.apache.maven.plugins | [maven-jar-plugin](http://maven.apache.org/plugins/maven-jar-plugin/)                                      | 2.4           |
| org.apache.maven.plugins | [maven-javadoc-plugin](https://maven.apache.org/plugins/maven-javadoc-plugin/)                             | 3.0.0-M1      |
| org.apache.maven.plugins | [maven-pmd-plugin](https://maven.apache.org/plugins/maven-pmd-plugin/)                                     | 3.8           |
| org.apache.maven.plugins | [maven-project-info-reports-plugin](http://maven.apache.org/plugins/maven-project-info-reports-plugin/)    | 2.9           |
| org.apache.maven.plugins | [maven-resources-plugin](http://maven.apache.org/plugins/maven-resources-plugin/)                          | 2.6           |
| org.apache.maven.plugins | [maven-site-plugin](https://maven.apache.org/plugins/maven-site-plugin/)                                   | 3.6           |
| org.apache.maven.plugins | [maven-surefire-plugin](http://maven.apache.org/surefire/maven-surefire-plugin/)                           | 2.19.1        |
| org.basepom.maven        | [duplicate-finder-maven-plugin](https://github.com/basepom/duplicate-finder-maven-plugin)                  | 1.2.1         |
| org.codehaus.mojo        | [codenarc-maven-plugin](http://mojo.codehaus.org/codenarc-maven-plugin)                                    | 0.22-1        |
| org.codehaus.mojo        | [exec-maven-plugin](http://www.mojohaus.org/exec-maven-plugin)                                             | 1.6.0         |
| org.codehaus.mojo        | [findbugs-maven-plugin](http://gleclaire.github.io/findbugs-maven-plugin/)                                 | 3.0.4         |
| org.codehaus.mojo        | [license-maven-plugin](http://www.mojohaus.org/license-maven-plugin)                                       | 1.14          |
| org.codehaus.mojo        | [versions-maven-plugin](http://www.mojohaus.org/versions-maven-plugin/)                                    | 2.5           |
| org.codehaus.plexus      | [plexus-component-metadata](http://codehaus-plexus.github.io/plexus-containers/plexus-component-metadata/) | 1.7.1         |
| org.eluder.coveralls     | [coveralls-maven-plugin](https://github.com/trautonen/coveralls-maven-plugin)                              | 4.3.0         |
| org.jacoco               | http://jacoco-maven-plugin                                                                                 | 0.7.9         |
| org.springframework.boot | [spring-boot-maven-plugin](http://projects.spring.io/spring-boot/)                                         | 1.5.4.RELEASE |

## Project Report Plugins

| GroupId                  | ArtifactId                                                                                                 | Version  |
| ------------------------ | ---------------------------------------------------------------------------------------------------------- | -------- |
| org.apache.maven.plugins | [maven-changelog-plugin](http://maven.apache.org/plugins/maven-changelog-plugin/)                          | 2.3      |
| org.apache.maven.plugins | [maven-checkstyle-plugin](http://maven.apache.org/plugins/maven-checkstyle-plugin/)                        | 2.17     |
| org.apache.maven.plugins | [maven-dependency-plugin](http://maven.apache.org/plugins/maven-dependency-plugin/)                        | 2.10     |
| org.apache.maven.plugins | [maven-enforcer-plugin](http://maven.apache.org/enforcer/maven-enforcer-plugin/)                           | 3.0.0-M1 |
| org.apache.maven.plugins | [maven-javadoc-plugin](https://maven.apache.org/plugins/maven-javadoc-plugin/)                             | 3.0.0-M1 |
| org.apache.maven.plugins | [maven-jxr-plugin](http://maven.apache.org/jxr/maven-jxr-plugin/)                                          | 2.5      |
| org.apache.maven.plugins | [maven-plugin-plugin](http://maven.apache.org/plugin-tools/maven-plugin-plugin)                            | 3.5      |
| org.apache.maven.plugins | [maven-pmd-plugin](https://maven.apache.org/plugins/maven-pmd-plugin/)                                     | 3.8      |
| org.apache.maven.plugins | [maven-project-info-reports-plugin](http://maven.apache.org/plugins/maven-project-info-reports-plugin/)    | 2.9      |
| org.apache.maven.plugins | [maven-surefire-report-plugin](http://maven.apache.org/surefire/maven-surefire-report-plugin/)             | 2.19.1   |
| org.basepom.maven        | [duplicate-finder-maven-plugin](https://github.com/basepom/duplicate-finder-maven-plugin)                  | 1.2.1    |
| org.codehaus.mojo        | [codenarc-maven-plugin](http://mojo.codehaus.org/codenarc-maven-plugin)                                    | 0.22-1   |
| org.codehaus.mojo        | [findbugs-maven-plugin](http://gleclaire.github.io/findbugs-maven-plugin/)                                 | 3.0.4    |
| org.codehaus.mojo        | [jdepend-maven-plugin](http://mojo.codehaus.org/jdepend-maven-plugin)                                      | 2.0      |
| org.codehaus.mojo        | [license-maven-plugin](http://www.mojohaus.org/license-maven-plugin)                                       | 1.14     |
| org.codehaus.mojo        | [versions-maven-plugin](http://www.mojohaus.org/versions-maven-plugin/)                                    | 2.5      |
| org.codehaus.plexus      | [plexus-component-metadata](http://codehaus-plexus.github.io/plexus-containers/plexus-component-metadata/) | 1.7.1    |
| org.jacoco               | http://jacoco-maven-plugin                                                                                 | 0.7.9    |
| org.owasp                | [dependency-check-maven](https://github.com/jeremylong/DependencyCheck.git/dependency-check-maven)         | 3.0.1    |

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
