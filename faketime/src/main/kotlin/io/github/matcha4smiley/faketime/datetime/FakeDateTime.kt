package io.github.matcha4smiley.faketime.datetime

import io.github.matcha4smiley.faketime.datetime.internal.FixedFakeDateTime
import java.time.Instant

interface FakeDateTime {
    fun instant(): Instant

    fun unixTime(): Long

    companion object {
        fun fixed(fixedInstant: Instant): FakeDateTime = FixedFakeDateTime(fixedInstant)
    }
}
