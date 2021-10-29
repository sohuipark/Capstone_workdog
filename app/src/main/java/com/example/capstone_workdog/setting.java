package com.example.capstone_workdog;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;

public class setting extends PreferenceFragmentCompat {
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
//        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.setting);


//        하단 내용은 알림 내부로 들어갈 예정임!
//                <CheckBoxPreference
//        android:title="알림 설정"
//        android:defaultValue="false"
//        android:key="Ringing"/>
//        <SwitchPreference
//        android:key="sound"
//        android:title="소리"
//        android:dependency="Ringing"/>
//        <SwitchPreference
//        android:key="message"
//        android:title="진동"
//        android:dependency="Ringing"/>
    }
}