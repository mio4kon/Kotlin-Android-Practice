package com.mio4kon.kotlin.practice.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.ImageView
import android.widget.LinearLayout
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.util.inflate
import com.mio4kon.kotlin.practice.util.loadUrl
import com.mio4kon.kotlin.practice.util.showToast
import org.jetbrains.anko.find

/**
 * Created by mio4kon on 16/8/29.
 */
class UnitTestActivity : AppCompatActivity() {


     val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_unit_test)
        showToast("HEHE")
        getColor(R.color.colorAccent)
        val ll = LinearLayout(this)
        ll.inflate(R.layout.activity_main)

        val iv = ImageView(this)
        iv.loadUrl("http://..")
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean = with(item.itemId) {
        super.onOptionsItemSelected(item)
    }
}