package org.example.data_class.collection

fun main() {
    val animalList = mutableListOf("Button1", 1, true)
    animalList.forEach { println(it) }
    animalList.add(0, "ButtonRemo")
    animalList.forEach { println(it) }
}