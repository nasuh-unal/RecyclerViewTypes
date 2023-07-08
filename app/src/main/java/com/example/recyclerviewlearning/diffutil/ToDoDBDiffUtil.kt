package com.example.recyclerviewlearning.diffutil

import com.example.recyclerviewlearning.viewtype.DataItem

object ToDoDBDiffUtil {
    fun getToDo():ArrayList<ToDoModelDiffUtil>{
        val todoList= arrayListOf<ToDoModelDiffUtil>()
        todoList.add(ToDoModelDiffUtil(1,"ToDo DiffUtil"))
        todoList.add(ToDoModelDiffUtil(2,"Bitirme tezine çalış"))
        todoList.add(ToDoModelDiffUtil(3,"16:00 Ekip toplantısı"))
        todoList.add(ToDoModelDiffUtil(4,"Ödevleri Yap"))
        todoList.add(ToDoModelDiffUtil(5,"Kitap Oku"))
        todoList.add(ToDoModelDiffUtil(6, "Ödevleri hazırla"))
        todoList.add(ToDoModelDiffUtil(7, "Bilgisayarı temizle"))
        todoList.add(ToDoModelDiffUtil(8, "Bug'lara bak"))
        todoList.add(ToDoModelDiffUtil(9, "Proje için hazırlık yap"))
        todoList.add(ToDoModelDiffUtil(10, "Bankayı ara"))

        return todoList
    }
}