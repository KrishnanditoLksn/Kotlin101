package org.example.object_oriented.transportation

class Car(private val carColor: String) : Vehicle(vehicleName = "Camaro", vehicleId = 12, driverName = "Jono") {
    private val door: Int = 20
    fun isDriveAble(): String {
        if (door > 1) {
            return "is Driveable"
        }
        return "not driveable"
    }

    fun getCarColor() {
        println("The car color is $carColor")
    }

    fun getCarDoor(): String {
        return "The ${getVehicleName()} have a $door"
    }
}