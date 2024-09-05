package org.example

fun main() {
    println("Hello World!")
    val a = arrayOf(2, 2, 1)
    println(singleNumber(a))
    println(1 xor 2)
    implementElvis()
}

fun bubbleSort(array: IntArray): String {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - 1 - i) {
            if (array[i] > array[i + i]) {
                val temp = array[j]
                array[j] = array[i + 1]
                array[i + 1] = temp
                return temp.toString()
            }
        }
    }
    return " "
}

fun singleNumber(nums: Array<Int>): Int {
    var a = 0
    for (i in nums.indices) {
        a = a xor i
    }
    return a
}

fun implementElvis(): String {
    val a: String = "Dito"
    val immutable: String = a
    return immutable
}