package com.fazlerabbikhan.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.fazlerabbikhan.worldcup.adapter.TeamAdapter
import com.fazlerabbikhan.worldcup.datasorce.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadWorldCup()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = TeamAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}