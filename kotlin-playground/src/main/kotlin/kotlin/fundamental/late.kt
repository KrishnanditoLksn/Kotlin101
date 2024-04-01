package org.example.kotlin.fundamental

import kotlin.properties.Delegates

var  nim by Delegates.notNull<Int>()
val ipk : Double by lazy     {
    2.1
}

lateinit var name : String
fun main() {
    nim = 1123
    println(nim)
    println(ipk)
}