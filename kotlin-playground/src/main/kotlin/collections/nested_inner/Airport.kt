package org.example.collections.nested_inner

class Airport {
    class Plane {
        fun definePlane(planeName: String) {
            println("The plane is :  $planeName")
        }
    }
}

fun main() {
    val airport = Airport.Plane()
    airport.definePlane("Lion Air")
}