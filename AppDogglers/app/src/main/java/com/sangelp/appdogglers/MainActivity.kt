package com.sangelp.appdogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.sangelp.appdogglers.adapter.DogsAdapter
import com.sangelp.appdogglers.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView.
        // recyclerView.setHasFixedSize((true))
    }

    override fun onResume() {
        super.onResume()
        val vertical: Button = findViewById(R.id.Button_Vertical)
        val horizontal : Button = findViewById(R.id.Button_horizontal)
        val grid: Button = findViewById(R.id.Button_Grid)
        val menu: Button = findViewById(R.id.Button_back)

        vertical.setOnClickListener{
            val dataSet = DataSource().loadDogs()
            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.isVisible = true
            recyclerView.adapter = DogsAdapter(dataSet, this)
            vertical.isVisible = false
            horizontal.isVisible = false
            grid.isVisible = false
            menu.isVisible = true
        }

        horizontal.setOnClickListener{
            val dataSet = DataSource().loadDogs()
            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.isVisible = true
            recyclerView.adapter = DogsAdapter(dataSet, this)
            vertical.isVisible = false
            horizontal.isVisible = false
            grid.isVisible = false
            menu.isVisible = true
        }

        grid.setOnClickListener{
            val dataSet = DataSource().loadDogs()
            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.isVisible = true
            recyclerView.adapter = DogsAdapter(dataSet, this)
            vertical.isVisible = false
            horizontal.isVisible = false
            grid.isVisible = false
            menu.isVisible = true
        }

        menu.setOnClickListener {
            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.isVisible = false
            vertical.isVisible = true
            horizontal.isVisible = true
            grid.isVisible = true
        }

    }
}