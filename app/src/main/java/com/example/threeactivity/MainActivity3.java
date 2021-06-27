package com.example.threeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("MainActivity3","OnCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity3","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity3","OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity3","OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity3","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity3","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity3","OnDestroy");
    }
}