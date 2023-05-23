package com.example.appelis.view.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appelis.databinding.FragmentPrincipalBinding
import com.example.appelis.view.popularmoviesrv.MoviePopularAdapter
import com.example.appelis.view.populartvshowsrv.TvShowPopularAdapter
import com.example.appelis.viewmodel.MoviesPopularViewModel
import com.example.appelis.viewmodel.TvShowsPopularViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrincipalFragment : Fragment() {

    //    private var param1: String? = null
//    private var param2: String? = null
    lateinit var moviesPopularAdapter: MoviePopularAdapter
    lateinit var tvShowsPopularAdapter: TvShowPopularAdapter
    val moviesPopularViewModel: MoviesPopularViewModel by viewModels()
    val tvShowPopularViewModel: TvShowsPopularViewModel by viewModels()
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
        initTvShowRVAdapter()
        getData()


    }

    private fun getData() {
        moviesPopularViewModel.onCreate()
        moviesPopularViewModel.moviePopular.observe(viewLifecycleOwner) {
            moviesPopularAdapter.updateData(it)
        }
        tvShowPopularViewModel.onCreate()
        tvShowPopularViewModel.tvshowsPopular.observe(viewLifecycleOwner) {
            tvShowsPopularAdapter.updateData(it)
        }


    }

    private fun initTvShowRVAdapter() {
        tvShowsPopularAdapter = TvShowPopularAdapter()
        _binding!!.rvLastestTvshows.setHasFixedSize(true)
        _binding!!.rvLastestTvshows.layoutManager = LinearLayoutManager(
            _binding!!.rvLastestTvshows.context,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        _binding!!.rvLastestTvshows.adapter = tvShowsPopularAdapter

    }

    private fun initMoviesRVAdapter() {
        moviesPopularAdapter = MoviePopularAdapter()
        _binding!!.rvLastestMovies.setHasFixedSize(true)
        _binding!!.rvLastestMovies.layoutManager =
            LinearLayoutManager(
                _binding!!.rvLastestMovies.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        _binding!!.rvLastestMovies.adapter = moviesPopularAdapter

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
