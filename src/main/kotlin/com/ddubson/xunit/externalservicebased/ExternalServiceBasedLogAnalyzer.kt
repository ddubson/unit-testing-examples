package com.ddubson.xunit.externalservicebased

import com.ddubson.xunit.externalservicebased.externalservice.FakeExternalService

class ExternalServiceBasedLogAnalyzer(private val fakeService: FakeExternalService) {
    fun analyze(filename: String) {
        if(filename.length < 8) {
            fakeService.logError("Filename is too short.")
        }
    }
}
