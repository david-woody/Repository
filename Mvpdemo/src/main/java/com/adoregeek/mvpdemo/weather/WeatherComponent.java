package com.adoregeek.mvpdemo.weather;

import com.adoregeek.mvpdemo.ActivityScope;
import com.adoregeek.mvpdemo.baseComponent.NetComponent;

import dagger.Component;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
@ActivityScope
@Component(dependencies = NetComponent.class, modules = WeatherModule.class)
public interface WeatherComponent {
    void inject(WeatherActivity activity);
}
