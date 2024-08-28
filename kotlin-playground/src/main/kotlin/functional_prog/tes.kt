package org.example.functional_prog

open class tes {
    open fun testing(i : Int = 10 ){

    }
}

class test2 : tes() {
    override fun testing(i: Int) {
        super.testing(i)
    }
}

