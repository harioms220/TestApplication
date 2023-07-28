package com.example.testapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testapplication.databinding.ActivityMainBinding
import com.example.testapplication.databinding.ListItemBinding

class SampleAdapter: RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    private var list = mutableListOf<String>()

    fun setData(list: List<String>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }
    class ViewHolder(var binding: ListItemBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvSample.text = list[position]
    }
}