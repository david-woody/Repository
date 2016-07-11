package com.adoregeek.wallpage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.adoregeek.wallpage.custom.CustomViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.cvp)
    CustomViewPager cvp;
    private int mTabCount = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        cvp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return SimpleFragment.newInstance("Position:" + position);
            }

            @Override
            public int getCount() {
                return mTabCount;
            }
        });
        cvp.setCurrentItem(2);
    }
}
