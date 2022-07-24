package com.kotlinplayground.functions

const val courseName = "Kotlin Program"

// returns random int in range [1,100]
fun topLevelFunction() : Int {
    return (1..100).random()
}

fun main() {
    val num = topLevelFunction()
    println("Num: $num")
}