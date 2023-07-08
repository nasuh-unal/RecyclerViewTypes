package com.example.recyclerviewlearning.viewtype

object TodoDBViewType {
    fun getTodos():ArrayList<Any>{

        return arrayListOf(
            DataItem.HeaderItem("Günlük"),
            DataItem.ToDoItem(1, "Alışverişe git"),
            DataItem.ToDoItem(2, "16:00 Ekip toplantısı"),
            DataItem.ToDoItem(3, "Bitirme tezine çalış"),
            DataItem.ToDoItem(4, "Telefon faturasını yatır"),
            DataItem.ToDoItem(5, "Çeviriyi tamamla"),
            DataItem.ToDoItem(6, "Ödevleri hazırla"),
            DataItem.ToDoItem(7, "Bilgisayarı temizle"),
            DataItem.ToDoItem(8, "Bug'lara bak"),
            DataItem.ToDoItem(9, "Proje için hazırlık yap"),
            DataItem.ToDoItem(10, "Bankayı ara"),
            DataItem.HeaderItem("Düzenli"),
            DataItem.ToDoItem(11, "Her gün 30dk spor yap"),
            DataItem.ToDoItem(11, "Her gün 30dk kitap oku"),
            DataItem.ToDoItem(12, "Her gün Medium'da bir yazı oku"),
            DataItem.ToDoItem(13, "Her gün 30dk ingilizce çalış")
        )
    }
}