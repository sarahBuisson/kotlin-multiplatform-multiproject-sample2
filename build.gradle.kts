import groovy.json.JsonBuilder
import org.gradle.api.publish.maven.MavenPublication


repositories {
    mavenCentral()
}
val kotlinVersion = "1.3.61"
val rootGroup = "com.example.my.library"
val rootVersion = "0.0.1"


plugins {
    val kotlinVersion = "1.3.61"
    kotlin("multiplatform").version(kotlinVersion)
    id("maven-publish")
}

subprojects {

    this.group = rootGroup;
    this.version = rootVersion;
    this.extra.set("kotlinVersion", kotlinVersion)
    apply(from = "../util.gradle.kts")

}
