# faKeTime

⏳ A fake time control library for Kotlin.  
Freeze, tick, shift, and format time as you like.

> 🧪 **Currently in early development phase** — core API is under construction.  
> Follow or ⭐️ Star to get updates as features are added!

---

## 🚀 Example (planned)

```kotlin
val fakeDateTime = FakeDateTime.fixed(Instant.parse("2025-07-30T12:00:00Z"))
fakeDateTime.instant()     // → 2025-07-30T12:00:00Z
fakeDateTime.unixTime()    // → 1753915200
```

---

## 📦 Installation

This library will be published to **Maven Central** soon.

For now, you can use it via **GitHub Packages**:

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/matcha4smiley/faKeTime")
        credentials {
            username = "<your-github-username>"
            password = "<your-personal-access-token>"
        }
    }
}

dependencies {
    implementation("io.github.matcha4smiley:faketime:0.1.0")
}
```

---

## 📅 Roadmap

- ✅ GitHub Packages initial release
- ✅ Core: `FakeDateTime.fixed(...)`
- 🚧 Support for UNIX timestamp, `Clock`, `ZonedDateTime`
- 🚧 Kotlin Multiplatform support (future)
- 🚧 Publish to Maven Central

---

## 💚 Support & Feedback

If you like this project, consider giving it a ⭐️!  
It really motivates me and helps the project grow.

Feedback, ideas, and contributions are all welcome —  
feel free to open an [issue](https://github.com/matcha4smiley/faKeTime/issues) or start a [discussion](https://github.com/matcha4smiley/faKeTime/discussions).

---

## 📝 License

Apache License 2.0
