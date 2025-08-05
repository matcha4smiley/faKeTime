package io.github.matcha4smiley.faketime.datetime

import java.time.Instant
import kotlin.test.Test
import kotlin.test.assertEquals

class FakeDateTimeTest {

    @Test
    fun `fixed returns correct instant and unixTime`()  {
        val instant = Instant.parse("2025-07-30T12:00:00Z")
        val fake = FakeDateTime.fixed(instant)

        assertEquals(instant, fake.instant())
        assertEquals(instant.epochSecond, fake.unixTime())
    }
}
