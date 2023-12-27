package org.example.control_flow

import kotlin.random.Random

fun main() {
//    val value = 7
//    val stringOfValue = when (value) {
//        6 -> {
//            println("value is 6")
//            "Values"
//        }
//
//        7 -> {
//            println("value is 7")
//        }
//
//        8 -> {
//            println("value is 8")
//        }
//
//        else -> println("value cannot be reached")
//    }
//
//    println(stringOfValue.toString())

    advWhen()
}


fun whenIs() {
    val anyType: Any = 100L
    //instance dari tipe tertentu
    when (anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}

fun whenIn() {
    val value = 26
    val ranges = 10..50

    when (value) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }
}

fun advWhen() {
    val registerNumber = when (val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}
fun getRegisterNumber() = Random.nextInt(100)