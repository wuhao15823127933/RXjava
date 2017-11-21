package ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.example.hao.rxjava.R;
import com.jakewharton.rxbinding2.widget.RxTextView;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import bean.CodeMode;
import bean.Login;
import http.CallBack;
import http.Presenter;
import http.RetrofitFactory;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import ui.MainActivity;
import ui.rxbinding.RxBinding;
import ui.upload.Upload;
import uitl.ActionSP;

import static android.text.TextUtils.isEmpty;
import static android.util.Patterns.EMAIL_ADDRESS;


/**
 * Created by Hao on 2017/11/8.
 登录
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    TextView zhuce;
    EditText ed_phone, ed_code;
    Button bt_login;
    Intent intent;
    ImageView clear;
    String phone, code;
    TextView login_code, login_back;

    private TimeCount time;
     
	 
 
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        init();
    }

    public void init() {
        time = new TimeCount(60000, 1000);
        zhuce = (TextView) findViewById(R.id.zhuce);
        ed_phone = (EditText) findViewById(R.id.ed_phone);
        ed_code = (EditText) findViewById(R.id.ed_code);
        bt_login = (Button) findViewById(R.id.bt_login);
        clear = (ImageView) findViewById(R.id.clear);
        login_code = (TextView) findViewById(R.id.login_code);
        login_back = (TextView) findViewById(R.id.login_back);
        zhuce.setOnClickListener(this);
        bt_login.setOnClickListener(this);
        clear.setOnClickListener(this);
        login_code.setOnClickListener(this);
        login_back.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.login_back:
                finish();
                break;
            case R.id.clear:
                ed_phone.setText("");
                break;
            case R.id.zhuce:

                break;
            //获取验证码
            case R.id.login_code:
                phone = ed_phone.getText().toString();
                if (isEmpty(phone)) {
                    ToastUtils.showShort("请输入手机号");
                } else {
                    if (RegexUtils.isMobileExact(phone)) {
                        // 开始计时
                        time.start();
                        code(phone, "1");
                    } else {
                        ToastUtils.showShort("手机号格式错误");
                    }
                }
                break;

            //登录
            case R.id.bt_login:
                phone = ed_phone.getText().toString();
                code = ed_code.getText().toString();
                if (isEmpty(phone) || isEmpty(code)) {
                    ToastUtils.showShort("信息填写完整");
                } else {
                    if (RegexUtils.isMobileExact(phone)) {
                        login(phone, code);
                    } else {
                        ToastUtils.showShort("手机号格式错误");
                    }

                }

                break;
        }
    }

    //登录
    public void login(String phone, String code) {
        Presenter.login(phone, code, LoginActivity.this, new CallBack() {
            @Override
            public void OnSuccess(Object data) {
                Login login = (Login) data;

                if (login.getCode() == 0) {
                    Login.DataBean l = login.getData();
                    SPUtils.getInstance().put(ActionSP.Token, l.getAccess_token());
                    ToastUtils.showShort("登录成功");
                    intent=new Intent(LoginActivity.this, RxBinding.class);
                    startActivity(intent);
                    finish();

                    RetrofitFactory.getInstence_Token();

                } else if (login.getCode() == 220) {
                    ToastUtils.showShort(login.getMsg());
                } else if (login.getCode() == -1) {
                    ToastUtils.showShort(login.getMsg());
                }
            }
        });

    }


    public void code(String phone, String tyepe) {
        Presenter.code(phone, tyepe, LoginActivity.this, new CallBack() {
            @Override
            public void OnSuccess(Object data) {
                CodeMode code = (CodeMode) data;

                if (code.getCode() == 0) {
                    ToastUtils.showShort("已发送");
                } else {
                    ToastUtils.showShort(code.getMsg());
                }
            }
        });
    }

    /**
     * 验证码倒计时
     */

    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        // 计时过程
        @Override
        public void onTick(long millisUntilFinished) {
            if (!LoginActivity.this.isFinishing()) {
                login_code.setClickable(false);//防止重复点击
                login_code.setText(millisUntilFinished / 1000 + "s");
            }


        }


        //计时完毕
        @Override
        public void onFinish() {
            login_code.setText("获取验证码");
            login_code.setClickable(true);


        }
    }

    @Override
    public void onDestroy() {
        if (time != null) {
            time.cancel();
            time = null;
        }
        super.onDestroy();
    }
}
