package com.example.recyclerviewlearning.viewtype

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlearning.databinding.HeaderDesingBinding
import com.example.recyclerviewlearning.databinding.TodoItemDesingViewTypeBinding

private const val TYPE_HEADER = 0
private const val TYPE_TODO = 1

class TodoAdapterViewType() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val todoList = ArrayList<Any>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_TODO -> ToDoViewHolder(TodoItemDesingViewTypeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            TYPE_HEADER -> HeaderViewHolder(HeaderDesingBinding.inflate(LayoutInflater.from(parent.context),parent,false))
            else->throw IllegalArgumentException("Invalid ViewType")
        }
    }

    class ToDoViewHolder(private val todoItemDesingViewTypeBinding: TodoItemDesingViewTypeBinding) :
        RecyclerView.ViewHolder(todoItemDesingViewTypeBinding.root) {
        fun bind(todo: DataItem.ToDoItem) {
            todoItemDesingViewTypeBinding.todoItem = todo
        }
    }

    class HeaderViewHolder(private val headerDesingBinding: HeaderDesingBinding) :
        RecyclerView.ViewHolder(headerDesingBinding.root) {
        fun bind(header: DataItem.HeaderItem) {
            headerDesingBinding.headerItem=header
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
             is ToDoViewHolder -> holder.bind(todoList[position] as DataItem.ToDoItem)
            is HeaderViewHolder -> holder.bind(todoList[position] as DataItem.HeaderItem)
        }
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (todoList[position]) {
            is DataItem.ToDoItem -> TYPE_TODO
            is DataItem.HeaderItem -> TYPE_HEADER
            else -> throw IllegalArgumentException("Invalid Data")
        }
    }

    fun updateList(updatedList: List<Any>) {
        todoList.clear()
        todoList.addAll(updatedList)
        notifyDataSetChanged()
    }


}