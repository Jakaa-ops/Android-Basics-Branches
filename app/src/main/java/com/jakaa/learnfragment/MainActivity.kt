package com.jakaa.learnfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.jakaa.learnfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Step 1: Declare variables and initialize the bindings
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Step3: calling the method inside clickListener
        binding.buttonFragment1.setOnClickListener {
            goToFragment(Fragment1())
        }
        binding.buttonFragment2.setOnClickListener {
            goToFragment(Fragment2())
        }
    }

    //Step 2: create go to fragment function
    private fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
}