package object_oriented.device_app.objects

import org.example.object_oriented.device_app.utils.RangeRegulator

open class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Tv"
    override var speakerVolume by RangeRegulator(2, 1, 100)
    private var decreaseVolume by RangeRegulator(2, 1, 100)

    private var channelNumber by RangeRegulator(2, 0, 200)
    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }

    fun decreaseVolume() {
        decreaseVolume++
    }

    fun previousChannel() {
        channelNumber--
        println("Channel number decreased to $channelNumber")
    }

}