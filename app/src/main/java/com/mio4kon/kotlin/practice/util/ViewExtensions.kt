package com.mio4kon.kotlin.practice.util

import android.content.Context
import android.widget.Toast

/**
 * Created by mio4kon on 16/8/12.
 */

fun Context.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, duration).show()
}

val Context.layoutInflater: android.view.LayoutInflater
    get() = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as android.view.LayoutInflater