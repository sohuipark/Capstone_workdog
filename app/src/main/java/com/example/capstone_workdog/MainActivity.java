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

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;

        tabHost.addTab(tabHost.newTabSpec("setting_tab").setIndicator("setting")
        .setContent(new Intent(this,setting.class)));

        tabHost.setCurrentTab(0);
    }
}