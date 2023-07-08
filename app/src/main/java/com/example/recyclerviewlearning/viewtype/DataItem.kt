package com.example.recyclerviewlearning.viewtype

sealed class DataItem {
    data class ToDoItem(val todoId:Int,val todoText:String):DataItem()
    data class HeaderItem(val headerText:String):DataItem()
}