package com.mio4kon.kotlin.practice.ui.adater


import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.model.Meizi
import org.jetbrains.anko.find

/**
 * Created by mio4kon on 16/8/15.
 */

class GankioAdapter(val items: List<Meizi>) : Adapter<GankioAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GankioAdapter.ViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.item_big_img, parent, false)

        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: GankioAdapter.ViewHolder, position: Int) {
        holder.setImage(items[position].url)
    }

    override fun getItemCount() = items.count()


    class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        private var imageView: ImageView = root.find<ImageView>(R.id.iv_mio)

        fun setImage(url: String) {
            Glide.with(imageView.context).load(url).fitCenter().into(imageView)
        }

    }
}
