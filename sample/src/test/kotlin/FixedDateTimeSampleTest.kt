package sample

import io.github.matcha4smiley.faketime.FakeDateTime
import java.time.Instant
import kotlin.test.Test
import kotlin.test.assertEquals

class FixedDateTimeSampleTest {

    private val fixedDateTimeSample = FixedDateTimeSample()

    @Test
    fun sampleWithInstantTest(){
        val fake = FakeDateTime.fixed(Instant.parse("2025-01-01T12:00:00Z")).instant()
        val result = fixedDateTimeSample.sample(fake)

        assertEquals("DateTime(Instant):$fake", result)
    }

    @Test
    fun sampleWithUnixTimeTest(){
        val fake = FakeDateTime.fixed(Instant.parse("2025-01-01T12:00:00Z")).unixTime()
        val result = fixedDateTimeSample.sample(fake)

        assertEquals("DateTime(unixTime):$fake",result)
    }

}