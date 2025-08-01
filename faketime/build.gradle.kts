// faketime-core/build.gradle.kts
plugins {
    kotlin("jvm") version "1.9.10"
    `maven-publish`
    signing
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

publishing {
    publications {
        create<MavenPublication>("faketime") {
            from(components["java"])
            groupId = "io.github.matcha4smiley"
            artifactId = "faketime"
            version = "0.1.0"

            pom {
                name.set("faKeTime")
                description.set("A Kotlin library to fake time during testing.")
                url.set("https://github.com/matcha4smiley/faKeTime")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
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
                    connection.set("scm:git:git://github.com/matcha4smiley/faKeTime.git")
                    developerConnection.set("scm:git:ssh://git@github.com:matcha4smiley/faKeTime.git")
                    url.set("https://github.com/matcha4smiley/faKeTime")
                }
            }
        }
    }

    repositories {
        maven {
            name = "centralPortal"
            url = uri("https://central.sonatype.com/api/v1/publisher/deployments")
            credentials {
                username = System.getenv("CENTRAL_PORTAL_USERNAME")
                password = System.getenv("CENTRAL_PORTAL_PASSWORD")
            }
        }
    }
}

signing {
    useInMemoryPgpKeys(
        System.getenv("SIGNING_KEY_ID"),
        System.getenv("SIGNING_KEY"),
        System.getenv("SIGNING_PASSWORD")
    )
    sign(publishing.publications["faketime"])
}
