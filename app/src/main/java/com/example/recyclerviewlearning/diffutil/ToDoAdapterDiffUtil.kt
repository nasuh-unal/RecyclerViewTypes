package com.example.recyclerviewlearning.diffutil

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlearning.databinding.ItemDesingBinding
import com.example.recyclerviewlearning.databinding.ItemDesingDiffutilBinding

class ToDoAdapterDiffUtil(): ListAdapter<ToDoModelDiffUtil, ToDoAdapterDiffUtil.todoViewHolder>(ToDoDiffUtilCallBack()) {

    class todoViewHolder(private val ItemDesingDiffutilBinding: ItemDesingDiffutilBinding): RecyclerView.ViewHolder(ItemDesingDiffutilBinding.root) {
        fun bind(todo:ToDoModelDiffUtil){
            ItemDesingDiffutilBinding.todoItem=todo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todoViewHolder {
        val ItemDesingDiffutilBinding=ItemDesingDiffutilBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return todoViewHolder(ItemDesingDiffutilBinding)
    }

    override fun onBindViewHolder(holder: todoViewHolder, position: Int) {
        val todo=getItem(position)
        holder.bind(todo)
    }

}