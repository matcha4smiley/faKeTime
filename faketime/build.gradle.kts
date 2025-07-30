// faketime-core/build.gradle.kts
plugins {
    kotlin("jvm") version "1.9.10"
    `maven-publish`
}

group = "io.github.matcha4smiley"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("faketime") {
            from(components["java"])
            groupId = "io.github.matcha4smiley"
            artifactId = "faketime"
            version = "0.1.0"
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/matcha4smiley/faKeTime")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
