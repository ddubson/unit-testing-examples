package com.ddubson.xunit

class LogAnalyzer {
    fun isValidLogFileName(fileName: String): Boolean {
        if(fileName.endsWith(".SLF", ignoreCase = true)) {
            return true
        }

        return false
    }
}