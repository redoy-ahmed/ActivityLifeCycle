package com.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class SomeActivity extends AppCompatActivity {
    private static final String TAG = SomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(TAG);

        Log.wtf(TAG, "onCreate called");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.wtf(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.wtf(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.wtf(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.wtf(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.wtf(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.wtf(TAG, "onDestroy called");
    }
}
