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
  - [Coding Standards](#)
      - [Checkstyle](#)
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
      - [Checkstyle](#)
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

## Checkstyle Results

The following document contains the results of
[Checkstyle](http://checkstyle.sourceforge.net/) 6.11.2 with
google\_checks.xml ruleset. [![rss
feed](images/rss.png)](checkstyle.rss)

## Summary

| Files | ![](images/icon_info_sml.gif) Info | ![](images/icon_warning_sml.gif) Warnings | ![](images/icon_error_sml.gif) Errors |
| ----- | ---------------------------------- | ----------------------------------------- | ------------------------------------- |
| 14    | 0                                  | 14                                        | 0                                     |

## Files

| File                                                                                                                                              | ![](images/icon_info_sml.gif) I | ![](images/icon_warning_sml.gif) W | ![](images/icon_error_sml.gif) E |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------- | ---------------------------------- | -------------------------------- |
| [net/swindle/springdemo/domain/Department.java](#net.swindle.springdemo.domain.Department.java)                                                   | 0                               | 3                                  | 0                                |
| [net/swindle/springdemo/domain/HumanResourceDept.java](#net.swindle.springdemo.domain.HumanResourceDept.java)                                     | 0                               | 5                                  | 0                                |
| [net/swindle/springdemo/service/RecruitmentService.java](#net.swindle.springdemo.service.RecruitmentService.java)                                 | 0                               | 2                                  | 0                                |
| [net/swindle/springdemo/serviceimpl/AgencyRecruitmentServiceImpl.java](#net.swindle.springdemo.serviceimpl.AgencyRecruitmentServiceImpl.java)     | 0                               | 1                                  | 0                                |
| [net/swindle/springdemo/serviceimpl/CloudServiceImpl.java](#net.swindle.springdemo.serviceimpl.CloudServiceImpl.java)                             | 0                               | 1                                  | 0                                |
| [net/swindle/springdemo/serviceimpl/EcommerceServiceImpl.java](#net.swindle.springdemo.serviceimpl.EcommerceServiceImpl.java)                     | 0                               | 1                                  | 0                                |
| [net/swindle/springdemo/serviceimpl/ReferralRecruitmentServiceImpl.java](#net.swindle.springdemo.serviceimpl.ReferralRecruitmentServiceImpl.java) | 0                               | 1                                  | 0                                |

## Rules

<table>
<colgroup>
<col style="width: 25%" />
<col style="width: 25%" />
<col style="width: 25%" />
<col style="width: 25%" />
</colgroup>
<thead>
<tr class="header">
<th>Category</th>
<th>Rule</th>
<th>Violations</th>
<th>Severity</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>imports</td>
<td><a href="http://checkstyle.sourceforge.net/config_imports.md#CustomImportOrder" class="externalLink">CustomImportOrder</a>
<ul>
<li>sortImportsInGroupAlphabetically: <code>&quot;true&quot;</code></li>
<li>specialImportsRegExp: <code>&quot;com.google&quot;</code></li>
<li>customImportOrderRules: <code>&quot;STATIC###SPECIAL_IMPORTS###THIRD_PARTY_PACKAGE###STANDARD_JAVA_PACKAGE&quot;</code></li>
</ul></td>
<td>4</td>
<td><img src="images/icon_warning_sml.gif" /> Warning</td>
</tr>
<tr class="even">
<td>javadoc</td>
<td><a href="http://checkstyle.sourceforge.net/config_javadoc.md#NonEmptyAtclauseDescription" class="externalLink">NonEmptyAtclauseDescription</a></td>
<td>5</td>
<td><img src="images/icon_warning_sml.gif" /> Warning</td>
</tr>
<tr class="odd">
<td></td>
<td><a href="http://checkstyle.sourceforge.net/config_javadoc.md#SingleLineJavadoc" class="externalLink">SingleLineJavadoc</a>
<ul>
<li>ignoreInlineTags: <code>&quot;false&quot;</code></li>
</ul></td>
<td>1</td>
<td><img src="images/icon_warning_sml.gif" /> Warning</td>
</tr>
</tbody>
</table>

## Details

### net/swindle/springdemo/domain/Department.java

| Severity                                 | Category | Rule                        | Message                                                                     | Line                                                         |
| ---------------------------------------- | -------- | --------------------------- | --------------------------------------------------------------------------- | ------------------------------------------------------------ |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | SummaryJavadoc              | First sentence of Javadoc is incomplete (period is missing) or not present. | [5](./xref/net/swindle/springdemo/domain/Department.md#L5) |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | NonEmptyAtclauseDescription | At-clause should have a non-empty description.                              | [6](./xref/net/swindle/springdemo/domain/Department.md#L6) |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | NonEmptyAtclauseDescription | At-clause should have a non-empty description.                              | [7](./xref/net/swindle/springdemo/domain/Department.md#L7) |

### net/swindle/springdemo/domain/HumanResourceDept.java

| Severity                                 | Category | Rule                        | Message                                                                     | Line                                                                  |
| ---------------------------------------- | -------- | --------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | SummaryJavadoc              | First sentence of Javadoc is incomplete (period is missing) or not present. | [5](./xref/net/swindle/springdemo/domain/HumanResourceDept.md#L5)   |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | NonEmptyAtclauseDescription | At-clause should have a non-empty description.                              | [18](./xref/net/swindle/springdemo/domain/HumanResourceDept.md#L18) |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | NonEmptyAtclauseDescription | At-clause should have a non-empty description.                              | [25](./xref/net/swindle/springdemo/domain/HumanResourceDept.md#L25) |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | SummaryJavadoc              | First sentence of Javadoc is incomplete (period is missing) or not present. | [25](./xref/net/swindle/springdemo/domain/HumanResourceDept.md#L25) |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | SingleLineJavadoc           | Single-line Javadoc comment should be multi-line.                           | [25](./xref/net/swindle/springdemo/domain/HumanResourceDept.md#L25) |

### net/swindle/springdemo/service/RecruitmentService.java

| Severity                                 | Category | Rule                        | Message                                                                     | Line                                                                    |
| ---------------------------------------- | -------- | --------------------------- | --------------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | SummaryJavadoc              | First sentence of Javadoc is incomplete (period is missing) or not present. | [10](./xref/net/swindle/springdemo/service/RecruitmentService.md#L10) |
| ![](images/icon_warning_sml.gif) Warning | javadoc  | NonEmptyAtclauseDescription | At-clause should have a non-empty description.                              | [14](./xref/net/swindle/springdemo/service/RecruitmentService.md#L14) |

### net/swindle/springdemo/serviceimpl/AgencyRecruitmentServiceImpl.java

| Severity                                 | Category | Rule              | Message                                                                                                                                                                                      | Line                                                                                |
| ---------------------------------------- | -------- | ----------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| ![](images/icon_warning_sml.gif) Warning | imports  | CustomImportOrder | Import statement for 'net.swindle.springdemo.service.RecruitmentService' is in the wrong order. Should be in the 'THIRD\_PARTY\_PACKAGE' group, expecting not assigned imports on this line. | [5](./xref/net/swindle/springdemo/serviceimpl/AgencyRecruitmentServiceImpl.md#L5) |

### net/swindle/springdemo/serviceimpl/CloudServiceImpl.java

| Severity                                 | Category | Rule              | Message                                                                                                                                                                                   | Line                                                                    |
| ---------------------------------------- | -------- | ----------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| ![](images/icon_warning_sml.gif) Warning | imports  | CustomImportOrder | Import statement for 'net.swindle.springdemo.service.BusinessService' is in the wrong order. Should be in the 'THIRD\_PARTY\_PACKAGE' group, expecting not assigned imports on this line. | [5](./xref/net/swindle/springdemo/serviceimpl/CloudServiceImpl.md#L5) |

### net/swindle/springdemo/serviceimpl/EcommerceServiceImpl.java

| Severity                                 | Category | Rule              | Message                                                                                                                                                                                   | Line                                                                        |
| ---------------------------------------- | -------- | ----------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| ![](images/icon_warning_sml.gif) Warning | imports  | CustomImportOrder | Import statement for 'net.swindle.springdemo.service.BusinessService' is in the wrong order. Should be in the 'THIRD\_PARTY\_PACKAGE' group, expecting not assigned imports on this line. | [5](./xref/net/swindle/springdemo/serviceimpl/EcommerceServiceImpl.md#L5) |

### net/swindle/springdemo/serviceimpl/ReferralRecruitmentServiceImpl.java

| Severity                                 | Category | Rule              | Message                                                                                                                                                                                      | Line                                                                                  |
| ---------------------------------------- | -------- | ----------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| ![](images/icon_warning_sml.gif) Warning | imports  | CustomImportOrder | Import statement for 'net.swindle.springdemo.service.RecruitmentService' is in the wrong order. Should be in the 'THIRD\_PARTY\_PACKAGE' group, expecting not assigned imports on this line. | [5](./xref/net/swindle/springdemo/serviceimpl/ReferralRecruitmentServiceImpl.md#L5) |

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
