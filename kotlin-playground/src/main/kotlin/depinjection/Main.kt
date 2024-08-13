package depinjection

import org.example.depinjection.Animal
import org.example.depinjection.Lion


fun main() {
    val animal = Animal()
    val l1 = Lion(animal)
    l1.startSound()
    l1.stopSound()
}
