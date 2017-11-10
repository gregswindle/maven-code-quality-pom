#!/bin/bash

baseDir=$(pwd)
siteDir="$baseDir/target/site"
docsDir="./docs/site"

function generateReports() {
  mvn clean site
}

function cleanDocs() {
  rm -rf ./docs/site
}

function copyTargetSite() {
  cp -R ./target/site ./docs/site
}

function generateGitHubFlavoredMarkdown() {
  # cd ./docs/site
  # @see https://gist.github.com/bzerangue/2504041
  find ./docs/site -name "*.ht*" | while read i; do pandoc -f html -t gfm "$i" -o "${i%.*}.md"; done
}

function removeHtmlResources() {
  rm -rf ./docs/site/**/*.css
  rm -rf ./docs/site/**/*.html
  rm -rf ./docs/site/**/*.js
  rm -rf ./docs/site/*.css
  rm -rf ./docs/site/*.html
  rm -rf ./docs/site/*.js
  rm -rf ./docs/site/css
  rm -rf ./docs/site/fonts
  rm -rf ./docs/site/jacoco-aggregate
  rm -rf ./docs/site/js
}

function convertHtmlHrefs() {
  # Replace all links ending in *.html with *.md
  find "$docsDir" -type f -name "*.md" -exec sed -i '' 's/.html/.md/g' {} +
}

function formatCodeBlocks() {
  #  prettyprint linenums
  find "$docsDir" -type f -name "*.md" -exec sed -i '' 's/prettyprint/ /g' {} +
  find "$docsDir" -type f -name "*.md" -exec sed -i '' 's/linenums/ /g' {} +
}

function renameIndexPage() {
  mv $docsDir/index.md $docsDir/README.md
}

function main() {
  # Report generation
  generateReports
  cleanDocs
  copyTargetSite
  generateGitHubFlavoredMarkdown

  # Markdown report conversions
  removeHtmlResources
  convertHtmlHrefs
  renameIndexPage

  # Formatting
  formatCodeBlocks
}

main
