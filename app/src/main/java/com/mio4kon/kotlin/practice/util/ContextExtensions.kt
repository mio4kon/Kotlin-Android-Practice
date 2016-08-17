package com.mio4kon.kotlin.practice.util

import android.app.Activity
import android.content.Intent
import android.support.v4.app.ActivityCompat

/**
 * Created by mio4kon on 16/8/15.
 */

inline fun <reified T : Activity> Activity.gotoActivity() {
    var intent = Intent(this, T::class.java)
    this.startActivity(intent)
}