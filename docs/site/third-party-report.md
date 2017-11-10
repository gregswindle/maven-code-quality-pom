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
      - [Third Parties](#)

-----

[![Built by
Maven](./images/logos/maven-feather.png)](http://maven.apache.org/ "Built by Maven")

## Overview

This report summarizes all third-party dependencies of the
project.

|                                  |                                                                                             |    |
| -------------------------------- | ------------------------------------------------------------------------------------------- | -- |
| ![](images/icon_info_sml.gif)    | \# of total dependencies                                                                    | 36 |
| ![](images/icon_success_sml.gif) | \# of dependencies with license declared in their pom                                       | 36 |
| ![](images/icon_warning_sml.gif) | \# of dependencies with no license in their pom, but filled in the third-party missing file | 0  |
| ![](images/icon_error_sml.gif)   | \# of dependencies with no license at all                                                   | 0  |

### Third-parties list

| Status                           | GroupId:ArtifactId:Version                                                                                                                                     | Scope   | Classifier | Type   | License(s)                                                          |
| -------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------- | ------ | ------------------------------------------------------------------- |
| ![](images/icon_success_sml.gif) | [com.google.code.findbugs:jsr305:1.3.9](./third-party-report.md#com.google.code.findbugs:jsr305:1.3.9)                                                       | compile |            | jar    | The Apache Software License, Version 2.0                            |
| ![](images/icon_success_sml.gif) | [com.google.errorprone:error\_prone\_annotations:2.0.18](./third-party-report.md#com.google.errorprone:error_prone_annotations:2.0.18)                       | compile |            | jar    | Apache 2.0                                                          |
| ![](images/icon_success_sml.gif) | [com.google.errorprone:javac-shaded:9-dev-r4023-3](./third-party-report.md#com.google.errorprone:javac-shaded:9-dev-r4023-3)                                 | compile |            | jar    | GNU General Public License, version 2, with the Classpath Exception |
| ![](images/icon_success_sml.gif) | [com.google.googlejavaformat:google-java-format:1.5](./third-party-report.md#com.google.googlejavaformat:google-java-format:1.5)                             | compile |            | jar    | The Apache Software License, Version 2.0                            |
| ![](images/icon_success_sml.gif) | [com.google.guava:guava:22.0](./third-party-report.md#com.google.guava:guava:22.0)                                                                           | compile |            | bundle | The Apache Software License, Version 2.0                            |
| ![](images/icon_success_sml.gif) | [com.google.j2objc:j2objc-annotations:1.1](./third-party-report.md#com.google.j2objc:j2objc-annotations:1.1)                                                 | compile |            | jar    | The Apache Software License, Version 2.0                            |
| ![](images/icon_success_sml.gif) | [commons-logging:commons-logging:1.2](./third-party-report.md#commons-logging:commons-logging:1.2)                                                           | compile |            | jar    | The Apache Software License, Version 2.0                            |
| ![](images/icon_success_sml.gif) | [junit:junit:4.12](./third-party-report.md#junit:junit:4.12)                                                                                                 | test    |            | jar    | Eclipse Public License 1.0                                          |
| ![](images/icon_success_sml.gif) | [org.apache.logging.log4j:log4j-api:2.9.1](./third-party-report.md#org.apache.logging.log4j:log4j-api:2.9.1)                                                 | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.apache.logging.log4j:log4j-core:2.9.1](./third-party-report.md#org.apache.logging.log4j:log4j-core:2.9.1)                                               | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.apache.maven.skins:maven-fluido-skin:1.6](./third-party-report.md#org.apache.maven.skins:maven-fluido-skin:1.6)                                         | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.apache.maven.surefire:common-java5:2.19.1](./third-party-report.md#org.apache.maven.surefire:common-java5:2.19.1)                                       | runtime |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.apache.maven.surefire:surefire-api:2.19.1](./third-party-report.md#org.apache.maven.surefire:surefire-api:2.19.1)                                       | runtime |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.apiguardian:apiguardian-api:1.0.0](./third-party-report.md#org.apiguardian:apiguardian-api:1.0.0)                                                       | test    |            | jar    | The Apache License, Version 2.0                                     |
| ![](images/icon_success_sml.gif) | [org.codehaus.mojo:animal-sniffer-annotations:1.14](./third-party-report.md#org.codehaus.mojo:animal-sniffer-annotations:1.14)                               | compile |            | jar    | MIT license                                                         |
| ![](images/icon_success_sml.gif) | [org.hamcrest:hamcrest-core:1.3](./third-party-report.md#org.hamcrest:hamcrest-core:1.3)                                                                     | test    |            | jar    | New BSD License                                                     |
| ![](images/icon_success_sml.gif) | [org.hamcrest:hamcrest-junit:2.0.0.0](./third-party-report.md#org.hamcrest:hamcrest-junit:2.0.0.0)                                                           | test    |            | jar    | Eclipse Public License - v 1.0                                      |
| ![](images/icon_success_sml.gif) | [org.hamcrest:java-hamcrest:2.0.0.0](./third-party-report.md#org.hamcrest:java-hamcrest:2.0.0.0)                                                             | test    |            | jar    | BSD Licence 3                                                       |
| ![](images/icon_success_sml.gif) | [org.junit.jupiter:junit-jupiter-api:5.0.1](./third-party-report.md#org.junit.jupiter:junit-jupiter-api:5.0.1)                                               | test    |            | jar    | Eclipse Public License v2.0                                         |
| ![](images/icon_success_sml.gif) | [org.junit.platform:junit-platform-commons:1.0.1](./third-party-report.md#org.junit.platform:junit-platform-commons:1.0.1)                                   | test    |            | jar    | Eclipse Public License v2.0                                         |
| ![](images/icon_success_sml.gif) | [org.junit.platform:junit-platform-engine:1.0.1](./third-party-report.md#org.junit.platform:junit-platform-engine:1.0.1)                                     | test    |            | jar    | Eclipse Public License v2.0                                         |
| ![](images/icon_success_sml.gif) | [org.junit.platform:junit-platform-launcher:1.0.1](./third-party-report.md#org.junit.platform:junit-platform-launcher:1.0.1)                                 | test    |            | jar    | Eclipse Public License v2.0                                         |
| ![](images/icon_success_sml.gif) | [org.junit.platform:junit-platform-runner:1.0.1](./third-party-report.md#org.junit.platform:junit-platform-runner:1.0.1)                                     | test    |            | jar    | Eclipse Public License v2.0                                         |
| ![](images/icon_success_sml.gif) | [org.junit.platform:junit-platform-suite-api:1.0.1](./third-party-report.md#org.junit.platform:junit-platform-suite-api:1.0.1)                               | test    |            | jar    | Eclipse Public License v2.0                                         |
| ![](images/icon_success_sml.gif) | [org.junit.platform:junit-platform-surefire-provider:1.0.1](./third-party-report.md#org.junit.platform:junit-platform-surefire-provider:1.0.1)               | compile |            | jar    | The Apache License, Version 2.0                                     |
| ![](images/icon_success_sml.gif) | [org.junit.vintage:junit-vintage-engine:4.12.1](./third-party-report.md#org.junit.vintage:junit-vintage-engine:4.12.1)                                       | test    |            | jar    | Eclipse Public License v2.0                                         |
| ![](images/icon_success_sml.gif) | [org.opentest4j:opentest4j:1.0.0](./third-party-report.md#org.opentest4j:opentest4j:1.0.0)                                                                   | test    |            | jar    | The Apache License, Version 2.0                                     |
| ![](images/icon_success_sml.gif) | [org.springframework:spring-aop:4.3.12.RELEASE](./third-party-report.md#org.springframework:spring-aop:4.3.12.RELEASE)                                       | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework:spring-beans:4.3.12.RELEASE](./third-party-report.md#org.springframework:spring-beans:4.3.12.RELEASE)                                   | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework:spring-context:4.3.12.RELEASE](./third-party-report.md#org.springframework:spring-context:4.3.12.RELEASE)                               | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework:spring-core:4.3.12.RELEASE](./third-party-report.md#org.springframework:spring-core:4.3.12.RELEASE)                                     | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework:spring-expression:4.3.12.RELEASE](./third-party-report.md#org.springframework:spring-expression:4.3.12.RELEASE)                         | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework:spring-test:4.3.12.RELEASE](./third-party-report.md#org.springframework:spring-test:4.3.12.RELEASE)                                     | test    |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework.boot:spring-boot:1.5.4.RELEASE](./third-party-report.md#org.springframework.boot:spring-boot:1.5.4.RELEASE)                             | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework.boot:spring-boot-autoconfigure:1.5.4.RELEASE](./third-party-report.md#org.springframework.boot:spring-boot-autoconfigure:1.5.4.RELEASE) | compile |            | jar    | Apache License, Version 2.0                                         |
| ![](images/icon_success_sml.gif) | [org.springframework.boot:spring-boot-test:1.5.4.RELEASE](./third-party-report.md#org.springframework.boot:spring-boot-test:1.5.4.RELEASE)                   | test    |            | jar    | Apache License, Version 2.0                                         |
| Status                           | GroupId:ArtifactId:Version                                                                                                                                     | Scope   | Classifier | Type   | License(s)                                                          |

## Third-parties detail with no license

Listing of Third-parties with no license.  
No such dependency.

## Third-parties details with license from Third-party file

Listing of Third-parties with no license in pom and filled in the
third-party missing file.  
No such dependency.

## Third-parties with license in pom

Listing of Third-parties with license defined in their
pom.

### com.google.code.findbugs:jsr305:1.3.9

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | com.google.code.findbugs:jsr305:1.3.9                                         |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | The Apache Software License, Version 2.0                                      |

[Back to
top](./third-party-report.md#Overview)  

### com.google.errorprone:error\_prone\_annotations:2.0.18

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | com.google.errorprone:error\_prone\_annotations:2.0.18                        |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache 2.0                                                                    |

[Back to
top](./third-party-report.md#Overview)  

### com.google.errorprone:javac-shaded:9-dev-r4023-3

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | com.google.errorprone:javac-shaded:9-dev-r4023-3                              |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | GNU General Public License, version 2, with the Classpath Exception           |

[Back to
top](./third-party-report.md#Overview)  

### com.google.googlejavaformat:google-java-format:1.5

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | com.google.googlejavaformat:google-java-format:1.5                            |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | The Apache Software License, Version 2.0                                      |

[Back to
top](./third-party-report.md#Overview)  

### com.google.guava:guava:22.0

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | com.google.guava:guava:22.0                                                   |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | bundle                                                                        |
| License(s)                 | The Apache Software License, Version 2.0                                      |

[Back to
top](./third-party-report.md#Overview)  

### com.google.j2objc:j2objc-annotations:1.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | com.google.j2objc:j2objc-annotations:1.1                                      |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | The Apache Software License, Version 2.0                                      |

[Back to
top](./third-party-report.md#Overview)  

### commons-logging:commons-logging:1.2

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | commons-logging:commons-logging:1.2                                           |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | The Apache Software License, Version 2.0                                      |

[Back to
top](./third-party-report.md#Overview)  

### junit:junit:4.12

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | junit:junit:4.12                                                              |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License 1.0                                                    |

[Back to
top](./third-party-report.md#Overview)  

### org.apache.logging.log4j:log4j-api:2.9.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.apache.logging.log4j:log4j-api:2.9.1                                      |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.apache.logging.log4j:log4j-core:2.9.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.apache.logging.log4j:log4j-core:2.9.1                                     |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.apache.maven.skins:maven-fluido-skin:1.6

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.apache.maven.skins:maven-fluido-skin:1.6                                  |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.apache.maven.surefire:common-java5:2.19.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.apache.maven.surefire:common-java5:2.19.1                                 |
| Scope                      | runtime                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.apache.maven.surefire:surefire-api:2.19.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.apache.maven.surefire:surefire-api:2.19.1                                 |
| Scope                      | runtime                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.apiguardian:apiguardian-api:1.0.0

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.apiguardian:apiguardian-api:1.0.0                                         |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | The Apache License, Version 2.0                                               |

[Back to
top](./third-party-report.md#Overview)  

### org.codehaus.mojo:animal-sniffer-annotations:1.14

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.codehaus.mojo:animal-sniffer-annotations:1.14                             |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | MIT license                                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.hamcrest:hamcrest-core:1.3

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.hamcrest:hamcrest-core:1.3                                                |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | New BSD License                                                               |

[Back to
top](./third-party-report.md#Overview)  

### org.hamcrest:hamcrest-junit:2.0.0.0

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.hamcrest:hamcrest-junit:2.0.0.0                                           |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License - v 1.0                                                |

[Back to
top](./third-party-report.md#Overview)  

### org.hamcrest:java-hamcrest:2.0.0.0

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.hamcrest:java-hamcrest:2.0.0.0                                            |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | BSD Licence 3                                                                 |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.jupiter:junit-jupiter-api:5.0.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.jupiter:junit-jupiter-api:5.0.1                                     |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License v2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.platform:junit-platform-commons:1.0.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.platform:junit-platform-commons:1.0.1                               |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License v2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.platform:junit-platform-engine:1.0.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.platform:junit-platform-engine:1.0.1                                |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License v2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.platform:junit-platform-launcher:1.0.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.platform:junit-platform-launcher:1.0.1                              |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License v2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.platform:junit-platform-runner:1.0.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.platform:junit-platform-runner:1.0.1                                |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License v2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.platform:junit-platform-suite-api:1.0.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.platform:junit-platform-suite-api:1.0.1                             |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License v2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.platform:junit-platform-surefire-provider:1.0.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.platform:junit-platform-surefire-provider:1.0.1                     |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | The Apache License, Version 2.0                                               |

[Back to
top](./third-party-report.md#Overview)  

### org.junit.vintage:junit-vintage-engine:4.12.1

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.junit.vintage:junit-vintage-engine:4.12.1                                 |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Eclipse Public License v2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.opentest4j:opentest4j:1.0.0

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.opentest4j:opentest4j:1.0.0                                               |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | The Apache License, Version 2.0                                               |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework:spring-aop:4.3.12.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework:spring-aop:4.3.12.RELEASE                                 |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework:spring-beans:4.3.12.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework:spring-beans:4.3.12.RELEASE                               |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework:spring-context:4.3.12.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework:spring-context:4.3.12.RELEASE                             |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework:spring-core:4.3.12.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework:spring-core:4.3.12.RELEASE                                |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework:spring-expression:4.3.12.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework:spring-expression:4.3.12.RELEASE                          |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework:spring-test:4.3.12.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework:spring-test:4.3.12.RELEASE                                |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework.boot:spring-boot:1.5.4.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework.boot:spring-boot:1.5.4.RELEASE                            |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework.boot:spring-boot-autoconfigure:1.5.4.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework.boot:spring-boot-autoconfigure:1.5.4.RELEASE              |
| Scope                      | compile                                                                       |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to
top](./third-party-report.md#Overview)  

### org.springframework.boot:spring-boot-test:1.5.4.RELEASE

|                            |                                                                               |
| -------------------------- | ----------------------------------------------------------------------------- |
| Status                     | ![](images/icon_success_sml.gif) License defined in the pom of the dependency |
| GroupId:ArtifactId:Version | org.springframework.boot:spring-boot-test:1.5.4.RELEASE                       |
| Scope                      | test                                                                          |
| Classifier                 |                                                                               |
| Type                       | jar                                                                           |
| License(s)                 | Apache License, Version 2.0                                                   |

[Back to top](./third-party-report.md#Overview)  

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
