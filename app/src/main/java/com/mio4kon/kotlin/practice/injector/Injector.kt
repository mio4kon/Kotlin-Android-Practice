package com.mio4kon.kotlin.practice.injector

import com.mio4kon.kotlin.practice.util.d


/**
 * Created by mio4kon on 16/9/1.
 */
interface Injector {
    val loginName: String
    fun login()
}

class InjectorImpl(override val loginName: String) : Injector {
    override fun login() {
        d("$loginName login.............")
    }
}


object Inject {
    lateinit var instance: Injector
}
