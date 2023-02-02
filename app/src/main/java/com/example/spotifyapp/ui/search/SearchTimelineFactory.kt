package com.example.spotifyapp.ui.search

import android.graphics.Color
import com.example.spotifyapp.model.*

class SearchTimelineFactory {
    companion object{
        fun create():ArrayList<ItemView>{
            val header = ItemView(arrayListOf(Header()), ViewTypes.SEARCH_HEADER.viewType,"Search")

            val genre1 = Genre("Podcasts", Color.rgb(0,153,76),
                "https://media.timeout.com/images/105875128/image.jpg")
            val genre2 = Genre("Made For You",Color.rgb(204,102,0),
                "https://i.scdn.co/image/ab67616d0000b273abb7d0a95fd0a21d775f5e2b")
            val genre3 = Genre("New releases",Color.rgb(148,0,211),
                "https://upload.wikimedia.org/wikipedia/en/f/f6/Taylor_Swift_-_1989.png")
            val genre4 = Genre("Vietnamese Music",Color.rgb(0,204,204),
                "https://i.scdn.co/image/ab67616d0000b27387e8ad55a2cfc10505760cf1")
            val genre5 = Genre("Pop",Color.rgb(96,96,96),
                "https://www.listenspotify.com/uploaded_files/Thf_1552155142.jpg")
            val genre6 = Genre("K-pop",Color.rgb(255,0,0),
                "https://i.scdn.co/image/ab67706f00000002643f13ef8614ee8ac300691e")
            val genre7 = Genre("Hip-Hop",Color.rgb(255,20,147),
                "https://i.scdn.co/image/ab67616d0000b27376734ac5d18dd3bf06751b9f")
            val genre8 = Genre("Charts",Color.rgb(76,0,153),
                "https://images.sk-static.com/images/media/profile_images/artists/9589234/huge_avatar")
            val genre9 = Genre("Live Events",Color.rgb(102,102,255),
                "https://i.scdn.co/image/ab6761610000517414b12da992e6b6f8cb1bdc6c")
            val genre10 = Genre("Fresh Finds",Color.rgb(153,0,0),
                "https://i.scdn.co/image/3010f8ef6f4f22c26bed51ab81178d1042c3ee9b")
            val genre11 = Genre("Mood",Color.rgb(102,204,0),
                "https://i.scdn.co/image/ab67616d0000b27360036f58bbb4b25a7a6f2712")
            val genre12 = Genre("Chill",Color.rgb(204,204,0),
                "https://i.scdn.co/image/ab67616d00001e02aea2e00b6276e9617aa71a99")

//            val genreView1 = ItemView(arrayListOf(genre1,genre2,genre3,genre4),
//                ViewTypes.GENRE_ITEM.viewType,"Your top genres")
            val genreView2 = ItemView(arrayListOf(genre1,genre2,genre3,genre4,genre5,genre6,genre7,genre8,genre9,genre10,genre11,genre12),
                ViewTypes.GENRE_ITEM.viewType,"Browse all")

            val blank = ItemView(arrayListOf(),ViewTypes.BLANK.viewType,"Example Text")

            val timeLine = arrayListOf<ItemView>(header,genreView2,blank)

            return timeLine
        }
    }
}