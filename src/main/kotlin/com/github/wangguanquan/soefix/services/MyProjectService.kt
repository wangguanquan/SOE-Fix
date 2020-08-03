package com.github.wangguanquan.soefix.services

import com.intellij.openapi.project.Project
import com.github.wangguanquan.soefix.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
