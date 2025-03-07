package com.example.lentera_istiqomah_kmp

class Greeting {
    private val platform = getPlatform()


    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}