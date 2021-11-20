package com.github.pglve.designercoderefactor.services

import com.intellij.openapi.project.Project
import com.github.pglve.designercoderefactor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
