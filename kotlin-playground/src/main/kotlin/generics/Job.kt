package org.example.generics

fun main() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

}

abstract  class Job (jobName : String){
}

class Teacher(honor:Boolean):Job("Guru")

class Doctor :Job("Dokter"){}


interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}




