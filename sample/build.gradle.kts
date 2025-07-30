// faketime-sample/build.gradle.kts
plugins {
    kotlin("jvm") version "1.9.10"
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":faketime"))
}

application {
    mainClass.set("sample.MainKt")
}
