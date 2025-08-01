import org.jreleaser.gradle.plugin.JReleaserExtension

// faketime-core/build.gradle.kts
plugins {
    kotlin("jvm") version "1.9.10"
    `maven-publish`
    signing
    `java-library`
    id("org.jreleaser") version "1.19.0"
}

group = "io.github.matcha4smiley"
version = "0.1.0"

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

publishing {

    publications {
        create<MavenPublication>("faketime") {
            from(components["java"])
            groupId = "io.github.matcha4smiley"
            artifactId = "faketime"
            version = "0.1.0"

            pom {
                name.set("faKeTime")
                description.set("A Kotlin/Java library to fake or freeze time for testing")
                url.set("https://github.com/matcha4smiley/faKeTime")
                inceptionYear.set("2025")
                licenses {
                    license {
                        name.set("Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0")
                    }
                }
                developers {
                    developer {
                        id.set("matcha4smiley")
                        name.set("matcha4smiley")
                        email.set("matcha4smiley@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/matcha4smiley/faKeTime.git")
                    developerConnection.set("scm:git:ssh://git@github.com/matcha4smiley/faKeTime.git")
                    url.set("https://github.com/matcha4smiley/faKeTime")
                }
            }
        }
    }
    repositories {
        maven {
            url = layout.buildDirectory.dir("staging-deploy").get().asFile.toURI()
        }
    }
    configure<JReleaserExtension> {
        configFile.set(file("$projectDir/jreleaser.yml"))
    }
}