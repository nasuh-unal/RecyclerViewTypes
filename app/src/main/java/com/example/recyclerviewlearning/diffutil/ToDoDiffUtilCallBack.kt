package com.example.recyclerviewlearning.diffutil

import androidx.recyclerview.widget.DiffUtil
import com.example.recyclerviewlearning.recyclerview.ToDoModel

class ToDoDiffUtilCallBack:DiffUtil.ItemCallback<ToDoModelDiffUtil>() {
    override fun areItemsTheSame(oldItem: ToDoModelDiffUtil, newItem: ToDoModelDiffUtil): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: ToDoModelDiffUtil, newItem: ToDoModelDiffUtil): Boolean {
        return oldItem==newItem
    }

}