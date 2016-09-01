package com.mio4kon.kotlin.practice

import android.app.Application
import com.mio4kon.kotlin.practice.injector.Inject
import com.mio4kon.kotlin.practice.injector.InjectorImpl

/**
 * Created by mio4kon on 16/9/1.
 */
class KotlinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Inject.instance = InjectorImpl("Mio4kon")
    }
}