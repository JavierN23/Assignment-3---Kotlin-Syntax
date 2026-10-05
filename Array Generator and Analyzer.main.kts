#!/usr/bin/env kotlin

fun main() {

    val numbers = Array(10) { index ->
        index * index
    }

    for (index in numbers.indices) {
        println()
        println("numbers[$index] = ${numbers[index]}")
    }

    println()
    println("Even values:")

    for (number in numbers) {
        if (number % 2 == 0) {
            print("$number ")
        }
    }

    var sum = 0
    for (number in numbers) {
        sum += number
    }

    println()
    println("Sum: $sum")

    var largest = numbers[0]

    for (number in numbers) {
        if (number > largest) {
            largest = number
        }
    }
    println()
    println("Largest value: $largest")
}