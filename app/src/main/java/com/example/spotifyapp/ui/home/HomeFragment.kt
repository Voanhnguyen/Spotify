package com.example.spotifyapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spotifyapp.databinding.FragmentHomeBinding
import com.example.spotifyapp.model.*
import com.example.spotifyapp.ui.adapter.HomeRecyclerViewAdapter

class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by activityViewModels{
        HomeViewModelFactory(
        )
    }

    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initRecycler()

        return root
    }



    private fun initRecycler() {
        recyclerView = _binding!!.homeRecyclerView

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity,
                RecyclerView.VERTICAL, false)

            adapter = HomeRecyclerViewAdapter(viewModel.timeline)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}