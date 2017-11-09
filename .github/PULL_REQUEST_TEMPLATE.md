## Description of change

_Please describe your changes here._

## Associated issue(s)

_Reference issues pertinent to this PR here If there are no issues referenced,
replace this line and the following task completion line._

## PR check-list
> **:white_check_mark: Please review and check the appropriate items.**

### 1. Acceptance criteria

- [ ] The acceptance criteria for all associated issues have been completed, tested, and validated.

### 2. **Test coverage** [![Coverage Status][sonar-coverage-img]][sonar-coverage-url]

- [ ] The source code is 100% covered with passing specs.

### 3. Code standards compliance
[![JavaScript Style Guide](https://cdn.rawgit.com/feross/standard/master/badge.svg)](https://github.com/feross/standard) [![Google Checkstyle Docs][checkstyle-image]][checkstyle-google-url]

#### 3.1. JavaScript

- [ ] `ESLint` passes.

#### 3.2. Java

- [ ] `Checkstyle` passes
- [ ] `PMD` passes
- [ ] `Findbugs` passes

### 4. Code quality [![Quality Gate][sonar-gate-img]][sonar-gate-url]

- [ ] The quality gateways pass with an "A" grade.

| Measure               | Scores                                                                                                                                                                                                        |
|:--------------------- |:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **`Complexity`**      | [![Complexity][sonar-complexity-img]][sonar-complexity-url]<br>[![Cognitive complexity][sonar-cognitive-img]][sonar-cognitive-url]<br>[![Complexity per Class][sonar-complexity-class-img]][sonar-complexity-class-img]<br>[![Complexity per file][sonar-complexity-file-img]][sonar-complexity-file-img]            <br>[![Complexity per Function][sonar-complexity-function-img]][sonar-complexity-function-url]                                                              |
| **`Duplications`**    | [![Duplications][sonar-duplications-img]][sonar-duplications-url]                                                                                                                                             |
| **`Issues`**          | [![Issues][sonar-issues-img]][sonar-issues-url]                                                                                                                                                               |
| **`Maintainability`** | [![Code smells][sonar-code-smells-img]][sonar-code-smells-url]<br>[![Maintainability][sonar-maintainability-img]][sonar-maintainability-url]<br>[![Technical debt][sonar-tech-debt-img]][sonar-tech-debt-url] |
| **`Reliability`**     | [![Reliability][sonar-reliability-img]][sonar-reliability-url]                                                                                                                                                |
| **`Security`**        | [![Security][sonar-security-img]][sonar-security-url]                                                                                                                                                         |

> **:information_source: These tasks are not required to open a PR, and may be addresses while the PR is open.**

[checkstyle-google-url]: http://checkstyle.sourceforge.net/google_style.html
[checkstyle-image]: ../docs/img/icon-checkstyle.png
[coveralls-img]: https://coveralls.io/repos/github/gregswindle/maven-code-quality-pom/badge.svg
[coveralls-url]: https://coveralls.io/github/gregswindle/maven-code-quality-pom
[sonar-code-smells-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=code_smells
[sonar-code-smells-url]: https://sonarcloud.io/component_measures/metric/code_smells/list?id=gregswindle-github&metric=code_smells
[sonar-cognitive-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=cognitive_complexity
[sonar-cognitive-url]: https://sonarcloud.io/component_measures/metric/cognitive_complexity/list?id=gregswindle-github&metric=cognitive_complexity
[sonar-complexity-class-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=class_complexity
[sonar-complexity-class-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=class_complexity
[sonar-complexity-file-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=file_complexity
[sonar-complexity-file-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=file_complexity
[sonar-complexity-function-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=function_complexity
[sonar-complexity-function-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=function_complexity
[sonar-complexity-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=complexity
[sonar-complexity-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=complexity
[sonar-coverage-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=coverage
[sonar-coverage-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=coverage
[sonar-duplications-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=duplicated_line_density
[sonar-duplications-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=duplicated_lines_density
[sonar-gate-img]: http://sonarcloud.io/api/badges/gate?key=gregswindle-github
[sonar-gate-url]: https://sonarcloud.io/dashboard?id=gregswindle-github
[sonar-issues-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=blocker_violations
[sonar-issues-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=violations
[sonar-maintainability-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=new_maintainability_rating
[sonar-maintainability-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=new_maintainability_rating
[sonar-reliability-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=new_reliability_rating
[sonar-reliability-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=new_reliability_rating
[sonar-security-img]: http://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=vulnerabilities
[sonar-security-url]: https://sonarcloud.io/component_measures?id=gregswindle-github&metric=vulnerabilities
[sonar-tech-debt-img]:  https://sonarcloud.io/api/badges/measure?key=gregswindle-github&metric=sqale_debt_ratio
[sonar-tech-debt-url]: https://sonarcloud.io/component_measures/metric/sqale_index/list?id=gregswindle-github&metric=sqale_debt_ratio
