<img src="docs/images/faKeTime_Logo.png" alt="faKeTime logo" style="width:30%;"/>

[![Maven Central](https://img.shields.io/maven-central/v/io.github.matcha4smiley/faketime?label=Maven%20Central)](https://central.sonatype.com/artifact/io.github.matcha4smiley/faketime)
[![License](https://img.shields.io/github/license/matcha4smiley/faKeTime)](LICENSE)
[![Newcomers Welcome](https://img.shields.io/badge/newcomers-welcome-brightgreen.svg)](https://github.com/matcha4smiley/faKeTime/contribute)
[![GitHub Stars](https://img.shields.io/github/stars/matcha4smiley/faKeTime?style=social)](https://github.com/matcha4smiley/faKeTime/stargazers)
[![Contributors](https://img.shields.io/github/contributors/matcha4smiley/faKeTime)](https://github.com/matcha4smiley/faKeTime/graphs/contributors)

# faKeTime（フェイクタイム）

⏳ Kotlin で時間を自在にコントロールするためのテスト支援ライブラリです。  
時間を「固定」「進める」「ずらす」「整形する」など、思いのままに扱えます。

> 🧪 **現在は開発初期フェーズです** — コア API を鋭意開発中です。  
> 興味を持っていただけたら ⭐️ スターやウォッチで応援してください！

---

## 🚀 使用例

```kotlin
import io.github.matcha4smiley.faketime.FakeDateTime
import java.time.Instant

val fakeDateTime = FakeDateTime.fixed(Instant.parse("2025-07-30T12:00:00Z"))
fakeDateTime.instant()     // → 2025-07-30T12:00:00Z
fakeDateTime.unixTime()    // → 1753915200
```

---

## 📦 インストール

faKeTime は **Maven Central** から利用できます 🎉

### Gradle（Kotlin DSL）

```kotlin
dependencies {
    implementation("io.github.matcha4smiley:faketime:0.1.1")
}
```

### Gradle（Groovy）

```groovy
dependencies {
    implementation 'io.github.matcha4smiley:faketime:0.1.1'
}
```

通常、`repositories` に `mavenCentral()` を含めるだけで利用可能です：

```kotlin
repositories {
    mavenCentral()
}
```

---

## ❓ faKeTime とは？

- ✅ 時間に依存した処理のテストが簡単に書ける
- ✅ アプリ側のロジックを変更せずに、時間だけを偽装できる
- ✅ 固定・進行・手動シフトの時間操作に対応予定
- ✅ `java.time` に近い、直感的で扱いやすい API
- 🕘 近日追加予定：`FakeTime`（日付を含まない軽量な時間制御向けのAPI）

---

## 📅 開発ロードマップ

> 🚧 ライブラリは現在も積極的に開発中です。  
> 実装済みのもの、今後追加予定の機能は以下のとおりです。

### ✅ 実装済み
- ✅ GitHub Packages にて初回リリース（`0.1.1`）
- ✅ `FakeDateTime.fixed(...)` を提供

---

### 🧭 今後の予定（Planned）
- `FakeTime`：日付なしの時刻制御（LongやClockベース）
- `FakeDateTime.tick(interval: Duration)`：一定間隔で自動進行
- `FakeDateTime.shift(duration: Duration)`：手動で時間を進めたり戻したり
- 対応予定の型：
    - Instant
    - LocalDateTime
    - ZonedDateTime
    - UNIX timestamp（Long型）
- 実装予定のメソッド：
    - `unixTime()`
    - `toEpochMilli()`
    - `toIso8601String()`
- Kotlin Multiplatform（KMP）対応

### 📦 配布について
- ✅ Maven Central で提供中
- 🗑️ GitHub Packages は非推奨（提供終了）

---

## 📖 ドキュメント＆ポリシー

- [コントリビュートガイド（日本語）](docs/CONTRIBUTING.ja.md)
- [Contributing Guide (EN)](docs/CONTRIBUTING.md)
- [ディスカッションはこちら](https://github.com/matcha4smiley/faKeTime/discussions)
- [Code of Conduct](docs/CODE_OF_CONDUCT.md)
- [Security Policy](docs/SECURITY.md)
- [Discussions](https://github.com/matcha4smiley/faKeTime/discussions)

---

## 💚 フィードバック・協力のお願い

このプロジェクトが気に入ったら、ぜひ ⭐️ スターで応援してください！  
とても励みになりますし、プロジェクトの成長にもつながります。

バグ報告・提案・貢献など大歓迎です。  
[Issue](https://github.com/matcha4smiley/faKeTime/issues) や  
[Discussion](https://github.com/matcha4smiley/faKeTime/discussions) でお気軽にご参加ください。

---

## 📝 ライセンス

[Apache License 2.0](LICENSE)