package org.example.functional_prog

fun main() {
    /*  val list = listOf(1, 2, 12)
      println(asList(list))
      println(getSize(list))*/
    val angka = sumNumbers(10, 20, 30, 40)
    val hurufKonsonan = listOf('A', 'I', 'U', 'E', 'O')
    println(printChars(hurufKonsonan))
}


fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}


fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}


fun <T> printChars(vararg char: T) {
    val counter = char.forEach { println(it) }
    return counter
}

fun <T> getSize(vararg param: T) {
    return param.forEach { _ -> param.size }
}

