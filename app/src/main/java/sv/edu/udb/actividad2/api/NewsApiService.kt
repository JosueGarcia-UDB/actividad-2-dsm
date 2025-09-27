package sv.edu.udb.actividad2.api

import retrofit2.http.GET
import retrofit2.http.Query
import sv.edu.udb.actividad2.models.NewsResponse

interface NewsApiService {
    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ): NewsResponse
}
