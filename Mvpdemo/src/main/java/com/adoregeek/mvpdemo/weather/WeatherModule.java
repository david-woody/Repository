package com.adoregeek.mvpdemo.weather;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
@Module
public class WeatherModule {
    private WeatherContract.View mView;

    public WeatherModule(WeatherContract.View mView) {
        this.mView = mView;
    }

    @Provides
    WeatherContract.View provideView() {
        return mView;
    }
}
