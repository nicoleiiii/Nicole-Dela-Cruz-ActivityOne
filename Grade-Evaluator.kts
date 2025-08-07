package com.example.number_one_filter_and_transform

fun main() {
    val grades = listOf(85, 42, 70, 58, 90)
    for (grade in grades) {
        if (grade >= 60) {
            println("Pass")
        } else {
            println("Fail")
        }
    }
}
