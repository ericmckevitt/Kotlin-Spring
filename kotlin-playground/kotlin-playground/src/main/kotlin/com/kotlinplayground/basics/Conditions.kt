package com.kotlinplayground.basics

fun main() {

    // if-else

    var name = "Eric"

    val result = if (name.length == 4) {
        println("The name is 4 characters")
        // Add something to return if true
        name.length
    } else {
        println("The name is not 4 characters")
        // Add something to return if false/else
        name.length
    }

    println("result: $result \n")

    // 1 -> GOLD, 2 -> SILVER, 3 -> BRONZE

    var position = 3

    var medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    println(medal)

    // when

    position = 3

    medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println("Medal: $medal")

}