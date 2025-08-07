package com.example.number_one_filter_and_transform

fun main() {
    val numbers = 1..20
    val result = numbers.filter { it % 2 == 0} .map{ it * 2}
    println("Transformed List: $result")
}
