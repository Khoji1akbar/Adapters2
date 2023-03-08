package adatpter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.google.android.material.transition.Hold
import uz.hh.databinding.ItemBinding

class UserAdabter(val list:List<String>):RecyclerView.Adapter<UserAdabter.VH>() {
    inner class VH(val itemBinding: ItemBinding):ViewHolder(itemBinding.root){
        fun old(name:String){
            itemBinding.tvitem.text = name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.old(list[position])
    }

    override fun getItemCount(): Int = list.size
}