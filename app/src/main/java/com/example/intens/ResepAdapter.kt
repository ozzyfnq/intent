package com.example.intens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.resep_list_item.view.*

class ResepAdapter (private val resepItemList: List<ResepData>,private val clickListener: (ResepData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.resep_list_item, parent, false)
            return PartViewHolder(view)
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            (holder as PartViewHolder).bind(resepItemList[position], clickListener)
        }

        override fun getItemCount() = resepItemList.size

        class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(resep: ResepData, clickListener: (ResepData) -> Unit) {
                itemView.tv_part_nama.text = resep.nama
                itemView.tv_part_deskripsi.text = resep.deskripsi
                itemView.iv_makanan.setImageResource(resep.gambar)
                itemView.iv_makanan.contentDescription = resep.nama
                itemView.setOnClickListener { clickListener(resep) }
            }
        }
}
