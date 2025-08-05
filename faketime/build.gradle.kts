// faketime/build.gradle.kts
plugins {
    kotlin("jvm") version "1.9.10"
    `maven-publish`
    `java-library`
    id("org.jreleaser") version "1.19.0"
}

group = "io.github.matcha4smiley"
version = "0.1.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}

java {
    withSourcesJar()
    withJavadocJar()
}