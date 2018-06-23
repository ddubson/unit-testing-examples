package com.ddubson.xunit.statebased.extension

class AlwaysValidFakeFileExtensionAdapter : FileExtensionAdapter {
    override fun isValid(fileName: String): Boolean = true
}