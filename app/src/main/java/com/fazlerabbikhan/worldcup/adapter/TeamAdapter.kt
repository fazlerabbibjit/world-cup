package com.fazlerabbikhan.worldcup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fazlerabbikhan.worldcup.R
import com.fazlerabbikhan.worldcup.model.WorldCup

class TeamAdapter(
    private val context: Context,
    private val dataset: List<WorldCup>
) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {
    class TeamViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val logo: ImageView = view.findViewById(R.id.logo)
        val name: TextView = view.findViewById(R.id.name)
        val confederation: TextView = view.findViewById(R.id.confederation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return TeamViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val item = dataset[position]
        holder.logo.setImageResource(item.logo)
        holder.name.text = context.resources.getString(item.name)
        holder.confederation.text = context.resources.getString(item.confederation)
    }

    override fun getItemCount() = dataset.size
}