package tayeb.shahbakhsh.tamiratkif

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tayeb.shahbakhsh.tamiratkif.databinding.RvItemBinding
import tayeb.shahbakhsh.tamiratkif.data.Item

class MyAdapter(val list: MutableList<Item>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding:RvItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder =
        MyViewHolder(RvItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.binding.itemNameTv.text = list[position].name
        holder.binding.itemNumberTv.text= list[position].number
        holder.binding.itemDateTv.text= list[position].date
    }

    override fun getItemCount(): Int = list.size
}