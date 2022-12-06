package com.fazlerabbikhan.worldcup.datasorce

import com.fazlerabbikhan.worldcup.R
import com.fazlerabbikhan.worldcup.model.WorldCup

class Datasource {
    fun loadWorldCup() : List<WorldCup> {
        return listOf<WorldCup>(
            WorldCup(R.drawable.netherlands_logo, R.string.team1, R.string.uefa),
            WorldCup(R.drawable.argentina_logo, R.string.team2, R.string.conmebol),
            WorldCup(R.drawable.croatia_logo,R.string.team3, R.string.uefa),
            WorldCup(R.drawable.brazil_logo,R.string.team4, R.string.conmebol),
            WorldCup(R.drawable.england_logo,R.string.team5, R.string.uefa),
            WorldCup(R.drawable.france_logo,R.string.team6, R.string.uefa),
            WorldCup(R.drawable.spain_logo,R.string.team7, R.string.uefa),
            WorldCup(R.drawable.portugal_logo,R.string.team8, R.string.uefa)
        )
    }
}