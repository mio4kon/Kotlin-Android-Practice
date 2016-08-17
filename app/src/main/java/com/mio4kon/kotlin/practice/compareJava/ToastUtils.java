package com.mio4kon.kotlin.practice.compareJava;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by mio4kon on 16/8/12.
 */
public class ToastUtils {

    public static void show(Context ctx, String msg) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }

    public static void show(Context ctx, String msg, int duration) {
        Toast.makeText(ctx, msg, duration).show();
    }

}
