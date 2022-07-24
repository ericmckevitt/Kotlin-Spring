package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {

    val name : String = "Eric"
    println(name)

    // val is immutable
    // name = "Test"

    var age : Int = 20
    println(age)
    age += 1 // += valid
    println(age)

    // Type inference
    val salary = 96000L
    println(salary)

    // String interpolation (like f-string)
    val course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}")

    val multiLine = "ABC\nDEF"
    println(multiLine)

    val multiLine2 = """
        ABC
        DEF
    """.trimIndent()
    println(multiLine2)

    // FROM TOP-LEVEL FUNCTIONS LECTURE
    val num = topLevelFunction()
    println("Num: $num")
    println("Course: $courseName")

}