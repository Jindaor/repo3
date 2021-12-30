package com.qimo.graduationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class NewsActivity extends AppCompatActivity {

    private ListView mLvNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        mLvNews = findViewById(R.id.lv_news);
        mLvNews.setAdapter(new NewsAdapter(NewsActivity.this));
    }
}