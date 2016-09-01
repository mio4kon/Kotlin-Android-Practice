package com.mio4kon.kotlin.practice.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.injector.Inject
import com.mio4kon.kotlin.practice.injector.Injector
import kotlinx.android.synthetic.main.activity_delegate.*

/**
 * 没有在类中实例
 */
class DelegateActivity : AppCompatActivity(), Injector by Inject.instance {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delegate)
        loginNameTv.text = loginName
        login()
    }
}
