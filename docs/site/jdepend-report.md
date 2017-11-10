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
      - [JDepend](#)
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
      - [JDepend](#)
      - [dependency-check](dependency-check-report.md "dependency-check")
      - [Dependency
        Analysis](dependency-analysis.md "Dependency Analysis")
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

## Metric Results

\[ [summary](#summary) \] \[ [packages](#packages) \] \[
[cycles](#cycles) \] \[ [explanations](#explanations) \]  
  
The following document contains the results of a JDepend metric
analysis. The various metrics are defined at the bottom of this
document.  
  

## Summary

\[ [summary](#summary) \] \[ [packages](#packages) \] \[
[cycles](#cycles) \] \[ [explanations](#explanations)
\]  
  

| Package                                                                   | TC | CC | AC | Ca | Ce | A      | I      | D     | V |
| ------------------------------------------------------------------------- | -- | -- | -- | -- | -- | ------ | ------ | ----- | - |
| [net.swindle.springdemo](#net.swindle.springdemo)                         | 1  | 1  | 0  | 0  | 5  | 0.0%   | 100.0% | 0.0%  | 1 |
| [net.swindle.springdemo.domain](#net.swindle.springdemo.domain)           | 3  | 2  | 1  | 1  | 2  | 33.0%  | 67.0%  | 0.0%  | 1 |
| [net.swindle.springdemo.service](#net.swindle.springdemo.service)         | 2  | 0  | 2  | 2  | 1  | 100.0% | 33.0%  | 33.0% | 1 |
| [net.swindle.springdemo.serviceimpl](#net.swindle.springdemo.serviceimpl) | 4  | 4  | 0  | 0  | 3  | 0.0%   | 100.0% | 0.0%  | 1 |

## Packages

\[ [summary](#summary) \] \[ [packages](#packages) \] \[
[cycles](#cycles) \] \[ [explanations](#explanations)
\]  

### net.swindle.springdemo

| Afferent Couplings | Efferent Couplings | Abstractness | Instability | Distance |
| ------------------ | ------------------ | ------------ | ----------- | -------- |
| 0                  | 5                  | 0.0%         | 100.0%      | 0.0%     |

<table>
<thead>
<tr class="header">
<th>Abstract Classes</th>
<th>Concrete Classes</th>
<th>Used by Packages</th>
<th>Uses Packages</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><em>None</em></td>
<td>net.swindle.springdemo.DiConstructorApp<br />
</td>
<td><em>None</em></td>
<td>java.io<br />
java.lang<br />
net.swindle.springdemo.domain<br />
org.springframework.context<br />
org.springframework.context.support<br />
</td>
</tr>
</tbody>
</table>

### net.swindle.springdemo.domain

| Afferent Couplings | Efferent Couplings | Abstractness | Instability | Distance |
| ------------------ | ------------------ | ------------ | ----------- | -------- |
| 1                  | 2                  | 33.0%        | 67.0%       | 0.0%     |

<table>
<thead>
<tr class="header">
<th>Abstract Classes</th>
<th>Concrete Classes</th>
<th>Used by Packages</th>
<th>Uses Packages</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>net.swindle.springdemo.domain.Department<br />
</td>
<td>net.swindle.springdemo.domain.HumanResourceDept<br />
net.swindle.springdemo.domain.Organization<br />
</td>
<td>net.swindle.springdemo<br />
</td>
<td>java.lang<br />
net.swindle.springdemo.service<br />
</td>
</tr>
</tbody>
</table>

### net.swindle.springdemo.service

| Afferent Couplings | Efferent Couplings | Abstractness | Instability | Distance |
| ------------------ | ------------------ | ------------ | ----------- | -------- |
| 2                  | 1                  | 100.0%       | 33.0%       | 33.0%    |

<table>
<thead>
<tr class="header">
<th>Abstract Classes</th>
<th>Concrete Classes</th>
<th>Used by Packages</th>
<th>Uses Packages</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>net.swindle.springdemo.service.BusinessService<br />
net.swindle.springdemo.service.RecruitmentService<br />
</td>
<td><em>None</em></td>
<td>net.swindle.springdemo.domain<br />
net.swindle.springdemo.serviceimpl<br />
</td>
<td>java.lang<br />
</td>
</tr>
</tbody>
</table>

### net.swindle.springdemo.serviceimpl

| Afferent Couplings | Efferent Couplings | Abstractness | Instability | Distance |
| ------------------ | ------------------ | ------------ | ----------- | -------- |
| 0                  | 3                  | 0.0%         | 100.0%      | 0.0%     |

<table>
<thead>
<tr class="header">
<th>Abstract Classes</th>
<th>Concrete Classes</th>
<th>Used by Packages</th>
<th>Uses Packages</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td><em>None</em></td>
<td>net.swindle.springdemo.serviceimpl.AgencyRecruitmentServiceImpl<br />
net.swindle.springdemo.serviceimpl.CloudServiceImpl<br />
net.swindle.springdemo.serviceimpl.EcommerceServiceImpl<br />
net.swindle.springdemo.serviceimpl.ReferralRecruitmentServiceImpl<br />
</td>
<td><em>None</em></td>
<td>java.lang<br />
java.util<br />
net.swindle.springdemo.service<br />
</td>
</tr>
</tbody>
</table>

## Cycles

\[ [summary](#summary) \] \[ [packages](#packages) \] \[
[cycles](#cycles) \] \[ [explanations](#explanations) \]  
  
There are no cyclic dependencies.  

## Explanation

\[ [summary](#summary) \] \[ [packages](#packages) \] \[
[cycles](#cycles) \] \[ [explanations](#explanations) \]  
  
The following explanations are for quick reference and are lifted
directly from the original JDepend
documentation.  
  

| Term               | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| ------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Number of Classes  | The number of concrete and abstract classes (and interfaces) in the package is an indicator of the extensibility of the package.                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| Afferent Couplings | The number of other packages that depend upon classes within the package is an indicator of the package's responsibility.                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| Efferent Couplings | The number of other packages that the classes in the package depend upon is an indicator of the package's independence.                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| Abstractness       | The ratio of the number of abstract classes (and interfaces) in the analyzed package to the total number of classes in the analyzed package. The range for this metric is 0 to 1, with A=0 indicating a completely concrete package and A=1 indicating a completely abstract package.                                                                                                                                                                                                                                                                                                              |
| Instability        | The ratio of efferent coupling (Ce) to total coupling (Ce / (Ce + Ca)). This metric is an indicator of the package's resilience to change. The range for this metric is 0 to 1, with I=0 indicating a completely stable package and I=1 indicating a completely instable package.                                                                                                                                                                                                                                                                                                                  |
| Distance           | The perpendicular distance of a package from the idealized line A + I = 1. This metric is an indicator of the package's balance between abstractness and stability. A package squarely on the main sequence is optimally balanced with respect to its abstractness and stability. Ideal packages are either completely abstract and stable (x=0, y=1) or completely concrete and instable (x=1, y=0). The range for this metric is 0 to 1, with D=0 indicating a package that is coincident with the main sequence and D=1 indicating a package that is as far from the main sequence as possible. |
| Cycles             | Packages participating in a package dependency cycle are in a deadly embrace with respect to reusability and their release cycle. Package dependency cycles can be easily identified by reviewing the textual reports of dependency cycles. Once these dependency cycles have been identified with JDepend, they can be broken by employing various object-oriented techniques.                                                                                                                                                                                                                    |

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
