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

## 📅 Roadmap
- [x] GitHub Packages initial release
- [x] Core: FakeDateTime.fixed(...)
- [] Support for UNIX timestamp, Clock, ZonedDateTime
- [] Kotlin Multiplatform support (future)
- [] Publish to Maven Central