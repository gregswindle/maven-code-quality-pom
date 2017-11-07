[![Generator Community Repo][product-repo-logo-image]][product-repo-url]

# `ESLint` rules

`spring-qa-dependencies` enforces the following code standards with `ESLint`.

## Table of contents

<!-- toc -->

- [1. Rule summary](#1-rule-summary)
- [2. Rules](#2-rules)
  * [2.1. `eslint`](#21-eslint)
  * [2.2. `import`](#22-import)
  * [2.3. `security`](#23-security)
  * [2.4. `jsdoc`](#24-jsdoc)
  * [2.5. `no-unsanitized`](#25-no-unsanitized)
  * [2.6. `node`](#26-node)
  * [2.7. `promise`](#27-promise)
  * [2.8. `standard`](#28-standard)
  * [2.9. `xss`](#29-xss)
  * [2.10. `no-unsafe-innerhtml`](#210-no-unsafe-innerhtml)
  * [2.11. `scanjs-rules`](#211-scanjs-rules)

<!-- tocstop -->

<!-- tocend -->

## 1. Rule summary

|                       | total   | omitted | off     | warn    | error   |
|:----------------------|--------:|--------:|--------:|--------:|--------:|
| `eslint`              | 245     | 115     | -       | 1       | 129     |
| `import`              | 30      | 22      | -       | 3       | 5       |
| `security`            | 13      | -       | -       | 1       | 12      |
| `jsdoc`               | 12      | -       | -       | -       | 12      |
| `no-unsafe-innerhtml` | 1       | 1       | -       | -       | -       |
| `no-unsanitized`      | 2       | -       | -       | -       | 2       |
| `node`                | 12      | -       | -       | -       | 12      |
| `promise`             | 11      | 10      | -       | -       | 1       |
| `scanjs-rules`        | 88      | -       | -       | 88      | -       |
| `standard`            | 4       | -       | -       | -       | 4       |
| `xss`                 | 2       | -       | -       | -       | 2       |
| **TOTALS**            | **420** | **147** | -       | **93**  | **181** |

## 2. Rules

### 2.1. `eslint`

| Name | Status |
|:-----|:-------|
| [`accessor-pairs`](http://eslint.org/docs/rules/accessor-pairs) | error |
| [`arrow-spacing`](http://eslint.org/docs/rules/arrow-spacing) | error |
| [`block-spacing`](http://eslint.org/docs/rules/block-spacing) | error |
| [`brace-style`](http://eslint.org/docs/rules/brace-style) | error |
| [`camelcase`](http://eslint.org/docs/rules/camelcase) | error |
| [`comma-dangle`](http://eslint.org/docs/rules/comma-dangle) | error |
| [`comma-spacing`](http://eslint.org/docs/rules/comma-spacing) | error |
| [`comma-style`](http://eslint.org/docs/rules/comma-style) | error |
| [`constructor-super`](http://eslint.org/docs/rules/constructor-super) | error |
| [`curly`](http://eslint.org/docs/rules/curly) | error |
| [`dot-location`](http://eslint.org/docs/rules/dot-location) | error |
| [`eol-last`](http://eslint.org/docs/rules/eol-last) | error |
| [`eqeqeq`](http://eslint.org/docs/rules/eqeqeq) | error |
| [`func-call-spacing`](http://eslint.org/docs/rules/func-call-spacing) | error |
| [`generator-star-spacing`](http://eslint.org/docs/rules/generator-star-spacing) | error |
| [`handle-callback-err`](http://eslint.org/docs/rules/handle-callback-err) | error |
| [`indent`](http://eslint.org/docs/rules/indent) | error |
| [`key-spacing`](http://eslint.org/docs/rules/key-spacing) | error |
| [`keyword-spacing`](http://eslint.org/docs/rules/keyword-spacing) | error |
| [`new-cap`](http://eslint.org/docs/rules/new-cap) | error |
| [`new-parens`](http://eslint.org/docs/rules/new-parens) | error |
| [`no-array-constructor`](http://eslint.org/docs/rules/no-array-constructor) | error |
| [`no-caller`](http://eslint.org/docs/rules/no-caller) | error |
| [`no-class-assign`](http://eslint.org/docs/rules/no-class-assign) | error |
| [`no-compare-neg-zero`](http://eslint.org/docs/rules/no-compare-neg-zero) | error |
| [`no-cond-assign`](http://eslint.org/docs/rules/no-cond-assign) | error |
| [`no-const-assign`](http://eslint.org/docs/rules/no-const-assign) | error |
| [`no-constant-condition`](http://eslint.org/docs/rules/no-constant-condition) | error |
| [`no-control-regex`](http://eslint.org/docs/rules/no-control-regex) | error |
| [`no-debugger`](http://eslint.org/docs/rules/no-debugger) | error |
| [`no-delete-var`](http://eslint.org/docs/rules/no-delete-var) | error |
| [`no-dupe-args`](http://eslint.org/docs/rules/no-dupe-args) | error |
| [`no-dupe-class-members`](http://eslint.org/docs/rules/no-dupe-class-members) | error |
| [`no-dupe-keys`](http://eslint.org/docs/rules/no-dupe-keys) | error |
| [`no-duplicate-case`](http://eslint.org/docs/rules/no-duplicate-case) | error |
| [`no-empty-character-class`](http://eslint.org/docs/rules/no-empty-character-class) | error |
| [`no-empty-pattern`](http://eslint.org/docs/rules/no-empty-pattern) | error |
| [`no-eval`](http://eslint.org/docs/rules/no-eval) | error |
| [`no-ex-assign`](http://eslint.org/docs/rules/no-ex-assign) | error |
| [`no-extend-native`](http://eslint.org/docs/rules/no-extend-native) | error |
| [`no-extra-bind`](http://eslint.org/docs/rules/no-extra-bind) | error |
| [`no-extra-boolean-cast`](http://eslint.org/docs/rules/no-extra-boolean-cast) | error |
| [`no-extra-parens`](http://eslint.org/docs/rules/no-extra-parens) | error |
| [`no-fallthrough`](http://eslint.org/docs/rules/no-fallthrough) | error |
| [`no-floating-decimal`](http://eslint.org/docs/rules/no-floating-decimal) | error |
| [`no-func-assign`](http://eslint.org/docs/rules/no-func-assign) | error |
| [`no-global-assign`](http://eslint.org/docs/rules/no-global-assign) | error |
| [`no-implied-eval`](http://eslint.org/docs/rules/no-implied-eval) | error |
| [`no-inner-declarations`](http://eslint.org/docs/rules/no-inner-declarations) | error |
| [`no-invalid-regexp`](http://eslint.org/docs/rules/no-invalid-regexp) | error |
| [`no-irregular-whitespace`](http://eslint.org/docs/rules/no-irregular-whitespace) | error |
| [`no-iterator`](http://eslint.org/docs/rules/no-iterator) | error |
| [`no-label-var`](http://eslint.org/docs/rules/no-label-var) | error |
| [`no-labels`](http://eslint.org/docs/rules/no-labels) | error |
| [`no-lone-blocks`](http://eslint.org/docs/rules/no-lone-blocks) | error |
| [`no-mixed-operators`](http://eslint.org/docs/rules/no-mixed-operators) | error |
| [`no-mixed-spaces-and-tabs`](http://eslint.org/docs/rules/no-mixed-spaces-and-tabs) | error |
| [`no-multi-spaces`](http://eslint.org/docs/rules/no-multi-spaces) | error |
| [`no-multi-str`](http://eslint.org/docs/rules/no-multi-str) | error |
| [`no-multiple-empty-lines`](http://eslint.org/docs/rules/no-multiple-empty-lines) | error |
| [`no-new`](http://eslint.org/docs/rules/no-new) | error |
| [`no-new-func`](http://eslint.org/docs/rules/no-new-func) | error |
| [`no-new-object`](http://eslint.org/docs/rules/no-new-object) | error |
| [`no-new-require`](http://eslint.org/docs/rules/no-new-require) | error |
| [`no-new-symbol`](http://eslint.org/docs/rules/no-new-symbol) | error |
| [`no-new-wrappers`](http://eslint.org/docs/rules/no-new-wrappers) | error |
| [`no-obj-calls`](http://eslint.org/docs/rules/no-obj-calls) | error |
| [`no-octal`](http://eslint.org/docs/rules/no-octal) | error |
| [`no-octal-escape`](http://eslint.org/docs/rules/no-octal-escape) | error |
| [`no-path-concat`](http://eslint.org/docs/rules/no-path-concat) | error |
| [`no-process-exit`](http://eslint.org/docs/rules/no-process-exit) | error |
| [`no-proto`](http://eslint.org/docs/rules/no-proto) | error |
| [`no-redeclare`](http://eslint.org/docs/rules/no-redeclare) | error |
| [`no-regex-spaces`](http://eslint.org/docs/rules/no-regex-spaces) | error |
| [`no-return-assign`](http://eslint.org/docs/rules/no-return-assign) | error |
| [`no-return-await`](http://eslint.org/docs/rules/no-return-await) | error |
| [`no-self-assign`](http://eslint.org/docs/rules/no-self-assign) | error |
| [`no-self-compare`](http://eslint.org/docs/rules/no-self-compare) | error |
| [`no-sequences`](http://eslint.org/docs/rules/no-sequences) | error |
| [`no-shadow-restricted-names`](http://eslint.org/docs/rules/no-shadow-restricted-names) | error |
| [`no-sparse-arrays`](http://eslint.org/docs/rules/no-sparse-arrays) | error |
| [`no-tabs`](http://eslint.org/docs/rules/no-tabs) | error |
| [`no-template-curly-in-string`](http://eslint.org/docs/rules/no-template-curly-in-string) | error |
| [`no-this-before-super`](http://eslint.org/docs/rules/no-this-before-super) | error |
| [`no-throw-literal`](http://eslint.org/docs/rules/no-throw-literal) | error |
| [`no-trailing-spaces`](http://eslint.org/docs/rules/no-trailing-spaces) | error |
| [`no-undef`](http://eslint.org/docs/rules/no-undef) | error |
| [`no-undef-init`](http://eslint.org/docs/rules/no-undef-init) | error |
| [`no-unexpected-multiline`](http://eslint.org/docs/rules/no-unexpected-multiline) | error |
| [`no-unmodified-loop-condition`](http://eslint.org/docs/rules/no-unmodified-loop-condition) | error |
| [`no-unneeded-ternary`](http://eslint.org/docs/rules/no-unneeded-ternary) | error |
| [`no-unreachable`](http://eslint.org/docs/rules/no-unreachable) | error |
| [`no-unsafe-finally`](http://eslint.org/docs/rules/no-unsafe-finally) | error |
| [`no-unsafe-negation`](http://eslint.org/docs/rules/no-unsafe-negation) | error |
| [`no-unused-expressions`](http://eslint.org/docs/rules/no-unused-expressions) | error |
| [`no-unused-vars`](http://eslint.org/docs/rules/no-unused-vars) | error |
| [`no-use-before-define`](http://eslint.org/docs/rules/no-use-before-define) | error |
| [`no-useless-call`](http://eslint.org/docs/rules/no-useless-call) | error |
| [`no-useless-computed-key`](http://eslint.org/docs/rules/no-useless-computed-key) | error |
| [`no-useless-constructor`](http://eslint.org/docs/rules/no-useless-constructor) | error |
| [`no-useless-escape`](http://eslint.org/docs/rules/no-useless-escape) | error |
| [`no-useless-rename`](http://eslint.org/docs/rules/no-useless-rename) | error |
| [`no-useless-return`](http://eslint.org/docs/rules/no-useless-return) | error |
| [`no-whitespace-before-property`](http://eslint.org/docs/rules/no-whitespace-before-property) | error |
| [`no-with`](http://eslint.org/docs/rules/no-with) | error |
| [`object-property-newline`](http://eslint.org/docs/rules/object-property-newline) | error |
| [`one-var`](http://eslint.org/docs/rules/one-var) | error |
| [`operator-linebreak`](http://eslint.org/docs/rules/operator-linebreak) | error |
| [`padded-blocks`](http://eslint.org/docs/rules/padded-blocks) | error |
| [`prefer-promise-reject-errors`](http://eslint.org/docs/rules/prefer-promise-reject-errors) | error |
| [`quotes`](http://eslint.org/docs/rules/quotes) | error |
| [`rest-spread-spacing`](http://eslint.org/docs/rules/rest-spread-spacing) | error |
| [`semi`](http://eslint.org/docs/rules/semi) | error |
| [`semi-spacing`](http://eslint.org/docs/rules/semi-spacing) | error |
| [`space-before-blocks`](http://eslint.org/docs/rules/space-before-blocks) | error |
| [`space-before-function-paren`](http://eslint.org/docs/rules/space-before-function-paren) | error |
| [`space-in-parens`](http://eslint.org/docs/rules/space-in-parens) | error |
| [`space-infix-ops`](http://eslint.org/docs/rules/space-infix-ops) | error |
| [`space-unary-ops`](http://eslint.org/docs/rules/space-unary-ops) | error |
| [`spaced-comment`](http://eslint.org/docs/rules/spaced-comment) | error |
| [`symbol-description`](http://eslint.org/docs/rules/symbol-description) | error |
| [`template-curly-spacing`](http://eslint.org/docs/rules/template-curly-spacing) | error |
| [`template-tag-spacing`](http://eslint.org/docs/rules/template-tag-spacing) | error |
| [`unicode-bom`](http://eslint.org/docs/rules/unicode-bom) | error |
| [`use-isnan`](http://eslint.org/docs/rules/use-isnan) | error |
| [`valid-typeof`](http://eslint.org/docs/rules/valid-typeof) | error |
| [`wrap-iife`](http://eslint.org/docs/rules/wrap-iife) | error |
| [`yield-star-spacing`](http://eslint.org/docs/rules/yield-star-spacing) | error |
| [`yoda`](http://eslint.org/docs/rules/yoda) | error |
| [`array-bracket-newline`](http://eslint.org/docs/rules/array-bracket-newline) | omitted |
| [`array-bracket-spacing`](http://eslint.org/docs/rules/array-bracket-spacing) | omitted |
| [`array-callback-return`](http://eslint.org/docs/rules/array-callback-return) | omitted |
| [`array-element-newline`](http://eslint.org/docs/rules/array-element-newline) | omitted |
| [`arrow-body-style`](http://eslint.org/docs/rules/arrow-body-style) | omitted |
| [`arrow-parens`](http://eslint.org/docs/rules/arrow-parens) | omitted |
| [`block-scoped-var`](http://eslint.org/docs/rules/block-scoped-var) | omitted |
| [`callback-return`](http://eslint.org/docs/rules/callback-return) | omitted |
| [`capitalized-comments`](http://eslint.org/docs/rules/capitalized-comments) | omitted |
| [`class-methods-use-this`](http://eslint.org/docs/rules/class-methods-use-this) | omitted |
| [`complexity`](http://eslint.org/docs/rules/complexity) | omitted |
| [`computed-property-spacing`](http://eslint.org/docs/rules/computed-property-spacing) | omitted |
| [`consistent-return`](http://eslint.org/docs/rules/consistent-return) | omitted |
| [`consistent-this`](http://eslint.org/docs/rules/consistent-this) | omitted |
| [`default-case`](http://eslint.org/docs/rules/default-case) | omitted |
| [`dot-notation`](http://eslint.org/docs/rules/dot-notation) | omitted |
| [`for-direction`](http://eslint.org/docs/rules/for-direction) | omitted |
| [`func-name-matching`](http://eslint.org/docs/rules/func-name-matching) | omitted |
| [`func-names`](http://eslint.org/docs/rules/func-names) | omitted |
| [`func-style`](http://eslint.org/docs/rules/func-style) | omitted |
| [`getter-return`](http://eslint.org/docs/rules/getter-return) | omitted |
| [`global-require`](http://eslint.org/docs/rules/global-require) | omitted |
| [`guard-for-in`](http://eslint.org/docs/rules/guard-for-in) | omitted |
| [`id-blacklist`](http://eslint.org/docs/rules/id-blacklist) | omitted |
| [`id-length`](http://eslint.org/docs/rules/id-length) | omitted |
| [`id-match`](http://eslint.org/docs/rules/id-match) | omitted |
| [`init-declarations`](http://eslint.org/docs/rules/init-declarations) | omitted |
| [`jsx-quotes`](http://eslint.org/docs/rules/jsx-quotes) | omitted |
| [`line-comment-position`](http://eslint.org/docs/rules/line-comment-position) | omitted |
| [`linebreak-style`](http://eslint.org/docs/rules/linebreak-style) | omitted |
| [`lines-around-comment`](http://eslint.org/docs/rules/lines-around-comment) | omitted |
| [`max-depth`](http://eslint.org/docs/rules/max-depth) | omitted |
| [`max-len`](http://eslint.org/docs/rules/max-len) | omitted |
| [`max-lines`](http://eslint.org/docs/rules/max-lines) | omitted |
| [`max-nested-callbacks`](http://eslint.org/docs/rules/max-nested-callbacks) | omitted |
| [`max-params`](http://eslint.org/docs/rules/max-params) | omitted |
| [`max-statements`](http://eslint.org/docs/rules/max-statements) | omitted |
| [`max-statements-per-line`](http://eslint.org/docs/rules/max-statements-per-line) | omitted |
| [`multiline-ternary`](http://eslint.org/docs/rules/multiline-ternary) | omitted |
| [`newline-per-chained-call`](http://eslint.org/docs/rules/newline-per-chained-call) | omitted |
| [`no-alert`](http://eslint.org/docs/rules/no-alert) | omitted |
| [`no-await-in-loop`](http://eslint.org/docs/rules/no-await-in-loop) | omitted |
| [`no-bitwise`](http://eslint.org/docs/rules/no-bitwise) | omitted |
| [`no-buffer-constructor`](http://eslint.org/docs/rules/no-buffer-constructor) | omitted |
| [`no-case-declarations`](http://eslint.org/docs/rules/no-case-declarations) | omitted |
| [`no-catch-shadow`](http://eslint.org/docs/rules/no-catch-shadow) | omitted |
| [`no-confusing-arrow`](http://eslint.org/docs/rules/no-confusing-arrow) | omitted |
| [`no-console`](http://eslint.org/docs/rules/no-console) | omitted |
| [`no-continue`](http://eslint.org/docs/rules/no-continue) | omitted |
| [`no-div-regex`](http://eslint.org/docs/rules/no-div-regex) | omitted |
| [`no-duplicate-imports`](http://eslint.org/docs/rules/no-duplicate-imports) | omitted |
| [`no-else-return`](http://eslint.org/docs/rules/no-else-return) | omitted |
| [`no-empty`](http://eslint.org/docs/rules/no-empty) | omitted |
| [`no-empty-function`](http://eslint.org/docs/rules/no-empty-function) | omitted |
| [`no-eq-null`](http://eslint.org/docs/rules/no-eq-null) | omitted |
| [`no-extra-label`](http://eslint.org/docs/rules/no-extra-label) | omitted |
| [`no-extra-semi`](http://eslint.org/docs/rules/no-extra-semi) | omitted |
| [`no-implicit-coercion`](http://eslint.org/docs/rules/no-implicit-coercion) | omitted |
| [`no-implicit-globals`](http://eslint.org/docs/rules/no-implicit-globals) | omitted |
| [`no-invalid-this`](http://eslint.org/docs/rules/no-invalid-this) | omitted |
| [`no-lonely-if`](http://eslint.org/docs/rules/no-lonely-if) | omitted |
| [`no-loop-func`](http://eslint.org/docs/rules/no-loop-func) | omitted |
| [`no-magic-numbers`](http://eslint.org/docs/rules/no-magic-numbers) | omitted |
| [`no-mixed-requires`](http://eslint.org/docs/rules/no-mixed-requires) | omitted |
| [`no-multi-assign`](http://eslint.org/docs/rules/no-multi-assign) | omitted |
| [`no-negated-condition`](http://eslint.org/docs/rules/no-negated-condition) | omitted |
| [`no-nested-ternary`](http://eslint.org/docs/rules/no-nested-ternary) | omitted |
| [`no-param-reassign`](http://eslint.org/docs/rules/no-param-reassign) | omitted |
| [`no-plusplus`](http://eslint.org/docs/rules/no-plusplus) | omitted |
| [`no-process-env`](http://eslint.org/docs/rules/no-process-env) | omitted |
| [`no-prototype-builtins`](http://eslint.org/docs/rules/no-prototype-builtins) | omitted |
| [`no-restricted-globals`](http://eslint.org/docs/rules/no-restricted-globals) | omitted |
| [`no-restricted-imports`](http://eslint.org/docs/rules/no-restricted-imports) | omitted |
| [`no-restricted-modules`](http://eslint.org/docs/rules/no-restricted-modules) | omitted |
| [`no-restricted-properties`](http://eslint.org/docs/rules/no-restricted-properties) | omitted |
| [`no-restricted-syntax`](http://eslint.org/docs/rules/no-restricted-syntax) | omitted |
| [`no-script-url`](http://eslint.org/docs/rules/no-script-url) | omitted |
| [`no-shadow`](http://eslint.org/docs/rules/no-shadow) | omitted |
| [`no-sync`](http://eslint.org/docs/rules/no-sync) | omitted |
| [`no-ternary`](http://eslint.org/docs/rules/no-ternary) | omitted |
| [`no-undefined`](http://eslint.org/docs/rules/no-undefined) | omitted |
| [`no-underscore-dangle`](http://eslint.org/docs/rules/no-underscore-dangle) | omitted |
| [`no-unused-labels`](http://eslint.org/docs/rules/no-unused-labels) | omitted |
| [`no-useless-concat`](http://eslint.org/docs/rules/no-useless-concat) | omitted |
| [`no-var`](http://eslint.org/docs/rules/no-var) | omitted |
| [`no-void`](http://eslint.org/docs/rules/no-void) | omitted |
| [`no-warning-comments`](http://eslint.org/docs/rules/no-warning-comments) | omitted |
| [`nonblock-statement-body-position`](http://eslint.org/docs/rules/nonblock-statement-body-position) | omitted |
| [`object-curly-newline`](http://eslint.org/docs/rules/object-curly-newline) | omitted |
| [`object-curly-spacing`](http://eslint.org/docs/rules/object-curly-spacing) | omitted |
| [`object-shorthand`](http://eslint.org/docs/rules/object-shorthand) | omitted |
| [`one-var-declaration-per-line`](http://eslint.org/docs/rules/one-var-declaration-per-line) | omitted |
| [`operator-assignment`](http://eslint.org/docs/rules/operator-assignment) | omitted |
| [`padding-line-between-statements`](http://eslint.org/docs/rules/padding-line-between-statements) | omitted |
| [`prefer-arrow-callback`](http://eslint.org/docs/rules/prefer-arrow-callback) | omitted |
| [`prefer-const`](http://eslint.org/docs/rules/prefer-const) | omitted |
| [`prefer-destructuring`](http://eslint.org/docs/rules/prefer-destructuring) | omitted |
| [`prefer-numeric-literals`](http://eslint.org/docs/rules/prefer-numeric-literals) | omitted |
| [`prefer-rest-params`](http://eslint.org/docs/rules/prefer-rest-params) | omitted |
| [`prefer-spread`](http://eslint.org/docs/rules/prefer-spread) | omitted |
| [`prefer-template`](http://eslint.org/docs/rules/prefer-template) | omitted |
| [`quote-props`](http://eslint.org/docs/rules/quote-props) | omitted |
| [`radix`](http://eslint.org/docs/rules/radix) | omitted |
| [`require-await`](http://eslint.org/docs/rules/require-await) | omitted |
| [`require-jsdoc`](http://eslint.org/docs/rules/require-jsdoc) | omitted |
| [`require-yield`](http://eslint.org/docs/rules/require-yield) | omitted |
| [`semi-style`](http://eslint.org/docs/rules/semi-style) | omitted |
| [`sort-imports`](http://eslint.org/docs/rules/sort-imports) | omitted |
| [`sort-keys`](http://eslint.org/docs/rules/sort-keys) | omitted |
| [`sort-vars`](http://eslint.org/docs/rules/sort-vars) | omitted |
| [`strict`](http://eslint.org/docs/rules/strict) | omitted |
| [`switch-colon-spacing`](http://eslint.org/docs/rules/switch-colon-spacing) | omitted |
| [`valid-jsdoc`](http://eslint.org/docs/rules/valid-jsdoc) | omitted |
| [`vars-on-top`](http://eslint.org/docs/rules/vars-on-top) | omitted |
| [`wrap-regex`](http://eslint.org/docs/rules/wrap-regex) | omitted |
| [`no-inline-comments`](http://eslint.org/docs/rules/no-inline-comments) | warn |

### 2.2. `import`

| Name | Status |
|:-----|:-------|
| [`import/default`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/default.md) | error |
| [`import/export`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/export.md) | error |
| [`import/named`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/named.md) | error |
| [`import/namespace`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/namespace.md) | error |
| [`import/no-unresolved`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-unresolved.md) | error |
| [`import/extensions`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/extensions.md) | omitted |
| [`import/first`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/first.md) | omitted |
| [`import/max-dependencies`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/max-dependencies.md) | omitted |
| [`import/newline-after-import`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/newline-after-import.md) | omitted |
| [`import/no-absolute-path`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-absolute-path.md) | omitted |
| [`import/no-amd`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-amd.md) | omitted |
| [`import/no-anonymous-default-export`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-anonymous-default-export.md) | omitted |
| [`import/no-commonjs`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-commonjs.md) | omitted |
| [`import/no-deprecated`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-deprecated.md) | omitted |
| [`import/no-dynamic-require`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-dynamic-require.md) | omitted |
| [`import/no-extraneous-dependencies`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-extraneous-dependencies.md) | omitted |
| [`import/no-internal-modules`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-internal-modules.md) | omitted |
| [`import/no-mutable-exports`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-mutable-exports.md) | omitted |
| [`import/no-named-default`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-named-default.md) | omitted |
| [`import/no-namespace`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-namespace.md) | omitted |
| [`import/no-nodejs-modules`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-nodejs-modules.md) | omitted |
| [`import/no-restricted-paths`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-restricted-paths.md) | omitted |
| [`import/no-unassigned-import`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-unassigned-import.md) | omitted |
| [`import/no-webpack-loader-syntax`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-webpack-loader-syntax.md) | omitted |
| [`import/order`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/order.md) | omitted |
| [`import/prefer-default-export`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/prefer-default-export.md) | omitted |
| [`import/unambiguous`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/unambiguous.md) | omitted |
| [`import/no-duplicates`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-duplicates.md) | warn |
| [`import/no-named-as-default`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-named-as-default.md) | warn |
| [`import/no-named-as-default-member`](https://github.com/benmosher/eslint-plugin-import/blob/master/docs/rules/no-named-as-default-member.md) | warn |

### 2.3. `security`

| Name | Status |
|:-----|:-------|
| [`security/detect-buffer-noassert`](https://www.npmjs.com/package/eslint-plugin-security#detect-buffer-noassert) | error |
| [`security/detect-child-process`](https://www.npmjs.com/package/eslint-plugin-security#detect-child-process) | error |
| [`security/detect-disable-mustache-escape`](https://www.npmjs.com/package/eslint-plugin-security#detect-disable-mustache-escape) | error |
| [`security/detect-eval-with-expression`](https://www.npmjs.com/package/eslint-plugin-security#detect-eval-with-expression) | error |
| [`security/detect-no-csrf-before-method-override`](https://www.npmjs.com/package/eslint-plugin-security#detect-no-csrf-before-method-override) | error |
| [`security/detect-non-literal-fs-filename`](https://www.npmjs.com/package/eslint-plugin-security#detect-non-literal-fs-filename) | error |
| [`security/detect-non-literal-regexp`](https://www.npmjs.com/package/eslint-plugin-security#detect-non-literal-regexp) | error |
| [`security/detect-non-literal-require`](https://www.npmjs.com/package/eslint-plugin-security#detect-non-literal-require) | error |
| [`security/detect-object-injection`](https://www.npmjs.com/package/eslint-plugin-security#detect-object-injection) | error |
| [`security/detect-possible-timing-attacks`](https://www.npmjs.com/package/eslint-plugin-security#detect-possible-timing-attacks) | error |
| [`security/detect-pseudoRandomBytes`](https://www.npmjs.com/package/eslint-plugin-security#detect-pseudoRandomBytes) | error |
| [`security/detect-unsafe-regex`](https://www.npmjs.com/package/eslint-plugin-security#detect-unsafe-regex) | error |
| [`security/detect-new-buffer`](https://www.npmjs.com/package/eslint-plugin-security#detect-new-buffer) | warn |

### 2.4. `jsdoc`

| Name | Status |
|:-----|:-------|
| [`jsdoc/check-param-names`](https://github.com/gajus/eslint-plugin-jsdoc#check-param-names) | error |
| [`jsdoc/check-tag-names`](https://github.com/gajus/eslint-plugin-jsdoc#check-tag-names) | error |
| [`jsdoc/check-types`](https://github.com/gajus/eslint-plugin-jsdoc#check-types) | error |
| [`jsdoc/newline-after-description`](https://github.com/gajus/eslint-plugin-jsdoc#newline-after-description) | error |
| [`jsdoc/require-description-complete-sentence`](https://github.com/gajus/eslint-plugin-jsdoc#require-description-complete-sentence) | error |
| [`jsdoc/require-example`](https://github.com/gajus/eslint-plugin-jsdoc#require-example) | error |
| [`jsdoc/require-hyphen-before-param-description`](https://github.com/gajus/eslint-plugin-jsdoc#require-hyphen-before-param-description) | error |
| [`jsdoc/require-param`](https://github.com/gajus/eslint-plugin-jsdoc#require-param) | error |
| [`jsdoc/require-param-description`](https://github.com/gajus/eslint-plugin-jsdoc#require-param-description) | error |
| [`jsdoc/require-param-type`](https://github.com/gajus/eslint-plugin-jsdoc#require-param-type) | error |
| [`jsdoc/require-returns-description`](https://github.com/gajus/eslint-plugin-jsdoc#require-returns-description) | error |
| [`jsdoc/require-returns-type`](https://github.com/gajus/eslint-plugin-jsdoc#require-returns-type) | error |

### 2.5. `no-unsanitized`

| Name | Status |
|:-----|:-------|
| [`no-unsanitized/method`](https://www.npmjs.com/package/eslint-plugin-no-unsanitized#method) | error |
| [`no-unsanitized/property`](https://www.npmjs.com/package/eslint-plugin-no-unsanitized#property) | error |

### 2.6. `node`

| Name | Status |
|:-----|:-------|
| [`node/exports-style`](https://www.npmjs.com/package/eslint-plugin-node#exports-style) | error |
| [`node/no-deprecated-api`](https://www.npmjs.com/package/eslint-plugin-node#no-deprecated-api) | error |
| [`node/no-extraneous-import`](https://www.npmjs.com/package/eslint-plugin-node#no-extraneous-import) | error |
| [`node/no-extraneous-require`](https://www.npmjs.com/package/eslint-plugin-node#no-extraneous-require) | error |
| [`node/no-missing-import`](https://www.npmjs.com/package/eslint-plugin-node#no-missing-import) | error |
| [`node/no-missing-require`](https://www.npmjs.com/package/eslint-plugin-node#no-missing-require) | error |
| [`node/no-unpublished-bin`](https://www.npmjs.com/package/eslint-plugin-node#no-unpublished-bin) | error |
| [`node/no-unpublished-import`](https://www.npmjs.com/package/eslint-plugin-node#no-unpublished-import) | error |
| [`node/no-unpublished-require`](https://www.npmjs.com/package/eslint-plugin-node#no-unpublished-require) | error |
| [`node/no-unsupported-features`](https://www.npmjs.com/package/eslint-plugin-node#no-unsupported-features) | error |
| [`node/process-exit-as-throw`](https://www.npmjs.com/package/eslint-plugin-node#process-exit-as-throw) | error |
| [`node/shebang`](https://www.npmjs.com/package/eslint-plugin-node#shebang) | error |

### 2.7. `promise`

| Name | Status |
|:-----|:-------|
| [`promise/param-names`](https://www.npmjs.com/package/eslint-plugin-promise#param-names) | error |
| [`promise/always-return`](https://www.npmjs.com/package/eslint-plugin-promise#always-return) | omitted |
| [`promise/avoid-new`](https://www.npmjs.com/package/eslint-plugin-promise#avoid-new) | omitted |
| [`promise/catch-or-return`](https://www.npmjs.com/package/eslint-plugin-promise#catch-or-return) | omitted |
| [`promise/no-callback-in-promise`](https://www.npmjs.com/package/eslint-plugin-promise#no-callback-in-promise) | omitted |
| [`promise/no-native`](https://www.npmjs.com/package/eslint-plugin-promise#no-native) | omitted |
| [`promise/no-nesting`](https://www.npmjs.com/package/eslint-plugin-promise#no-nesting) | omitted |
| [`promise/no-promise-in-callback`](https://www.npmjs.com/package/eslint-plugin-promise#no-promise-in-callback) | omitted |
| [`promise/no-return-wrap`](https://www.npmjs.com/package/eslint-plugin-promise#no-return-wrap) | omitted |
| [`promise/prefer-await-to-callbacks`](https://www.npmjs.com/package/eslint-plugin-promise#prefer-await-to-callbacks) | omitted |
| [`promise/prefer-await-to-then`](https://www.npmjs.com/package/eslint-plugin-promise#prefer-await-to-then) | omitted |

### 2.8. `standard`

| Name | Status |
|:-----|:-------|
| [`standard/array-bracket-even-spacing`](https://www.npmjs.com/package/eslint-plugin-standard#array-bracket-even-spacing) | error |
| [`standard/computed-property-even-spacing`](https://www.npmjs.com/package/eslint-plugin-standard#computed-property-even-spacing) | error |
| [`standard/no-callback-literal`](https://www.npmjs.com/package/eslint-plugin-standard#no-callback-literal) | error |
| [`standard/object-curly-even-spacing`](https://www.npmjs.com/package/eslint-plugin-standard#object-curly-even-spacing) | error |

### 2.9. `xss`

| Name | Status |
|:-----|:-------|
| [`xss/no-location-href-assign`](https://www.npmjs.com/package/eslint-plugin-xss#no-location-href-assign) | error |
| [`xss/no-mixed-html`](https://www.npmjs.com/package/eslint-plugin-xss#no-mixed-html) | error |

### 2.10. `no-unsafe-innerhtml`

| Name | Status |
|:-----|:-------|
| [`no-unsafe-innerhtml/no-unsafe-innerhtml`](https://www.npmjs.com/package/eslint-plugin-no-unsafe-innerhtml#no-unsafe-innerhtml) | omitted |

### 2.11. `scanjs-rules`

| Name | Status |
|:-----|:-------|
| [`scanjs-rules/accidental_assignment`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#accidental_assignment) | warn |
| [`scanjs-rules/assign_to_hostname`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_hostname) | warn |
| [`scanjs-rules/assign_to_href`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_href) | warn |
| [`scanjs-rules/assign_to_location`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_location) | warn |
| [`scanjs-rules/assign_to_mozAudioChannel`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_mozAudioChannel) | warn |
| [`scanjs-rules/assign_to_mozAudioChannelType`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_mozAudioChannelType) | warn |
| [`scanjs-rules/assign_to_onmessage`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_onmessage) | warn |
| [`scanjs-rules/assign_to_pathname`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_pathname) | warn |
| [`scanjs-rules/assign_to_protocol`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_protocol) | warn |
| [`scanjs-rules/assign_to_search`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_search) | warn |
| [`scanjs-rules/assign_to_src`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#assign_to_src) | warn |
| [`scanjs-rules/call_Function`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_Function) | warn |
| [`scanjs-rules/call_addEventListener`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_addEventListener) | warn |
| [`scanjs-rules/call_addEventListener_cellbroadcastmsgchanged`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_addEventListener_cellbroadcastmsgchanged) | warn |
| [`scanjs-rules/call_addEventListener_deviceproximity`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_addEventListener_deviceproximity) | warn |
| [`scanjs-rules/call_addEventListener_message`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_addEventListener_message) | warn |
| [`scanjs-rules/call_addEventListener_moznetworkdownload`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_addEventListener_moznetworkdownload) | warn |
| [`scanjs-rules/call_addEventListener_moznetworkupload`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_addEventListener_moznetworkupload) | warn |
| [`scanjs-rules/call_connect`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_connect) | warn |
| [`scanjs-rules/call_eval`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_eval) | warn |
| [`scanjs-rules/call_execScript`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_execScript) | warn |
| [`scanjs-rules/call_generateCRMFRequest`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_generateCRMFRequest) | warn |
| [`scanjs-rules/call_getDeviceStorage_apps`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_getDeviceStorage_apps) | warn |
| [`scanjs-rules/call_getDeviceStorage_crashes`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_getDeviceStorage_crashes) | warn |
| [`scanjs-rules/call_getDeviceStorage_music`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_getDeviceStorage_music) | warn |
| [`scanjs-rules/call_getDeviceStorage_pictures`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_getDeviceStorage_pictures) | warn |
| [`scanjs-rules/call_getDeviceStorage_sdcard`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_getDeviceStorage_sdcard) | warn |
| [`scanjs-rules/call_getDeviceStorage_videos`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_getDeviceStorage_videos) | warn |
| [`scanjs-rules/call_hide`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_hide) | warn |
| [`scanjs-rules/call_mozSetMessageHandler`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_mozSetMessageHandler) | warn |
| [`scanjs-rules/call_mozSetMessageHandler_activity`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_mozSetMessageHandler_activity) | warn |
| [`scanjs-rules/call_mozSetMessageHandler_wappush_received`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_mozSetMessageHandler_wappush_received) | warn |
| [`scanjs-rules/call_open_attention`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_open_attention) | warn |
| [`scanjs-rules/call_open_remote=true`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_open_remote=true) | warn |
| [`scanjs-rules/call_parseFromString`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_parseFromString) | warn |
| [`scanjs-rules/call_setAttribute_mozapp`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_setAttribute_mozapp) | warn |
| [`scanjs-rules/call_setAttribute_mozbrowser`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_setAttribute_mozbrowser) | warn |
| [`scanjs-rules/call_setImmediate`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_setImmediate) | warn |
| [`scanjs-rules/call_setInterval`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_setInterval) | warn |
| [`scanjs-rules/call_setMessageHandler_connect`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_setMessageHandler_connect) | warn |
| [`scanjs-rules/call_setTimeout`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_setTimeout) | warn |
| [`scanjs-rules/call_write`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_write) | warn |
| [`scanjs-rules/call_writeln`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#call_writeln) | warn |
| [`scanjs-rules/identifier_indexedDB`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#identifier_indexedDB) | warn |
| [`scanjs-rules/identifier_localStorage`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#identifier_localStorage) | warn |
| [`scanjs-rules/identifier_sessionStorage`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#identifier_sessionStorage) | warn |
| [`scanjs-rules/new_Function`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#new_Function) | warn |
| [`scanjs-rules/new_MozActivity`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#new_MozActivity) | warn |
| [`scanjs-rules/new_MozSpeakerManager`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#new_MozSpeakerManager) | warn |
| [`scanjs-rules/new_Notification`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#new_Notification) | warn |
| [`scanjs-rules/object_mozSystem`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#object_mozSystem) | warn |
| [`scanjs-rules/property_addIdleObserver`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_addIdleObserver) | warn |
| [`scanjs-rules/property_createContextualFragment`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_createContextualFragment) | warn |
| [`scanjs-rules/property_crypto`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_crypto) | warn |
| [`scanjs-rules/property_geolocation`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_geolocation) | warn |
| [`scanjs-rules/property_getDataStores`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_getDataStores) | warn |
| [`scanjs-rules/property_getDeviceStorage`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_getDeviceStorage) | warn |
| [`scanjs-rules/property_getUserMedia`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_getUserMedia) | warn |
| [`scanjs-rules/property_indexedDB`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_indexedDB) | warn |
| [`scanjs-rules/property_lastKnownHomeNetwork`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_lastKnownHomeNetwork) | warn |
| [`scanjs-rules/property_lastKnownNetwork`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_lastKnownNetwork) | warn |
| [`scanjs-rules/property_localStorage`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_localStorage) | warn |
| [`scanjs-rules/property_mgmt`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mgmt) | warn |
| [`scanjs-rules/property_mozAlarms`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozAlarms) | warn |
| [`scanjs-rules/property_mozBluetooth`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozBluetooth) | warn |
| [`scanjs-rules/property_mozCameras`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozCameras) | warn |
| [`scanjs-rules/property_mozCellBroadcast`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozCellBroadcast) | warn |
| [`scanjs-rules/property_mozContacts`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozContacts) | warn |
| [`scanjs-rules/property_mozDownloadManager`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozDownloadManager) | warn |
| [`scanjs-rules/property_mozFMRadio`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozFMRadio) | warn |
| [`scanjs-rules/property_mozInputMethod`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozInputMethod) | warn |
| [`scanjs-rules/property_mozKeyboard`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozKeyboard) | warn |
| [`scanjs-rules/property_mozMobileConnection`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozMobileConnection) | warn |
| [`scanjs-rules/property_mozMobileConnections`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozMobileConnections) | warn |
| [`scanjs-rules/property_mozMobileMessage`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozMobileMessage) | warn |
| [`scanjs-rules/property_mozNetworkStats`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozNetworkStats) | warn |
| [`scanjs-rules/property_mozNfc`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozNfc) | warn |
| [`scanjs-rules/property_mozNotification`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozNotification) | warn |
| [`scanjs-rules/property_mozPermissionSettings`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozPermissionSettings) | warn |
| [`scanjs-rules/property_mozPhoneNumberService`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozPhoneNumberService) | warn |
| [`scanjs-rules/property_mozPower`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozPower) | warn |
| [`scanjs-rules/property_mozSettings`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozSettings) | warn |
| [`scanjs-rules/property_mozTCPSocket`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozTCPSocket) | warn |
| [`scanjs-rules/property_mozTelephony`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozTelephony) | warn |
| [`scanjs-rules/property_mozTime`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozTime) | warn |
| [`scanjs-rules/property_mozVoicemail`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozVoicemail) | warn |
| [`scanjs-rules/property_mozWifiManager`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_mozWifiManager) | warn |
| [`scanjs-rules/property_sessionStorage`](https://www.npmjs.com/package/eslint-plugin-scanjs-rules#property_sessionStorage) | warn |


---

Generated on `2017-07-21T06:05:56.603Z`.


[product-repo-logo-image]: ../docs/img/logo-commonalaxy.png
[product-repo-url]: .
