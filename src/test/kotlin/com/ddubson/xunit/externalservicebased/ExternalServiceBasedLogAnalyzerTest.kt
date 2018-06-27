package com.ddubson.xunit.externalservicebased

import com.ddubson.xunit.externalservicebased.externalservice.FakeExternalService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ExternalServiceBasedLogAnalyzerTest {
    @Test
    fun analyze_whenFileNameIsTooShort_CallsWebService() {
        val fakeService = FakeExternalService()
        val externalServiceBasedLogAnalyzer = ExternalServiceBasedLogAnalyzer(fakeService)

        externalServiceBasedLogAnalyzer.analyze("short")

        assertEquals("Filename is too short.", fakeService.lastError)
    }
}