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
      - [Dependency
        Convergence](dependency-convergence.md "Dependency Convergence")
      - [Dependency
        Updates](dependency-updates-report.md "Dependency Updates")
      - [Plugin Updates](plugin-updates-report.md "Plugin Updates")
      - [Property Updates](#)
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
      - [Dependency Updates
        Report](dependency-updates-report.md "Dependency Updates Report")
      - [Plugin Updates
        Report](plugin-updates-report.md "Plugin Updates Report")
      - [Property Updates Report](#)
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
project's various properties associated with
artifacts.

|                                  |                                                                                                 |   |
| -------------------------------- | ----------------------------------------------------------------------------------------------- | - |
| ![](images/icon_success_sml.gif) | \# of properties using the latest version available                                             | 3 |
| ![](images/icon_warning_sml.gif) | \# of properties where the next version available is smaller than an incremental version update | 0 |
| ![](images/icon_warning_sml.gif) | \# of properties where the next version available is an incremental version update              | 2 |
| ![](images/icon_warning_sml.gif) | \# of properties where the next version available is a minor version update                     | 2 |
| ![](images/icon_warning_sml.gif) | \# of properties where the next version available is a major version update                     | 2 |

### Summary of properties associated with artifact versions

| Status                           | Property                            | Current Version | Next Version | Next Incremental  | Next Minor | Next Major        |
| -------------------------------- | ----------------------------------- | --------------- | ------------ | ----------------- | ---------- | ----------------- |
| ![](images/icon_warning_sml.gif) | ${maven.compiler.plugin.version}    | 3.1             |              |                   | **3.2**    |                   |
| ![](images/icon_warning_sml.gif) | ${spring.version}                   | 4.3.12.RELEASE  |              |                   |            | **5.0.0.RELEASE** |
| ![](images/icon_success_sml.gif) | ${license.maven.plugin.version}     | 1.14            |              |                   |            |                   |
| ![](images/icon_warning_sml.gif) | ${spring.boot.version}              | 1.5.4.RELEASE   |              | **1.5.5.RELEASE** |            |                   |
| ![](images/icon_warning_sml.gif) | ${maven.dependency.plugin.version}  | 2.10            |              |                   |            | **3.0.0**         |
| ![](images/icon_success_sml.gif) | ${maven.pmd.plugin.version}         | 3.8             |              |                   |            |                   |
| ![](images/icon_warning_sml.gif) | ${maven.surefire.plugin.version}    | 2.19.1          |              |                   | **2.20**   |                   |
| ![](images/icon_success_sml.gif) | ${maven.checkstyle.plugin.version}  | 2.17            |              |                   |            |                   |
| ![](images/icon_warning_sml.gif) | ${spring.boot.maven.plugin.version} | 1.5.4.RELEASE   |              | **1.5.5.RELEASE** |            |                   |
| Status                           | Property                            | Current Version | Next Version | Next Incremental  | Next Minor | Next Major        |

## Properties associated with artifact versions

### ${license.maven.plugin.version

|                                                          |                                                               |
| -------------------------------------------------------- | ------------------------------------------------------------- |
| Status                                                   | ![](images/icon_success_sml.gif) No newer versions available. |
| Property                                                 | ${license.maven.plugin.version}                               |
| Associated artifacts                                     | org.codehaus.mojo:license-maven-plugin                        |
| Current Version                                          | 1.14                                                          |
| Allowed version range                                    | \[,)                                                          |
| Infer associations from project                          | Yes                                                           |
| Only use release versions                                | No                                                            |
| Include projects from reactor                            | Yes                                                           |
| Always use reactor projects (even if older or -SNAPSHOT) | Yes                                                           |

### ${maven.checkstyle.plugin.version

|                                                          |                                                               |
| -------------------------------------------------------- | ------------------------------------------------------------- |
| Status                                                   | ![](images/icon_success_sml.gif) No newer versions available. |
| Property                                                 | ${maven.checkstyle.plugin.version}                            |
| Associated artifacts                                     | org.apache.maven.plugins:maven-checkstyle-plugin              |
| Current Version                                          | 2.17                                                          |
| Allowed version range                                    | \[,)                                                          |
| Infer associations from project                          | Yes                                                           |
| Only use release versions                                | No                                                            |
| Include projects from reactor                            | Yes                                                           |
| Always use reactor projects (even if older or -SNAPSHOT) | Yes                                                           |

### ${maven.compiler.plugin.version

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Property</td>
<td>${maven.compiler.plugin.version}</td>
</tr>
<tr class="odd">
<td>Associated artifacts</td>
<td>org.apache.maven.plugins:maven-compiler-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>3.1</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>3.2</strong> <em>Next Minor</em><br />
3.3<br />
3.5<br />
3.5.1<br />
3.6.0<br />
3.6.1<br />
3.6.2<br />
<strong>3.7.0</strong> <em>Latest Minor</em></td>
</tr>
<tr class="even">
<td>Allowed version range</td>
<td>[,)</td>
</tr>
<tr class="odd">
<td>Infer associations from project</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Only use release versions</td>
<td>No</td>
</tr>
<tr class="odd">
<td>Include projects from reactor</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Always use reactor projects (even if older or -SNAPSHOT)</td>
<td>Yes</td>
</tr>
</tbody>
</table>

### ${maven.dependency.plugin.version

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer major version available. Major updates are rarely passive.</td>
</tr>
<tr class="even">
<td>Property</td>
<td>${maven.dependency.plugin.version}</td>
</tr>
<tr class="odd">
<td>Associated artifacts</td>
<td>org.apache.maven.plugins:maven-dependency-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.10</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>3.0.0</strong> <em>Next Major</em><br />
3.0.1<br />
<strong>3.0.2</strong> <em>Latest Major</em></td>
</tr>
<tr class="even">
<td>Allowed version range</td>
<td>[,)</td>
</tr>
<tr class="odd">
<td>Infer associations from project</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Only use release versions</td>
<td>No</td>
</tr>
<tr class="odd">
<td>Include projects from reactor</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Always use reactor projects (even if older or -SNAPSHOT)</td>
<td>Yes</td>
</tr>
</tbody>
</table>

### ${maven.pmd.plugin.version

|                                                          |                                                               |
| -------------------------------------------------------- | ------------------------------------------------------------- |
| Status                                                   | ![](images/icon_success_sml.gif) No newer versions available. |
| Property                                                 | ${maven.pmd.plugin.version}                                   |
| Associated artifacts                                     | org.apache.maven.plugins:maven-pmd-plugin                     |
| Current Version                                          | 3.8                                                           |
| Allowed version range                                    | \[,)                                                          |
| Infer associations from project                          | Yes                                                           |
| Only use release versions                                | No                                                            |
| Include projects from reactor                            | Yes                                                           |
| Always use reactor projects (even if older or -SNAPSHOT) | Yes                                                           |

### ${maven.surefire.plugin.version

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Property</td>
<td>${maven.surefire.plugin.version}</td>
</tr>
<tr class="odd">
<td>Associated artifacts</td>
<td>org.apache.maven.plugins:maven-surefire-plugin<br />
org.apache.maven.plugins:maven-surefire-report-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.19.1</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.20</strong> <em>Next Minor</em><br />
<strong>2.20.1</strong> <em>Latest Minor</em></td>
</tr>
<tr class="even">
<td>Allowed version range</td>
<td>[,)</td>
</tr>
<tr class="odd">
<td>Infer associations from project</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Only use release versions</td>
<td>No</td>
</tr>
<tr class="odd">
<td>Include projects from reactor</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Always use reactor projects (even if older or -SNAPSHOT)</td>
<td>Yes</td>
</tr>
</tbody>
</table>

### ${spring.boot.maven.plugin.version

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer incremental version available. Incremental updates are typically passive.</td>
</tr>
<tr class="even">
<td>Property</td>
<td>${spring.boot.maven.plugin.version}</td>
</tr>
<tr class="odd">
<td>Associated artifacts</td>
<td>org.springframework.boot:spring-boot-maven-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>1.5.4.RELEASE</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>1.5.5.RELEASE</strong> <em>Next Incremental</em><br />
1.5.6.RELEASE<br />
1.5.7.RELEASE<br />
<strong>1.5.8.RELEASE</strong> <em>Latest Incremental</em></td>
</tr>
<tr class="even">
<td>Allowed version range</td>
<td>[,)</td>
</tr>
<tr class="odd">
<td>Infer associations from project</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Only use release versions</td>
<td>No</td>
</tr>
<tr class="odd">
<td>Include projects from reactor</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Always use reactor projects (even if older or -SNAPSHOT)</td>
<td>Yes</td>
</tr>
</tbody>
</table>

### ${spring.boot.version

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer incremental version available. Incremental updates are typically passive.</td>
</tr>
<tr class="even">
<td>Property</td>
<td>${spring.boot.version}</td>
</tr>
<tr class="odd">
<td>Associated artifacts</td>
<td>org.springframework.boot:spring-boot-autoconfigure<br />
org.springframework.boot:spring-boot-test</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>1.5.4.RELEASE</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>1.5.5.RELEASE</strong> <em>Next Incremental</em><br />
1.5.6.RELEASE<br />
1.5.7.RELEASE<br />
<strong>1.5.8.RELEASE</strong> <em>Latest Incremental</em></td>
</tr>
<tr class="even">
<td>Allowed version range</td>
<td>[,)</td>
</tr>
<tr class="odd">
<td>Infer associations from project</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Only use release versions</td>
<td>No</td>
</tr>
<tr class="odd">
<td>Include projects from reactor</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Always use reactor projects (even if older or -SNAPSHOT)</td>
<td>Yes</td>
</tr>
</tbody>
</table>

### ${spring.version

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer major version available. Major updates are rarely passive.</td>
</tr>
<tr class="even">
<td>Property</td>
<td>${spring.version}</td>
</tr>
<tr class="odd">
<td>Associated artifacts</td>
<td>org.springframework:spring-beans<br />
org.springframework:spring-context<br />
org.springframework:spring-core<br />
org.springframework:spring-test</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>4.3.12.RELEASE</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>5.0.0.RELEASE</strong> <em>Next Major</em><br />
<strong>5.0.1.RELEASE</strong> <em>Latest Major</em></td>
</tr>
<tr class="even">
<td>Allowed version range</td>
<td>[,)</td>
</tr>
<tr class="odd">
<td>Infer associations from project</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Only use release versions</td>
<td>No</td>
</tr>
<tr class="odd">
<td>Include projects from reactor</td>
<td>Yes</td>
</tr>
<tr class="even">
<td>Always use reactor projects (even if older or -SNAPSHOT)</td>
<td>Yes</td>
</tr>
</tbody>
</table>

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
