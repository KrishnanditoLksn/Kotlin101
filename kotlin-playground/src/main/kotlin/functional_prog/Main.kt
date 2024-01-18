package org.example.functional_prog

fun main() {
    /*cookies.forEach {
        println("Menu item: ${it.name}")
    }*/

    /*    val fullMenu = cookies.map {
            println("${it.name} - $${it.price}")
        }

        fullMenu.forEach { it }*/

    val groupedMenu = cookies.groupBy {
        it.softBaked
    }

    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    /*val softBakedMenu = emptyList<Cookie>()*/


    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    /* val (softBakedMenu , crunchMenu) = */

}