package com.kotlinplayground.classes

data class Course (
    val id : Int,
    val name : String,
    val author: String
)

fun main() {
    val course1 = Course(1, "Reactive Programming in Java", "John Doe")
//    println(course1)

    val course2 = Course(1, "Reactive Programming in Java", "John Doe")
//    println(course2)
    // data class already overrides equality operator for us
    println("Checking Object Equality: ${course1 == course2}")

    // data class automatically defines copy() for us
    val course3 = course2.copy(id=3, author="Eric McKevitt")
    println(course3)
}