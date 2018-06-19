package com.ddubson.xunit

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LogAnalyzerTest {
    private var logAnalyzer: LogAnalyzer? = null

    @BeforeEach
    fun beforeEach() {
        // Arrange
        logAnalyzer = LogAnalyzer()
    }

    @Test
    fun isValidLogFileName_givenABadFileName_returnsFalse() {
        // Act
        val result = logAnalyzer!!.isValidLogFileName("fileWithBadExtension.foo")

        // Assert
        assertFalse(result)
    }

    @Test
    fun isValidLogFileName_givenAGoodExtensionLowercase_returnsTrue() {
        // Act
        val result = logAnalyzer!!.isValidLogFileName("fileWithGoodExtension.slf")

        // Assert
        assertTrue(result)
    }

    @Test
    fun isValidLogFileName_givenAGoodExtensionUppercase_returnsTrue() {
        // Act
        val result = logAnalyzer!!.isValidLogFileName("fileWithGoodExtension.SLF")

        // Assert
        assertTrue(result)
    }
}