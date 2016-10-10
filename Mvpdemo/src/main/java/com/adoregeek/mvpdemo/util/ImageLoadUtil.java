package com.adoregeek.mvpdemo.util;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.adoregeek.mvpdemo.weather.WeatherActivity;
import com.adoregeek.mvpdemo.weather.api.WeatherApiService;
import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class ImageLoadUtil {

    public static void load(Context context, String path, ImageView view) {
        Glide.with(context).load(path).into(view);
    }
}
