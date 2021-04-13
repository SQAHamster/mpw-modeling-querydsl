# QueryDSL - Release Checklist

## New Release of Source Code

* replace pom.xml versions
* replace MANIFEST.MF versions
* replace plugin.xml versions
* commit with pattern: "Version X.Y.Z"
* create tag on master

## Updatesite

* wait until updatesite is built on GitHub
* switch to branch "querydsl-updatesite"
* replace files from remote branch "querydsl-updatesite-snapshot"
* commit with pattern "Updatesite: Version X.Y.Z"
* tag with pattern "X.Y.Z-updatesite"

## Set new SNAPSHOT Version

* replace pom.xml versions to next snapshot
* replace MANIFEST.MF versions to next snapshot
* replace plugin.xml versions to next snapshot
* commit with pattern: "Version X.Y.Z-SNAPSHOT"
