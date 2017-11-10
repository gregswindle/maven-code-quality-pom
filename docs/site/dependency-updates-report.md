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
  - [Dependencies](#)
      - [Dependency
        Convergence](dependency-convergence.md "Dependency Convergence")
      - [Dependency Updates](#)
      - [Plugin Updates](plugin-updates-report.md "Plugin Updates")
      - [Property
        Updates](property-updates-report.md "Property Updates")
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
      - [Dependency
        Analysis](dependency-analysis.md "Dependency Analysis")
      - [Dependency Updates Report](#)
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

## Overview

This report summarizes newer versions that may be available for your
project's various
dependencies.

|                                  |                                                                                                   |    |
| -------------------------------- | ------------------------------------------------------------------------------------------------- | -- |
| ![](images/icon_success_sml.gif) | \# of dependencies using the latest version available                                             | 11 |
| ![](images/icon_warning_sml.gif) | \# of dependencies where the next version available is smaller than an incremental version update | 0  |
| ![](images/icon_warning_sml.gif) | \# of dependencies where the next version available is an incremental version update              | 2  |
| ![](images/icon_warning_sml.gif) | \# of dependencies where the next version available is a minor version update                     | 0  |
| ![](images/icon_warning_sml.gif) | \# of dependencies where the next version available is a major version update                     | 4  |

### Dependency Management

This project does not declare any dependencies in a dependencyManagement
section.

### Dependencies

| Status                           | Group Id                    | Artifact Id                      | Current Version | Scope   | Classifier | Type | Next Version | Next Incremental  | Next Minor | Next Major        |
| -------------------------------- | --------------------------- | -------------------------------- | --------------- | ------- | ---------- | ---- | ------------ | ----------------- | ---------- | ----------------- |
| ![](images/icon_success_sml.gif) | com.google.googlejavaformat | google-java-format               | 1.5             | compile |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | junit                       | junit                            | 4.12            | test    |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.apache.logging.log4j    | log4j-core                       | 2.9.1           | compile |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.apache.maven.skins      | maven-fluido-skin                | 1.6             | compile |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.apiguardian             | apiguardian-api                  | 1.0.0           | test    |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.hamcrest                | hamcrest-junit                   | 2.0.0.0         | test    |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.junit.jupiter           | junit-jupiter-api                | 5.0.1           | test    |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.junit.platform          | junit-platform-launcher          | 1.0.1           | test    |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.junit.platform          | junit-platform-runner            | 1.0.1           | test    |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.junit.platform          | junit-platform-surefire-provider | 1.0.1           | compile |            | jar  |              |                   |            |                   |
| ![](images/icon_success_sml.gif) | org.junit.vintage           | junit-vintage-engine             | 4.12.1          | test    |            | jar  |              |                   |            |                   |
| ![](images/icon_warning_sml.gif) | org.springframework         | spring-beans                     | 4.3.12.RELEASE  | compile |            | jar  |              |                   |            | **5.0.0.RELEASE** |
| ![](images/icon_warning_sml.gif) | org.springframework         | spring-context                   | 4.3.12.RELEASE  | compile |            | jar  |              |                   |            | **5.0.0.RELEASE** |
| ![](images/icon_warning_sml.gif) | org.springframework         | spring-core                      | 4.3.12.RELEASE  | compile |            | jar  |              |                   |            | **5.0.0.RELEASE** |
| ![](images/icon_warning_sml.gif) | org.springframework         | spring-test                      | 4.3.12.RELEASE  | test    |            | jar  |              |                   |            | **5.0.0.RELEASE** |
| ![](images/icon_warning_sml.gif) | org.springframework.boot    | spring-boot-autoconfigure        | 1.5.4.RELEASE   | compile |            | jar  |              | **1.5.5.RELEASE** |            |                   |
| ![](images/icon_warning_sml.gif) | org.springframework.boot    | spring-boot-test                 | 1.5.4.RELEASE   | test    |            | jar  |              | **1.5.5.RELEASE** |            |                   |
| Status                           | Group Id                    | Artifact Id                      | Current Version | Scope   | Classifier | Type | Next Version | Next Incremental  | Next Minor | Next Major        |

## Dependency Updates

### com.google.googlejavaformat:google-java-format

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | com.google.googlejavaformat                                   |
| Artifact Id     | google-java-format                                            |
| Current Version | 1.5                                                           |
| Scope           | compile                                                       |
| Classifier      |                                                               |
| Type            | jar                                                           |

### junit:junit

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | junit                                                         |
| Artifact Id     | junit                                                         |
| Current Version | 4.12                                                          |
| Scope           | test                                                          |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.apache.logging.log4j:log4j-core

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.logging.log4j                                      |
| Artifact Id     | log4j-core                                                    |
| Current Version | 2.9.1                                                         |
| Scope           | compile                                                       |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.apache.maven.skins:maven-fluido-skin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.skins                                        |
| Artifact Id     | maven-fluido-skin                                             |
| Current Version | 1.6                                                           |
| Scope           | compile                                                       |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.apiguardian:apiguardian-api

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apiguardian                                               |
| Artifact Id     | apiguardian-api                                               |
| Current Version | 1.0.0                                                         |
| Scope           | test                                                          |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.hamcrest:hamcrest-junit

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.hamcrest                                                  |
| Artifact Id     | hamcrest-junit                                                |
| Current Version | 2.0.0.0                                                       |
| Scope           | test                                                          |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.junit.jupiter:junit-jupiter-api

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.junit.jupiter                                             |
| Artifact Id     | junit-jupiter-api                                             |
| Current Version | 5.0.1                                                         |
| Scope           | test                                                          |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.junit.platform:junit-platform-launcher

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.junit.platform                                            |
| Artifact Id     | junit-platform-launcher                                       |
| Current Version | 1.0.1                                                         |
| Scope           | test                                                          |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.junit.platform:junit-platform-runner

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.junit.platform                                            |
| Artifact Id     | junit-platform-runner                                         |
| Current Version | 1.0.1                                                         |
| Scope           | test                                                          |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.junit.platform:junit-platform-surefire-provider

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.junit.platform                                            |
| Artifact Id     | junit-platform-surefire-provider                              |
| Current Version | 1.0.1                                                         |
| Scope           | compile                                                       |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.junit.vintage:junit-vintage-engine

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.junit.vintage                                             |
| Artifact Id     | junit-vintage-engine                                          |
| Current Version | 4.12.1                                                        |
| Scope           | test                                                          |
| Classifier      |                                                               |
| Type            | jar                                                           |

### org.springframework:spring-beans

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer major version available. Major updates are rarely passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.springframework</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>spring-beans</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>4.3.12.RELEASE</td>
</tr>
<tr class="odd">
<td>Scope</td>
<td>compile</td>
</tr>
<tr class="even">
<td>Classifier</td>
<td></td>
</tr>
<tr class="odd">
<td>Type</td>
<td>jar</td>
</tr>
<tr class="even">
<td>Newer versions</td>
<td><strong>5.0.0.RELEASE</strong> <em>Next Major</em><br />
<strong>5.0.1.RELEASE</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### org.springframework:spring-context

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer major version available. Major updates are rarely passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.springframework</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>spring-context</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>4.3.12.RELEASE</td>
</tr>
<tr class="odd">
<td>Scope</td>
<td>compile</td>
</tr>
<tr class="even">
<td>Classifier</td>
<td></td>
</tr>
<tr class="odd">
<td>Type</td>
<td>jar</td>
</tr>
<tr class="even">
<td>Newer versions</td>
<td><strong>5.0.0.RELEASE</strong> <em>Next Major</em><br />
<strong>5.0.1.RELEASE</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### org.springframework:spring-core

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer major version available. Major updates are rarely passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.springframework</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>spring-core</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>4.3.12.RELEASE</td>
</tr>
<tr class="odd">
<td>Scope</td>
<td>compile</td>
</tr>
<tr class="even">
<td>Classifier</td>
<td></td>
</tr>
<tr class="odd">
<td>Type</td>
<td>jar</td>
</tr>
<tr class="even">
<td>Newer versions</td>
<td><strong>5.0.0.RELEASE</strong> <em>Next Major</em><br />
<strong>5.0.1.RELEASE</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### org.springframework:spring-test

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer major version available. Major updates are rarely passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.springframework</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>spring-test</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>4.3.12.RELEASE</td>
</tr>
<tr class="odd">
<td>Scope</td>
<td>test</td>
</tr>
<tr class="even">
<td>Classifier</td>
<td></td>
</tr>
<tr class="odd">
<td>Type</td>
<td>jar</td>
</tr>
<tr class="even">
<td>Newer versions</td>
<td><strong>5.0.0.RELEASE</strong> <em>Next Major</em><br />
<strong>5.0.1.RELEASE</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### org.springframework.boot:spring-boot-autoconfigure

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer incremental version available. Incremental updates are typically passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.springframework.boot</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>spring-boot-autoconfigure</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>1.5.4.RELEASE</td>
</tr>
<tr class="odd">
<td>Scope</td>
<td>compile</td>
</tr>
<tr class="even">
<td>Classifier</td>
<td></td>
</tr>
<tr class="odd">
<td>Type</td>
<td>jar</td>
</tr>
<tr class="even">
<td>Newer versions</td>
<td><strong>1.5.5.RELEASE</strong> <em>Next Incremental</em><br />
1.5.6.RELEASE<br />
1.5.7.RELEASE<br />
<strong>1.5.8.RELEASE</strong> <em>Latest Incremental</em></td>
</tr>
</tbody>
</table>

### org.springframework.boot:spring-boot-test

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer incremental version available. Incremental updates are typically passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.springframework.boot</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>spring-boot-test</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>1.5.4.RELEASE</td>
</tr>
<tr class="odd">
<td>Scope</td>
<td>test</td>
</tr>
<tr class="even">
<td>Classifier</td>
<td></td>
</tr>
<tr class="odd">
<td>Type</td>
<td>jar</td>
</tr>
<tr class="even">
<td>Newer versions</td>
<td><strong>1.5.5.RELEASE</strong> <em>Next Incremental</em><br />
1.5.6.RELEASE<br />
1.5.7.RELEASE<br />
<strong>1.5.8.RELEASE</strong> <em>Latest Incremental</em></td>
</tr>
</tbody>
</table>

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
