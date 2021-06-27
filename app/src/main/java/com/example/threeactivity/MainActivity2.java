package com.example.threeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button mbtnLaunchSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mbtnLaunchSecondActivity=findViewById(R.id.btnLaunchSecondActivity);
        mbtnLaunchSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,"Button clicked",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        Log.d("MainActivity","OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity2","OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity2","OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity2","OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity2","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity2","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity2","OnDestroy");
    }
}