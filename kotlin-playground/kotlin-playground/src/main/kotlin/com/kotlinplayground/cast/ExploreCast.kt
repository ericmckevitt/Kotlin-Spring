package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course

fun checkType(type : Any) {
    when(type) {
        is Course -> {
            // val course = type as Course
            // SmartCast takes care of this for us
            println(type.copy())
        }
        is String -> {
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {
    when (any) {
        // If we can successfully cast to double
        any as Double -> println("Value is Double")
        
    }
}

fun main() {

    val course = Course(1, "Intro to CS","Eric McKevitt")

    checkType(course)
    checkType("ERIC")

    castNumber(1)
}


