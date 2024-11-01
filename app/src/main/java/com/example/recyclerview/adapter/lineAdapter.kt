package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.dataClass.Person
import java.util.ArrayList

class LineAdapter(private val dataSet: ArrayList<Person>) :
    RecyclerView.Adapter<LineAdapter.ViewHolder> (){

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val name_nationality: TextView
            val Sport: TextView
            val yearOfBirthday: TextView

            init {
                name_nationality = view.findViewById(R.id.name_nationality)
                Sport = view.findViewById(R.id.Sport)
                yearOfBirthday = view.findViewById(R.id.yearOfBirthday)
            }
        }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclerline,viewGroup,false)
            return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.name_nationality.text = dataSet[position].name +" - "+ dataSet[position].nationality
        viewHolder.Sport.text = dataSet[position].sport
        viewHolder.yearOfBirthday.text = (2024 - dataSet[position].yearOfBirth).toString()
    }

    override fun getItemCount() = dataSet.size
}