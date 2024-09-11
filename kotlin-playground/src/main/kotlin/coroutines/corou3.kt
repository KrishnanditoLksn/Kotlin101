package org.example.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    /*
    coroutine builder that bridges the non-coroutine world of a regular fun main()
     */
    runBlocking {
        launch {
            doWorld()
        }
    }
    println("Yah terakhir deh ")
}

suspend fun doWorld(){
    delay(3000L)
    /*
    It suspends the coroutine for a specific time
     */
    println("duluan ya  !! ")
}