package com.example.number_one_filter_and_transform.ui.theme

fun calculate(a: Double, b: Double, operator: Char): Double {
    return when (operator) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> {
            println("Invalid operator: '$operator'")
            0.0
        }
    }
}

fun main() {
    println(calculate(10.0, 5.0, '+')) // Output: 15.0
}
