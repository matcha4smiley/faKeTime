<img src="docs/images/faKeTime_Logo.png" alt="faKeTime logo" style="width:30%;"/>
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#contributors-)
<!-- ALL-CONTRIBUTORS-BADGE:END -->

[![Maven Central](https://img.shields.io/maven-central/v/io.github.matcha4smiley/faketime?label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.matcha4smiley/faketime)
[![License](https://img.shields.io/github/license/matcha4smiley/faKeTime)](LICENSE)
[![Newcomers Welcome](https://img.shields.io/badge/newcomers-welcome-brightgreen.svg)](https://github.com/matcha4smiley/faKeTime/contribute)
[![GitHub Stars](https://img.shields.io/github/stars/matcha4smiley/faKeTime?style=social)](https://github.com/matcha4smiley/faKeTime/stargazers)
[![Contributors](https://img.shields.io/github/contributors/matcha4smiley/faKeTime)](https://github.com/matcha4smiley/faKeTime/graphs/contributors)
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#-contributors)

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

## 📖 Documentation & Policies
- [Contributing Guide (EN)](docs/CONTRIBUTING.md)
- [コントリビュートガイド（JP）](docs/CONTRIBUTING.ja.md)
- [Code of Conduct](docs/CODE_OF_CONDUCT.md)
- [Security Policy](docs/SECURITY.md)
- [Discussions](https://github.com/matcha4smiley/faKeTime/discussions)

---

## 💚 Support & Feedback

If you like this project, consider giving it a ⭐️!  
It really motivates me and helps the project grow.

Feedback, ideas, and contributions are all welcome —  
feel free to open an [issue](https://github.com/matcha4smiley/faKeTime/issues) or start a [discussion](https://github.com/matcha4smiley/faKeTime/discussions).

---

## ✨ Contributors

Thanks goes to these wonderful people ([emoji key](https://github.com/all-contributors/all-contributors/blob/master/docs/emoji-key.md)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- ALL-CONTRIBUTORS-LIST:END -->

---

## 📝 License

- [License: Apache License 2.0](LICENSE)
## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/matcha4smiley"><img src="https://avatars.githubusercontent.com/u/158127859?v=4?s=100" width="100px;" alt="ryo.saito"/><br /><sub><b>ryo.saito</b></sub></a><br /><a href="https://github.com/matcha4smiley/faKeTime/commits?author=matcha4smiley" title="Code">💻</a> <a href="https://github.com/matcha4smiley/faKeTime/commits?author=matcha4smiley" title="Documentation">📖</a> <a href="https://github.com/matcha4smiley/faKeTime/issues?q=author%3Amatcha4smiley" title="Bug reports">🐛</a> <a href="#ideas-matcha4smiley" title="Ideas, Planning, & Feedback">🤔</a> <a href="#infra-matcha4smiley" title="Infrastructure (Hosting, Build-Tools, etc)">🚇</a> <a href="https://github.com/matcha4smiley/faKeTime/pulls?q=is%3Apr+reviewed-by%3Amatcha4smiley" title="Reviewed Pull Requests">👀</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!