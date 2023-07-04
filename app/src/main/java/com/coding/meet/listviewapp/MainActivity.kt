package com.coding.meet.listviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val simpleListViewBtn = findViewById<Button>(R.id.simpleListViewBtn)
        simpleListViewBtn.setOnClickListener {
            startActivity(Intent(this,SimpleListViewActivity::class.java))
        }


        val customArrayAdapterViewBtn = findViewById<Button>(R.id.customArrayAdapterViewBtn)
        customArrayAdapterViewBtn.setOnClickListener {
            startActivity(Intent(this,CustomArrayAdapterActivity::class.java))
        }
    }
}