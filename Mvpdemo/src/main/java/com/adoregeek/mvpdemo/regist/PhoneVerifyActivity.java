package com.adoregeek.mvpdemo.regist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.adoregeek.mvpdemo.BaseActivity;
import com.adoregeek.mvpdemo.R;

/**
 * Created by Administrator on 2016/11/9 0009.
 */

public class PhoneVerifyActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verify);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
