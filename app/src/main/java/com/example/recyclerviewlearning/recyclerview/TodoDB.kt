package com.example.recyclerviewlearning.recyclerview

object TodoDB {
    fun getToDo():ArrayList<ToDoModel>{
        val todoList= arrayListOf<ToDoModel>()

        todoList.add(ToDoModel(1,"ToDo RecyclerView"))
        todoList.add(ToDoModel(2,"Yüzmeye git"))
        todoList.add(ToDoModel(3,"İngilizce öğren"))
        todoList.add(ToDoModel(4,"16:00 Ekip toplantısı"))
        todoList.add(ToDoModel(5,"Telefon faturasını yatır"))
        todoList.add(ToDoModel(6,"Bug'lara bak"))
        todoList.add(ToDoModel(7,"Medium'da bir yazı oku"))
        todoList.add(ToDoModel(8,"TV izle"))
        todoList.add(ToDoModel(9,"Kitap Oku"))
        todoList.add(ToDoModel(10,"Müzik dinle"))
        todoList.add(ToDoModel(11,"Çeviriyi tamamla"))
        todoList.add(ToDoModel(12,"Her gün 30dk spor yap"))

        return todoList
    }
}