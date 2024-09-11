package org.example.coroutines.channels

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
share data between coroutines
 */
fun main(): Unit = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")) {
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5)channel.send(x * x)
    }

    repeat(5){
        println(channel.receive())
    }
    println("received in ${Thread.currentThread().name}")
}