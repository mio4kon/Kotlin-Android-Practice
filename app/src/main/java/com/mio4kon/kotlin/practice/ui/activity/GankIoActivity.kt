package com.mio4kon.kotlin.practice.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.model.Meizi
import com.mio4kon.kotlin.practice.service.GankService
import com.mio4kon.kotlin.practice.ui.adater.GankioAdapter
import kotlinx.android.synthetic.main.activity_recycler_view.*
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.*

class GankIoActivity : AppCompatActivity() {

    val meiziList =ArrayList<Meizi>()
    val adapter = GankioAdapter(meiziList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gank_io)
        GankService.api.getMeizi(50, 1)
                .subscribeOn(Schedulers.io())
                .map { it.results }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    meiziList.clear()
                    meiziList.addAll(it)
                    adapter.notifyDataSetChanged()
                })


        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter

    }
}
