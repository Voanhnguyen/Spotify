package com.example.spotifyapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Album(
    val albumName: String,
    val artistName: String,
    val imageSource: String,
    val songList: List<Song>
): Parcelable