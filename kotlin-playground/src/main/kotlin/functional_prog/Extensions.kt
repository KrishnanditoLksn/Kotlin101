package org.example.functional_prog


fun main() {
    10.printInt()

    println(100.2.plusThree())
    println(10.slice)
}

/*
Extensions Function has a receiver that represent of data type
 */

fun Int.printInt() {
    println("Value is $this")
}

fun Double.plusThree(): Double {
    return this + 3.0
}

/*
Extensions Properties
 */
val Int.slice: Int
    get() = this / 2