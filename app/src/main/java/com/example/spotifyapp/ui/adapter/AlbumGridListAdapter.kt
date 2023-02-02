package com.example.spotifyapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spotifyapp.databinding.AlbumPreviewItemBinding
import com.example.spotifyapp.model.Album
import com.example.spotifyapp.ui.genre.GenreFragmentDirections

class AlbumGridListAdapter(private val albumList : List<Album>): RecyclerView.Adapter<AlbumGridListAdapter.ViewHolder>() {

    class ViewHolder(val binding: AlbumPreviewItemBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumGridListAdapter.ViewHolder {
        val binding = AlbumPreviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = albumList[position]
        //holder.imageView.setImageResource(child.image)
        holder.binding.album = album

        holder.binding.imageView.setOnClickListener {
            val action = GenreFragmentDirections.actionGenreFragmentToAlbum(album)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

}