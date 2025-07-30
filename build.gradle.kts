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
    // 必要な場合のみ
    testImplementation(kotlin("test"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            groupId = "io.github.matcha4smiley"
            artifactId = "faKeTime"
            version = "0.1.0"

            pom {
                name.set("faKeTime")
                description.set("A fake time control library for Kotlin")
                url.set("https://github.com/matcha4smiley/faKeTime")
                licenses {
                    license {
                        name.set("Apache License 2.0")
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
                    connection.set("scm:git:git://github.com/matcha4smiley/faKeTime.git")
                    developerConnection.set("scm:git:ssh://github.com:matcha4smiley/faKeTime.git")
                    url.set("https://github.com/matcha4smiley/faKeTime")
                }
            }
        }
    }
}
