package com.adoregeek.mvpdemo.weather;

import com.adoregeek.mvpdemo.BasePresenter;
import com.adoregeek.mvpdemo.BaseView;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
public interface WeatherContract {
        interface View extends BaseView<Presenter>{

        }

        interface Presenter extends BasePresenter{
             void   loadData();
        }

}
