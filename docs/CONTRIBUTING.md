
# 🚀 Contributing to faKeTime

Thank you for considering a contribution to **faKeTime** — your help is truly appreciated!  
This guide will walk you through setting up your development environment, contributing code, and submitting pull requests.

---

## 📚 Table of Contents

- [🛠️ Development Setup](#-development-setup)
- [🧪 Running Tests](#-running-tests)
- [✨ Code Style & Lint](#-code-style--lint)
- [🌱 Issue & Pull Request Workflow](#-issue--pull-request-workflow)
- [🔍 Pull Request Review Process](#-pull-request-review-process)
- [💬 Questions & Feedback](#-questions--feedback)
- [🎉 First-Time Contributors Welcome!](#-first-time-contributors-welcome)

---

## 🛠️ Development Setup

**Requirements**
- **JDK 17**
- **Gradle 8.0+** (you can use the provided `./gradlew` wrapper)
- Kotlin version: `1.9.x`

**Getting Started**
1. **Fork the repository** via GitHub  
   👉 [faKeTime on GitHub](https://github.com/matcha4smiley/faKeTime)
2. **Clone your fork:**
   ```bash
   git clone https://github.com/your-username/faKeTime.git
   cd faKeTime
   ```
3. **Build the project:**
   ```bash
   ./gradlew build
   ```
**Recommended IDE:**  
IntelliJ IDEA (Community Edition is sufficient)

---

## 🧪 Running Tests

To run the test suite:
```bash
./gradlew test
```
All pull requests are tested automatically via GitHub Actions.  
Make sure your changes pass the tests before submitting.

---

## ✨ Code Style & Lint

We use [Spotless](https://github.com/diffplug/spotless) with [ktlint](https://github.com/pinterest/ktlint) to enforce Kotlin code formatting and style.

**Before opening a Pull Request, please run:**
```bash
./gradlew spotlessApply
```
This will automatically format your code.

After that, check that your code passes the linter:
```bash
./gradlew spotlessCheck
```

> ⚠️ **Pull Requests that fail the lint check (Spotless) will not be merged.**

You can also configure your IDE (e.g. IntelliJ IDEA) to run ktlint automatically on save for even smoother development.

---

## 🌱 Issue & Pull Request Workflow

### 📝 Creating Issues

Anyone can create an issue in this repository!  
Feel free to [open a new issue](https://github.com/matcha4smiley/faKeTime/issues/new) to report bugs, request features.

> **Tip:** Please check [existing issues](https://github.com/matcha4smiley/faKeTime/issues) before creating a new one to avoid duplicates.

### Branch Naming Convention

Use the following pattern for all contributions:
```
feature/faketime-{issue-number}-{short-description (optional)}
```
Examples:
- `feature/faketime-42-fix-unix-time-rounding`
- `feature/faketime-17`

### **Pull Request Checklist**

> **Before submitting your PR, please confirm:**

- [ ] Code is **auto-formatted using `./gradlew spotlessApply`**
- [ ] `./gradlew spotlessCheck` passes with no errors
- [ ] Tests are added or updated if needed
- [ ] All tests pass

>We provide a single, general-purpose Pull Request template.  
>When creating a pull request, the template will be loaded automatically.  
>Please fill in all relevant sections to help reviewers understand your change.

---

### 📌 Working on Issues

If you'd like to work on an issue:

1. Comment on the issue to say "I'll work on this"
2. A maintainer may assign it to you or add a `status: accepted` label
3. If you're unsure of the solution, feel free to open a **Draft PR** to share your approach early

---

## 🔍 Pull Request Review Process

1. Once your PR is opened, **GitHub Actions will automatically run tests and lint checks**
2. A maintainer will review your changes and may leave comments or suggestions
3. After approval, the maintainer will merge the PR  
   _(Note: self-merging is generally not allowed)_

---

## 💬 Questions & Feedback

Feel free to open an [Issue](https://github.com/matcha4smiley/faKeTime/issues) or start a [Discussion](https://github.com/matcha4smiley/faKeTime/discussions) if you have questions or suggestions.  
You’re also welcome to open a Draft PR to get early feedback!

---

## 🎉 First-Time Contributors Welcome!

First-time contributions like fixing typos or improving documentation are more than welcome — thank you for helping make faKeTime better!

If you like this project, consider giving it a ⭐️ on GitHub — it helps us reach more developers!
