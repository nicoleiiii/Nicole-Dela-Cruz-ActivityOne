package com.example.number_one_filter_and_transform.ui.theme

fun main() {
    val numbers = listOf(70, 52, 1, 99, 42, 45)
    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Max number is: $max")
}
