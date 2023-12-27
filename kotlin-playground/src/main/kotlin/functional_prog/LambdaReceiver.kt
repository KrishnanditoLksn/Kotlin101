package org.example.functional_prog

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)

    var favActor:String? = "Sandra Oh"
    println(favActor?.length)
}

fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

