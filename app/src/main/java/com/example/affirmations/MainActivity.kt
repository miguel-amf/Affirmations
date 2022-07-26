package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var source = Datasource()

        var textview = findViewById<TextView>(R.id.caixa_inicial)

        var output = ""
        for (aff in source.loadAffirmations()) {
            output += resources.getString(aff.stringResourceId) + "\n"
        }
        textview.text = output
    }
}