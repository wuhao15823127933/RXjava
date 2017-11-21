package ui.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.hao.rxjava.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.HomeModel;


/**
 * Created by Hao on 2017/8/17.
 * 首页适配器
 */

public class HomePageAdater extends BaseAdapter {
    List<HomeModel.DataBean> list;
    Context context;
    String str = "";

    public HomePageAdater(List<HomeModel.DataBean> list, Context context) {
        this.context = context;
        this.list = list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewhoder viewHolder = null;
        if (convertView == null) {
            viewHolder = new Viewhoder();
            convertView = LayoutInflater.from(context).inflate(R.layout.homepage_item, null);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.te_dstance = (TextView) convertView.findViewById(R.id.te_dstance);
            viewHolder.company = (TextView) convertView.findViewById(R.id.company);
            viewHolder.job = (TextView) convertView.findViewById(R.id.job);
            viewHolder.home_icon = (ImageView) convertView.findViewById(R.id.home_icon);
            viewHolder.te_resources = (TextView) convertView.findViewById(R.id.te_resources);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (Viewhoder) convertView.getTag();
        }


        if(TextUtils.isEmpty(list.get(position).getNickname()))
        {
            viewHolder.name.setText("暂无昵称");
        }else
            {
                viewHolder.name.setText(list.get(position).getNickname());//名称
            }

        //距离
        viewHolder.te_dstance.setText(list.get(position).getDistance() + "km");

        //公司
        if (TextUtils.isEmpty(list.get(position).getCompany())) {
            viewHolder.company.setText("无");
        } else {
            viewHolder.company.setText(list.get(position).getCompany());
        }

        //工作职位
        if (TextUtils.isEmpty(list.get(position).getJob())) {
            viewHolder.job.setText("无");
        } else {
            viewHolder.job.setText(list.get(position).getJob());
        }

        //图片
        Picasso.with(context).load(list.get(position).getHeadimgurl()).placeholder(R.mipmap.loadingxh).error(R.mipmap.icon)  .into(viewHolder.home_icon);
       //资源
        List<HomeModel.DataBean.ResourcesBean> L= list.get(position).getResources();
        if(L.size()==0)
        {
            viewHolder.te_resources.setText("暂无资源");
        }else
            {
                str = "";
            for (int i = 0; i < L.size(); i++) {
                str += L.get(i).getName()+ ",";
            }
            viewHolder.te_resources.setText("资源:" + str);
            }




        return convertView;
    }


    public class Viewhoder {
        TextView name, te_dstance, company, job, te_resources;
        ImageView home_icon;
    }
}
