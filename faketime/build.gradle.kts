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
        }
    }
    repositories {
        maven {
            name = "CentralPortal"
            url = uri("https://central.sonatype.com/api/v1/publish")
            credentials {
                username = project.findProperty("centralUsername") as String? ?: System.getenv("CENTRAL_USERNAME")
                password = project.findProperty("centralPassword") as String? ?: System.getenv("CENTRAL_PASSWORD")
            }
        }
    }
}
