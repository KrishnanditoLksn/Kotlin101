package org.example.data_class.collection

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))
    println(capital.keys)
    val mutableCapital = capital.toMutableMap()
    mutableCapital["Sragen"] = "Indonesia"

}