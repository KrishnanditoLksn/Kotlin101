package org.example.functional_prog

fun main() {
    val trick = ::trick
    /*val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    var favActor: String? = "Sandra Oh"
    println(message)
    println(favActor?.length)*/

    /*
    shorthand param
     */
    val coins: (Int) -> String = {
        "$it quarteers"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()

    repeat(4) {
        treatFunction()
    }
    trickFunction()
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

val trick: () -> Unit = {
    println("No treats !!")
}

val treat: () -> Unit = {
    println("Hv a treat")
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}
