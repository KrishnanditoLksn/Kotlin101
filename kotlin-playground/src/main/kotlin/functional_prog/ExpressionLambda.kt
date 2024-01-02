package org.example.functional_prog

import java.util.*

fun main() {
    val lambdaName: (String) -> String = { value: String ->
        value.uppercase(Locale.getDefault())
    }

    val name = lambdaName("Dito belajar lambda")

    println(name)

    val lambdaNama: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "First name $firstName" +
                "Last name $lastName"
        /*
        the last line will be return value
         */
        result
    }

    /*
    only work if lambda expression has a one param
     */
    val testIt: (Int) -> Int = { it }

    val namaku = lambdaNama("Emmanuel", "Laksana")
    println(namaku)

    val numb = testIt(1)
    println(numb)

    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Dito"))
}
/*
    method references
     */


fun toUpper(value: String) = value.uppercase(Locale.getDefault())
