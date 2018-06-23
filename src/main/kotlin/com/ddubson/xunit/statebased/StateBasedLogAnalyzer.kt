package com.ddubson.xunit.statebased

import com.ddubson.xunit.statebased.extension.FileExtensionAdapter

class StateBasedLogAnalyzer(private val fileExtensionAdapter: FileExtensionAdapter) {
    fun isValidLogFileName(fileName: String): Boolean = fileExtensionAdapter.isValid(fileName)
}