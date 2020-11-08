import com.charlesthoughts.plugins.GradPlugin
import com.charlesthoughts.plugins.GradPluginExtension

plugins {
    java
}

group = "com.charlesthoughts"
version = "1.0"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
}

apply<GradPlugin>()

configure<GradPluginExtension> {
    message = "Hi"
    greeting = "Gradle"
}
