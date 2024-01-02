package org.example.functional_prog

fun main() {
    println("Factorial 9999 is: ${factoriala(9999)}")
}

fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) newResult else factorial(n - 1, newResult)
}

tailrec fun factoriala(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factoriala(n - 1, newResult)
    }
}