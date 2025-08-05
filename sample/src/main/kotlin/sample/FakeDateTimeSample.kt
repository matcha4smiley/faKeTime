package sample

import io.github.matcha4smiley.faketime.FakeDateTime
import java.time.Instant

fun main() {
    val fakeDateTime = FakeDateTime.fixed(Instant.parse("2025-01-01T00:00:00Z"))
    println("Fake now(Instant): ${fakeDateTime.instant()}")
    println("Fake now(unixTime): ${fakeDateTime.unixTime()}")
}
