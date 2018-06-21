package com.ddubson.xunit

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class LogAnalyzerTest {
    private var logAnalyzer: LogAnalyzer? = null

    @BeforeEach
    fun beforeEach() {
        // Arrange
        logAnalyzer = LogAnalyzer()
    }

    @DisplayName("isValidLogFileName")
    @ParameterizedTest(name = "given a {1} filename {2}, it returns {0}")
    @CsvSource(
            "false, badfilename.txt, IgnoreCase",
            "true, goodfilename.slf, Lowercase",
            "true, goodfilename.SLF, Uppercase"
    )
    fun logFileNameTestCases(expectedResult: Boolean, filename: String, case: String) {
        // Act
        val result = logAnalyzer!!.isValidLogFileName(filename)

        // Assert
        assertEquals(expectedResult, result)
    }
}