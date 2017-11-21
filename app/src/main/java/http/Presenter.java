package http;

import android.content.Context;

import bean.CodeMode;
import bean.HomeModel;
import bean.Login;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;


/**
 * Created by Hao on 2017/11/2.
 * 网络请求类
 */

public class Presenter {
    //登录
    public static void login(String phone, String code, Context context, final CallBack callback) {
         RetrofitFactory.getInstence().API().login(phone, code)
                .subscribeOn(Schedulers.io())//指定Observable(被观察者)所在的线程，或者叫做事件产生的线程。
                .observeOn(AndroidSchedulers.mainThread())//切换到主线程 （observeOn(): 指定 Observer(观察者)所运行在的线程，或者叫做事件消费的线程。）
                .subscribe(new MySubscriber<Login>(context) {//订阅者
                    @Override
                    public void onNext(Login modelBaseEntity) {
                        //这里的book就是我们请求接口返回的实体类
                        callback.OnSuccess(modelBaseEntity);
                    }
                });


    }

    //获取验证码
    public static void code(String phone, String type, Context context, final CallBack callback) {
        RetrofitFactory.getInstence().API().Code(phone, type).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MySubscriber<CodeMode>(context) {//订阅者
                    @Override
                    public void onNext(CodeMode modelBaseEntity) {
                        //这里的book就是我们请求接口返回的实体类
                        callback.OnSuccess(modelBaseEntity);
                    }
                });
    }

    //首页列表
    public static  void  home_list(String lat,String lng,String order_by,int page,int per_page,Context context, final CallBack callback)
    {
        RetrofitFactory.getInstence().API().HomeList(lat, lng, order_by, page, per_page).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MySubscriber<HomeModel>(context) {//订阅者
                    @Override
                    public void onNext(HomeModel modelBaseEntity) {
                        //这里的book就是我们请求接口返回的实体类
                        callback.OnSuccess(modelBaseEntity);
                    }
                });
    }

    //上传头像
    public static  void  File(RequestBody file, Context context, final CallBack callback)
    {
        RetrofitFactory.getInstence().API().uploadFile(file).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MySubscriber<HomeModel>(context) {//订阅者
                    @Override
                    public void onNext(HomeModel modelBaseEntity) {
                        //这里的book就是我们请求接口返回的实体类
                        callback.OnSuccess(modelBaseEntity);
        }
       });
    }


}
