package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    val isCoursePersisted : Boolean

    fun getById(id: Int) : Course

    fun save(course: Course) : Int {
        println("course: $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactive Programming in Kotlin", "Dilip")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactive Programming in Kotlin", "Dilip")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlRepository: $course")
        return course.id
    }

}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        // You can choose which interface's function to invoke like this:
        super<A>.doSomething()
        super<B>.doSomething()
        // Additional Functionality
        println("doSomething in AB")
    }


}

fun main() {

    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    var savedCourseId = sqlCourseRepository.save(course)
    println("Course is $course")
    println("Saved Course with Id: $savedCourseId")
    println("Course Persisted Value is: ${sqlCourseRepository.isCoursePersisted}")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val noSqlCourse = noSqlCourseRepository.getById(2)
    savedCourseId = noSqlCourseRepository.save(noSqlCourse)
    println("Course is $noSqlCourse")
    println("Saved Course with Id: $savedCourseId")

    val ab = AB()
    ab.doSomething()
}