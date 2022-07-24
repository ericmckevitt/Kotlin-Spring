package com.kotlinplayground.basics

fun main() {

    // continue
    for (i in 1..5) {
        if (i==3) continue
        println("i is $i")
    }
    println("Done!")

    // break
    for (i in 1..5) {
        println("i is $i")
        if (i==3) break
    }
    println("Done!")

    // label
    label()

    for (i in 1..5) {
        println("i is $i")
        if (i==3) return
    }
    println("Inaccessible code!")
}

fun label() {
    loop@ for (i in 1..5) {
        println("(label) i is $i")
//        if (i==3) break@loop
        innerloop@ for (j in 1..5) {
            println("\t(label) j is $j")
            if (j==2) break@innerloop
            // if (j==2) continue@loop
        }
    }
}
