package com.mio4kon.kotlin.practice.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.util.*

/**
 * Created by mio4kon on 16/8/29.
 */
class UnitTestActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_test)

        showToast("HEHE")


        val ll = LinearLayout(this)
        val root = ll.inflate(R.layout.activity_main) as ViewGroup

        val iv = ImageView(this)
        iv.loadUrl("http://..")

        d("root children size : ${root.views.size} ")

    }



}