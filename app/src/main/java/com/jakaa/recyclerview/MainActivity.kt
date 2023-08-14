package com.jakaa.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.baseline_photo_camera_24,
            R.drawable.baseline_check_box_24,
            R.drawable.baseline_date_range_24,
            R.drawable.baseline_edit_24,
            R.drawable.baseline_image_24,
            R.drawable.baseline_list_24,
            R.drawable.baseline_star_rate_24,
            R.drawable.baseline_text_fields_24,
            R.drawable.baseline_access_time_24,
            R.drawable.baseline_toggle_on_24
        )
        titleList = arrayOf(
            "Camera",
            "Check Box",
            "Date",
            "Edit",
            "Image",
            "List",
            "Rating",
            "Text",
            "Time",
            "Toggle")

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()

    }
    private fun getData(){
      for (i in imageList.indices){
          val dataClass = DataClass(imageList[i], titleList[i])
          dataList.add(dataClass)
      }
        recyclerView.adapter = AdapterClass(dataList)
    }
}











































