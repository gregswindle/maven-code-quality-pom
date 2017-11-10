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
      - [Plugin Updates](#)
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
      - [Dependency Updates
        Report](dependency-updates-report.md "Dependency Updates Report")
      - [Plugin Updates Report](#)
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
plugins.

|                                  |                                                                                              |    |
| -------------------------------- | -------------------------------------------------------------------------------------------- | -- |
| ![](images/icon_success_sml.gif) | \# of plugins using the latest version available                                             | 17 |
| ![](images/icon_warning_sml.gif) | \# of plugins where the next version available is smaller than an incremental version update | 1  |
| ![](images/icon_warning_sml.gif) | \# of plugins where the next version available is an incremental version update              | 2  |
| ![](images/icon_warning_sml.gif) | \# of plugins where the next version available is a minor version update                     | 9  |
| ![](images/icon_warning_sml.gif) | \# of plugins where the next version available is a major version update                     | 0  |
| ![](images/icon_warning_sml.gif) | \# of plugins where a dependencies section containes a dependency with an updated version    | 0  |

### Plugin Management

| Status                           | Group Id                 | Artifact Id             | Current Version | Next Version | Next Incremental | Next Minor | Next Major | Dependency status                |
| -------------------------------- | ------------------------ | ----------------------- | --------------- | ------------ | ---------------- | ---------- | ---------- | -------------------------------- |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-antrun-plugin     | 1.3             |              |                  | **1.4**    |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-assembly-plugin   | 2.2-beta-5      | **2.2**      | **2.2.1**        | **2.3**    | **3.0.0**  | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-dependency-plugin | 2.8             |              |                  | **2.9**    | **3.0.0**  | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-install-plugin    | **2.5.2**       |              |                  |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-release-plugin    | 2.3.2           |              |                  | **2.4**    |            | ![](images/icon_success_sml.gif) |
| Status                           | Group Id                 | Artifact Id             | Current Version | Next Version | Next Incremental | Next Minor | Next Major | Dependency status                |

### Plugins

| Status                           | Group Id                 | Artifact Id                       | Current Version | Next Version | Next Incremental  | Next Minor | Next Major | Dependency status                |
| -------------------------------- | ------------------------ | --------------------------------- | --------------- | ------------ | ----------------- | ---------- | ---------- | -------------------------------- |
| ![](images/icon_success_sml.gif) | com.versioneye           | versioneye-maven-plugin           | **3.11.4**      |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-changelog-plugin            | **2.3**         |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-checkstyle-plugin           | **2.17**        |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-clean-plugin                | 2.5             |              |                   | **2.6**    | **3.0.0**  | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-compiler-plugin             | 3.1             |              |                   | **3.2**    |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-deploy-plugin               | 2.7             |              |                   | **2.8**    |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-enforcer-plugin             | **3.0.0-M1**    |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-jar-plugin                  | 2.4             |              |                   | **2.5**    | **3.0.0**  | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-javadoc-plugin              | **3.0.0-M1**    |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-pmd-plugin                  | **3.8**         |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-project-info-reports-plugin | **2.9**         |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-resources-plugin            | 2.6             |              |                   | **2.7**    | **3.0.0**  | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.apache.maven.plugins | maven-site-plugin                 | **3.6**         |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.apache.maven.plugins | maven-surefire-plugin             | 2.19.1          |              |                   | **2.20**   |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.basepom.maven        | duplicate-finder-maven-plugin     | **1.2.1**       |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.codehaus.mojo        | codenarc-maven-plugin             | **0.22-1**      |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.codehaus.mojo        | exec-maven-plugin                 | **1.6.0**       |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.codehaus.mojo        | findbugs-maven-plugin             | 3.0.4           |              | **3.0.5**         |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.codehaus.mojo        | license-maven-plugin              | **1.14**        |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.codehaus.mojo        | versions-maven-plugin             | **2.5**         |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.codehaus.plexus      | plexus-component-metadata         | **1.7.1**       |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.eluder.coveralls     | coveralls-maven-plugin            | **4.3.0**       |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_success_sml.gif) | org.jacoco               | jacoco-maven-plugin               | **0.7.9**       |              |                   |            |            | ![](images/icon_success_sml.gif) |
| ![](images/icon_warning_sml.gif) | org.springframework.boot | spring-boot-maven-plugin          | 1.5.4.RELEASE   |              | **1.5.5.RELEASE** |            |            | ![](images/icon_success_sml.gif) |
| Status                           | Group Id                 | Artifact Id                       | Current Version | Next Version | Next Incremental  | Next Minor | Next Major | Dependency status                |

## Plugin Updates

### Plugin com.versioneye:versioneye-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | com.versioneye                                                |
| Artifact Id     | versioneye-maven-plugin                                       |
| Current Version | 3.11.4                                                        |

### Plugin org.apache.maven.plugins:maven-antrun-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-antrun-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>1.3</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>1.4</strong> <em>Next Minor</em><br />
1.5<br />
1.6<br />
1.7<br />
<strong>1.8</strong> <em>Latest Minor</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-assembly-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer version available.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-assembly-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.2-beta-5</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.2</strong> <em>Next Version</em><br />
<strong>2.2.1</strong> <em>Next Incremental</em><br />
<strong>2.2.2</strong> <em>Latest Incremental</em><br />
<strong>2.3</strong> <em>Next Minor</em><br />
2.4<br />
2.4.1<br />
2.5<br />
2.5.1<br />
2.5.2<br />
2.5.3<br />
2.5.4<br />
2.5.5<br />
<strong>2.6</strong> <em>Latest Minor</em><br />
<strong>3.0.0</strong> <em>Next Major</em><br />
<strong>3.1.0</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-changelog-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-changelog-plugin                                        |
| Current Version | 2.3                                                           |

### Plugin org.apache.maven.plugins:maven-checkstyle-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-checkstyle-plugin                                       |
| Current Version | 2.17                                                          |

### Plugin org.apache.maven.plugins:maven-clean-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-clean-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.5</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.6</strong> <em>Next Minor</em><br />
<strong>2.6.1</strong> <em>Latest Minor</em><br />
<strong>3.0.0</strong> <em>Next Major</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-compiler-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-compiler-plugin</td>
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
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-dependency-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-dependency-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.8</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.9</strong> <em>Next Minor</em><br />
<strong>2.10</strong> <em>Latest Minor</em><br />
<strong>3.0.0</strong> <em>Next Major</em><br />
3.0.1<br />
<strong>3.0.2</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-deploy-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-deploy-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.7</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.8</strong> <em>Next Minor</em><br />
2.8.1<br />
<strong>2.8.2</strong> <em>Latest Minor</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-enforcer-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-enforcer-plugin                                         |
| Current Version | 3.0.0-M1                                                      |

### Plugin org.apache.maven.plugins:maven-install-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-install-plugin                                          |
| Current Version | 2.5.2                                                         |

### Plugin org.apache.maven.plugins:maven-jar-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-jar-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.4</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.5</strong> <em>Next Minor</em><br />
<strong>2.6</strong> <em>Latest Minor</em><br />
<strong>3.0.0</strong> <em>Next Major</em><br />
3.0.1<br />
<strong>3.0.2</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-javadoc-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-javadoc-plugin                                          |
| Current Version | 3.0.0-M1                                                      |

### Plugin org.apache.maven.plugins:maven-pmd-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-pmd-plugin                                              |
| Current Version | 3.8                                                           |

### Plugin org.apache.maven.plugins:maven-project-info-reports-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-project-info-reports-plugin                             |
| Current Version | 2.9                                                           |

### Plugin org.apache.maven.plugins:maven-release-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-release-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.3.2</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.4</strong> <em>Next Minor</em><br />
2.4.1<br />
2.4.2<br />
2.5<br />
2.5.1<br />
2.5.2<br />
<strong>2.5.3</strong> <em>Latest Minor</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-resources-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-resources-plugin</td>
</tr>
<tr class="even">
<td>Current Version</td>
<td>2.6</td>
</tr>
<tr class="odd">
<td>Newer versions</td>
<td><strong>2.7</strong> <em>Next Minor</em><br />
<strong>3.0.0</strong> <em>Next Major</em><br />
3.0.1<br />
<strong>3.0.2</strong> <em>Latest Major</em></td>
</tr>
</tbody>
</table>

### Plugin org.apache.maven.plugins:maven-site-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.plugins                                      |
| Artifact Id     | maven-site-plugin                                             |
| Current Version | 3.6                                                           |

#### Dependencies of org.apache.maven.plugins:maven-site-plugin

| Status                           | Group Id               | Artifact Id           | Current Version | Classifier | Type | Next Version | Next Incremental | Next Minor | Next Major |
| -------------------------------- | ---------------------- | --------------------- | --------------- | ---------- | ---- | ------------ | ---------------- | ---------- | ---------- |
| ![](images/icon_success_sml.gif) | org.apache.maven.doxia | doxia-module-markdown | 1.7             |            | jar  |              |                  |            |            |
| ![](images/icon_success_sml.gif) | org.apache.maven.skins | maven-fluido-skin     | 1.6             |            | jar  |              |                  |            |            |
| Status                           | Group Id               | Artifact Id           | Current Version | Classifier | Type | Next Version | Next Incremental | Next Minor | Next Major |

#### Dependency org.apache.maven.doxia:doxia-module-markdown

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.doxia                                        |
| Artifact Id     | doxia-module-markdown                                         |
| Current Version | 1.7                                                           |
| Classifier      |                                                               |
| Type            | jar                                                           |

#### Dependency org.apache.maven.skins:maven-fluido-skin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.apache.maven.skins                                        |
| Artifact Id     | maven-fluido-skin                                             |
| Current Version | 1.6                                                           |
| Classifier      |                                                               |
| Type            | jar                                                           |

### Plugin org.apache.maven.plugins:maven-surefire-plugin

<table>
<tbody>
<tr class="odd">
<td>Status</td>
<td><img src="images/icon_warning_sml.gif" /> There is at least one newer minor version available. Minor updates are sometimes passive.</td>
</tr>
<tr class="even">
<td>Group Id</td>
<td>org.apache.maven.plugins</td>
</tr>
<tr class="odd">
<td>Artifact Id</td>
<td>maven-surefire-plugin</td>
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
</tbody>
</table>

#### Dependencies of org.apache.maven.plugins:maven-surefire-plugin

| Status                           | Group Id           | Artifact Id                      | Current Version | Classifier | Type | Next Version | Next Incremental | Next Minor | Next Major |
| -------------------------------- | ------------------ | -------------------------------- | --------------- | ---------- | ---- | ------------ | ---------------- | ---------- | ---------- |
| ![](images/icon_success_sml.gif) | org.junit.jupiter  | junit-jupiter-engine             | 5.0.1           |            | jar  |              |                  |            |            |
| ![](images/icon_success_sml.gif) | org.junit.platform | junit-platform-surefire-provider | 1.0.1           |            | jar  |              |                  |            |            |
| Status                           | Group Id           | Artifact Id                      | Current Version | Classifier | Type | Next Version | Next Incremental | Next Minor | Next Major |

#### Dependency org.junit.jupiter:junit-jupiter-engine

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.junit.jupiter                                             |
| Artifact Id     | junit-jupiter-engine                                          |
| Current Version | 5.0.1                                                         |
| Classifier      |                                                               |
| Type            | jar                                                           |

#### Dependency org.junit.platform:junit-platform-surefire-provider

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.junit.platform                                            |
| Artifact Id     | junit-platform-surefire-provider                              |
| Current Version | 1.0.1                                                         |
| Classifier      |                                                               |
| Type            | jar                                                           |

### Plugin org.basepom.maven:duplicate-finder-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.basepom.maven                                             |
| Artifact Id     | duplicate-finder-maven-plugin                                 |
| Current Version | 1.2.1                                                         |

### Plugin org.codehaus.mojo:codenarc-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.codehaus.mojo                                             |
| Artifact Id     | codenarc-maven-plugin                                         |
| Current Version | 0.22-1                                                        |

### Plugin org.codehaus.mojo:exec-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.codehaus.mojo                                             |
| Artifact Id     | exec-maven-plugin                                             |
| Current Version | 1.6.0                                                         |

### Plugin org.codehaus.mojo:findbugs-maven-plugin

|                 |                                                                                                                                        |
| --------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| Status          | ![](images/icon_warning_sml.gif) There is at least one newer incremental version available. Incremental updates are typically passive. |
| Group Id        | org.codehaus.mojo                                                                                                                      |
| Artifact Id     | findbugs-maven-plugin                                                                                                                  |
| Current Version | 3.0.4                                                                                                                                  |
| Newer versions  | **3.0.5** *Next Incremental*                                                                                                           |

### Plugin org.codehaus.mojo:license-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.codehaus.mojo                                             |
| Artifact Id     | license-maven-plugin                                          |
| Current Version | 1.14                                                          |

### Plugin org.codehaus.mojo:versions-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.codehaus.mojo                                             |
| Artifact Id     | versions-maven-plugin                                         |
| Current Version | 2.5                                                           |

### Plugin org.codehaus.plexus:plexus-component-metadata

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.codehaus.plexus                                           |
| Artifact Id     | plexus-component-metadata                                     |
| Current Version | 1.7.1                                                         |

### Plugin org.eluder.coveralls:coveralls-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.eluder.coveralls                                          |
| Artifact Id     | coveralls-maven-plugin                                        |
| Current Version | 4.3.0                                                         |

### Plugin org.jacoco:jacoco-maven-plugin

|                 |                                                               |
| --------------- | ------------------------------------------------------------- |
| Status          | ![](images/icon_success_sml.gif) No newer versions available. |
| Group Id        | org.jacoco                                                    |
| Artifact Id     | jacoco-maven-plugin                                           |
| Current Version | 0.7.9                                                         |

### Plugin org.springframework.boot:spring-boot-maven-plugin

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
<td>spring-boot-maven-plugin</td>
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
</tbody>
</table>

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
