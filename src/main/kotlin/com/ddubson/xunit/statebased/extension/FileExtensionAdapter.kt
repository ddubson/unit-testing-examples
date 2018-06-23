package com.ddubson.xunit.statebased.extension

interface FileExtensionAdapter {
    fun isValid(fileName: String): Boolean
}