package com.adoregeek.videosplash.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.VideoView;

import com.adoregeek.videosplash.R;
import com.adoregeek.videosplash.common.util.AppLog;

/**
 * Created by Administrator on 2016/11/17 0017.
 */

public class CustomVideoView extends VideoView {
    public CustomVideoView(Context context) {
        this(context, null);
    }

    public CustomVideoView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    private boolean repeatable;
    private int videoRes;
    private Uri videoUri;

    public CustomVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomVideoView);

        repeatable = ta.getBoolean(R.styleable.CustomVideoView_repeatable, false);
        videoRes = ta.getResourceId(R.styleable.CustomVideoView_videoUri, -1);
        ta.recycle();
        videoUri = Uri.parse("android.resource://" + context.getPackageName() + "/" + videoRes);
        playVideo();
    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));)
//    }

    public void playVideo() {
        if (videoUri == null) {
            throw new IllegalArgumentException("Uri can not be null");
        }
        //设置播放路径
        setVideoURI(videoUri);
        start();
        setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //设置循环播放
                mp.setLooping(true);
            }
        });
        setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                return true;
            }
        });

    }

}
