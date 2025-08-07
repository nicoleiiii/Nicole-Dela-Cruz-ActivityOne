package com.example.number_one_filter_and_transform.ui.theme

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val reversed = mutableListOf<Int>()

    for (i in numbers.size - 1 downTo 0) {
        reversed.add(numbers[i])
    }

    println("Reversed list: $reversed")
}
