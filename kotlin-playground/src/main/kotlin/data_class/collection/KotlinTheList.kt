package org.example.data_class.collection

fun main() {
    /*   val animalList = mutableListOf("Button1", 1, true)
       animalList.forEach { println(it) }
       val items = listOf(1, 2, 3, 4, 5)
       animalList.add(0, "ButtonRemo")
       animalList.forEach { println(it) }

       // Lambdas are code blocks enclosed in curly braces.
       items.fold(0) {
           // When a lambda has parameters, they go first, followed by '->'
               acc: Int, i: Int ->
           print("acc = $acc, i = $i, ")
           val result = acc + i
           println("result = $result")
           // The last expression in a lambda is considered the return value:
           result
       }

       val joinedToString = items.fold(1,Int::times)
       println(joinedToString)
   */
/*    println(sum(1))*/
    println(result)
}

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R,
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

fun printHello(name: String?) {
    if (name != null) {
        println("Hello $name")
    } else {
        println("Hello anon")
    }
}

/*
param{A,B}
 */
val sum: (Int) -> Int = { x: Int -> x + 2 }


val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }

val twoParams:(String , Int) -> String = repeatFun

fun runTransformation(f:(String , Int)->String):String{
    return  f("Helo",1)
}

val result = runTransformation(twoParams)