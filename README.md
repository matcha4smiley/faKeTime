<img src="docs/images/faKeTime_Logo.png" alt="faKeTime logo" style="width:30%;"/>

[![Maven Central](https://img.shields.io/maven-central/v/io.github.matcha4smiley/faketime?label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.matcha4smiley/faketime)
[![License](https://img.shields.io/github/license/matcha4smiley/faKeTime)](LICENSE)
[![Newcomers Welcome](https://img.shields.io/badge/newcomers-welcome-brightgreen.svg)](https://github.com/matcha4smiley/faKeTime/contribute)
[![GitHub Stars](https://img.shields.io/github/stars/matcha4smiley/faKeTime?style=social)](https://github.com/matcha4smiley/faKeTime/stargazers)
[![Contributors](https://img.shields.io/github/contributors/matcha4smiley/faKeTime)](https://github.com/matcha4smiley/faKeTime/graphs/contributors)
[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#-contributors)

# faKeTime

⏳ A time manipulation library for **testing Kotlin applications**.  
Freeze, tick, shift, and assert time with precision.

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

faKeTime is designed specifically for **testing time-sensitive code**.

✅ **Make time deterministic** — avoid flaky tests caused by system clocks  
✅ **Inject fake time** without changing your production logic  
✅ Easily switch between:
- 🧊 `fixed` time (e.g., freeze now)
- ⏩ `ticked` time (advance on each call)
- ⏱️ `adjustable` time (manually jump or shift time)

✅ Familiar API based on `java.time` and `kotlin.time`  
✅ Write **cleaner tests** without custom time wrappers or boilerplate  
✅ Great for testing:
- Scheduling logic
- Timeouts and retries
- Expiration and TTLs
- Delayed tasks
- Any time-dependent logic

🕘 Coming soon: `FakeTime` for lighter use cases without date-time overhead

---

## 📅 Roadmap

> 🚧 This roadmap is a work in progress and **subject to change** based on feedback, priorities, and new ideas.  
> Contributions and suggestions are always welcome!

---

### ✅ Released

#### **v0.1.0**: Initial release – Published to GitHub Packages & Maven Central
  - Includes: `FakeDateTime.fixed(...)` (core API)

#### **v0.1.1**:
- Add typealias for easier import & update README ([#20](https://github.com/matcha4smiley/faKeTime/pull/20))
- Add `FakeDateTimeSample.kt` usage example ([#22](https://github.com/matcha4smiley/faKeTime/pull/22))

---

### 🚀 Upcoming Plans

#### **v0.2.0 – v0.8.0: Feature Expansion Phase**
- Add `FakeDateTime.ticked(...)` and `FakeDateTime.adjustable(...)` (for `Instant` & `unixTime`)
- Expand support for additional time types  
  (e.g., `LocalDateTime`, `ZonedDateTime`, UNIX timestamp)
- Introduce `FakeTime` for simulating plain time (`Long`, `Clock`, `Duration`)
- Add utility & conversion methods (`unixTime()`, `toEpochMilli()`, etc.)
- Improve test coverage & usage examples
- Begin **Kotlin Multiplatform (KMP)** support  
  (JVM, JS, Native compatibility)
- Continuously refine core API based on feedback

#### **v0.9.0**
- Pre-release finalization:
- Final API review & polish
- Comprehensive documentation & samples
- Bug fixes & refactoring
- Prepare for stable release

#### **v1.0.0**
- **Stable release**
- Final feature set and API determined based on feedback, testing, and community needs

> This schedule is a guideline and may change as the project evolves.  
> If you have feature ideas, feedback, or want to help, please join the [Discussions](https://github.com/matcha4smiley/faKeTime/discussions)!

---

### 📦 Distribution
- ✅ Maven Central release
- 🗑️ GitHub Packages (deprecated)

---  
## 🧪 Who is it for?

If you're writing **unit tests** or **integration tests** that depend on time —  
`faKeTime` helps you control and assert time with precision and zero flakiness.

No more:
- Custom clock wrappers
- Thread.sleep hacks
- Unstable system time assertions  
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