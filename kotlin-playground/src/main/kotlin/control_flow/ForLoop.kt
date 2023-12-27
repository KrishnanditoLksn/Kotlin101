package org.example.control_flow

fun main() {
    val range = 1.rangeTo(5)
    for (i in range) {
        println("value is $i!")
    }

    rangeIndexed()
}

fun ranges() {
    val ranged = 1.rangeTo(10) step 3
    ranged.forEach { value ->
        println("value is $value")
    }
}

fun rangeIndexed() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}