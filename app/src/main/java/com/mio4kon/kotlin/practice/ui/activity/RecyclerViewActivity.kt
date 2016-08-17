package com.mio4kon.kotlin.practice.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.model.items
import com.mio4kon.kotlin.practice.ui.adater.SimpleImageAdapter
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = SimpleImageAdapter(items)
    }
}
