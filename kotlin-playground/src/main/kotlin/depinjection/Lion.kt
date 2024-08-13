package org.example.depinjection

/*
tanpa injeksi dependensi
 */
//class Lion {
//    private val sound = Animal()
//
//    fun startSound(){
//        sound.animalSound()
//    }
//}

class Lion (private val animal: Animal) {
    fun startSound(){
        animal.animalSound()
    }
    fun stopSound(){
        animal.animalStopSound()
    }
}