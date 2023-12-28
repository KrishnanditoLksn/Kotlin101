package org.example.object_oriented.transportation

class Plane(altitude: Double) : Vehicle(vehicleName = "Lion Air", vehicleId = 129, driverName = "Jordi"), Airport {

    private val planeAltitude: Any = altitude

    fun getAltitude(): Any {
        return "The altitude is $planeAltitude"
    }

    override fun getAirportName() {
        println("Yogyakarta International Airport")
    }


}