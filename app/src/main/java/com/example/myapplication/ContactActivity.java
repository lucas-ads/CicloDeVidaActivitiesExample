package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Log.i("LOG_LIFECICLE", "ContactActivity: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOG_LIFECICLE", "ContactActivity: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOG_LIFECICLE", "ContactActivity: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOG_LIFECICLE", "ContactActivity: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LOG_LIFECICLE", "ContactActivity: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOG_LIFECICLE", "ContactActivity: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LOG_LIFECICLE", "ContactActivity: onRestart");
    }
}