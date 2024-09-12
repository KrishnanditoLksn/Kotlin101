package org.example.generics.variances

/*
implementation of how Covariant works in Kotlin Generics
 */
open class Binatang
class Kucing : Binatang()

class Kandang<out T : Binatang>(private val hewan: T) {

    fun getAnimal(): T {
        return hewan
    }
}

val kandangKucing: Kandang<Kucing> = Kandang(Kucing())
val kandangBinatang: Kandang<Binatang> = kandangKucing

fun main() {
    println(kandangBinatang.getAnimal())
}
