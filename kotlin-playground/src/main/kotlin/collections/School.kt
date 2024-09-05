package org.example.collections


sealed class School {
    class Classroom(classname: String, classCode: Int) : School() {
    }


    data class Chair(val name: String, val width: Int, val height: Int) : School() {
        override fun toString(): String {
            return "Name $name\n" +
                    "Width : $width\n" +
                    "Height : $height\n"
        }
    }

    data class Mading(val madingName: String, val madingCode: String) : School() {
        override fun toString(): String {
            return super.toString()
        }
    }

    data class Book(val title: String, val authors: List<String>, val isbn: List<Int>) : School() {
        override fun toString(): String {
            return super.toString()
        }
    }
}

fun main() {
    val book1 = School.Book("Kancil", mutableListOf("Dito"), mutableListOf(12312, 123))
    val chair = School.Chair("Kursi Hijau", 200, 200)
    println(chair.toString())
    println(book1.toString())
}
