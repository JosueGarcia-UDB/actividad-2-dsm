package sv.edu.udb.actividad2.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NewsResponse(
    val articles: List<Article>?
)
