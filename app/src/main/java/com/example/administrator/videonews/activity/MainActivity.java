package com.example.administrator.videonews.activity;


import android.os.Bundle;

import com.example.administrator.videonews.R;
import com.example.administrator.videonews.base.MyBaseActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends MyBaseActivity {
    private Unbinder unbinder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定到Activity上
        unbinder = ButterKnife.bind(this);

        initData();
    }

    private void initData() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();//视图销毁时，解绑。
    }
}
