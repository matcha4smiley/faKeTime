<img src="docs/images/faKeTime_Logo.png" alt="faKeTime logo" style="width:30%;"/>

# faKeTime

⏳ A fake time control library for Kotlin.  
Freeze, tick, shift, and format time as you like.

> 🇯🇵 日本語版 README は [こちら](README.ja.md) からご覧いただけます。

> 🧪 **Currently in early development phase** — core API is under construction.  
> Follow or ⭐️ Star to get updates as features are added!

---

## 🚀 Example

```kotlin
import io.github.matcha4smiley.faketime.FakeDateTime
import java.time.Instant

val fakeDateTime = FakeDateTime.fixed(Instant.parse("2025-07-30T12:00:00Z"))
fakeDateTime.instant()     // → 2025-07-30T12:00:00Z
fakeDateTime.unixTime()    // → 1753915200
```

---

## 📦 Installation

faKeTime is available on **Maven Central** 🎉

### Gradle (Kotlin DSL)

```kotlin
dependencies {
  implementation("io.github.matcha4smiley:faketime:0.1.1")
}
```

### Gradle (Groovy)

```groovy
dependencies {
  implementation 'io.github.matcha4smiley:faketime:0.1.1'
}
```

Make sure to include Maven Central in your repositories (default in most Gradle setups):

```kotlin
repositories {
  mavenCentral()
}
```

---

## ❓ Why faKeTime?

- ✅ Test time-sensitive code with ease
- ✅ Fake time without changing app logic
- ✅ Supports fixed, ticked, and shifted time models
- ✅ Familiar API inspired by `java.time`
- 🕘 Coming soon: `FakeTime` for lightweight clock-based control (without date-time overhead)

---

## 📅 Roadmap

> 🚧 This library is under active development.  
> Here's what's been done and what's coming next!

### ✅ Released
- ✅ GitHub Packages: Initial release (`0.1.1`)
- ✅ Core API: `FakeDateTime.fixed(...)`

---

### 🧭 Planned
- Add `FakeTime` for simulating plain time (e.g. `Long`, `Clock`, `Duration` based)
- `FakeDateTime.tick(interval: Duration)` – Automatically advance time by fixed intervals
- `FakeDateTime.shift(duration: Duration)` – Manually move time forward/backward
- Support for:
  - Instant
  - LocalDateTime
  - ZonedDateTime
  - UNIX timestamp (as Long)
- Core methods:
  - (for `FakeDateTime`)
  - `unixTime()`
  - `toEpochMilli()`
  - `toIso8601String()`
- Kotlin Multiplatform (KMP) support

### 📦 Distribution
- ✅ Maven Central release
- 🗑️ GitHub Packages (deprecated)

---

## 📖 Documentation

- [Contributing Guide (EN)](docs/CONTRIBUTING.md)
- [コントリビュートガイド（JP）](docs/CONTRIBUTING.ja.md)
- [Discussions](https://github.com/matcha4smiley/faKeTime/discussions)

---

## 💚 Support & Feedback

If you like this project, consider giving it a ⭐️!  
It really motivates me and helps the project grow.

Feedback, ideas, and contributions are all welcome —  
feel free to open an [issue](https://github.com/matcha4smiley/faKeTime/issues) or start a [discussion](https://github.com/matcha4smiley/faKeTime/discussions).

---

## 📝 License

Apache License 2.0