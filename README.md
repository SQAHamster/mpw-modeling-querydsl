# QueryDSL for the MPW Modeling Framework

This repository contains a custom DSL used to describe queries and constraints for the MPW Modeling Framework (https://github.com/SQAHamster/mpw-modeling-framework).

## Running QueryDSL editor

* right click on project `de.unistuttgart.iste.sqa.mpw.modeling.querydsl`
* run as Eclipse Application
    * note: ensure that in the run configuration the Java JDK 15 is used
* import project in the runtime eclipse workspace
    * browse to a development workspace containing an concrete simulator modeling
    * select the modeling project, e.g. `de.unistuttgart.iste.sqa.mpw.modeling.hamstersimulator` project
* double click on any `*.query` file under `src-queries`, it shall be opened with syntax highlighting
