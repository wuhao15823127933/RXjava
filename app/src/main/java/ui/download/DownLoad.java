package ui.download;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.hao.rxjava.R;

import java.text.NumberFormat;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import zlc.season.rxdownload2.RxDownload;
import zlc.season.rxdownload2.entity.DownloadStatus;


/**
 * Created by Hao on 2017/11/15.
 * 文件下载
 */

public class DownLoad extends AppCompatActivity {
    Button download,stop_download;
    ProgressBar progressBar5;
    TextView text;
    String url = "http://36.189.255.155:9001/Resource/XinJiangRfid.apk";
    Disposable disposable;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download);
        download = (Button) findViewById(R.id.download);
        stop_download= (Button) findViewById(R.id.stop_download);
        progressBar5= (ProgressBar) findViewById(R.id.progressBar5);
        text= (TextView) findViewById(R.id.text);

        //开始下载
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 disposable =   RxDownload.getInstance(DownLoad.this).download(url)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<DownloadStatus>() {
                            @Override
                            public void accept(DownloadStatus status) throws Exception {
                                //DownloadStatus为下载进度
                                text.setText(status.getFormatStatusString());
                                String str=status.getPercent().replace("%","");
                                progressBar5.setProgress(Math.round(Float.parseFloat(str)));

                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                //下载失败
                                Log.e("wh","下载失败==="+throwable.getMessage());
                            }
                        }, new Action() {
                            @Override
                            public void run() throws Exception {
                                Log.e("wh","下载成功");


                            }
                        });

            }
        });

        //暂停下载
        stop_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (disposable != null && !disposable.isDisposed()) {
                    disposable.dispose();
                }
            }
        });
    }
}
