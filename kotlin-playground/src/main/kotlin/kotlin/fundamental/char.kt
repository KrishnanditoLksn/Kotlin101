package org.example.kotlin.fundamental

fun main() {
    var character = 'A'
    //karena unicode maka akan menambah setiap nilai charnya
    println("Vocal" + character++)
    println("Vocal" + character++)
    println("The Final vocal is $character")
}