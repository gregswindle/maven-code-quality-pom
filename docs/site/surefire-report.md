## maven-code-quality-pom

-----

  - Last Published: 2017-11-10|
  - Version: 0.0.1-SNAPSHOT

<!-- end list -->

  - Code Quality Reports
  - [Unit Tests](#)
      - [Code Coverage
        (JaCoCo)](jacoco/index.md "Code Coverage (JaCoCo)")
      - [Results (Surefire)](#)
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
      - [Surefire Report](#)
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

## Surefire Report

## Summary

\[[Summary](#Summary)\] \[[Package List](#Package_List)\] \[[Test
Cases](#Test_Cases)\]

  

| Tests | Errors | Failures | Skipped | Success Rate | Time  |
| ----- | ------ | -------- | ------- | ------------ | ----- |
| 9     | 0      | 0        | 0       | 100%         | 0.526 |

  

Note: failures are anticipated and checked for with assertions while
errors are unanticipated.

  

## Package List

\[[Summary](#Summary)\] \[[Package List](#Package_List)\] \[[Test
Cases](#Test_Cases)\]

  

| Package                                                                   | Tests | Errors | Failures | Skipped | Success Rate | Time  |
| ------------------------------------------------------------------------- | ----- | ------ | -------- | ------- | ------------ | ----- |
| [net.swindle.springdemo.domain](#net.swindle.springdemo.domain)           | 3     | 0      | 0        | 0       | 100%         | 0     |
| [net.swindle.springdemo](#net.swindle.springdemo)                         | 2     | 0      | 0        | 0       | 100%         | 0.526 |
| [net.swindle.springdemo.serviceimpl](#net.swindle.springdemo.serviceimpl) | 4     | 0      | 0        | 0       | 100%         | 0     |

  

Note: package statistics are not computed recursively, they only sum up
all of its testsuites
numbers.

### net.swindle.springdemo.domain

|                                                                                       | Class                                                                    | Tests | Errors | Failures | Skipped | Success Rate | Time |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ | ----- | ------ | -------- | ------- | ------------ | ---- |
| [![](images/icon_success_sml.gif)](#net.swindle.springdemo.domainBusinessServiceTest) | [BusinessServiceTest](#net.swindle.springdemo.domainBusinessServiceTest) | 1     | 0      | 0        | 0       | 100%         | 0    |
| [![](images/icon_success_sml.gif)](#net.swindle.springdemo.domainOrganizationTest)    | [OrganizationTest](#net.swindle.springdemo.domainOrganizationTest)       | 2     | 0      | 0        | 0       | 100%         | 0    |

### net.swindle.springdemo

|                                                                                 | Class                                                               | Tests | Errors | Failures | Skipped | Success Rate | Time  |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------- | ----- | ------ | -------- | ------- | ------------ | ----- |
| [![](images/icon_success_sml.gif)](#net.swindle.springdemoDiConstructorAppTest) | [DiConstructorAppTest](#net.swindle.springdemoDiConstructorAppTest) | 2     | 0      | 0        | 0       | 100%         | 0.526 |

### net.swindle.springdemo.serviceimpl

|                                                                                                         | Class                                                                                                   | Tests | Errors | Failures | Skipped | Success Rate | Time |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ----- | ------ | -------- | ------- | ------------ | ---- |
| [![](images/icon_success_sml.gif)](#net.swindle.springdemo.serviceimplAgencyRecruitmentServiceImplTest) | [AgencyRecruitmentServiceImplTest](#net.swindle.springdemo.serviceimplAgencyRecruitmentServiceImplTest) | 2     | 0      | 0        | 0       | 100%         | 0    |
| [![](images/icon_success_sml.gif)](#net.swindle.springdemo.serviceimplCloudServiceImplTest)             | [CloudServiceImplTest](#net.swindle.springdemo.serviceimplCloudServiceImplTest)                         | 1     | 0      | 0        | 0       | 100%         | 0    |
| [![](images/icon_success_sml.gif)](#net.swindle.springdemo.serviceimplEcommerceServiceImplTest)         | [EcommerceServiceImplTest](#net.swindle.springdemo.serviceimplEcommerceServiceImplTest)                 | 1     | 0      | 0        | 0       | 100%         | 0    |

  

## Test Cases

\[[Summary](#Summary)\] \[[Package List](#Package_List)\] \[[Test
Cases](#Test_Cases)\]

### DiConstructorAppTest

|                                  |                    |       |
| -------------------------------- | ------------------ | ----- |
| ![](images/icon_success_sml.gif) | testExistenceOfApp | 0.009 |
| ![](images/icon_success_sml.gif) | testMain           | 0     |

### BusinessServiceTest

|                                  |             |   |
| -------------------------------- | ----------- | - |
| ![](images/icon_success_sml.gif) | testRevenue | 0 |

### OrganizationTest

|                                  |                      |   |
| -------------------------------- | -------------------- | - |
| ![](images/icon_success_sml.gif) | testCorporateService | 0 |
| ![](images/icon_success_sml.gif) | testContext          | 0 |

### AgencyRecruitmentServiceImplTest

|                                  |                                  |   |
| -------------------------------- | -------------------------------- | - |
| ![](images/icon_success_sml.gif) | testRecruitEmployees             | 0 |
| ![](images/icon_success_sml.gif) | testAgencyRecruitmentServiceImpl | 0 |

### CloudServiceImplTest

|                                  |                  |   |
| -------------------------------- | ---------------- | - |
| ![](images/icon_success_sml.gif) | testOfferService | 0 |

### EcommerceServiceImplTest

|                                  |                  |   |
| -------------------------------- | ---------------- | - |
| ![](images/icon_success_sml.gif) | testOfferService | 0 |

  

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
