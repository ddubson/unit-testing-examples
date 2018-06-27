package com.ddubson.xunit.externalservicebased.externalservice

class FakeExternalService: ExternalService {
    lateinit var lastError: String

    override fun logError(message: String) {
        this.lastError = message
    }
}