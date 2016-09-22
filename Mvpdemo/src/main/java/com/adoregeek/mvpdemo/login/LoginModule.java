package com.adoregeek.mvpdemo.login;

import com.adoregeek.mvpdemo.weather.api.WeatherApiService;
import com.adoregeek.mvpdemo.weather.api.WeatherManager;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2016/9/22 0022.
 */
@Module
public class LoginModule {

    private LoginContract.View mView;

    public LoginModule(LoginContract.View mView) {
        this.mView = mView;
    }

    @Provides
    LoginContract.View provideView(){
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
