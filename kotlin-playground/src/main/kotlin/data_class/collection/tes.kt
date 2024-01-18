package org.example.data_class.collection

import kotlin.math.max

fun main() {
    val arr: CharArray = charArrayOf('c', 'f', 'j')
    val intA: IntArray = intArrayOf(2, 5, 1, 2)
    intA.sort()
    val targets = 5
    arr.sort()
    val target = 'c'
    println(nextGreatestLetter(arr, target))
    /*println(binarySearch(intA, targets))*/
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = ((left + right) / 2)

        if (nums[mid] > target) {
            right = mid - 1
        } else if (nums[mid] < target) {
            left = mid + 1
        }
    }
    return left
}

fun maximumCount(nums: IntArray): Int {
    var pos = 0
    var neg = 0
    for (counter in nums.indices) {
        if (nums[counter] > 0) {
            pos++

        }
        if (nums[counter] < 0) {
            neg++

        }
    }
    return max(pos, neg)
}

fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + right / 2

        if (arr[mid] < target) {
            left = mid + 1
        } else if (arr[mid] > target) {
            right = mid - 1
        } else {
            return mid
        }
    }
    return -1
}

fun nextGreatestLetter(letter: CharArray, target: Char): Char {
    var left = 0
    var right = letter.size - 1

    if (target < letter[left] || target > letter[right]) {
        return letter[left]
    }
    while (left < right) {
        val mid = left + right / 2
        if (letter[mid] < target) {
            left  = mid + 1
        } else {
            right = mid - 1
        }
    }

    return letter[left]
}