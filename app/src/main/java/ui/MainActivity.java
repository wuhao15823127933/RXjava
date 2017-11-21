package ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.blankj.utilcode.util.ToastUtils;
import com.example.hao.rxjava.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import bean.HomeModel;
import http.CallBack;
import http.Presenter;
import ui.adapter.HomePageAdater;
import ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {
 


    ListView list;
    SmartRefreshLayout refreshLayout;//刷新控件
    int page = 1;
    List<HomeModel.DataBean> list1 = new ArrayList<>();
    List<HomeModel.DataBean> l = new ArrayList<>();
    HomePageAdater homePageAdater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        refreshLayout = (SmartRefreshLayout) findViewById(R.id.refreshLayout);
        //触发自动刷新
        refreshLayout.autoRefresh();
        //初始化数据源
        homePageAdater = new HomePageAdater(list1, MainActivity.this);
        list.setAdapter(homePageAdater);
        Home("0", "0", "distance", 1, 13);
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {

                page=1;
                refreshlayout.finishRefresh(2000);


            }
        });
        refreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadmore(2000);
            }
        });


    }


    public void Home(String lat, String lng, String order_by, int page, int per_page) {
        Presenter.home_list(lat, lng, order_by, page, per_page, MainActivity.this, new CallBack() {
            @Override
            public void OnSuccess(Object data) {
                HomeModel homeModel = (HomeModel) data;
                if (homeModel.getCode() == 110) {
                    ToastUtils.showShort(homeModel.getMsg());
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else if (homeModel.getCode() == -1) {
                    ToastUtils.showShort(homeModel.getMsg());
                } else if (homeModel.getCode() == 0) {
                    l = homeModel.getData();
                    if (l.size() == 0) {
                        ToastUtils.showShort("暂无数据");
                    } else {
                            list1.addAll(l);
                            homePageAdater.notifyDataSetChanged();
                        }
                    }



            }
        });

    }


}
