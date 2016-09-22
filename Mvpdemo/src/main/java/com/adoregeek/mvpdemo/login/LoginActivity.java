package com.adoregeek.mvpdemo.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.adoregeek.mvpdemo.BaseActivity;
import com.adoregeek.mvpdemo.MyApplication;
import com.adoregeek.mvpdemo.R;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/9/22 0022.
 */

public class LoginActivity extends BaseActivity implements LoginContract.View {
    @Inject
    LoginPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DaggerLoginComponent.builder()
                .loginModule(new LoginModule(this))
                .netComponent(((MyApplication) getApplication()).getNetComponent())
                .build().inject(this);
    }

    @Override
    public void showAvatar(String path) {

    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
