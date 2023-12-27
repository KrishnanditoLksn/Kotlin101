package org.example.control_flow

fun main() {
    val rangeInt = 1..10
    val rangeTo = 1.rangeTo(10)
    val downInt = 10.downTo(1)

    if (7 in downInt) {
        do {
            println("Value 7 is available")
        } while (false)
    }
}

fun range() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        println("$it")
    }
    println(rangeInt.step)
}

