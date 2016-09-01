package com.mio4kon.kotlin.practice.ui.adater


import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.mio4kon.kotlin.practice.R
import com.mio4kon.kotlin.practice.model.Meizi
import com.mio4kon.kotlin.practice.util.inflate
import com.mio4kon.kotlin.practice.util.loadUrl
import org.jetbrains.anko.find

/**
 * Created by mio4kon on 16/8/15.
 */

class GankioAdapter(val items: List<Meizi>) : Adapter<GankioAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GankioAdapter.ViewHolder {
        val root = parent.inflate(R.layout.item_big_img)
        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: GankioAdapter.ViewHolder, position: Int) {
        holder.setImage(items[position].url)
    }

    override fun getItemCount() = items.count()


    class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        private var imageView = root.find<ImageView>(R.id.iv_mio)

        fun setImage(url: String) {
            imageView.loadUrl(url)
        }

    }
}
