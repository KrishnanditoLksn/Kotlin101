package org.example.generics.variances

open class Plant
class AloeVera : Plant()

class PlantKeeper<in T : Plant> {
    fun managePlant(plant: T) {

    }
}

val plantKeeper:PlantKeeper<Plant> = PlantKeeper()
val plantAloeVera:PlantKeeper<AloeVera> = plantKeeper

fun main() {
    println(plantAloeVera.managePlant(plant = AloeVera()))
}
