package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Retrieve the list of affirmations*/
        val myDataset = Datasource().loadAffirmations()

        //get the recycler view
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        //set the recyclerView's adapter
        recyclerView.adapter = ItemAdapter(this, myDataset)
        /* Increases performance */
        recyclerView.setHasFixedSize(true)
    }
}