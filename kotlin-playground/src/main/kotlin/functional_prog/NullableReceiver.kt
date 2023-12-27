package org.example.functional_prog

fun main() {
    val value: Int? = null

    println(value.slice)

   /* val value: Int? = null
    val value1: Int? = null

    println(value?.slice)
    println(value1?.slice)*/
}

val Int?.slice:Int
    get()  = this?.div(2) ?: 0
