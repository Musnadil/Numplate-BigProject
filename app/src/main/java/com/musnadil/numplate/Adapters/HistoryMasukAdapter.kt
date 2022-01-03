package com.musnadil.numplate.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.musnadil.numplate.Models.HistoryMasukModel
import com.musnadil.numplate.R

class HistoryMasukAdapter(

    val history_masuk:ArrayList<HistoryMasukModel.Data_masuk>
    ): RecyclerView.Adapter<HistoryMasukAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.history_list,parent,false)
    )

    override fun onBindViewHolder(holder: HistoryMasukAdapter.ViewHolder, position: Int) {
        val history = history_masuk[position]
        holder.tv_plat.text = history.nomer_plat
        holder.tv_tanggal.text = history.tanggal
        holder.tv_waktu_masuk.text = history.waktu_masuk
        holder.tv_waktu_keluar.text = history.waktu_keluar
    }

    override fun getItemCount() = history_masuk.size

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tv_plat = view.findViewById<TextView>(R.id.tv_plat)
        val tv_tanggal = view.findViewById<TextView>(R.id.tv_tanggal)
        val tv_waktu_masuk = view.findViewById<TextView>(R.id.tv_waktu_masuk)
        val tv_waktu_keluar = view.findViewById<TextView>(R.id.tv_waktu_keluar)
    }
    public fun setData(recap : List<HistoryMasukModel.Data_masuk>){
        history_masuk.clear()
        history_masuk.addAll(recap)
        notifyDataSetChanged()
    }

}