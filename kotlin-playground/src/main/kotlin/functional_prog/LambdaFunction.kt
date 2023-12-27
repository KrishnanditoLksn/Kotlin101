package org.example.functional_prog

fun main() {
    printMessage("Hello From Lambda")
    messageLength
}

val printMessage = { message: String -> println(message) }
val messageLength = { message: String -> message.length }

/*
   output : Hello From Lambda
*/