package org.example.generics

fun main() {
    /* val numbers = (1..100).toList()
    print(numbers.slice(1..10))*/

    Quiz().printProgressBar()
}

interface List<T> {
    /*
    return type of get is T
     */
    operator fun get(index: Int): T

}

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }

}

/*
constraint type param
 */

class ListNumber<T : Number> : List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }

}

class Quiz : ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    override val progressText: String
        get() = "$answered of $total answered"

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

interface ProgressPrintable {
    val progressText: String

    fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }
}