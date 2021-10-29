package com.example.capstone_workdog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //↓사용하려면 fragment나... 기타 다른 activity extend 필요
//        getSupportFragmentManager().beginTransaction()
//                .replace(android.R.id.content, new setting(), null).commit();

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabspecmap = tabHost.newTabSpec("map").setIndicator("맵");
        tabspecmap.setContent(R.id.map);
        tabHost.addTab(tabspecmap);

        TabHost.TabSpec tabspeccommu = tabHost.newTabSpec("community").setIndicator("커뮤니티");
        tabspeccommu.setContent(R.id.community);
        tabHost.addTab(tabspeccommu);

        //탭에서 액티비티를 사용할 수 있도록 인텐트 생성
        Intent intent = new Intent().setClass(this,setting.class);
        TabHost.TabSpec tabspecset = tabHost.newTabSpec("setting").setIndicator("설정"); //객체 생성 및 이름 설정
        tabspecset.setContent(intent);
        tabHost.addTab(tabspecset);

        tabHost.setCurrentTab(0);
    }
}