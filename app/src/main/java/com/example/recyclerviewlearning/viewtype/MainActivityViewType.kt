package com.example.recyclerviewlearning.viewtype


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewlearning.databinding.ActivityMainBinding
import com.example.recyclerviewlearning.databinding.TodoItemDesingViewTypeBinding

class MainActivityViewType : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val todoAdapterViewType by lazy { TodoAdapterViewType() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val todoList = TodoDBViewType.getTodos()

        todoAdapterViewType.updateList(todoList)

        binding.recyclerView.apply {

            layoutManager = LinearLayoutManager(this@MainActivityViewType, LinearLayoutManager.VERTICAL, false)
            //layoutManager = GridLayoutManager(this@MainActivity, 2, GridLayoutManager.VERTICAL, false)
            //layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = todoAdapterViewType
        }
    }
}