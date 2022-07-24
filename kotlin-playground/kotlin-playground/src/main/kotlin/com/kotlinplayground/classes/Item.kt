package com.kotlinplayground.classes

class Item() {
    var name : String = ""
    var price : Double = 0.0

    // This syntax is valid
//    get() = field

    // More verbose syntax can add logic
    get() {
        println("Inside Getter")
        return field
    }

    set(value) {
        println("Inside Setter")
        if (value >= 0.0) {
            field = value
        } else {
            throw IllegalArgumentException("Negative prices not allowed")
        }
    }

    constructor(_name : String) : this() {
        this.name = _name
    }
}

fun main() {
    val item = Item("iPhone")
    println("Item name is ${item.name}")

    item.name = "iPhone 13"
    println("Item name is ${item.name}")

    item.price = 10.0
}