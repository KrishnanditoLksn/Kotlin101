package org.example.functional_prog


fun main() {
//    val rev = "Dito"
//    println(rev.reversed())
//    printResult(10) { value ->
//        value + value
//    }
    println(fizzBuzz(3))
}

fun printResult(value: Int, sum: (Int) -> Int): Int {
    return sum(value)
}

var sum: (Int) -> Int = { value -> value + value }

fun fizzBuzz(n: Int): List<String> {
    val answer = mutableListOf<String>()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            answer.add("FizzBuzz")
        }
        else if (i % 3 == 0) {
            answer.add("Fizz")

        }
        else if (i % 5 == 0) {
            answer.add("Buzz")

        } else {
            answer.add(i.toString())
        }
    }
    return answer
}
