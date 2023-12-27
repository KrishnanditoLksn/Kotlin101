package org.example.data_class.collection

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val eventList = numberList.filter { it % 2 == 0 }

    println(eventList)

    val mappedList = numberList.map { it * 5 }
    println(mappedList)
    listFilters()
}

fun listFilters() {
  /*  val list = (1..100000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }*/

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}