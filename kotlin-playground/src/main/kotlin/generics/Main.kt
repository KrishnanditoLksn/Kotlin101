package org.example.generics

fun main() {
  /*  val box: Box<Int> = Box()
    box.put(20)
    box.get()

    println(box.sum(listOf(1, 2, 1)))

    println(box.zip(listOf(1, 2, 3), listOf(3, 4, 1)))*/

    val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.EASY)
    val question2 = Question("The sky is green. True or false", false, Difficulty.MEDIUM)
    val question3 = Question("How many days are there between full moons?", 28, Difficulty.HARD)
    println(question1.toString())
}

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty,
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}



