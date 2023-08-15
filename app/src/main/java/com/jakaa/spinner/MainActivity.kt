package com.jakaa.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Step 1(a): Declare and Initialize spinner
    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Step 1(b): Initialize spinner
        spinner = findViewById(R.id.spinner)

        // Step 2: Create list of items that will be present in Spinner
        val listItem = listOf(
            "Kenya",
            "United States",
            "Uganda",
            "Tanzania",
            "United Kingdom",
            "India",
            "China",
            "Rwanda",
            "Burundi",
            "Jamaica",
            "Ethiopia",
            "South Sudan",
            "South Africa",
            "Nigeria",
            "DRC Congo",
            "Egypt",
            "Malawi",
        )
        // 3: Create arrayAdapter
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listItem)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

        // 4: Set onItemSelectedListener
        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long,
            ) {
                val selectedItem = parent.getItemAtPosition(position).toString()

                // Step 5: Add A Toast
                Toast.makeText(this@MainActivity, "You have selected: $selectedItem", Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
}



























































































