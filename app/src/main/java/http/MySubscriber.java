package http;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.hao.rxjava.App;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.HttpException;
import uitl.MakeLoading;
import uitl.NetworkUtil;

/**
 * Created by Hao on 2017/11/3.
 * <p>
 * 重写实现订阅者 （用于封装网络状态、加载框）
 */

public class MySubscriber<T> implements Observer<T> {
    private MakeLoading dialog;
    private static final int UNAUTHORIZED = 401;
    private static final int FORBIDDEN = 403;
    private static final int NOT_FOUND = 404;
    private static final int REQUEST_TIMEOUT = 408;
    private static final int INTERNAL_SERVER_ERROR = 500;
    private static final int BAD_GATEWAY = 502;
    private static final int SERVICE_UNAVAILABLE = 503;
    private static final int GATEWAY_TIMEOUT = 504;

    public MySubscriber(Context context) {
        try {
            dialog = new MakeLoading(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onSubscribe(Disposable d) {
        if (!NetworkUtil.isNetworkAvailable(App.getmContext())) {
            Toast.makeText(App.getmContext(), "网络不可用", Toast.LENGTH_SHORT).show();
        } else {
            if (dialog != null && !dialog.isShowing()) {
                dialog.show();
            }
        }
    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        //异常判断
        if(e instanceof HttpException){
            //获取对应statusCode和Message
            HttpException exception = (HttpException)e;
            int code = exception.response().code();
            Log.e("wh","code==="+code);
            switch (code) {
                case UNAUTHORIZED:
                    Log.e("wh","未经授权的=="+UNAUTHORIZED);
                    break;
                case FORBIDDEN:
                    Log.e("wh","被禁止的=="+FORBIDDEN);
                    break;
                case NOT_FOUND:
                    Log.e("wh","没有找到=="+NOT_FOUND);
                    break;
                case REQUEST_TIMEOUT:
                    Log.e("wh","请求超时=="+REQUEST_TIMEOUT);
                    break;
                case GATEWAY_TIMEOUT:
                    Log.e("wh","网关超时=="+GATEWAY_TIMEOUT);
                    break;
                case INTERNAL_SERVER_ERROR:
                    Log.e("wh","内部服务器错误=="+INTERNAL_SERVER_ERROR);
                    break;
                case BAD_GATEWAY:
                    Log.e("wh","错误的网关=="+BAD_GATEWAY);
                    break;
                case SERVICE_UNAVAILABLE:
                    Log.e("wh","服务不可用=="+SERVICE_UNAVAILABLE);
                    break;

            }
        }

    }

    @Override
    public void onComplete() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
