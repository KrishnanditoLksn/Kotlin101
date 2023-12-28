package object_oriented

class Animal {
    /*
    delegate getters from function in DelegateName()class
     */

    /*
    Any is a root of Kotlin class hierarchy
     */
    var name: Any by DelegateName()
    var weight: Any by DelegateName()

    val Animal.getAnimalInfo: String
        get() = "Nama: ${this.name}, Berat: ${this.weight}}"

    fun eat() {
        println("This animal with the $name has ate an pinion ")
    }

    fun sleep() {
        println("This $name is sleeping ")
    }
}

