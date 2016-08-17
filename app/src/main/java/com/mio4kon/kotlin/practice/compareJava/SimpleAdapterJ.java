package com.mio4kon.kotlin.practice.compareJava;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mio4kon.kotlin.practice.R;

/**
 * Created by mio4kon on 16/8/15.
 */
public class SimpleAdapterJ extends RecyclerView.Adapter<SimpleAdapterJ.SimpleViewHolder> {

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_simple_rv,parent,false);
        return new SimpleViewHolder(root);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.imageView.setBackgroundResource(R.mipmap.mio);
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public SimpleViewHolder(View root) {
            super(root);
            imageView = (ImageView) root.findViewById(R.id.iv_mio);
        }
    }
}
