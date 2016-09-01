package com.mio4kon.kotlin.practice.ui.adater

import android.support.annotation.DrawableRes
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.util.inflate
import org.jetbrains.anko.find

/**
 * Created by mio4kon on 16/8/15.
 */

class SimpleImageAdapter(val items: List<String>) : Adapter<SimpleImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleImageAdapter.ViewHolder {
//        val root = LayoutInflater.from(parent.context).inflate(R.layout.item_simple_rv, parent,false)
        val root = parent.inflate(R.layout.item_simple_rv)
        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: SimpleImageAdapter.ViewHolder, position: Int) {
        holder.setImage(R.mipmap.mio)
    }

    override fun getItemCount() = items.count()


    class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        private var imageView = root.find<ImageView>(R.id.iv_mio)

        fun setImage(@DrawableRes resId: Int) {
            imageView.setImageResource(resId)
        }

    }
}
