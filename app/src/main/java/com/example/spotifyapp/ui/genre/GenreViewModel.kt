package com.example.spotifyapp.ui.genre

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.spotifyapp.model.Genre
import com.example.spotifyapp.model.ItemView

class GenreViewModel: ViewModel() {
    lateinit var timeline: List<ItemView>

    fun createTimeline(genre: Genre){
        timeline = GenreTimelineFactory.create(genre)
    }

    //val timeline = GenreTimelineFactory.create()

    private val _genre = MutableLiveData<Genre>()

    val genre: LiveData<Genre> = _genre

}
class GenreViewModelFactory(
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GenreViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return GenreViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}