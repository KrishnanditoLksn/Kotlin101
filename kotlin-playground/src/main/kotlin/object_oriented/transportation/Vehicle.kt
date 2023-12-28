package org.example.object_oriented.transportation

/*
The Default class of parent is Final, so it cant be inherited
 */

abstract class Vehicle(private val vehicleName: String, private val vehicleId: Int, private val driverName: String) {

    open fun getVehicleId(): String {
        return "Report,$vehicleId is a vehicle Id"
    }


    open fun getDriverName(): String {
        return "Hello driver $driverName!!!"
    }

    open fun getVehicleName(): String {
        return "Hey , using $vehicleName"
    }

    /*
    implement secondary constructor in kotlin
     */


}