package com.adoregeek.mvpdemo.weather;

import com.adoregeek.mvpdemo.common.util.AppLog;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class WeatherPresenter implements WeatherContract.Presenter {
    private WeatherContract.View mView;
    private Retrofit mRetrofit;

    @Inject
    public WeatherPresenter(WeatherContract.View mView, Retrofit retrofit) {
        this.mView = mView;
        this.mRetrofit = retrofit;
    }

    @Override
    public void start() {

    }

    @Override
    public void loadData() {
        AppLog.d(mRetrofit.baseUrl().url());
    }
}
