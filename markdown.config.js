const fs = require('fs')
const path = require('path')
const markdownMagic = require('markdown-magic')
const markdownMagicDependencyTable = require('markdown-magic-dependency-table')
const  markdownMagicPackageScripts = require('markdown-magic-package-scripts')

const config = {
  transforms: {
    DEPENDENCYTABLE: markdownMagicDependencyTable,
    SCRIPTS: markdownMagicPackageScripts
  },
  DEBUG: true
}

let markdownPath = path.join(__dirname, 'README.md')
markdownMagic(markdownPath, config)

markdownPath = path.join(__dirname, 'CONTRIBUTING.md')
markdownMagic(markdownPath, config)
