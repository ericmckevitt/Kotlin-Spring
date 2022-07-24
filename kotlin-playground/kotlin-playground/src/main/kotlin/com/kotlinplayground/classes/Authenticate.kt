package com.kotlinplayground.classes

// Use object for Singleton pattern
object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("User authenticate for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate("emckevitt", "abcdef")
}