package com.example.bookhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  val img = arrayOf(R.drawable.b1,R.drawable.b2,R.drawable.b4,R.drawable.b5,)

    private val texts = arrayOf("તમાચો ", "ખો ખો રમતું કબૂતર ", "જિંદગીના screenshots", "સાવજનું કાળજું ")

   private val desc = arrayOf("વાસુદેવ સોઢા પ્રેરિત બાવીસ કસબીઓની કલમથી લખાયેલ નવલકથા", "પારૂલ બારોટ", "રવજી ગાબાણી", "રવજી ગાબાણી")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)
    }
}