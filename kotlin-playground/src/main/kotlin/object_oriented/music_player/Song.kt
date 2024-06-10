package org.example.object_oriented.music_player

class Song(
    private val artistName: String,
    private val artistId: String,
    private val songName: String
) {
    val playCount: Int = 0

    fun printSongTitle(): String {
        return "Song name $songName"
    }

    fun printArtistId(): Any {
        return artistName
    }

    fun printSongId(): Any {
        return artistId
    }


}