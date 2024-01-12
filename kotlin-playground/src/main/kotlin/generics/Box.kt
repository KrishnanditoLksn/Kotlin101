package org.example.generics

import kotlin.collections.List

class Box<T> {
    private var item: T? = null

    fun put(item: T) {
        this.item = item
    }

    fun get(): T? {
        return item
    }

    fun sum(numbers: List<Int>): Int {
        var result = 0
        for (number in numbers) {
            result += number
        }
        return result
    }


    /*
    multiple type param
     */
    fun <T, U> zip(list1: List<T>, list2: List<U>): List<Pair<T, U>> {
        val result = mutableListOf<Pair<T, U>>()

        for (i in list1.indices) {
            result.add(Pair(list1[i], list2[i]))
        }
        return result
    }
}