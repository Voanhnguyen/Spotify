package com.example.spotifyapp.ui.album

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spotifyapp.MainActivity
import com.example.spotifyapp.databinding.FragmentAlbumBinding
import com.example.spotifyapp.model.Album
import com.example.spotifyapp.service.MusicService
import com.example.spotifyapp.ui.adapter.AlbumRecyclerViewAdapter
import com.example.spotifyapp.viewmodel.MainViewModel

class AlbumFragment : Fragment() {

    private val viewModel: AlbumViewModel by activityViewModels{
        AlbumViewModelFactory(
        )
    }

    private lateinit var mService: MusicService

    private val mainViewModel: MainViewModel by activityViewModels()

    private lateinit var albumRecyclerViewAdapter: AlbumRecyclerViewAdapter
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentAlbumBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var album: Album

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAlbumBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mService = (context as MainActivity).getService()

        val bundle = arguments
        bundle?.let{
            val args = AlbumFragmentArgs.fromBundle(bundle)
            album = args.album
            viewModel.createTimeline(album)
        }

        initRecycler()

        subscribeToObservables()

        return root
    }

    private fun initRecycler() {
        recyclerView = _binding!!.albumRecyclerView

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity,
                RecyclerView.VERTICAL, false)

            albumRecyclerViewAdapter = AlbumRecyclerViewAdapter(viewModel.timeline, context, album, viewLifecycleOwner)

            adapter = albumRecyclerViewAdapter
        }
    }

    private fun subscribeToObservables(){
        mService.isSongPlaying.observe(viewLifecycleOwner){
            albumRecyclerViewAdapter.updateUI(it)
        }
    }
}