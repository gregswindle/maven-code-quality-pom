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
      - [About](#)
      - [CI Management](integration.md "CI Management")
      - [Dependencies](dependencies.md "Dependencies")
      - [Dependency
        Convergence](dependency-convergence.md "Dependency Convergence")
      - [Dependency
        Information](dependency-info.md "Dependency Information")
      - [Issue Management](issue-tracking.md "Issue Management")
      - [Licenses](license.md "Licenses")
      - [Plugin Management](plugin-management.md "Plugin Management")
      - [Plugins](plugins.md "Plugins")
      - [Team](team-list.md "Team")
      - [Source Code
        Management](source-repository.md "Source Code Management")
      - [Summary](project-summary.md "Summary")
  - [Project Reports](project-reports.md "Project Reports")

-----

[![Built by
Maven](./images/logos/maven-feather.png)](http://maven.apache.org/ "Built by Maven")

## About maven-code-quality-pom

Code quality enforcement and reporting

**Enforce and report code quality with JUnit, JaCoCo, Hamcrest,
FindBugs, PMD, CodeNarc, Checkstyle (Google), Enforcer,
Duplicate-Finder, JDepend, and more with this Maven POM.**

`maven-code-quality-pom` is a spike Spring solution for providing Maven
POMs with quality assurance features.

### Purpose

The purpose of the project is to use the Maven Site Plugin to:

1.  Use the Maven Site Plugin to generate meaningful test and quality
    reporting artifacts
2.  Enforce test coverage thresholds and code standards
3.  Prevent source code that does not conform to standards from being
    merged into `master`.

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
