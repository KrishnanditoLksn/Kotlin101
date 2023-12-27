package org.example.control_flow

fun main() {
    val now = 3
    val then = 1
    val office = if (now > then) "open" else "closed"
    println(office)

    sum(1, 1)
}


fun sum(value1: Int, value2: Int) = value1 + value2