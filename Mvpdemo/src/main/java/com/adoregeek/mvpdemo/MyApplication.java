package com.adoregeek.mvpdemo;

import android.app.Application;

import com.adoregeek.mvpdemo.common.util.AppLog;

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
