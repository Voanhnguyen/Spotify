package com.example.spotifyapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spotifyapp.databinding.AlbumLibraryRowBinding
import com.example.spotifyapp.model.Album
import com.example.spotifyapp.ui.library.LibraryFragmentDirections

class AlbumListAdapter(private val albumList: List<Album>): RecyclerView.Adapter<AlbumListAdapter.ViewHolder>() {
    class ViewHolder(val binding: AlbumLibraryRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AlbumLibraryRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var album = albumList[position]

        holder.binding.album = album

        holder.binding.linearLayoutView.setOnClickListener {
            val action = LibraryFragmentDirections.actionLibraryFragmentToAlbum(album)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return albumList.size
    }
}