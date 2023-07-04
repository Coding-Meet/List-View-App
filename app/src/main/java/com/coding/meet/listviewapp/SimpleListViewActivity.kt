package com.coding.meet.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class SimpleListViewActivity : AppCompatActivity() {
    private val languageList = arrayListOf(
        "English",
        "Hindi (हिंदी)",
        "Japanese (日本)",
        "Chinese (中国人)",
        "Spanish (Española)",
        "German (Deutsch)",
        "French (Français)",
        "Portuguese (Português)",
        "Italian (Italiana)",
        "Arabic (عربي)",
        "Russian (Русский)",
        "Korean (한국인)",
        "Indonesian (bahasa Indonesia)",
        "Catalan (català)"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list_view)
        val languageLV = findViewById<ListView>(R.id.languageLV)
        languageLV.adapter = ArrayAdapter(this,R.layout.custom_layout,R.id.languageTxt,languageList)

        languageLV.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
            Toast.makeText(this,languageList[position], Toast.LENGTH_LONG).show()
        }

        languageLV.onItemLongClickListener = AdapterView.OnItemLongClickListener { _, view, position, _ ->
            Toast.makeText(this,"Position: $position", Toast.LENGTH_LONG).show()
            true
        }
    }
}