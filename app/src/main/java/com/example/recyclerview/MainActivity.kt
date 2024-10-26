package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.LineAdapter
import com.example.recyclerview.dataClass.Person

class MainActivity : AppCompatActivity() {
    private lateinit var myList: ArrayList<Person>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        myList = ArrayList<Person>()
        myList.add(Person("Football", "Lionel Messi", 1987, "Argentina"))
        myList.add(Person("Football", "Cristiano Ronaldo", 1985, "Portugal"))
        myList.add(Person("Football", "Neymar", 1992, "Brasil"))

        val recycler_view: RecyclerView = findViewById(R.id.recycler)
        recycler_view.adapter = LineAdapter(myList)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }
}