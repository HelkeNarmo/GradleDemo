package com.narmo.plugintest

import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.android.applicationVariants.all { variant ->
            variant.outputs.all {
                def namePre = outputFileName.replace(".apk", "")
                outputFileName = "$namePre-${variant.name}-v${variant.versionName}.apk"
            }
        }
    }
}