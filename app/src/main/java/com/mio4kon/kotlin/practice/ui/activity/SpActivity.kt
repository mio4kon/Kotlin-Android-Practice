package com.mio4kon.kotlin.practice.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.util.Sp
import kotlinx.android.synthetic.main.activity_sp.*
import org.jetbrains.anko.find

class SpActivity : AppCompatActivity() {


    val SP_KEY = "login_name"

    val spET by lazy { find<TextView>(R.id.et_sp) }

    var loginName by Sp(this, SP_KEY, "")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sp)

        btClear.setOnClickListener { spET.text = "" }
        btSetsp.setOnClickListener { loginName = spET.text.toString() }
        btGetsp.setOnClickListener { spET.text = loginName }
    }


}
