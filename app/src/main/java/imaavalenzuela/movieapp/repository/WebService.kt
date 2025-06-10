package imaavalenzuela.movieapp.repository

import com.google.gson.GsonBuilder
import imaavalenzuela.movieapp.data.model.MovieList
import imaavalenzuela.movieapp.utils.Const
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {
    @GET("upcoming")
    suspend fun getUpcomingMovies(@Query("api_key") apiKey: String): MovieList

    @GET("popular")
    suspend fun getTopRatedMovies(@Query("api_key") apiKey: String): MovieList

    @GET("top_rated")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): MovieList
}

object RetrofitClient{
    val webservice by lazy {
        Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }
}