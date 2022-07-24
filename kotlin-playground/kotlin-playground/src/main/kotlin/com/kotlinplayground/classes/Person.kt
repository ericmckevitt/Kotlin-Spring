package com.kotlinplayground.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {

    var email : String = ""
    var nameLength : Int = 0

    init {
        println("Inside Init Block")
        nameLength = name.length
    }

    constructor(_email : String,
        _name : String = "",
        _age : Int = 0
    ) : this(_name, _age) {
        this.email = _email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
//    val person = Person("Eric", 20)
//    person.action()
//    println("Name: ${person.name}, Age: ${person.age}")
//
//    val person2 = Person()
//    println("Name: ${person2.name}, Age: ${person2.age}")
//
//    val person3 = Person(_email = "test@gmail.com")
//    println("Name: ${person3.name}, Age: ${person3.age}, Email: ${person3.email}")

    val person4 = Person(_email = "other@gmail.com", _name = "Billy", _age = 16)
    println("Name: ${person4.name}, Age: ${person4.age}, Email: ${person4.email}, nameLength: ${person4.nameLength}")

}