package com.adoregeek.mvpdemo.weather;

import com.adoregeek.mvpdemo.C;
import com.adoregeek.mvpdemo.common.util.AppLog;
import com.adoregeek.mvpdemo.weather.api.WeatherManager;
import com.adoregeek.mvpdemo.weather.dao.WeatherResponse;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class WeatherPresenter implements WeatherContract.Presenter {
    private WeatherContract.View mView;
    private WeatherManager mWeatherManager;

    @Inject
    public WeatherPresenter(WeatherContract.View mView, WeatherManager mWeatherManager) {
        this.mView = mView;
        this.mWeatherManager = mWeatherManager;
    }

    @Override
    public void start() {

    }

    @Override
    public void loadData() {
        mWeatherManager.getWeatherByCityId("1790923")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherResponse>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(WeatherResponse weatherResponse) {
                        AppLog.d(weatherResponse.toString());
                        mView.showWeatherIcon(String.format(C.Weather.WeatherIcon, weatherResponse.weather.get(0).icon));
                    }
                });
    }
}
