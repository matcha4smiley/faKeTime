import org.jreleaser.model.Active
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins{
    kotlin("jvm") version "1.9.10" apply false
    `java-library`
    id("org.jreleaser") version "1.19.0"
}

java {
    withSourcesJar()
    withJavadocJar()
}

allprojects {
    group = "io.github.matcha4smiley"
    version = "0.1.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    // Kotlin & Java セットアップ
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    version = "0.1.0"

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    configure<org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension> {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_17
        }
    }

    if (project.name == "faketime") {
        apply(plugin = "org.jreleaser")

        java {
            withJavadocJar()
            withSourcesJar()
        }

        configure<PublishingExtension> {
            publications {
                register<MavenPublication>("maven") {
                    from(components["java"])
                    pom {
                        name.set("faketime")
                        description.set("A Kotlin library to fake time during testing")
                        url.set("https://github.com/matcha4smiley/faKeTime")
                        licenses {
                            license {
                                name.set("Apache-2.0")
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
                            developerConnection.set("scm:git:ssh://github.com:matcha4smiley/faKeTime.git")
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
        }

        configure<org.jreleaser.gradle.plugin.JReleaserExtension> {
            gitRootSearch = true
            project {
                name = "faketime"
                version = "0.1.0"
                description = "A Kotlin library to fake time during testing"
                authors = listOf("matcha4smiley")
                license = "Apache-2.0"
                links {
                    homepage = "https://github.com/matcha4smiley/faKeTime"
                }
            }

            signing {
                active = Active.ALWAYS
                armored = true
            }

            deploy {
                maven {
                    mavenCentral {
                        register("sonatype") {
                            active = Active.ALWAYS
                            url = "https://central.sonatype.com/api/v1/publisher"
                            sign = true
                            checksums = true
                            sourceJar = true
                            javadocJar = true
                            verifyPom = true
                            applyMavenCentralRules = true
                            stagingRepository(layout.buildDirectory.dir("staging-deploy").get().asFile.path)
                        }
                    }
                }
            }
        }
    }
}