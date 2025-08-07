package com.example.number_one_filter_and_transform.ui.theme

fun main() {
    val mixedList = listOf("Nicole", 42, true, 1.23, 30, false)

    for (item in mixedList) {
        when (item) {
            is String -> println("\"$item\" is a String")
            is Int -> println("$item is an Integer")
            is Boolean -> println("$item is a Boolean")
            is Double -> println("$item is a Double")
            else -> println("$item is of unknown type")
        }
    }
}
