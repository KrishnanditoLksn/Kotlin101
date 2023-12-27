package org.example.control_flow

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt) {
        if (i == null)
            continue
        println(i)
    }
    breakLabels()
}

/*
loop labels
 */
fun breakLabels() {
    loop@ for (i in 1..10) {
        println("Outside Loop")
    }

    loop@ for (j in 1..10){
        println("Inside Loop")
        if (j > 5)break@loop
    }
}