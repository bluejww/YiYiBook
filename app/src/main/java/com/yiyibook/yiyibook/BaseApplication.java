package com.yiyibook.yiyibook;

import android.app.Application;

import com.yanzhenjie.nohttp.Logger;
import com.yanzhenjie.nohttp.NoHttp;
import com.yanzhenjie.nohttp.OkHttpNetworkExecutor;
import com.yanzhenjie.nohttp.cache.DBCacheStore;

/**
 * Created by jianweiwei on 2018/4/1.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        NoHttp.Config config = new NoHttp.Config().setCacheStore(new DBCacheStore(this).
//                setEnable(false)).//设置不使用缓存
//                setNetworkExecutor(new OkHttpNetworkExecutor()//设置使用okhttp做访问
//                );
        NoHttp.initialize(this);//nohttp默认初始化
        Logger.setDebug(true);
        Logger.setTag("Ingernet request/response data :  ");
    }
}
