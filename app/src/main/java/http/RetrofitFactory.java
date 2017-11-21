package http;

import android.app.Application;
import android.util.Log;

import com.blankj.utilcode.util.SPUtils;
import com.example.hao.rxjava.App;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import uitl.ActionSP;

/**
 * Created by Hao on 2017/11/1.
 * 配置请求
 */

public class RetrofitFactory {
    private static RetrofitFactory mRetrofitFactory;
    private static APIFunction mAPIFunction;

    /**
     * 设置请求头
     */
    private static Interceptor addHeaderInterceptor() {
        Log.e("wh", "请求头进来了===" + SPUtils.getInstance().getString(ActionSP.Token));
        HttpCommonInterceptor commonInterceptor = new HttpCommonInterceptor.Builder()
                .addHeaderParams("Authorization", SPUtils.getInstance().getString(ActionSP.Token))
                .build();
        return commonInterceptor;
    }

    /**
     * 设置公共参数
     */
    private static Interceptor addQueryParameterInterceptor() {
        Log.e("wh", "公共参数进来了");
        Interceptor addQueryParameterInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                Request request;
                HttpUrl modifiedUrl = originalRequest.url().newBuilder()
                        .addQueryParameter("platform", "Android")
                        .build();
                request = originalRequest.newBuilder().url(modifiedUrl).build();
                return chain.proceed(request);
            }
        };
        return addQueryParameterInterceptor;
    }

    public RetrofitFactory() {
        //添加一个log拦截器,打印所有的log
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.e("wh", message);
            }
        });
        //可以设置请求过滤的水平,body,basic,headers
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //设置 请求的缓存的大小跟位置
        File cacheFile = new File(App.getmContext().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 50); //50Mb 缓存的大小

        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)//设置连接超时时间
                .readTimeout(601, TimeUnit.SECONDS)//设置读取超时时间
                .writeTimeout(601, TimeUnit.SECONDS)//设置写入超时时间
                .addInterceptor(addHeaderInterceptor())// token过滤
                .addInterceptor(httpLoggingInterceptor)//日志拦截
                .addInterceptor(addQueryParameterInterceptor())  //公共参数添加参数添加
                .cache(cache)  //添加缓存
                .build();//添加日志拦截器

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl("http://sdp.hzsb365.com")//这里相当于是域名
                .addConverterFactory(GsonConverterFactory.create())//添加gson转换器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//添加rxjava转换器
                .client(mOkHttpClient)
                .build();

        //我们需要用Retrofit创建一个BlogService的代理对象。
        mAPIFunction = mRetrofit.create(APIFunction.class);

    }

    public static RetrofitFactory getInstence() {
        if (mRetrofitFactory == null) {
            synchronized (RetrofitFactory.class) {
                if (mRetrofitFactory == null) {
                    mRetrofitFactory = new RetrofitFactory();
                }
            }
        }
        return mRetrofitFactory;
    }


    //这个只是在登录成功的时候重新去实例化RetrofitFactory这个类，  因为每次登录的token都不一样  要去重新更新token
    public static RetrofitFactory getInstence_Token() {
        mRetrofitFactory = new RetrofitFactory();
        return mRetrofitFactory;
    }


    public APIFunction API() {
        return mAPIFunction;
    }
}
