package org.example.coroutines.job

import kotlinx.coroutines.*


/*
Start a Job
 */


//fun main()  = runBlocking{
//    val job = launch (start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Sedang menjalankan job ")
//    }
//
//    job.start();
//    println("Other task")
//}
//


/*
Cancel a Job
 */
@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch (
        Dispatchers.Default
    ) {
        delay(5000L)
        println("Start new job")
    }

    delay(2000)
    job.cancel()
    println("Cancelling job . ...")
    if (job.isCancelled) {
        println("Job is Cancelled because ${job.getCancellationException().message}")
    }
}