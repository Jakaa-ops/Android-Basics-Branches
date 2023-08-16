package com.jakaa.viewpager2basics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    //Step 1: Declare Variables
    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Step 6: Set Adapter
        viewPager = findViewById(R.id.viewPager)
        pagerAdapter = ViewPagerAdapter()
        viewPager.adapter = pagerAdapter

    }


}

//Step 2: Create ViewPagerAdapterClass
class ViewPagerAdapter(): RecyclerView.Adapter<ViewHolder>() {
    //Step 4: Create a List
    private val itemList = listOf(
        "Delicious meals delivered to your doorstep, at the tap of a button",
        "Savor the convenience of culinary delights, delivered to you in minutes.",
        "Hungry? We've got you covered! order, relax, and let us bring the feast to you."
    )

    // Step 5: Implement Members
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pager_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }
}

//Step 3: Create ViewHolder Class
class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val pagerText = itemView.findViewById<TextView>(R.id.pagerText)
    fun bind(item: String){
        pagerText.text = item
    }
}





































































