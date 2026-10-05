#!/usr/bin/env kotlin

fun main() {

    val courses = ArrayList<String>()

    courses.add("Mobile Programming")
    courses.add("Database Systems")
    courses.add("Web Programming")
    courses.add("Data Structures")
    courses.add("Computer Security")

    println("Original courses:")

    for (course in courses) {
        println(course)
    }

    if ("Database Systems" in courses) {
        println("\nDatabase Systems is in the list.")
    }

    courses.remove("Web Programming")
    courses.add("Artificial Intelligence")



    println("\nUpdated courses:")
    for (index in courses.indices) {
        println("$index: ${courses[index]}")
    }


    val sortedCourses = courses.sorted()
    println("\nSorted courses:")
    for (course in sortedCourses) {
        println(course)
    }



    val programmingCourses = courses.filter {
        it.contains("Programming")
    }
    println("\nCourses containing \"Programming\":")

    for (course in programmingCourses) {
        println(course)
    }
}