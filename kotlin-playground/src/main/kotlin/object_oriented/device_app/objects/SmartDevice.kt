package object_oriented.device_app.objects

open class SmartDevice(val name: String, val category: String) {
    private var deviceStatus = "online"

    open val deviceType = "unknown"

    /*
    implement
     */
    open var speakerVolume = 2
        protected set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    /*
    implement secondary constructor in SmartDevice class
     */

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun printDeviceInfo(): String {
        return "Device name : $name , category : $category , type:$deviceType"
    }

}