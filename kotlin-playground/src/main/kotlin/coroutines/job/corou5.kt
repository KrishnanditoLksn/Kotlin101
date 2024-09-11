package org.example.coroutines.job

import kotlinx.coroutines.*

//fun main() = runBlocking<Unit> {
//    launch(Dispatchers.Unconfined) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}

suspend fun main() {
    hahah()
}

@OptIn(DelicateCoroutinesApi::class)
suspend fun hahah() = runBlocking {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}