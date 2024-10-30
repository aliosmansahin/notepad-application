package com.adrenalin.notepadapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adrenalin.notepadapplication.databinding.RecyclerRowBinding
import com.adrenalin.notepadapplication.model.Note

class ListAdapter(var noteList: List<Note>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    class ListViewHolder(val recyclerRowBinding: RecyclerRowBinding) : RecyclerView.ViewHolder(recyclerRowBinding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val recyclerRowBinding: RecyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(recyclerRowBinding)
    }

    override fun getItemCount(): Int {
        return noteList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.recyclerRowBinding.textView.text = noteList[position].title
        holder.itemView.setOnClickListener {
            //Go details page
        }
    }
}