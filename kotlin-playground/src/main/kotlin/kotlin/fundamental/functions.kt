package org.example.kotlin.fundamental

fun main() {
    getUser()
}

fun setUser(name: String, nim: Int) {
    println("Your name is $name and nim $nim")
}

fun getUser() {
    return setUser(name = "Emmanuel Dito", nim = 225314024)
}

fun printUser(name: String): Unit {
    print("Your name is $name")
}