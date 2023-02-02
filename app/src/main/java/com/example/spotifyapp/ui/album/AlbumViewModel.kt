package com.example.spotifyapp.ui.album

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.spotifyapp.model.Album
import com.example.spotifyapp.model.ItemView

class AlbumViewModel :ViewModel() {

    lateinit var timeline: List<ItemView>

    fun createTimeline(album: Album){
        timeline = AlbumTimelineFactory.create(album)
    }
}

class AlbumViewModelFactory(
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AlbumViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AlbumViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}