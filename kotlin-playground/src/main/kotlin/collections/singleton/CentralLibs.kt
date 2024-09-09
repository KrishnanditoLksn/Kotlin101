package org.example.collections.singleton

object CentralLibs {
    fun borrowBookById(id: Int) {
        println("Book with  $id has been borrowed")
    }
}

fun main() {
    CentralLibs.borrowBookById(2)
}