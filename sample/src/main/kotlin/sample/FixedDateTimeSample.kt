package sample

import java.time.Instant

class FixedDateTimeSample{

    fun sample(dateTime: Instant): String{
        return "DateTime(Instant):$dateTime"
    }

    fun sample(dateTime: Long): String{
        return "DateTime(unixTime):$dateTime"
    }
}