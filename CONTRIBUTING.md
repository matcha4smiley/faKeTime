## 🚀 Contributing to faKeTime

Thank you for considering a contribution to **faKeTime** — your help is truly appreciated!  
This guide will walk you through setting up your development environment, contributing code, and submitting pull requests.

---

### 🛠️ Development Setup

#### Requirements
- **JDK 17**
- **Gradle 8.0+** (you can use the provided `./gradlew` wrapper)
- Kotlin version: `1.9.x`

#### Getting Started

1. Fork the repository via GitHub  
   👉 [https://github.com/matcha4smiley/faKeTime](https://github.com/matcha4smiley/faKeTime)

2. Clone your fork:
   ```bash
   git clone https://github.com/your-username/faKeTime.git
   cd faKeTime
   ```

3. Build the project:
   ```bash
   ./gradlew build
   ```

#### Recommended IDE
- IntelliJ IDEA (Community Edition is sufficient)

---

### 🧪 Running Tests

To run the test suite:
```bash
./gradlew test
```

All pull requests are tested automatically via GitHub Actions. Make sure your changes pass the tests before submitting.

---

### ✨ Code Style

Please follow Kotlin's [official coding conventions](https://kotlinlang.org/docs/coding-conventions.html) and format your code using your IDE.

> ⚠️ Automated formatting (e.g., using [Spotless](https://github.com/diffplug/spotless)) is not yet enabled,  
> but we plan to introduce it in the near future. Stay tuned!

---

### 🌱 Issue & Pull Request Workflow

#### Branch Naming Convention

Please use the following pattern for all contributions:

```
feature/faketime-{issue-number}-{short-description (optional)}
```

Examples:
- `feature/faketime-42-fix-unix-time-rounding`
- `feature/faketime-17`

#### Pull Request Checklist
- [ ] Code is formatted and easy to read
- [ ] Tests are added or updated if needed
- [ ] All tests pass

#### Pull Request Template
A PR template will be automatically loaded when you create a pull request — please follow it for clarity and consistency.

---

### 📌 Working on Issues

If you'd like to work on an issue:

1. Comment on the issue to say "I'll work on this"
2. A maintainer may assign it to you or add a `status: accepted` label
3. If you're unsure of the solution, feel free to open a **Draft PR** to share your approach early

---

### 🔍 Pull Request Review Process

1. Once your PR is opened, GitHub Actions will automatically run tests
2. A maintainer will review your changes and may leave comments or suggestions
3. After approval, the maintainer will merge the PR  
   _(Note: self-merging is generally not allowed)_

---

### 💬 Questions & Feedback

Feel free to open an [Issue](https://github.com/matcha4smiley/faKeTime/issues) or start a [Discussion](https://github.com/matcha4smiley/faKeTime/discussions) if you have questions or suggestions.  
You’re also welcome to open a Draft PR to get early feedback!

---

## 🎉 First-Time Contributors Welcome!

First-time contributions like fixing typos or improving documentation are more than welcome — thank you for helping make faKeTime better!

If you like this project, consider giving it a ⭐️ on GitHub — it helps us reach more developers!