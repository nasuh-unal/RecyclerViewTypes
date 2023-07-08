package com.example.recyclerviewlearning.diffutil



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewlearning.databinding.ActivityMainBinding

class MainActivityDiffUtil : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val todoAdapterDiffUtil by lazy { ToDoAdapterDiffUtil() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val todoList = ToDoDBDiffUtil.getToDo()

        binding.recyclerView.apply {

            layoutManager = LinearLayoutManager(this@MainActivityDiffUtil, LinearLayoutManager.VERTICAL, false)
            //layoutManager = GridLayoutManager(this@MainActivity, 2, GridLayoutManager.VERTICAL, false)
            //layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = todoAdapterDiffUtil
        }
        todoAdapterDiffUtil.submitList(todoList)
    }
}