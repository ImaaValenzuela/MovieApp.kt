package imaavalenzuela.movieapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import kotlin.kmp.imaavalenzuela.movieapp.R
import kotlin.kmp.imaavalenzuela.movieapp.databinding.FragmentMovieBinding

class MovieFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var binding: FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)
    }
}
