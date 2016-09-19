package com.adoregeek.mvpdemo.weather.api;

import com.adoregeek.mvpdemo.weather.dao.WeatherResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/6/1.
 */
public interface WeatherApiService {
    @GET("weather")
    Observable<WeatherResponse> getWeather(@Query("id") String place, @Query("APPID") String appid);
}
