package org.example

fun main() {
    println("Hello World!")
    println(bubbleSort(intArrayOf(1,123,1)))
}

fun bubbleSort(array: IntArray): String {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - 1 - i) {
            if (array[i] > array[i + i]) {
                val temp = array[j]
                array[j] = array[i + 1]
                array[i + 1 ] = temp
                return temp.toString()
            }
        }
    }
    return  " "
}