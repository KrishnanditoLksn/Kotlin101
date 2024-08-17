package org.example.exer

fun main() {
    // Fill in the code.
    val celcius = 27.0
    val kelvin = 350.0
    val fahrenheit = 10.0
    val conversionFormula: Double = 9.5 * celcius + 32.0
    printFinalTemperature(celcius, "Celcius", "Fahrenheit") { (1.8 * celcius) + 32 }
    printFinalTemperature(kelvin, "Kelvin", "Fahrenheit") { (kelvin - 273.15) }
    printFinalTemperature(fahrenheit, "Fahrenheit", "Kelvin") { (0.55 * (fahrenheit - 32)) + 273.15 }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}