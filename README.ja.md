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

> 🚧 このロードマップは開発の進行やフィードバック、優先度、新しいアイデアなどに応じて**変更される場合があります**。  
> 機能提案やコントリビューションもいつでも歓迎です！

---

### ✅ リリース済み

#### **v0.1.0**: 初回リリース – GitHub Packages & Maven Centralに公開
- `FakeDateTime.fixed(...)`（コアAPI）を含む

#### **v0.1.1**:
- より簡単なインポートのためのtypealias追加、およびREADME修正 ([#20](https://github.com/matcha4smiley/faKeTime/pull/20))
- `FakeDateTimeSample.kt` 使用例サンプルの追加 ([#22](https://github.com/matcha4smiley/faKeTime/pull/22))

---

### 🚀 今後の予定

#### **v0.2.0**
- `FakeDateTime.ticked(...)` および `FakeDateTime.shifted(...)` の追加（Instant & unixTime のみ対応）
- 新機能のテスト追加

#### **v0.3.0 ～ v0.8.0**
- 追加の時間型への対応拡張  
  （例: `LocalDateTime`, `ZonedDateTime`, UNIXタイムスタンプ など）
- シンプルな時間操作用 `FakeTime`（`Long`, `Clock`, `Duration` 対応）の実装
- 追加ユーティリティ・変換メソッド（`unixTime()`, `toEpochMilli()` など）の導入
- **Kotlin Multiplatform (KMP) 対応**  
  （JVM・JS・Native対応）
- ドキュメントや使用例の充実
- フィードバックに基づくAPIの改善

#### **v0.9.0**
- 正式リリース前の最終調整
  - APIの最終レビュー＆調整
  - ドキュメント・使用例の総仕上げ
  - バグ修正・リファクタリング
  - 安定版リリース準備

#### **v1.0.0**
- **安定版リリース**
- 最終的な機能セットやAPIは、今後のフィードバックやテスト、コミュニティの要望を踏まえて決定

> このスケジュールはあくまで目安であり、開発の進行に応じて変更されることがあります。  
> 機能提案・フィードバック・コントリビュートは [Discussions](https://github.com/matcha4smiley/faKeTime/discussions) でいつでもお待ちしています！

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