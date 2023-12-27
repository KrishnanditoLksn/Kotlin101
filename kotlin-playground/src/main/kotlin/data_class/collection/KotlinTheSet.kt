package org.example.data_class.collection

fun main() {
    /*
    if one of value are duplicate , the result will be ignored
     */
    val integerSet = setOf(1,2,1,1)
    val integerSet2 = setOf(2,1,3,4)

    println(integerSet.intersect(integerSet2))
}