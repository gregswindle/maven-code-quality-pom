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
  - [Project Reports](project-reports.md "Project Reports")
      - [Surefire Report](surefire-report.md "Surefire Report")
      - [JaCoCo](jacoco/index.md "JaCoCo")
      - [JaCoCo
        Aggregate](jacoco-aggregate/index.md "JaCoCo Aggregate")
      - [CodeNarc
        Report](codenarc.md "CodeNarc Report")
      - [FindBugs](findbugs.md "FindBugs")
      - [Checkstyle](checkstyle.md "Checkstyle")
      - [CPD](cpd.md "CPD")
      - [PMD](pmd.md "PMD")
      - [JDepend](jdepend-report.md "JDepend")
      - [dependency-check](dependency-check-report.md "dependency-check")
      - [Dependency Analysis](#)
      - [Dependency Updates
        Report](dependency-updates-report.md "Dependency Updates Report")
      - [Plugin Updates
        Report](plugin-updates-report.md "Plugin Updates Report")
      - [Property Updates
        Report](property-updates-report.md "Property Updates Report")
      - [Source Xref](xref/index.md "Source Xref")
      - [Test Source Xref](xref-test/index.md "Test Source Xref")
      - [Javadoc](apidocs/index.md "Javadoc")
      - [Test Javadoc](testapidocs/index.md "Test Javadoc")
      - [Change Log](changelog.md "Change Log")
      - [File Activity](file-activity.md "File Activity")
      - [Developer Activity](dev-activity.md "Developer Activity")
      - [Third Parties](third-party-report.md "Third Parties")

-----

[![Built by
Maven](./images/logos/maven-feather.png)](http://maven.apache.org/ "Built by Maven")

## Dependency Analysis

### Used and declared dependencies

|                          |                           |                |           |                |          |              |
| ------------------------ | ------------------------- | -------------- | --------- | -------------- | -------- | ------------ |
| **GroupId**              | **ArtifactId**            | **Version**    | **Scope** | **Classifier** | **Type** | **Optional** |
| org.springframework      | spring-context            | 4.3.12.RELEASE | compile   |                | jar      | false        |
| org.springframework      | spring-beans              | 4.3.12.RELEASE | compile   |                | jar      | false        |
| org.springframework.boot | spring-boot-autoconfigure | 1.5.4.RELEASE  | compile   |                | jar      | false        |
| org.springframework      | spring-test               | 4.3.12.RELEASE | test      |                | jar      | false        |
| org.springframework.boot | spring-boot-test          | 1.5.4.RELEASE  | test      |                | jar      | false        |
| junit                    | junit                     | 4.12           | test      |                | jar      | false        |

-----

### Used but undeclared dependencies

|              |                |             |           |                |          |              |
| ------------ | -------------- | ----------- | --------- | -------------- | -------- | ------------ |
| **GroupId**  | **ArtifactId** | **Version** | **Scope** | **Classifier** | **Type** | **Optional** |
| org.hamcrest | java-hamcrest  | 2.0.0.0     | test      |                | jar      | false        |

-----

### Unused but declared dependencies

|                             |                                  |                |           |                |          |              |
| --------------------------- | -------------------------------- | -------------- | --------- | -------------- | -------- | ------------ |
| **GroupId**                 | **ArtifactId**                   | **Version**    | **Scope** | **Classifier** | **Type** | **Optional** |
| org.springframework         | spring-core                      | 4.3.12.RELEASE | compile   |                | jar      | false        |
| org.apache.logging.log4j    | log4j-core                       | 2.9.1          | compile   |                | jar      | false        |
| org.junit.platform          | junit-platform-surefire-provider | 1.0.1          | compile   |                | jar      | false        |
| org.junit.jupiter           | junit-jupiter-api                | 5.0.1          | test      |                | jar      | false        |
| org.junit.vintage           | junit-vintage-engine             | 4.12.1         | test      |                | jar      | false        |
| org.junit.platform          | junit-platform-launcher          | 1.0.1          | test      |                | jar      | false        |
| org.junit.platform          | junit-platform-runner            | 1.0.1          | test      |                | jar      | false        |
| org.hamcrest                | hamcrest-junit                   | 2.0.0.0        | test      |                | jar      | false        |
| org.apiguardian             | apiguardian-api                  | 1.0.0          | test      |                | jar      | false        |
| org.apache.maven.skins      | maven-fluido-skin                | 1.6            | compile   |                | jar      | false        |
| com.google.googlejavaformat | google-java-format               | 1.5            | compile   |                | jar      | false        |

-----

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
