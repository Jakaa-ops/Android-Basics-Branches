package com.jakaa.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Step 1: Declare and initialize the Button
        val showButton = findViewById<Button>(R.id.showButton)
        //Step 4: set onClick Listener
        showButton.setOnClickListener {
            showAlertDialog()
        }
    }
    //Step 2: Create showAlertMethod
    private fun showAlertDialog(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("SnapChat")
            .setMessage("Do you want to uninstall the app?")
            .setPositiveButton("Yes"){dialog, which ->
                Toast.makeText(this, "The app is successfully uninstalled", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){dialog, which ->
                dialog.dismiss()
            }
        //Step 3: Associate builder with AlertDialog
        val alertDialog = builder.create()
        alertDialog.show()

    }
}