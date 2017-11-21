package ui.rxbinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import com.blankj.utilcode.util.ToastUtils;
import com.example.hao.rxjava.R;
import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxCompoundButton;
import com.jakewharton.rxbinding2.widget.RxTextView;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import bean.HomeModel;
import http.CallBack;
import http.MySubscriber;
import http.Presenter;
import http.RetrofitFactory;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.HttpException;
import ui.adapter.HomePageAdater;
import ui.login.LoginActivity;


/**
 * Created by Hao on 2017/11/13.
 * 使用RxBinding规范而强大的安卓UI响应式编程（点击事件的监听、实现搜索请求）
 */

public class RxBinding extends AppCompatActivity {
    EditText ed_fitersearch;
    Button login,time;
    CheckBox check;
    ListView filter_search_listview;
    List<HomeModel.DataBean> list1 = new ArrayList<>();
    List<HomeModel.DataBean> l = new ArrayList<>();
    HomePageAdater homePageAdater;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rxbinding);
        ed_fitersearch = (EditText) findViewById(R.id.ed_fitersearch);
        filter_search_listview = (ListView) findViewById(R.id.filter_search_listview);
        login = (Button) findViewById(R.id.login);
        check = (CheckBox) findViewById(R.id.check);
        time= (Button) findViewById(R.id.time);
        //初始化数据源
        homePageAdater = new HomePageAdater(list1, RxBinding.this);
        filter_search_listview.setAdapter(homePageAdater);



        //点击倒计时监听
        RxView.clicks(time).throttleFirst(60, TimeUnit.SECONDS)//60S后可以再次发送
                .subscribe(new Observer() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Object o) {
                        Log.e("wh", "开始倒计时");
                        Observable.interval(1, TimeUnit.SECONDS, AndroidSchedulers.mainThread())
                                .take(60)
                                .subscribe(new Observer<Long>() {

                                    @Override
                                    public void onSubscribe(@NonNull Disposable d) {

                                    }

                                    @Override
                                    public void onNext(@NonNull Long aLong) {
                                        time.setText(60 - aLong + "S后可发送");
                                    }

                                    @Override
                                    public void onError(@NonNull Throwable e) {

                                    }

                                    @Override
                                    public void onComplete() {
                                        time.setText("发送验证码");

                                    }
                                });
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


        //单选框的监听
        RxCompoundButton.checkedChanges(check)
                .subscribe(new Observer<Boolean>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(Boolean aBoolean) {
                login.setEnabled(aBoolean);
                login.setBackgroundResource(aBoolean ? R.color.button_yes : R.color.button_no);
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {

            }

        });


        //搜索框实时请求
        RxTextView.textChanges(ed_fitersearch)
                //当你敲完字之后停下来的半秒就会执行下面语句
                .debounce(500, TimeUnit.MILLISECONDS)
                .switchMap(new Function<CharSequence, Observable<HomeModel>>() {
                    @Override
                    public Observable<HomeModel> apply(@NonNull CharSequence charSequence) throws Exception {
                        if(!charSequence.toString().equals(""))
                        {
                            return RetrofitFactory.getInstence().API().Search_list(charSequence.toString(), "9999", "user_name");
                        }else
                            {
                                return RetrofitFactory.getInstence().API().Search_list("null", "9999", "user_name");
                            }

                    }
                })
                //网络请求是在子线程的
                .subscribeOn(Schedulers.io())
                //界面更新在主线程
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("wh","===+onSubscribe");
                    }

                    @Override
                    public void onNext(HomeModel homeModel) {
                        if (homeModel.getCode() == 110) {
                            ToastUtils.showShort(homeModel.getMsg());
                            Intent intent = new Intent(RxBinding.this, LoginActivity.class);
                            startActivity(intent);
                        } else if (homeModel.getCode() == -1) {
                            ToastUtils.showShort(homeModel.getMsg());
                        } else if (homeModel.getCode() == 0) {
                            l = homeModel.getData();
                            if (l.size() == 0) {
                                ToastUtils.showShort("暂无数据");
                            } else {
                                list1.clear();
                                list1.addAll(l);
                                homePageAdater.notifyDataSetChanged();
                            }
                        }
                    }
                    @Override
                    public void onError(Throwable e) {

                        Log.e("wh","===+onError"+e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        Log.e("wh","===+onComplete");
                    }

                });

    }


}
