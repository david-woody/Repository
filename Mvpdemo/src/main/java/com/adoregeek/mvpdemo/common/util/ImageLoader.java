package com.adoregeek.mvpdemo.common.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class ImageLoader {
    /**
     * Load image from source and set it into the imageView. Use Glide now.
     * @param context context.
     * @param source could be Uri/String/File/ResourceId.
     * @param view the imageView.
     */
    public static void load(Context context, Object source, ImageView view) {
        Glide.with(context)
                .load(source)
                .centerCrop()
                .into(view);
    }
}
