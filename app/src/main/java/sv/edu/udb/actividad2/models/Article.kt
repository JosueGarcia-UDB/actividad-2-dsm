package sv.edu.udb.actividad2.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Article(
    val title: String?,
    val description: String?,
    val urlToImage: String?,
    val url: String?
)
