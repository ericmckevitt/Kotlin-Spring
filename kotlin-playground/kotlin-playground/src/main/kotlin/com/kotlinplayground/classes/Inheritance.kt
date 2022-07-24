package com.kotlinplayground.classes

open class User(val name: String) {

    open var isLoggedIn: Boolean = false

    open fun login() {
        println("Inside User login")
    }

    private fun secret() {
        println("(private) Secret in User")
    }

    open protected fun logout() {
        println("(protected) Logout in User")
    }
}

class Student(name: String) : User(name) {

    override var isLoggedIn: Boolean = false

    companion object {
        const val noCoursesEnrolled = 10
        // fun country() = "USA"
        fun country() : String {
            return "USA"
        }
    }

    override fun login() {
        println("Inside Student login")
        super.login()
    }

    override fun logout() {

    }

}

class Instructor(name: String) : User(name) {

}

fun main() {
    val student = Student("Eric")
    println("Name is ${student.name}")
    student.login()

    // Use companion object:
    val country = Student.country()
    println("Country is: $country")
    println("noCoursesEnrolled is: ${Student.noCoursesEnrolled}")

    val instructor = Instructor("Dilip")
    println("Name is ${instructor.name}")
    instructor.login()

    val user = User("Eric")

}