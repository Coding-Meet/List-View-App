package com.coding.meet.listviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CountryAdapter(private val context:Context,
                     private val countryList : ArrayList<Country>
): ArrayAdapter<Country>(context,R.layout.country_layout,countryList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.country_layout,parent,false)

        val countryImg = view.findViewById<ImageView>(R.id.countryImg)
        val countryTxt = view.findViewById<TextView>(R.id.countryTxt)

        val country = countryList[position]

        countryImg.setImageResource(country.flag)
        countryTxt.text = country.name

        view.setOnClickListener {
            Toast.makeText(context,countryList[position].code,Toast.LENGTH_LONG).show()

        }
        view.setOnLongClickListener {
          Toast.makeText(context,"Position:$position",Toast.LENGTH_LONG).show()

            true
        }
        return view

    }
}