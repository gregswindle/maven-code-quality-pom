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
      - [Dependencies](#)
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

## Project Dependencies

### compile

The following is a list of compile dependencies for this project. These
dependencies are required to compile and run the
application:

| GroupId                     | ArtifactId                                                                            | Version        | Type | Licenses                                                                                   |
| --------------------------- | ------------------------------------------------------------------------------------- | -------------- | ---- | ------------------------------------------------------------------------------------------ |
| com.google.googlejavaformat | [google-java-format](https://github.com/google/google-java-format/google-java-format) | 1.5            | jar  | [The Apache Software License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |
| org.apache.logging.log4j    | [log4j-core](https://logging.apache.org/log4j/2.x/log4j-core/)                        | 2.9.1          | jar  | [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt)             |
| org.apache.maven.skins      | [maven-fluido-skin](https://maven.apache.org/skins/maven-fluido-skin/)                | 1.6            | jar  | [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt)             |
| org.junit.platform          | [junit-platform-surefire-provider](http://junit.org/junit5/)                          | 1.0.1          | jar  | [The Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)          |
| org.springframework         | [spring-beans](https://github.com/spring-projects/spring-framework)                   | 4.3.12.RELEASE | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)                  |
| org.springframework         | [spring-context](https://github.com/spring-projects/spring-framework)                 | 4.3.12.RELEASE | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)                  |
| org.springframework         | [spring-core](https://github.com/spring-projects/spring-framework)                    | 4.3.12.RELEASE | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)                  |
| org.springframework.boot    | [spring-boot-autoconfigure](http://projects.spring.io/spring-boot/)                   | 1.5.4.RELEASE  | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)                  |

### test

The following is a list of test dependencies for this project. These
dependencies are only required to compile and run unit tests for the
application:

| GroupId                  | ArtifactId                                                         | Version        | Type | Licenses                                                                          |
| ------------------------ | ------------------------------------------------------------------ | -------------- | ---- | --------------------------------------------------------------------------------- |
| junit                    | [junit](http://junit.org)                                          | 4.12           | jar  | [Eclipse Public License 1.0](http://www.eclipse.org/legal/epl-v10.md)           |
| org.apiguardian          | [apiguardian-api](https://github.com/apiguardian-team/apiguardian) | 1.0.0          | jar  | [The Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |
| org.hamcrest             | [hamcrest-junit](https://github.com/hamcrest/hamcrest-junit)       | 2.0.0.0        | jar  | [Eclipse Public License - v 1.0](http://opensource.org/licenses/EPL-1.0)          |
| org.junit.jupiter        | [junit-jupiter-api](http://junit.org/junit5/)                      | 5.0.1          | jar  | [Eclipse Public License v2.0](http://www.eclipse.org/legal/epl-v20.md)          |
| org.junit.platform       | [junit-platform-launcher](http://junit.org/junit5/)                | 1.0.1          | jar  | [Eclipse Public License v2.0](http://www.eclipse.org/legal/epl-v20.md)          |
| org.junit.platform       | [junit-platform-runner](http://junit.org/junit5/)                  | 1.0.1          | jar  | [Eclipse Public License v2.0](http://www.eclipse.org/legal/epl-v20.md)          |
| org.junit.vintage        | [junit-vintage-engine](http://junit.org/junit5/)                   | 4.12.1         | jar  | [Eclipse Public License v2.0](http://www.eclipse.org/legal/epl-v20.md)          |
| org.springframework      | [spring-test](https://github.com/spring-projects/spring-framework) | 4.3.12.RELEASE | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)         |
| org.springframework.boot | [spring-boot-test](http://projects.spring.io/spring-boot/)         | 1.5.4.RELEASE  | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)         |

## Project Transitive Dependencies

The following is a list of transitive dependencies for this project.
Transitive dependencies are the dependencies of the project
dependencies.

### compile

The following is a list of compile dependencies for this project. These
dependencies are required to compile and run the
application:

| GroupId                  | ArtifactId                                                                                                                    | Version        | Type | Licenses                                                                                                           |
| ------------------------ | ----------------------------------------------------------------------------------------------------------------------------- | -------------- | ---- | ------------------------------------------------------------------------------------------------------------------ |
| com.google.code.findbugs | [jsr305](http://findbugs.sourceforge.net/)                                                                                    | 1.3.9          | jar  | [The Apache Software License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)                         |
| com.google.errorprone    | [error\_prone\_annotations](http://nexus.sonatype.org/oss-repository-hosting.md/error_prone_parent/error_prone_annotations) | 2.0.18         | jar  | [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)                                                       |
| com.google.errorprone    | [javac-shaded](https://github.com/google/error-prone-javac)                                                                   | 9-dev-r4023-3  | jar  | [GNU General Public License, version 2, with the Classpath Exception](http://openjdk.java.net/legal/gplv2+ce.md) |
| com.google.guava         | [guava](https://github.com/google/guava/guava)                                                                                | 22.0           | jar  | [The Apache Software License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)                         |
| com.google.j2objc        | [j2objc-annotations](https://github.com/google/j2objc/)                                                                       | 1.1            | jar  | [The Apache Software License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)                         |
| commons-logging          | [commons-logging](http://commons.apache.org/proper/commons-logging/)                                                          | 1.2            | jar  | [The Apache Software License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)                         |
| org.apache.logging.log4j | [log4j-api](https://logging.apache.org/log4j/2.x/log4j-api/)                                                                  | 2.9.1          | jar  | [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt)                                     |
| org.codehaus.mojo        | [animal-sniffer-annotations](http://mojo.codehaus.org/animal-sniffer/animal-sniffer-annotations)                              | 1.14           | jar  | [MIT license](http://www.opensource.org/licenses/mit-license.php)                                                  |
| org.springframework      | [spring-aop](https://github.com/spring-projects/spring-framework)                                                             | 4.3.12.RELEASE | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)                                          |
| org.springframework      | [spring-expression](https://github.com/spring-projects/spring-framework)                                                      | 4.3.12.RELEASE | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)                                          |
| org.springframework.boot | [spring-boot](http://projects.spring.io/spring-boot/)                                                                         | 1.5.4.RELEASE  | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)                                          |

### runtime

The following is a list of runtime dependencies for this project. These
dependencies are required to run the
application:

| GroupId                   | ArtifactId                                                                        | Version | Type | Licenses                                                                      |
| ------------------------- | --------------------------------------------------------------------------------- | ------- | ---- | ----------------------------------------------------------------------------- |
| org.apache.maven.surefire | [common-java5](http://maven.apache.org/surefire/surefire-providers/common-java5/) | 2.19.1  | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |
| org.apache.maven.surefire | [surefire-api](http://maven.apache.org/surefire/surefire-api/)                    | 2.19.1  | jar  | [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |

### test

The following is a list of test dependencies for this project. These
dependencies are only required to compile and run unit tests for the
application:

| GroupId            | ArtifactId                                                              | Version | Type | Licenses                                                                          |
| ------------------ | ----------------------------------------------------------------------- | ------- | ---- | --------------------------------------------------------------------------------- |
| org.hamcrest       | [hamcrest-core](https://github.com/hamcrest/JavaHamcrest/hamcrest-core) | 1.3     | jar  | [New BSD License](http://www.opensource.org/licenses/bsd-license.php)             |
| org.hamcrest       | [java-hamcrest](http://hamcrest.org/JavaHamcrest/)                      | 2.0.0.0 | jar  | [BSD Licence 3](http://opensource.org/licenses/BSD-3-Clause)                      |
| org.junit.platform | [junit-platform-commons](http://junit.org/junit5/)                      | 1.0.1   | jar  | [Eclipse Public License v2.0](http://www.eclipse.org/legal/epl-v20.md)          |
| org.junit.platform | [junit-platform-engine](http://junit.org/junit5/)                       | 1.0.1   | jar  | [Eclipse Public License v2.0](http://www.eclipse.org/legal/epl-v20.md)          |
| org.junit.platform | [junit-platform-suite-api](http://junit.org/junit5/)                    | 1.0.1   | jar  | [Eclipse Public License v2.0](http://www.eclipse.org/legal/epl-v20.md)          |
| org.opentest4j     | [opentest4j](https://github.com/ota4j-team/opentest4j)                  | 1.0.0   | jar  | [The Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |

## Project Dependency Graph

### Dependency Tree

  - net.swindle:maven-code-quality-pom:jar:0.0.1-SNAPSHOT
    ![\[Information\]](./images/icon_info_sml.gif)
    <table>
    <colgroup>
    <col style="width: 100%" />
    </colgroup>
    <thead>
    <tr class="header">
    <th>maven-code-quality-pom</th>
    </tr>
    </thead>
    <tbody>
    <tr class="odd">
    <td><p><strong>Description:</strong> &lt;h2&gt;Code quality enforcement and reporting&lt;/h3&gt;&lt;p&gt;&lt;strong&gt;Enforce and report code quality with JUnit, JaCoCo, Hamcrest, FindBugs, PMD, CodeNarc, Checkstyle (Google), Enforcer, Duplicate-Finder, JDepend, and more with this Maven POM.&lt;/strong&gt;&lt;/p&gt;&lt;p&gt;&lt;code&gt;maven-code-quality-pom&lt;/code&gt; is a spike Spring solution for providing Maven POMs with quality assurance features.&lt;/p&gt;&lt;h3&gt;Purpose&lt;/h3&gt;&lt;p&gt;The purpose of the project is to use the Maven Site Plugin to:&lt;/p&gt;&lt;ol&gt;&lt;li&gt; Use the Maven Site Plugin to generate meaningful test and quality reporting artifacts&lt;/li&gt;&lt;li&gt; Enforce test coverage thresholds and code standards&lt;/li&gt;&lt;li&gt; Prevent source code that does not conform to standards from being merged into &lt;code&gt;master&lt;/code&gt;.&lt;/li&gt;&lt;/ol&gt;</p>
    <p><strong>URL:</strong> <a href="https://github.com/gregswindle/maven-code-quality-pom" class="uri externalLink">https://github.com/gregswindle/maven-code-quality-pom</a></p>
    <p><strong>Project Licenses:</strong> <a href="LICENSE">MIT</a></p></td>
    </tr>
    </tbody>
    </table>
      - org.springframework:spring-core:jar:4.3.12.RELEASE (compile)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Spring Core</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Spring Core</p>
        <p><strong>URL:</strong> <a href="https://github.com/spring-projects/spring-framework" class="uri externalLink">https://github.com/spring-projects/spring-framework</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - commons-logging:commons-logging:jar:1.2 (compile)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Apache Commons Logging</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Apache Commons Logging is a thin adapter allowing configurable bridging to other, well known logging systems.</p>
            <p><strong>URL:</strong> <a href="http://commons.apache.org/proper/commons-logging/" class="uri externalLink">http://commons.apache.org/proper/commons-logging/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache Software License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.springframework:spring-context:jar:4.3.12.RELEASE (compile)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Spring Context</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Spring Context</p>
        <p><strong>URL:</strong> <a href="https://github.com/spring-projects/spring-framework" class="uri externalLink">https://github.com/spring-projects/spring-framework</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.springframework:spring-aop:jar:4.3.12.RELEASE (compile)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Spring AOP</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Spring AOP</p>
            <p><strong>URL:</strong> <a href="https://github.com/spring-projects/spring-framework" class="uri externalLink">https://github.com/spring-projects/spring-framework</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
          - org.springframework:spring-expression:jar:4.3.12.RELEASE
            (compile) ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Spring Expression Language (SpEL)</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Spring Expression Language (SpEL)</p>
            <p><strong>URL:</strong> <a href="https://github.com/spring-projects/spring-framework" class="uri externalLink">https://github.com/spring-projects/spring-framework</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.springframework:spring-beans:jar:4.3.12.RELEASE (compile)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Spring Beans</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Spring Beans</p>
        <p><strong>URL:</strong> <a href="https://github.com/spring-projects/spring-framework" class="uri externalLink">https://github.com/spring-projects/spring-framework</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
      - org.apache.logging.log4j:log4j-core:jar:2.9.1 (compile)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Apache Log4j Core</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> The Apache Log4j Implementation</p>
        <p><strong>URL:</strong> <a href="https://logging.apache.org/log4j/2.x/log4j-core/" class="uri externalLink">https://logging.apache.org/log4j/2.x/log4j-core/</a></p>
        <p><strong>Project Licenses:</strong> <a href="https://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.apache.logging.log4j:log4j-api:jar:2.9.1 (compile)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Apache Log4j API</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> The Apache Log4j API</p>
            <p><strong>URL:</strong> <a href="https://logging.apache.org/log4j/2.x/log4j-api/" class="uri externalLink">https://logging.apache.org/log4j/2.x/log4j-api/</a></p>
            <p><strong>Project Licenses:</strong> <a href="https://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">Apache License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.junit.platform:junit-platform-surefire-provider:jar:1.0.1
        (compile) ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>org.junit.platform:junit-platform-surefire-provider</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Module &quot;junit-platform-surefire-provider&quot; of JUnit 5.</p>
        <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.apache.maven.surefire:surefire-api:jar:2.19.1 (runtime)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>SureFire API</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> API used in Surefire and Failsafe MOJO, Booter, Common and test framework providers.</p>
            <p><strong>URL:</strong> <a href="http://maven.apache.org/surefire/surefire-api/" class="uri externalLink">http://maven.apache.org/surefire/surefire-api/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">Apache License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
          - org.apache.maven.surefire:common-java5:jar:2.19.1 (runtime)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Shared Java 5 Provider Base</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Shared Java 5 code for all providers.</p>
            <p><strong>URL:</strong> <a href="http://maven.apache.org/surefire/surefire-providers/common-java5/" class="uri externalLink">http://maven.apache.org/surefire/surefire-providers/common-java5/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">Apache License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.springframework.boot:spring-boot-autoconfigure:jar:1.5.4.RELEASE
        (compile) ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Spring Boot AutoConfigure</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Spring Boot AutoConfigure</p>
        <p><strong>URL:</strong> <a href="http://projects.spring.io/spring-boot/" class="uri externalLink">http://projects.spring.io/spring-boot/</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.springframework.boot:spring-boot:jar:1.5.4.RELEASE
            (compile) ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Spring Boot</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Spring Boot</p>
            <p><strong>URL:</strong> <a href="http://projects.spring.io/spring-boot/" class="uri externalLink">http://projects.spring.io/spring-boot/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.junit.jupiter:junit-jupiter-api:jar:5.0.1 (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>org.junit.jupiter:junit-jupiter-api</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Module &quot;junit-jupiter-api&quot; of JUnit 5.</p>
        <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v20.md" class="externalLink">Eclipse Public License v2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.opentest4j:opentest4j:jar:1.0.0 (test)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>org.opentest4j:opentest4j</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Open Test Alliance for the JVM</p>
            <p><strong>URL:</strong> <a href="https://github.com/ota4j-team/opentest4j" class="uri externalLink">https://github.com/ota4j-team/opentest4j</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
          - org.junit.platform:junit-platform-commons:jar:1.0.1 (test)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>org.junit.platform:junit-platform-commons</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Module &quot;junit-platform-commons&quot; of JUnit 5.</p>
            <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v20.md" class="externalLink">Eclipse Public License v2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.junit.vintage:junit-vintage-engine:jar:4.12.1 (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>org.junit.vintage:junit-vintage-engine</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Module &quot;junit-vintage-engine&quot; of JUnit 5.</p>
        <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v20.md" class="externalLink">Eclipse Public License v2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.junit.platform:junit-platform-engine:jar:1.0.1 (test)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>org.junit.platform:junit-platform-engine</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Module &quot;junit-platform-engine&quot; of JUnit 5.</p>
            <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v20.md" class="externalLink">Eclipse Public License v2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.junit.platform:junit-platform-launcher:jar:1.0.1 (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>org.junit.platform:junit-platform-launcher</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Module &quot;junit-platform-launcher&quot; of JUnit 5.</p>
        <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v20.md" class="externalLink">Eclipse Public License v2.0</a></p></td>
        </tr>
        </tbody>
        </table>
      - org.junit.platform:junit-platform-runner:jar:1.0.1 (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>org.junit.platform:junit-platform-runner</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Module &quot;junit-platform-runner&quot; of JUnit 5.</p>
        <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v20.md" class="externalLink">Eclipse Public License v2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.junit.platform:junit-platform-suite-api:jar:1.0.1 (test)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>org.junit.platform:junit-platform-suite-api</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Module &quot;junit-platform-suite-api&quot; of JUnit 5.</p>
            <p><strong>URL:</strong> <a href="http://junit.org/junit5/" class="uri externalLink">http://junit.org/junit5/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v20.md" class="externalLink">Eclipse Public License v2.0</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.springframework:spring-test:jar:4.3.12.RELEASE (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Spring TestContext Framework</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Spring TestContext Framework</p>
        <p><strong>URL:</strong> <a href="https://github.com/spring-projects/spring-framework" class="uri externalLink">https://github.com/spring-projects/spring-framework</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
      - org.springframework.boot:spring-boot-test:jar:1.5.4.RELEASE
        (test) ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Spring Boot Test</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Spring Boot Test</p>
        <p><strong>URL:</strong> <a href="http://projects.spring.io/spring-boot/" class="uri externalLink">http://projects.spring.io/spring-boot/</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
      - org.hamcrest:hamcrest-junit:jar:2.0.0.0 (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Hamcrest JUnit</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> Classes to use Hamcrest matchers within JUnit tests</p>
        <p><strong>URL:</strong> <a href="https://github.com/hamcrest/hamcrest-junit" class="uri externalLink">https://github.com/hamcrest/hamcrest-junit</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://opensource.org/licenses/EPL-1.0" class="externalLink">Eclipse Public License - v 1.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.hamcrest:java-hamcrest:jar:2.0.0.0 (test)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Java Hamcrest</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Hamcrest matcher library for Java</p>
            <p><strong>URL:</strong> <a href="http://hamcrest.org/JavaHamcrest/" class="uri externalLink">http://hamcrest.org/JavaHamcrest/</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://opensource.org/licenses/BSD-3-Clause" class="externalLink">BSD Licence 3</a></p></td>
            </tr>
            </tbody>
            </table>
      - junit:junit:jar:4.12 (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>JUnit</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> JUnit is a unit testing framework for Java, created by Erich Gamma and Kent Beck.</p>
        <p><strong>URL:</strong> <a href="http://junit.org" class="uri externalLink">http://junit.org</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.eclipse.org/legal/epl-v10.md" class="externalLink">Eclipse Public License 1.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - org.hamcrest:hamcrest-core:jar:1.3 (test)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Hamcrest Core</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> This is the core API of hamcrest matcher framework to be used by third-party framework providers. This includes the a foundation set of matcher implementations for common operations.</p>
            <p><strong>URL:</strong> <a href="https://github.com/hamcrest/JavaHamcrest/hamcrest-core" class="uri externalLink">https://github.com/hamcrest/JavaHamcrest/hamcrest-core</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.opensource.org/licenses/bsd-license.php" class="externalLink">New BSD License</a></p></td>
            </tr>
            </tbody>
            </table>
      - org.apiguardian:apiguardian-api:jar:1.0.0 (test)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>org.apiguardian:apiguardian-api</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> @API Guardian</p>
        <p><strong>URL:</strong> <a href="https://github.com/apiguardian-team/apiguardian" class="uri externalLink">https://github.com/apiguardian-team/apiguardian</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
      - org.apache.maven.skins:maven-fluido-skin:jar:1.6 (compile)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Apache Maven Fluido Skin</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> The Apache Maven Fluido Skin is an Apache Maven site skin built on top of Twitter's bootstrap.</p>
        <p><strong>URL:</strong> <a href="https://maven.apache.org/skins/maven-fluido-skin/" class="uri externalLink">https://maven.apache.org/skins/maven-fluido-skin/</a></p>
        <p><strong>Project Licenses:</strong> <a href="https://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">Apache License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
      - com.google.googlejavaformat:google-java-format:jar:1.5 (compile)
        ![\[Information\]](./images/icon_info_sml.gif)
        <table>
        <colgroup>
        <col style="width: 100%" />
        </colgroup>
        <thead>
        <tr class="header">
        <th>Google Java Format</th>
        </tr>
        </thead>
        <tbody>
        <tr class="odd">
        <td><p><strong>Description:</strong> A Java source code formatter that follows Google Java Style.</p>
        <p><strong>URL:</strong> <a href="https://github.com/google/google-java-format/google-java-format" class="uri externalLink">https://github.com/google/google-java-format/google-java-format</a></p>
        <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache Software License, Version 2.0</a></p></td>
        </tr>
        </tbody>
        </table>
          - com.google.guava:guava:jar:22.0 (compile)
            ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Guava: Google Core Libraries for Java</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> Guava is a suite of core and expanded libraries that include utility classes, google's collections, io classes, and much much more. Guava has only one code dependency - javax.annotation, per the JSR-305 spec.</p>
            <p><strong>URL:</strong> <a href="https://github.com/google/guava/guava" class="uri externalLink">https://github.com/google/guava/guava</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache Software License, Version 2.0</a></p></td>
            </tr>
            </tbody>
            </table>
              - com.google.code.findbugs:jsr305:jar:1.3.9 (compile)
                ![\[Information\]](./images/icon_info_sml.gif)
                <table>
                <colgroup>
                <col style="width: 100%" />
                </colgroup>
                <thead>
                <tr class="header">
                <th>FindBugs-jsr305</th>
                </tr>
                </thead>
                <tbody>
                <tr class="odd">
                <td><p><strong>Description:</strong> JSR305 Annotations for Findbugs</p>
                <p><strong>URL:</strong> <a href="http://findbugs.sourceforge.net/" class="uri externalLink">http://findbugs.sourceforge.net/</a></p>
                <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache Software License, Version 2.0</a></p></td>
                </tr>
                </tbody>
                </table>
              - com.google.errorprone:error\_prone\_annotations:jar:2.0.18
                (compile) ![\[Information\]](./images/icon_info_sml.gif)
                <table>
                <colgroup>
                <col style="width: 100%" />
                </colgroup>
                <thead>
                <tr class="header">
                <th>error-prone annotations</th>
                </tr>
                </thead>
                <tbody>
                <tr class="odd">
                <td><p><strong>Description:</strong> Sonatype helps open source projects to set up Maven repositories on https://oss.sonatype.org/</p>
                <p><strong>URL:</strong> <a href="http://nexus.sonatype.org/oss-repository-hosting.md/error_prone_parent/error_prone_annotations" class="uri externalLink">http://nexus.sonatype.org/oss-repository-hosting.md/error_prone_parent/error_prone_annotations</a></p>
                <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">Apache 2.0</a></p></td>
                </tr>
                </tbody>
                </table>
              - com.google.j2objc:j2objc-annotations:jar:1.1 (compile)
                ![\[Information\]](./images/icon_info_sml.gif)
                <table>
                <colgroup>
                <col style="width: 100%" />
                </colgroup>
                <thead>
                <tr class="header">
                <th>J2ObjC Annotations</th>
                </tr>
                </thead>
                <tbody>
                <tr class="odd">
                <td><p><strong>Description:</strong> A set of annotations that provide additional information to the J2ObjC translator to modify the result of translation.</p>
                <p><strong>URL:</strong> <a href="https://github.com/google/j2objc/" class="uri externalLink">https://github.com/google/j2objc/</a></p>
                <p><strong>Project Licenses:</strong> <a href="http://www.apache.org/licenses/LICENSE-2.0.txt" class="externalLink">The Apache Software License, Version 2.0</a></p></td>
                </tr>
                </tbody>
                </table>
              - org.codehaus.mojo:animal-sniffer-annotations:jar:1.14
                (compile) ![\[Information\]](./images/icon_info_sml.gif)
                <table>
                <colgroup>
                <col style="width: 100%" />
                </colgroup>
                <thead>
                <tr class="header">
                <th>Animal Sniffer Annotations</th>
                </tr>
                </thead>
                <tbody>
                <tr class="odd">
                <td><p><strong>Description:</strong> Animal Sniffer Parent project.</p>
                <p><strong>URL:</strong> <a href="http://mojo.codehaus.org/animal-sniffer/animal-sniffer-annotations" class="uri externalLink">http://mojo.codehaus.org/animal-sniffer/animal-sniffer-annotations</a></p>
                <p><strong>Project Licenses:</strong> <a href="http://www.opensource.org/licenses/mit-license.php" class="externalLink">MIT license</a></p></td>
                </tr>
                </tbody>
                </table>
          - com.google.errorprone:javac-shaded:jar:9-dev-r4023-3
            (compile) ![\[Information\]](./images/icon_info_sml.gif)
            <table>
            <colgroup>
            <col style="width: 100%" />
            </colgroup>
            <thead>
            <tr class="header">
            <th>Error Prone shaded javac</th>
            </tr>
            </thead>
            <tbody>
            <tr class="odd">
            <td><p><strong>Description:</strong> A repackaged and shaded copy of javac</p>
            <p><strong>URL:</strong> <a href="https://github.com/google/error-prone-javac" class="uri externalLink">https://github.com/google/error-prone-javac</a></p>
            <p><strong>Project Licenses:</strong> <a href="http://openjdk.java.net/legal/gplv2+ce.md" class="externalLink">GNU General Public License, version 2, with the Classpath Exception</a></p></td>
            </tr>
            </tbody>
            </table>

## Licenses

**The Apache License, Version 2.0:** org.apiguardian:apiguardian-api,
org.junit.platform:junit-platform-surefire-provider,
org.opentest4j:opentest4j

**Eclipse Public License 1.0:** JUnit

**Apache 2.0:** error-prone annotations

**GNU General Public License, version 2, with the Classpath Exception:**
Error Prone shaded javac

**Apache License, Version 2.0:** Apache Log4j API, Apache Log4j Core,
Apache Maven Fluido Skin, Shared Java 5 Provider Base, Spring AOP,
Spring Beans, Spring Boot, Spring Boot AutoConfigure, Spring Boot Test,
Spring Context, Spring Core, Spring Expression Language (SpEL), Spring
TestContext Framework, SureFire API

**Eclipse Public License v2.0:** org.junit.jupiter:junit-jupiter-api,
org.junit.platform:junit-platform-commons,
org.junit.platform:junit-platform-engine,
org.junit.platform:junit-platform-launcher,
org.junit.platform:junit-platform-runner,
org.junit.platform:junit-platform-suite-api,
org.junit.vintage:junit-vintage-engine

**MIT:** maven-code-quality-pom

**MIT license:** Animal Sniffer Annotations

**New BSD License:** Hamcrest Core

**The Apache Software License, Version 2.0:** Apache Commons Logging,
FindBugs-jsr305, Google Java Format, Guava: Google Core Libraries for
Java, J2ObjC Annotations

**BSD Licence 3:** Java Hamcrest

**Eclipse Public License - v 1.0:** Hamcrest
JUnit

## Dependency File Details

| Filename                                    | Size              | Entries       | Classes       | Packages     | Java Version | Debug Information |
| ------------------------------------------- | ----------------- | ------------- | ------------- | ------------ | ------------ | ----------------- |
| jsr305-1.3.9.jar                            | 33 kB             | 72            | 35            | 3            | 1.5          | Yes               |
| error\_prone\_annotations-2.0.18.jar        | 12.1 kB           | 31            | 19            | 2            | 1.7          | No                |
| javac-shaded-9-dev-r4023-3.jar              | 2.8 MB            | 1732          | 1689          | 35           | 1.8          | Yes               |
| google-java-format-1.5.jar                  | 222.9 kB          | 133           | 120           | 4            | 1.8          | Yes               |
| guava-22.0.jar                              | 2.6 MB            | 1895          | 1865          | 18           | 1.8          | Yes               |
| j2objc-annotations-1.1.jar                  | 8.8 kB            | 23            | 12            | 1            | 1.5          | Yes               |
| commons-logging-1.2.jar                     | 61.8 kB           | 42            | 28            | 2            | 1.2          | Yes               |
| junit-4.12.jar                              | 314.9 kB          | 323           | 286           | 30           | 1.5          | Yes               |
| log4j-api-2.9.1.jar                         | 239.9 kB          | 173           | 145           | 6            | \-           | Yes               |
| log4j-core-2.9.1.jar                        | 1.5 MB            | 1095          | 1015          | 49           | 1.7          | Yes               |
| maven-fluido-skin-1.6.jar                   | 350 kB            | 56            | 0             | 0            | \-           | No                |
| common-java5-2.19.1.jar                     | 44.1 kB           | 47            | 8             | 2            | 1.5          | Yes               |
| surefire-api-2.19.1.jar                     | 196.1 kB          | 162           | 116           | 14           | 1.5          | Yes               |
| apiguardian-api-1.0.0.jar                   | 2.2 kB            | 7             | 2             | 1            | 1.6          | Yes               |
| animal-sniffer-annotations-1.14.jar         | 3.5 kB            | 12            | 1             | 1            | 1.5          | No                |
| hamcrest-core-1.3.jar                       | 45 kB             | 52            | 45            | 3            | 1.5          | Yes               |
| hamcrest-junit-2.0.0.0.jar                  | 14.3 kB           | 21            | 15            | 2            | 1.7          | Yes               |
| java-hamcrest-2.0.0.0.jar                   | 112.9 kB          | 115           | 101           | 11           | 1.7          | Yes               |
| junit-jupiter-api-5.0.1.jar                 | 76 kB             | 74            | 64            | 3            | 1.8          | Yes               |
| junit-platform-commons-1.0.1.jar            | 62.5 kB           | 38            | 26            | 5            | 1.8          | Yes               |
| junit-platform-engine-1.0.1.jar             | 87.8 kB           | 77            | 63            | 6            | 1.8          | Yes               |
| junit-platform-launcher-1.0.1.jar           | 54.1 kB           | 38            | 28            | 3            | 1.8          | Yes               |
| junit-platform-runner-1.0.1.jar             | 17.3 kB           | 11            | 3             | 1            | 1.8          | Yes               |
| junit-platform-suite-api-1.0.1.jar          | 12.9 kB           | 20            | 11            | 1            | 1.8          | No                |
| junit-platform-surefire-provider-1.0.1.jar  | 14.9 kB           | 14            | 3             | 1            | 1.8          | Yes               |
| junit-vintage-engine-4.12.1.jar             | 55.6 kB           | 44            | 30            | 5            | 1.8          | Yes               |
| opentest4j-1.0.0.jar                        | 6.6 kB            | 10            | 6             | 1            | 1.6          | Yes               |
| spring-aop-4.3.12.RELEASE.jar               | 380.4 kB          | 306           | 269           | 17           | 1.6          | Yes               |
| spring-beans-4.3.12.RELEASE.jar             | 763.3 kB          | 463           | 408           | 15           | 1.6          | Yes               |
| spring-context-4.3.12.RELEASE.jar           | 1.1 MB            | 890           | 768           | 66           | 1.6          | Yes               |
| spring-core-4.3.12.RELEASE.jar              | 1.1 MB            | 842           | 793           | 42           | 1.6          | Yes               |
| spring-expression-4.3.12.RELEASE.jar        | 263.7 kB          | 156           | 142           | 6            | 1.6          | Yes               |
| spring-test-4.3.12.RELEASE.jar              | 601.9 kB          | 485           | 445           | 31           | 1.6          | Yes               |
| spring-boot-1.5.4.RELEASE.jar               | 673.9 kB          | 534           | 458           | 42           | 1.6          | Yes               |
| spring-boot-autoconfigure-1.5.4.RELEASE.jar | 1.1 MB            | 944           | 850           | 76           | 1.6          | Yes               |
| spring-boot-test-1.5.4.RELEASE.jar          | 145.6 kB          | 123           | 99            | 10           | 1.6          | Yes               |
| Total                                       | Size              | Entries       | Classes       | Packages     | Java Version | Debug Information |
| 36                                          | 15.2 MB           | 11060         | 9968          | 515          | 1.8          | 32                |
| compile: 19                                 | compile: 13.3 MB  | compile: 9413 | compile: 8620 | compile: 386 | \-           | compile: 16       |
| test: 15                                    | test: 1.6 MB      | test: 1438    | test: 1224    | test: 113    | \-           | test: 14          |
| runtime: 2                                  | runtime: 240.2 kB | runtime: 209  | runtime: 124  | runtime: 16  | \-           | runtime: 2        |

## Dependency Repository Locations

| Repo ID                  | URL                                                       | Release | Snapshot | Blacklisted |
| ------------------------ | --------------------------------------------------------- | ------- | -------- | ----------- |
| central                  | <https://repo.maven.apache.org/maven2>                    | Yes     | No       | No          |
| codehaus-snapshots       | <http://nexus.codehaus.org/snapshots/>                    | No      | Yes      | Yes         |
| spring-milestones        | <http://repo.spring.io/milestone>                         | Yes     | No       | No          |
| spring-snapshots         | <http://repo.spring.io/snapshot>                          | Yes     | Yes      | No          |
| spring-ext               | <http://repo.spring.io/ext-release-local/>                | Yes     | No       | No          |
| sonatype-nexus-snapshots | <https://oss.sonatype.org/content/repositories/snapshots> | No      | Yes      | No          |
| apache.snapshots         | <http://repository.apache.org/snapshots>                  | No      | Yes      | No          |

Repository locations for each of the
Dependencies.

| Artifact                                                             | central                                                                                                                                                                                                                            | spring-milestones                                                                                                                                                                                                        | spring-snapshots | spring-ext | sonatype-nexus-snapshots | apache.snapshots |
| -------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------------- | ---------- | ------------------------ | ---------------- |
| com.google.code.findbugs:jsr305:jar:1.3.9                            | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar)                                                       | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| com.google.errorprone:error\_prone\_annotations:jar:2.0.18           | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.0.18/error_prone_annotations-2.0.18.jar)                      | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| com.google.errorprone:javac-shaded:jar:9-dev-r4023-3                 | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/com/google/errorprone/javac-shaded/9-dev-r4023-3/javac-shaded-9-dev-r4023-3.jar)                              | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| com.google.googlejavaformat:google-java-format:jar:1.5               | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/com/google/googlejavaformat/google-java-format/1.5/google-java-format-1.5.jar)                                | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| com.google.guava:guava:jar:22.0                                      | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/com/google/guava/guava/22.0/guava-22.0.jar)                                                                   | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| com.google.j2objc:j2objc-annotations:jar:1.1                         | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar)                                          | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| commons-logging:commons-logging:jar:1.2                              | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar)                                                  | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| junit:junit:jar:4.12                                                 | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar)                                                                              | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.apache.logging.log4j:log4j-api:jar:2.9.1                         | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.9.1/log4j-api-2.9.1.jar)                                                 | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.apache.logging.log4j:log4j-core:jar:2.9.1                        | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-core/2.9.1/log4j-core-2.9.1.jar)                                               | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.apache.maven.skins:maven-fluido-skin:jar:1.6                     | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/apache/maven/skins/maven-fluido-skin/1.6/maven-fluido-skin-1.6.jar)                                       | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.apache.maven.surefire:common-java5:jar:2.19.1                    | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/2.19.1/common-java5-2.19.1.jar)                                        | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.apache.maven.surefire:surefire-api:jar:2.19.1                    | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.19.1/surefire-api-2.19.1.jar)                                        | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.apiguardian:apiguardian-api:jar:1.0.0                            | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.0.0/apiguardian-api-1.0.0.jar)                                              | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.codehaus.mojo:animal-sniffer-annotations:jar:1.14                | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar)                        | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.hamcrest:hamcrest-core:jar:1.3                                   | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar)                                                         | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.hamcrest:hamcrest-junit:jar:2.0.0.0                              | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-junit/2.0.0.0/hamcrest-junit-2.0.0.0.jar)                                               | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.hamcrest:java-hamcrest:jar:2.0.0.0                               | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/hamcrest/java-hamcrest/2.0.0.0/java-hamcrest-2.0.0.0.jar)                                                 | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.jupiter:junit-jupiter-api:jar:5.0.1                        | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.0.1/junit-jupiter-api-5.0.1.jar)                                        | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.platform:junit-platform-commons:jar:1.0.1                  | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.0.1/junit-platform-commons-1.0.1.jar)                             | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.platform:junit-platform-engine:jar:1.0.1                   | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.0.1/junit-platform-engine-1.0.1.jar)                               | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.platform:junit-platform-launcher:jar:1.0.1                 | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.0.1/junit-platform-launcher-1.0.1.jar)                           | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.platform:junit-platform-runner:jar:1.0.1                   | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-runner/1.0.1/junit-platform-runner-1.0.1.jar)                               | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.platform:junit-platform-suite-api:jar:1.0.1                | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-suite-api/1.0.1/junit-platform-suite-api-1.0.1.jar)                         | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.platform:junit-platform-surefire-provider:jar:1.0.1        | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-surefire-provider/1.0.1/junit-platform-surefire-provider-1.0.1.jar)         | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.junit.vintage:junit-vintage-engine:jar:4.12.1                    | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/junit/vintage/junit-vintage-engine/4.12.1/junit-vintage-engine-4.12.1.jar)                                | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.opentest4j:opentest4j:jar:1.0.0                                  | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.0.0/opentest4j-1.0.0.jar)                                                         | \-                                                                                                                                                                                                                       | \-               | \-         | \-                       | \-               |
| org.springframework:spring-aop:jar:4.3.12.RELEASE                    | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/spring-aop/4.3.12.RELEASE/spring-aop-4.3.12.RELEASE.jar)                                  | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/spring-aop/4.3.12.RELEASE/spring-aop-4.3.12.RELEASE.jar)                                  | \-               | \-         | \-                       | \-               |
| org.springframework:spring-beans:jar:4.3.12.RELEASE                  | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/spring-beans/4.3.12.RELEASE/spring-beans-4.3.12.RELEASE.jar)                              | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/spring-beans/4.3.12.RELEASE/spring-beans-4.3.12.RELEASE.jar)                              | \-               | \-         | \-                       | \-               |
| org.springframework:spring-context:jar:4.3.12.RELEASE                | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/spring-context/4.3.12.RELEASE/spring-context-4.3.12.RELEASE.jar)                          | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/spring-context/4.3.12.RELEASE/spring-context-4.3.12.RELEASE.jar)                          | \-               | \-         | \-                       | \-               |
| org.springframework:spring-core:jar:4.3.12.RELEASE                   | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/spring-core/4.3.12.RELEASE/spring-core-4.3.12.RELEASE.jar)                                | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/spring-core/4.3.12.RELEASE/spring-core-4.3.12.RELEASE.jar)                                | \-               | \-         | \-                       | \-               |
| org.springframework:spring-expression:jar:4.3.12.RELEASE             | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/spring-expression/4.3.12.RELEASE/spring-expression-4.3.12.RELEASE.jar)                    | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/spring-expression/4.3.12.RELEASE/spring-expression-4.3.12.RELEASE.jar)                    | \-               | \-         | \-                       | \-               |
| org.springframework:spring-test:jar:4.3.12.RELEASE                   | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/spring-test/4.3.12.RELEASE/spring-test-4.3.12.RELEASE.jar)                                | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/spring-test/4.3.12.RELEASE/spring-test-4.3.12.RELEASE.jar)                                | \-               | \-         | \-                       | \-               |
| org.springframework.boot:spring-boot:jar:1.5.4.RELEASE               | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/1.5.4.RELEASE/spring-boot-1.5.4.RELEASE.jar)                             | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/boot/spring-boot/1.5.4.RELEASE/spring-boot-1.5.4.RELEASE.jar)                             | \-               | \-         | \-                       | \-               |
| org.springframework.boot:spring-boot-autoconfigure:jar:1.5.4.RELEASE | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/1.5.4.RELEASE/spring-boot-autoconfigure-1.5.4.RELEASE.jar) | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/boot/spring-boot-autoconfigure/1.5.4.RELEASE/spring-boot-autoconfigure-1.5.4.RELEASE.jar) | \-               | \-         | \-                       | \-               |
| org.springframework.boot:spring-boot-test:jar:1.5.4.RELEASE          | [![Found at https://repo.maven.apache.org/maven2](images/icon_success_sml.gif)](https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/1.5.4.RELEASE/spring-boot-test-1.5.4.RELEASE.jar)                   | [![Found at http://repo.spring.io/milestone](images/icon_success_sml.gif)](http://repo.spring.io/milestone/org/springframework/boot/spring-boot-test/1.5.4.RELEASE/spring-boot-test-1.5.4.RELEASE.jar)                   | \-               | \-         | \-                       | \-               |
| Total                                                                | central                                                                                                                                                                                                                            | spring-milestones                                                                                                                                                                                                        | spring-snapshots | spring-ext | sonatype-nexus-snapshots | apache.snapshots |
| 36 (compile: 19, test: 15, runtime: 2)                               | 36                                                                                                                                                                                                                                 | 9                                                                                                                                                                                                                        | 0                | 0          | 0                        | 0                |

-----

Copyright ©2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
