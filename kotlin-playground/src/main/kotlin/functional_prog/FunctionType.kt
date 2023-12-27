package org.example.functional_prog

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val sumNull:Multiplication = {valueA ,valueB -> valueA * valueB}
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
    val sumResult = sum.invoke(10, 10)
    println(sumResult)

    val nullResult= sumNull?.invoke(10,10)
    println(nullResult)
}

/*
convert a function into data type using typealias keyword
 */

typealias Arithmetic = (Int, Int) -> Int

typealias Multiplication=((Int,Int)->Int)?