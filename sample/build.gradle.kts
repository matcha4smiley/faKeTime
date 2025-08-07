// faketime-sample/build.gradle.kts
plugins {
    kotlin("jvm") version "1.9.10"
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.github.matcha4smiley:faketime:0.1.1")
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("sample.MainKt")
}
