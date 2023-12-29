package org.example.object_oriented.device_app

import object_oriented.device_app.objects.SmartDevice
import object_oriented.device_app.objects.SmartLightDevice
import object_oriented.device_app.objects.SmartTvDevice
import org.example.object_oriented.device_app.objects.SmartHome

fun main() {
    val smartTvDevice = SmartDevice("Android TV ", "Electronic device", 1)
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
    val smartDevice1 = SmartTvDevice("Android TV", "Entertainment")
    smartDevice1.turnOn()


    val smartDevice2 = SmartLightDevice("Azure Light", "Home")


    val smartHome = SmartHome(smartDevice1, smartDevice2)
    smartHome.increaseTvVolume()
    smartHome.turnOffAllDevices()

}