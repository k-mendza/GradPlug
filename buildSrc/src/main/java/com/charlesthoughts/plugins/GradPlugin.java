package com.charlesthoughts.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GradPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        GradPluginExtension extension = project.getExtensions().create("gradPlug", GradPluginExtension.class);
        project.task("gradPlug").doLast(task ->
                System.out.printf("%s from %s%n", extension.getMessage(), extension.getGreeting())
        );
    }
}
