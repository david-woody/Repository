package com.adoregeek.mvpdemo.weather;

import com.adoregeek.mvpdemo.weather.api.WeatherApiService;
import com.adoregeek.mvpdemo.weather.api.WeatherManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

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

    @Provides
    WeatherApiService providesWeatherApiService(Retrofit retrofit) {
        return retrofit.create(WeatherApiService.class);
    }

    @Provides
    WeatherManager prvoidesWeatherManager(WeatherApiService weatherApiService) {
        return new WeatherManager(weatherApiService);
    }
}
