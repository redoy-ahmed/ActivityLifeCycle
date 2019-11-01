package com.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf("onCreate", "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.wtf("onStart", "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.wtf("onResume", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.wtf("onPause", "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.wtf("onStop", "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.wtf("onRestart", "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.wtf("onDestroy", "onDestroy called");
    }
}
