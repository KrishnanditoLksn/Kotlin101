package org.example.control_flow

fun main() {
    //Mengakses enum
//    val color: Color = Color.RED
//    println(color)

    val color: Array<Color> = enumValues()
    for (color1 in color) {
        println(color1)
    }

    val colors: Color = enumValueOf("RED")
    println("Color is $colors")
}

//inisialisasi enum
enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of red is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of green is $value")
        }
    };

    abstract fun printValue()
}

