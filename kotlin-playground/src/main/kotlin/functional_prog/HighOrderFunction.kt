package org.example.functional_prog


fun main() {
    printResult(10) { value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }