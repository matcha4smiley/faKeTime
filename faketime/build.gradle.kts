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
            name = "centralPortal"
            url = uri("https://central.sonatype.com/api/v1/publisher/deployments/download/")
            credentials(HttpHeaderCredentials::class) {
                name = System.getenv("CENTRAL_AUTH_HEADER_NAME")
                value = System.getenv("CENTRAL_AUTH_HEADER_VALUE")
            }
            authentication {
                create("header", HttpHeaderAuthentication::class)
            }
        }
    }
}
