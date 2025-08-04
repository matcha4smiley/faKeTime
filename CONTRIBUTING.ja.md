## 🚀 faKeTimeへの貢献について

**faKeTime** に興味を持ってくださってありがとうございます！
ここでは、開発環境の準備からコントリビュートの流れ、Pull Request の作成までをわかりやすくまとめています。

---

### 🛠️ 開発環境のセットアップ

#### 必要な環境
- **JDK 17**
- **Gradle 8.0+**（プロジェクトには `./gradlew` ラッパーがあります）
- Kotlin バージョン: `1.9.x`

#### はじめに行うこと

1. GitHub 上でリポジトリを Fork  
   👉 [https://github.com/matcha4smiley/faKeTime](https://github.com/matcha4smiley/faKeTime)

2. Fork したリポジトリをクローン：
   ```bash
   git clone https://github.com/your-username/faKeTime.git
   cd faKeTime
   ```

3. プロジェクトをビルド：
   ```bash
   ./gradlew build
   ```

#### 推奨 IDE
- IntelliJ IDEA（Community EditionでOK）

---

### 🧪 テストの実行

以下のコマンドでテストを実行できます：

```bash
./gradlew test
```

すべての Pull Request は GitHub Actions によって自動でテストされます。  
提出前にテストが通ることを確認してください。

---

### ✨ コードスタイル

Kotlin の[公式コーディング規約](https://kotlinlang.org/docs/coding-conventions.html)に従ってください。  
フォーマットは IDE の自動整形機能を利用してください。

> ⚠️ まだ `Spotless` などの自動整形ツールは導入していませんが、今後導入予定です。

---

### 🌱 Issue・Pull Request の流れ

#### ブランチ命名規則

以下の命名規則でブランチを作成してください：

```
feature/faketime-{Issue番号}-{（任意）簡単な説明}
```

例：
- `feature/faketime-42-fix-unix-time-rounding`
- `feature/faketime-17`

#### Pull Request チェックリスト
- [ ] コードが読みやすく整形されている
- [ ] 必要に応じてテストが追加・修正されている
- [ ] すべてのテストが通っている

#### Pull Request テンプレート
Pull Request 作成時にテンプレートが自動で読み込まれます。必要事項を記入してください。

---

### 🌐 言語ポリシー（Language Policy）

- **コード、コメント、コミットメッセージ、Pull Request の説明、Issue・Discussion などの投稿は英語で記述してください。**
- **メンテナ本人（@matcha4smiley）への直接の質問のみ日本語を使用しても構いません。**

---

### 📌 Issue の対応方法

Issue に取り組みたい場合は：

1. 該当 Issue に "I'd like to work on this" などと英語でコメント
2. メンテナがアサインまたは `status: accepted` ラベルを付けます
3. 不安がある場合は **Draft PR** を早めに出して相談しても問題ありません

---

### 🔍 PRのレビューとマージ

1. PR を作成すると、GitHub Actions によってテストが自動実行されます
2. メンテナが内容を確認し、必要に応じてコメントや修正依頼を行います
3. 問題がなければ Approve → メンテナがマージします  
   ※原則として、自分でマージすること（セルフマージ）は避けてください

---

### 💬 質問・フィードバック

不明点や提案がある場合は、[Issue](https://github.com/matcha4smiley/faKeTime/issues) や  
[Discussion](https://github.com/matcha4smiley/faKeTime/discussions) をご利用ください。

方向性に不安がある場合は Draft PR を使って相談していただいても構いません。

---

## 🎉 初めての貢献も大歓迎！

ドキュメントの改善やちょっとした typo 修正など、小さな貢献も大歓迎です！
一緒に faKeTime をもっと便利で使いやすいライブラリに育てていけたら嬉しいです！

気に入っていただけたら、ぜひ GitHub の ⭐️（スター）もよろしくお願いします！
ライブラリを広める励みになります 😊