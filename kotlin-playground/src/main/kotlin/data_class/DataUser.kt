package org.example.data_class

/*
TODO()
make User class
 */
class User(private val name: String, private val age: Int) {
    override fun toString(): String {
        return "User (name = $name , age = $age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println(println("My name is $name, I am $age years old"))
    }
}

/*
comparing and copied the data
 */

fun main() {
    val user = User("Dito", 22)
    val datUser = DataUser("Dito", 14)
    val dataUser2 = DataUser("Otid", 15)
    val dataUserCopy = dataUser2.copy(name = "Joko")
    val name = datUser.component1()
    val age = datUser.component2()
    println("My name is $name, I am $age years old")

    println(user)
    println(datUser == (dataUser2))

    println(dataUserCopy)

    val intro = DataUser("Dito", 19)
    intro.intro()
}


/*
Destructuring declaration
 */

fun destructuring() {
    val dataUser = DataUser("Mario", 20)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}

