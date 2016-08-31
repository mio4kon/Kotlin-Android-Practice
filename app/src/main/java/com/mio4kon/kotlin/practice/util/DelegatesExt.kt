package com.mio4kon.kotlin.practice.util

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by mio4kon on 16/8/30.
 */



class Sp<T>(val ctx: Context, val name: String, val default: T) : ReadWriteProperty<Any?, T> {

    val prefs by lazy { ctx.getSharedPreferences("default_sp_name", Context.MODE_PRIVATE) }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return findPreference(name, default)
    }


    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        putPreference(name, value)
    }


    private fun <U> findPreference(name: String, default: U): U = with(prefs) {

        val res: Any = when (default) {
            is Long -> getLong(name, default)
            is String -> getString(name, default)
            is Int -> getInt(name, default)
            is Boolean -> getBoolean(name, default)
            is Float -> getFloat(name, default)
            else -> throw IllegalArgumentException("this type can not find from sp")

        }
        return res as U
    }


    private fun <U> putPreference(name: String, value: U) = with(prefs.edit()) {
        when (value) {
            is Long -> putLong(name, value)
            is String -> putString(name, value)
            is Int -> putInt(name, value)
            is Boolean -> putBoolean(name, value)
            is Float -> putFloat(name, value)
            else -> throw IllegalArgumentException("This type can not save into sp")
        }.apply()
    }


}