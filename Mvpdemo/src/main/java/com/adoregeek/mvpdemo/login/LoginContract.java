package com.adoregeek.mvpdemo.login;

import com.adoregeek.mvpdemo.BasePresenter;
import com.adoregeek.mvpdemo.BaseView;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void showAvatar(String path);
    }

    interface Presenter extends BasePresenter {
        void loadData();
    }

}
