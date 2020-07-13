package com.zxl.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        TextView textView =  findViewById(R.id.tvText);
        String flavor =  BuildConfig.FLAVOR;
        if ("ali".equals(flavor)){
            textView.setText("阿里巴巴欢迎您");
        }else if ("baidu".equals(flavor)){
            textView.setText("百度欢迎您");
        }else {
            textView.setText("获取渠道名失败");
        }
    }
}
