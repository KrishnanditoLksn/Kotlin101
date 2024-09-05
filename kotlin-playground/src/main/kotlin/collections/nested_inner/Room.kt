package org.example.collections.nested_inner

class Room {
    private val rname: String = "Ruang Tamu"
    private val totalRooms = 4

    inner class RoomMate {
        private val totalRooms = 10

        fun isRoomNull() {
            return when(rname){
                Boolean.toString()-> println("Berisi")
                else -> {
                    println("now")
                }
            }
        }

        fun getRoomMateTotalRooms(): String {
            return "Hey this room have : " + this@RoomMate.totalRooms
        }
    }
}

fun main() {
    val room = Room().RoomMate()
    println(room.isRoomNull())
    println(room.getRoomMateTotalRooms())
}