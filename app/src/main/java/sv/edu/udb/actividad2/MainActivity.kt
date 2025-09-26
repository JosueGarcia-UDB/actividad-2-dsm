package sv.edu.udb.actividad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import sv.edu.udb.actividad2.adapter.NewsAdapter
import sv.edu.udb.actividad2.databinding.ActivityMainBinding
import sv.edu.udb.actividad2.viewmodel.NewsViewModel
import sv.edu.udb.actividad2.viewmodel.UiState

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: NewsViewModel
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(NewsViewModel::class.java)

        setupRecyclerView()
        observeViewModel()

        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.fetchTopHeadlines(getApiKey(), "us")
        }

        viewModel.fetchTopHeadlines(getApiKey(), "us")
    }

    private fun setupRecyclerView() {
        newsAdapter = NewsAdapter(emptyList())
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = newsAdapter
        }
    }

    private fun observeViewModel() {
        viewModel.uiState.observe(this) { state ->
            when (state) {
                is UiState.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.recyclerView.visibility = View.GONE
                    binding.textViewError.visibility = View.GONE
                    binding.swipeRefreshLayout.isRefreshing = true
                }
                is UiState.Success -> {
                    binding.progressBar.visibility = View.GONE
                    binding.recyclerView.visibility = View.VISIBLE
                    binding.textViewError.visibility = View.GONE
                    newsAdapter.updateArticles(state.articles ?: emptyList())
                    binding.swipeRefreshLayout.isRefreshing = false
                }
                is UiState.Error -> {
                    binding.progressBar.visibility = View.GONE
                    binding.recyclerView.visibility = View.GONE
                    binding.textViewError.visibility = View.VISIBLE
                    binding.textViewError.text = state.message
                    binding.swipeRefreshLayout.isRefreshing = false
                }
            }
        }
    }

    private fun getApiKey(): String {
        return BuildConfig.API_KEY
    }
}