package com.sangelp.appdogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sangelp.appdogglers.R
import com.sangelp.appdogglers.model.Dog

class DogsAdapter (private val dataset: List<Dog>, private val context: Context): RecyclerView.Adapter<DogsAdapter.ViewHolder>() {
    class ViewHolder(private val view:View): RecyclerView.ViewHolder(view){
        val dogName: TextView = view.findViewById(R.id.dog_name)
        val dogAge: TextView = view.findViewById(R.id.dog_age)
        val dogHobbie: TextView = view.findViewById(R.id.dog_Hobbies)
        val imageView: ImageView = view.findViewById(R.id.dog_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.dogs_file_vertical, parent, false)

        return ViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dog = dataset[position]
        holder.dogName.text = context.resources.getString(dog.dogName)
        holder.dogAge.text = "Age: " + context.resources.getString(dog.dogAge)
        holder.dogHobbie.text = "Hobbie: " +context.resources.getString(dog.dogHobbie)
        holder.imageView.setImageResource(dog.dogImage)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}