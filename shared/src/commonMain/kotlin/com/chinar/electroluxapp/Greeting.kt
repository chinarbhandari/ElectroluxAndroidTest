package com.chinar.electroluxapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}