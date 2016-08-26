package com.adoregeek.mvpdemo.common.util;

import com.adoregeek.mvpdemo.BuildConfig;
import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class AppLog {

    private static final String TAG = "MvpDemo";

    /**
     * initialize the logger.
     */
    public static void init() {
        Logger.init(TAG);
    }

    /**
     * log.i
     *
     * @param msg
     */
    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.i(msg);
        }
    }

    /**
     * log.d
     *
     * @param msg
     */
    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.d(msg);
        }
    }

    /**
     * log.d
     * @param map
     */
    public static void d(Object map) {
        if (BuildConfig.DEBUG) {
            Logger.d(map);
        }
    }

    /**
     * log.w
     *
     * @param msg
     */
    public static void w(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.w(msg);
        }
    }

    /**
     * log.e
     *
     * @param msg
     */
    public static void e(String msg) {
        Logger.e(msg);
    }


}