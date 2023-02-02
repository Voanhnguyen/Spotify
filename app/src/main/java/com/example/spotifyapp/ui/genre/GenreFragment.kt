package com.example.spotifyapp.ui.genre

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spotifyapp.databinding.FragmentGenreBinding
import com.example.spotifyapp.ui.adapter.GenreRecyclerViewAdapter

class GenreFragment : Fragment() {
    private val viewModel: GenreViewModel by activityViewModels{
        GenreViewModelFactory(
        )
    }
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentGenreBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGenreBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val bundle = arguments
        bundle?.let{
            val args = GenreFragmentArgs.fromBundle(bundle)
            viewModel.createTimeline(args.genre)
        }

        initRecycler()

        return root
    }

    private fun initRecycler() {
        recyclerView = _binding!!.genreRecyclerView

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity,
                RecyclerView.VERTICAL, false)

            adapter = GenreRecyclerViewAdapter(viewModel.timeline)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}