package com.kotlinplayground.basics

fun main() {

    val range : IntRange = 1..10
    for (i in range) {
        println("i: $i")
    }

    // var reverseRange = 10..1
    var reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("i: $i")
    }

    // Use step to skip values
    for (i in reverseRange step 2) {
        println("(with skip=2) i: $i")
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of i: $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while (x <= 5) {
        println("Value of x: $x")
        x++
    }
}
