package com.example.appelis.view.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appelis.R
import com.example.appelis.databinding.FragmentPrincipalBinding
import com.example.appelis.model.MovieDetailProvider
import com.example.appelis.model.MovieDetailRepository
import com.example.appelis.model.MovieDetailUseCase
import com.example.appelis.view.popularrv.MoviePopularAdapter
import com.example.appelis.viewmodel.MoviesPopularViewModel


class PrincipalFragment : Fragment() {

    //    private var param1: String? = null
//    private var param2: String? = null
    lateinit var adapter: MoviePopularAdapter
    val movieDetailViewModel: MoviesPopularViewModel by viewModels()
    private var _binding: FragmentPrincipalBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPrincipalBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initMoviesRVAdapter()
        getData()


    }

    private fun getData() {
        movieDetailViewModel.onCreate()
        movieDetailViewModel.moviePopular.observe(viewLifecycleOwner, Observer {
            adapter.updateData(it)
        })

    }

    private fun initMoviesRVAdapter() {
        adapter = MoviePopularAdapter()
        _binding!!.rvLastestMovies.setHasFixedSize(true)
        _binding!!.rvLastestMovies.layoutManager =
            LinearLayoutManager(
                _binding!!.rvLastestMovies.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        _binding!!.rvLastestMovies.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
