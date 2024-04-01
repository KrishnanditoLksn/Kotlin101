package org.example.coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch {
        task2()
    }
    task1()
    Thread.sleep(2000L)
}

fun task1(){
    println("Hello")
    println(Thread.currentThread().name)
}

suspend fun task2(){
    delay(1000L)
    println("World")
    println(Thread.currentThread().name)
}
