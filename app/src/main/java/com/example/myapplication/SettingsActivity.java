package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Log.i("LOG_LIFECICLE", "SettingsActivity: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOG_LIFECICLE", "SettingsActivity: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOG_LIFECICLE", "SettingsActivity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOG_LIFECICLE", "SettingsActivity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LOG_LIFECICLE", "SettingsActivity: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOG_LIFECICLE", "SettingsActivity: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LOG_LIFECICLE", "SettingsActivity: onRestart");
    }
}