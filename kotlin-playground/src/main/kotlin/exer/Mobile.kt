package org.example.exer

fun main() {
    val morningNotification = 51
    val eveningNotification = 135


    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(params: Int) {
    if (params <= 100) {
        println("You have $params")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}