package com.adoregeek.mvpdemo;

import android.app.Application;

import com.adoregeek.mvpdemo.baseComponent.DaggerNetComponent;
import com.adoregeek.mvpdemo.baseComponent.NetComponent;
import com.adoregeek.mvpdemo.baseModule.AppModule;
import com.adoregeek.mvpdemo.baseModule.NetModule;
import com.adoregeek.mvpdemo.common.util.AppLog;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class MyApplication extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        AppLog.init();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("https://api.github.com"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
