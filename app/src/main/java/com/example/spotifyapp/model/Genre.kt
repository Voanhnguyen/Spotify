package com.example.spotifyapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Genre(
    val genreName: String,
    val genreColor: Int,
    val genreImage: String
): Parcelable