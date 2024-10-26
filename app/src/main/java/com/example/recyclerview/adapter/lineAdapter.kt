package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.dataClass.Place
import java.util.ArrayList



class LineAdapter(private val dataSet: ArrayList<Place>) :
    RecyclerView.Adapter<LineAdapter.ViewHolder> (){

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val country: TextView
            val capital: TextView
            val habitants: TextView

            init {
                country = view.findViewById(R.id.Country)
                capital = view.findViewById(R.id.Capital)
                habitants = view.findViewById(R.id.Habitants)
            }
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclerline, viewGroup, false)
            return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.country.text = dataSet[position].country
        viewHolder.capital.text = dataSet[position].capital
        viewHolder.habitants.text = dataSet[position].habitants.toString()
    }

    override fun getItemCount() = dataSet.size
}