package com.mio4kon.kotlin.practice.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.util.consume
import com.mio4kon.kotlin.practice.util.gotoActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyleViewsBt.setOnClickListener {
            gotoActivity<RecyclerViewActivity>()
        }
        gankIoBt.setOnClickListener {
            gotoActivity<GankIoActivity>()
        }

        spBt.setOnClickListener {
            gotoActivity<SpActivity>()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean = with(menuInflater) {
        inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {
        R.id.action_unit->consume{gotoActivity<UnitTestActivity>()}
        else -> super.onOptionsItemSelected(item)
    }


}
