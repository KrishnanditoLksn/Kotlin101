package org.example.coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
using run blocking function
 */
/*fun main() = runBlocking(block = {
    launch {
        //suspending function
        delay(1000L)
        println("Aku terakhir nih  kwkwkw")
    }
    println("Hello aku pertama ")
    delay(2000L)
})*/

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
}

/*
async implementation
 */

suspend fun getCapital(): Int {
    delay(1000L)
    return 5000
}

suspend fun getIncome(): Int {
    delay(1_000L)
    return 75000
}

