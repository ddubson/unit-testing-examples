package com.ddubson.xunit

class LogAnalyzer {
    fun isValidLogFileName(fileName: String): Boolean {
        if(fileName.isEmpty()) {
            throw IllegalArgumentException("File name cannot be blank!")
        }

        if(fileName.endsWith(".SLF", ignoreCase = true)) {
            return true
        }

        return false
    }
}