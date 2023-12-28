package object_oriented

import org.example.object_oriented.transportation.Car
import org.example.object_oriented.transportation.Plane
import org.example.object_oriented.transportation.Vehicle

fun main() {

    /*  val animal = Animal()
      animal.name = "Kangaroo"
      animal.weight = 1.1

      println("Animal name : ${animal.name}")
      println("Animal weight : ${animal.weight}")
      animal.eat()
      animal.sleep()*/


    val vehicle1 = Car("Red")
    val planeVehicle = Plane(1.0)
    println(vehicle1.getVehicleId())
    println(vehicle1.getDriverName())
    println(vehicle1.isDriveAble())
    vehicle1.getCarColor()
    planeVehicle.getAirportName()

}
