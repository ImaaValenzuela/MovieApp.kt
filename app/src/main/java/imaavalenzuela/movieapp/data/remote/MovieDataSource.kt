package imaavalenzuela.movieapp.data.remote

import imaavalenzuela.movieapp.data.model.MovieList
import imaavalenzuela.movieapp.repository.WebService
import imaavalenzuela.movieapp.utils.Const

class MovieDataSource(private val webService: WebService) {
    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(Const.API_KEY)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(Const.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(Const.API_KEY)

}