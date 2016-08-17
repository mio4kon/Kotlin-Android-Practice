package com.mio4kon.kotlin.practice.compareJava;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mio4kon.kotlin.practice.R;
import com.mio4kon.kotlin.practice.ui.activity.RecyclerViewActivity;

/**
 * Created by mio4kon on 16/8/12.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,RecyclerViewActivity.class);
       this.startActivity(intent);

    }
}
