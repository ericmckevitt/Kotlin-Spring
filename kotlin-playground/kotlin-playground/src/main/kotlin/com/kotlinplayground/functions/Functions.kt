package com.kotlinplayground.functions

import java.time.LocalDate

fun main() {
    printName("Eric")

    val result = addition(1,2)
    println("Sum is: $result")

    val result2 = addition_approach2(1,2)
    println("Sum is: $result2")

    println("\n\n")

    printPersonDetails("Eric", "abc@gmail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("Eric")
    printPersonDetails(dob= LocalDate.parse("1998-03-21"), name="Eric", email="test@gmail.com")


}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun addition_approach2(x: Int, y: Int) = x + y

// Unit corresponds to void type
fun printName(name: String) : Unit {
    println("Name is: $name")
}

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
    println("Name is $name, the email is $email, and the DOB is $dob.")
}
