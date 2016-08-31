package com.mio4kon.kotlin.practice.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.util.*
import kotlinx.android.synthetic.main.activity_unit_test.*
import org.jetbrains.anko.find

/**
 * Created by mio4kon on 16/8/29.
 */
class UnitTestActivity : AppCompatActivity() {

    val SP_KEY = "login_name"

    val spET by lazy { find<TextView>(R.id.et_sp) }

    var loginName by Sp(this, SP_KEY, "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_test)

        showToast("HEHE")


        val ll = LinearLayout(this)
        val root = ll.inflate(R.layout.activity_main) as ViewGroup

        val iv = ImageView(this)
        iv.loadUrl("http://..")

        d("root children size : ${root.views.size} ")


        bt_clear.setOnClickListener { spET.text = "" }
        bt_set_sp.setOnClickListener { loginName = spET.text.toString() }
        bt_get_sp.setOnClickListener { spET.text = loginName }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean = with(item.itemId) {
        super.onOptionsItemSelected(item)
    }
}