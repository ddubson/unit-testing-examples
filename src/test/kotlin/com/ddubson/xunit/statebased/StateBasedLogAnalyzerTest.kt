package com.ddubson.xunit.statebased

import com.ddubson.xunit.statebased.extension.AlwaysValidFakeFileExtensionAdapter
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class StateBasedLogAnalyzerTest {
    @Test
    fun isValidLogFileName_whenFileNameIsValid_returnsTrue() {
        val stateBasedLogAnalyzer = StateBasedLogAnalyzer(AlwaysValidFakeFileExtensionAdapter())
        val isValid = stateBasedLogAnalyzer.isValidLogFileName("goodfilename.SLF")
        assertTrue(isValid)
    }
}