package org.example.kotlin.fundamental

fun main() {
    val text = "Kotlin"
    val fistChar = text[0]

    println("Karakter pertama dalam text $fistChar")

    for (char in text) {
        println("$char ")
    }

    //Escaped String
    val statement = "Kotlin is \"Awesome\""
    println(statement)

    //Raw String
    var line = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4\n"
    line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}