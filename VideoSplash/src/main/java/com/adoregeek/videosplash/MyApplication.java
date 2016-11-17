package com.adoregeek.videosplash;

import android.app.Application;

import com.adoregeek.videosplash.common.util.AppLog;


/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppLog.init();
    }

}
