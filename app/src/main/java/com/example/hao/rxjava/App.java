package com.example.hao.rxjava;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.Utils;

/**
 * Created by Hao on 2017/11/2.
 */

public class App extends Application{
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        //工具类
        Utils.init(this);
    }
    /**
     * @return
     * 全局的上下文
     */
    public static Context getmContext() {
        return mContext;
    }


}
