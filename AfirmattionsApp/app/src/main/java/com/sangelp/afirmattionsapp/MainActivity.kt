package com.sangelp.afirmattionsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.sangelp.afirmattionsapp.adapter.ItemAdapter
import com.sangelp.afirmattionsapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmation()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(myDataset, this)
        recyclerView.setHasFixedSize(true) // Usar si se sabe que los cambios en el contenido no cambiarán el tamaño del diseño del RecyclerView.
        
    }
}