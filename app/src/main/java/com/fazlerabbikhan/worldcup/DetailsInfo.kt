package com.fazlerabbikhan.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_info)

        val bundle: Bundle? = intent.extras
        val getTeamLogo: String? = bundle?.getString("teamLogo")
        val getTeamName: String? = bundle?.getString("teamName")
        val getTeamConfederation: String? = bundle?.getString("teamConfederation")

        val teamLogo: ImageView = findViewById(R.id.teamLogo)
        val teamName: TextView = findViewById(R.id.teamName)
        val teamConfederation: TextView = findViewById(R.id.teamConfederation)

        getTeamLogo?.toInt()?.let { teamLogo.setImageResource(it) }
        teamName.text = "Team: " + getTeamName?.toInt()?.let { getString(it) }
        teamConfederation.text = "Confederation: " + getTeamConfederation?.toInt()?.let { getString(it) }
    }
}