package io.github.matcha4smiley.faketime.datetime.internal

import io.github.matcha4smiley.faketime.datetime.FakeDateTime
import java.time.Instant

internal class FixedFakeDateTime(
    private val instant: Instant,
) : FakeDateTime {
    override fun instant(): Instant = instant
    override fun unixTime(): Long = instant.epochSecond
}
