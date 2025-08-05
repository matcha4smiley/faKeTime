# 🚀 faKeTime へのコントリビュート

**faKeTime** にご興味を持っていただきありがとうございます！  
このガイドでは、開発環境のセットアップ、コードのコントリビュート、Pull Request の提出方法をご紹介します。

---

## 📚 目次

- [🛠️ 開発環境のセットアップ](#-開発環境のセットアップ)
- [🧪 テストの実行](#-テストの実行)
- [✨ コードスタイルと Lint](#-コードスタイルと-lint)
- [🌱 Issue・Pull Request の流れ](#-issuepull-request-の流れ)
- [🔍 Pull Request のレビュー手順](#-pull-request-のレビュー手順)
- [💬 質問・フィードバック](#-質問フィードバック)
- [🎉 初めてのコントリビュートも大歓迎！](#-初めてのコントリビュートも大歓迎)

---

## 🛠️ 開発環境のセットアップ

**必要環境**
- **JDK 17**
- **Gradle 8.0+**（`./gradlew` ラッパーが同梱されています）
- Kotlin バージョン：`1.9.x`

**はじめにやること**
1. **GitHub でリポジトリをフォーク**  
   👉 [faKeTime on GitHub](https://github.com/matcha4smiley/faKeTime)
2. **フォークしたリポジトリをクローン：**
   ```bash
   git clone https://github.com/your-username/faKeTime.git
   cd faKeTime
   ```
3. **プロジェクトをビルド：**
   ```bash
   ./gradlew build
   ```

**推奨 IDE:**  
IntelliJ IDEA（Community Edition で問題ありません）

---

## 🧪 テストの実行

テストスイートを実行するには以下のコマンドを実行します：
```bash
./gradlew test
```
すべての Pull Request は GitHub Actions によって自動でテストされます。  
PR を出す前にローカルでテストが通ることを確認してください。

---

## ✨ コードスタイルと Lint

[Spotless](https://github.com/diffplug/spotless) + [ktlint](https://github.com/pinterest/ktlint) を使用して Kotlin のコードスタイルを統一しています。

**Pull Request の前に以下を実行してください：**
```bash
./gradlew spotlessApply
```
コードが自動的に整形されます。

その後、リントチェックを実行してください：
```bash
./gradlew spotlessCheck
```

> ⚠️ spotlessCheck に失敗した PR はマージされません。

IntelliJ IDEA で保存時に自動フォーマットするよう設定すると、より快適です。

---

## 🌱 Issue・Pull Request の流れ

### 📝 Issueの作成について

このリポジトリでは、**どなたでもIssueを作成できます**。  
バグ報告・機能要望など、[新しいIssueを作成](https://github.com/matcha4smiley/faKeTime/issues/new) して、お気軽にご投稿ください！

> ※すでに同じ内容の [既存Issue](https://github.com/matcha4smiley/faKeTime/issues) がないかだけご確認ください。

### ブランチの命名規則

すべてのブランチは以下の形式で命名してください：
```
feature/faketime-{issue番号}-{概要（任意）}
```
例：
- `feature/faketime-42-fix-unix-time-rounding`
- `feature/faketime-17`

### Pull Request チェックリスト

> PR を出す前に以下を確認してください：

- [ ] `./gradlew spotlessApply` を実行して整形済み
- [ ] `./gradlew spotlessCheck` がパスする
- [ ] 必要に応じてテストを追加または更新した
- [ ] すべてのテストが成功する

> **複数のPRテンプレートを用意しています：**
> - Feature（新機能）
> - Bug Fix（バグ修正）
> - Documentation Update（ドキュメント）
> - Release（リリース用）  

> PR作成時に内容に合ったテンプレートを**必ず選択してください**。
>（GitHubの画面で選択肢が表示されます。デフォルトはありません）

---

### 📌 Issue に取り組む場合

Issue に取り組みたい場合は：

1. 「この Issue に取り組みます」とコメントしてください
2. メンテナーが `status: accepted` ラベルを付けることがあります
3. 解決方法に不安がある場合は、早めに **Draft PR** を作成してください

---

## 🔍 Pull Request のレビュー手順

1. PR を作成すると、**GitHub Actions がテストとリントチェックを自動実行**します
2. メンテナーがコードレビューを行い、コメントや提案を残す場合があります
3. 承認後、メンテナーが PR をマージします  
   （※ 通常は自分でマージはできません）

---

## 💬 質問・フィードバック

質問や提案がある場合は [Issue](https://github.com/matcha4smiley/faKeTime/issues) や  
[Discussion](https://github.com/matcha4smiley/faKeTime/discussions) に投稿してください。  
また、早期に意見をもらいたい場合は Draft PR を作成しても OK です！

---

## 🎉 初めてのコントリビュートも大歓迎！

typo 修正やドキュメント改善など、小さな貢献でも大歓迎です。  
faKeTime をより良くしていただきありがとうございます！

---

## ✍️ 言語について（Language Policy）

基本的には **英語** での記述をお願いします。  
Issue・Pull Request・コミットメッセージ・コメントなど、他のコントリビューターと共有する情報は英語で統一することで、国際的な貢献を促進します。

ただし、**私（@matcha4smiley）宛の質問や確認であれば、日本語で書いていただいても問題ありません。**

このプロジェクトが気に入ったら、GitHubの ⭐️で応援していただけると嬉しいです！
---