package com.adoregeek.mvpdemo.login;

import com.adoregeek.mvpdemo.PerActivity;
import com.adoregeek.mvpdemo.baseComponent.NetComponent;
import com.adoregeek.mvpdemo.weather.WeatherModule;

import dagger.Component;

/**
 * Created by Administrator on 2016/9/22 0022.
 */
@PerActivity
@Component(dependencies = NetComponent.class, modules = LoginModule.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
