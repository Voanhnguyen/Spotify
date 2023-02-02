package com.example.spotifyapp.ui.album

import com.example.spotifyapp.model.*

class AlbumTimelineFactory {
    companion object{
        fun create(album: Album):ArrayList<ItemView>{
            val header = ItemView(arrayListOf(Header()),ViewTypes.PLAYLIST_HEADER.viewType,"Example Text")

            val albumListView = ItemView(arrayListOf(album),
                ViewTypes.ALBUM.viewType,"Example Text")

            val blank = ItemView(arrayListOf(),ViewTypes.BLANK.viewType,"Example Text")
            val timeLine = arrayListOf<ItemView>(header,albumListView,blank)

            return timeLine
        }
    }
}