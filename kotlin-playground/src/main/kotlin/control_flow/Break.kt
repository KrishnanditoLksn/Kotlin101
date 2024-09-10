package org.example.control_flow

val a : List<Int> = mutableListOf(1,2,3)
fun main() {
//    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
//    for (i in listOfInt) {
//        if (i == null)
//            continue
//        println(i)
//    }
//    breakLabels()
//    println(code())
//
//    val ranges = 1.rangeTo(10)step 3
//    ranges.forEach { _ ->
//        println("Hello World")
//    }

    printResult(10){
        value ->
        value + value
    }
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

    val message: String? = null
    message?.also{
        val length = it.length
        val text = "text length $length"
        println(text)
    }
}

fun code():List<Int>{
    return a.map {
        it * 2
    }
}

fun getmesg(name : String):String {
    return "sd"
}

//inline fun printResult(value : Int , sum :  (Int) -> Int){
//    val result = sum(value)
//    println(result)
//}

inline fun printResult(value : Int , sum :(Int)->Int){
    val res = sum(value)
    println(res)
}