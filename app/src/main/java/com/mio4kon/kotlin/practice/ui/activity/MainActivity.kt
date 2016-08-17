package com.mio4kon.kotlin.practice.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.util.gotoActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyleViewsBt.setOnClickListener {
            gotoActivity<RecyclerViewActivity>()
        }
        gankIo.setOnClickListener {
            gotoActivity<GankIoActivity>()
        }

    }
}
