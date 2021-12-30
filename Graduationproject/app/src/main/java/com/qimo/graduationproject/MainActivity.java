package com.qimo.graduationproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnNews;
    private Button mBtnPolicy;
    private Button mBtnResearchReport;
    private Button mBtnSpecialTopic;
    private ListView mLvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //设置监听
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnNews = findViewById(R.id.btn_news);
        mBtnPolicy = findViewById(R.id.btn_policy);
        mBtnResearchReport = findViewById(R.id.btn_researchReport);
        mBtnSpecialTopic = findViewById(R.id.btn_specialTopic);
        mLvMain = findViewById(R.id.lv_main);
        setListeners();
    }

    private void setListeners() {  //监听鼠标
        OnClick onClick = new OnClick();
        mBtnNews.setOnClickListener(onClick);
        mBtnPolicy.setOnClickListener(onClick);
        mBtnResearchReport.setOnClickListener(onClick);
        mBtnSpecialTopic.setOnClickListener(onClick);
        mLvMain.setAdapter(new NewsAdapter(MainActivity.this));
    }

    private class OnClick implements View.OnClickListener {
        //点击跳转

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                //跳转到最新消息界面
                case R.id.btn_news:
                    intent = new Intent(MainActivity.this,NewsActivity.class);
                    break;
                case R.id.btn_policy:
                    //跳转到政策界面
                    intent = new Intent(MainActivity.this,PolicyActivity.class);
                    break;
                case R.id.btn_researchReport:
                    //跳转到专题界面
                    intent = new Intent(MainActivity.this,ResearchReportActivity.class);
                    break;
                case R.id.btn_specialTopic:
                    //跳转到研报界面
                    intent = new Intent(MainActivity.this,SpecialTopicActivity.class);
                    break;
            }
            startActivity(intent);//开始跳转
        }
    }
}