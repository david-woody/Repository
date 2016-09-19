package com.adoregeek.mvpdemo.baseComponent;

import com.adoregeek.mvpdemo.baseModule.AppModule;
import com.adoregeek.mvpdemo.baseModule.NetModule;
import com.adoregeek.mvpdemo.weather.WeatherActivity;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit getRetrofit();
}
