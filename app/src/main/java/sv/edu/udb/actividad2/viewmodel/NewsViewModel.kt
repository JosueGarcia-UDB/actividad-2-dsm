package sv.edu.udb.actividad2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import sv.edu.udb.actividad2.api.RetrofitClient
import sv.edu.udb.actividad2.models.Article
import java.io.IOException

sealed class UiState {
    object Loading : UiState()
    data class Success(val articles: List<Article>) : UiState()
    data class Error(val message: String) : UiState()
}

class NewsViewModel : ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun fetchTopHeadlines(apiKey: String, country: String) {
        _uiState.value = UiState.Loading
        viewModelScope.launch {
            try {
                val response = RetrofitClient.instance.getTopHeadlines(apiKey, country)
                _uiState.postValue(UiState.Success(response.articles ?: emptyList()))
            } catch (e: IOException) {
                _uiState.postValue(UiState.Error("No hay conexión a Internet. Por favor, inténtelo de nuevo."))
            } catch (e: retrofit2.HttpException) {
                _uiState.postValue(UiState.Error("Error en el servidor: Código ${e.code()}"))
            } catch (e: Exception) {
                _uiState.postValue(UiState.Error("Ocurrió un error inesperado: ${e.message}"))
            }
        }
    }
}
