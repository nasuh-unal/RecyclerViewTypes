package com.example.recyclerviewlearning.recyclerview
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlearning.databinding.ItemDesingBinding

class ToDoAdapter():RecyclerView.Adapter<ToDoAdapter.todoViewHolder>() {

    private val todoListe= arrayListOf<ToDoModel>()

    class todoViewHolder(private val todoItemDesingBinding: ItemDesingBinding):RecyclerView.ViewHolder(todoItemDesingBinding.root){
        fun bind(todo: ToDoModel){
            todoItemDesingBinding.todoItem=todo

            //buraya gelen viewlar databinding ile model sınıfımıza eşitleniyor
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todoViewHolder {
        val todoItemDesingBinding= ItemDesingBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return todoViewHolder(todoItemDesingBinding)
        // item desing layoutunu burada inflate ediyoruz ve burada bir todoViewHolder şeklinde değer dönderiyoruz
    }

    override fun onBindViewHolder(holder: todoViewHolder, position: Int) {
        holder.bind(todoListe[position])
        //burada ise todoViewHOlder şeklinde dönen verileri alıyoruz sanki bir for döngüsünde gibi tek tek satırları elde ediyoruz
        //ardından bunu viewHolder sınıfına yolluyoruz bind fonksiyonunda gönderdiğimiz liste ile todoModeli eşleştiriyoruz
        //dataBinding ile bind foknsiyonuna gelen verilerimizi eşleştiriyoruz
    }

    override fun getItemCount(): Int {
        return todoListe.size
    }

    fun updateList(updatedList:List<ToDoModel>){
        todoListe.clear()
        todoListe.addAll(updatedList)
        notifyDataSetChanged()
    }
}
