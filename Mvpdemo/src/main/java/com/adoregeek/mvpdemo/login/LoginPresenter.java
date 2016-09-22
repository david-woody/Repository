package com.adoregeek.mvpdemo.login;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/9/22 0022.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View mView;

    @Inject
    public LoginPresenter(LoginContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void start() {

    }
}
