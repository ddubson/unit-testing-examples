package com.ddubson.xunit

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

internal class LogAnalyzerTest {
    @Test
    fun isValidLogFileName_givenABadFileName_returnsFalse() {
        // Arrange
        val logAnalyzer = LogAnalyzer()

        // Act
        val result = logAnalyzer.isValidLogFileName("fileWithBadExtension.foo")

        // Assert
        assertFalse(result)
    }
}