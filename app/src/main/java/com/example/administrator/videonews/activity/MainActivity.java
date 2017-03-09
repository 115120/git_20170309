package com.example.administrator.videonews.activity;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import com.example.administrator.videonews.R;
import com.example.administrator.videonews.base.MyBaseActivity;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends MyBaseActivity {
    private Unbinder unbinder;
    @BindView(R.id.mai_but)
    Button mai_but;
    @BindView(R.id.mai_but)
    Button mai_but1;
    @BindView(R.id.mai_but)
    Button mai_but2;
    //绑定视图列表
    @BindViews({R.id.mai_but, R.id.mai_but1, R.id.mai_but2})
    List<Button> buttons;
    //资源绑定
    @BindString(R.string.app_name)
    String app_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定到Activity上
        unbinder = ButterKnife.bind(this);
        mai_but.setText("大傻逼");
        //统一操作视图集合
        ButterKnife.apply(buttons, new ButterKnife.Action<Button>() {

            @Override
            public void apply(@NonNull Button view, int index) {

            }
        });
    }

    @OnClick({R.id.mai_but, R.id.mai_but1, R.id.mai_but2})
    public void aa(View view) {//必须用public修饰
        switch (view.getId()) {
            case R.id.mai_but:
                break;
            case R.id.mai_but1:
                break;
            case R.id.mai_but2:
                break;
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();//视图销毁时，解绑。
    }
}
