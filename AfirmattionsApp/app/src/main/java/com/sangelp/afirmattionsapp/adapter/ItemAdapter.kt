package com.sangelp.afirmattionsapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sangelp.afirmattionsapp.R
import com.sangelp.afirmattionsapp.model.Affirmation

class ItemAdapter(private val dataSet:List<Affirmation>, private val context:Context ):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is jast an Affirmation object.
    class ItemViewHolder(private val view:View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /*
        Create a new views (invoked by the layou manager
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayour = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayour)
    }


    /*
            Replace the contents of a view (invoked by the layout manager)
        */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Create a new view
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    /*
        Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {
        return dataSet.size
    }
}