package object_oriented

class SmartDevice {
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn() {
        println("Hey , Smart device is turned on")
    }

    fun turnOf() {
        println("Hoho, Smart device is turned off")
    }
}