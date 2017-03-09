package com.example.administrator.videonews.activity;


import android.os.Bundle;
import android.widget.Button;

import com.example.administrator.videonews.R;
import com.example.administrator.videonews.base.MyBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends MyBaseActivity {
    @BindView(R.id.mai_but) Button mai_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定到Activity上
        ButterKnife.bind(this);
        mai_but.setText("大傻逼");

    }

}
