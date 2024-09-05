package org.example.coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch {
        task2()
        task3()
        task4()
    }
    task1()

    Thread.sleep(2000L)
}

fun task1() {
    println("Hello")
    println(Thread.currentThread().name)
}

suspend fun task2() {
    delay(1000L)
    println("World")
    println(Thread.currentThread().name)
}

suspend fun task3() {
    delay(2000L)
    println("mmmmmmm pritttt")
    println(Thread.currentThread().name)
}

suspend fun task4() {
    delay(3000L)
    println("You are slow right now !! ")
    println(Thread.currentThread().name)
}