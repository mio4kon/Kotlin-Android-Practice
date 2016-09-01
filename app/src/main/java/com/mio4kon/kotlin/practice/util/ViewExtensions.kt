package com.mio4kon.kotlin.practice.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.annotation.LayoutRes
import android.support.v4.widget.DrawerLayout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

/**
 * Created by mio4kon on 16/8/12.
 */

fun Context.showToast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, duration).show()
}

fun d(msg: String, tag: String = "Mio4kon") = Log.d(tag, msg)


inline fun <reified T : Activity> Activity.gotoActivity() {
    var intent = Intent(this, T::class.java)
    this.startActivity(intent)
}

val Context.layoutInflater: android.view.LayoutInflater
    get() = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as android.view.LayoutInflater


@ColorInt
fun Context.getColor(@ColorRes color: Int): Int {
    return this.resources.getColor(color)
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}


fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).fitCenter().into(this)
}


inline fun consume(f: () -> Unit): Boolean {
    f()
    return true
}


inline fun DrawerLayout.consume(f: () -> Unit): Boolean {
    f()
    closeDrawers()
    return true
}

inline fun <T : View> T.afterMeasured(crossinline f: T.() -> Unit) {
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            if (measuredWidth > 0 && measuredHeight > 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this)
                f()
            }
        }
    })
}


val ViewGroup.views: List<View>
    get() = (0 until childCount).map { getChildAt(it) }
