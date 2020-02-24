package com.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements SomeFragment.OnFragmentInteractionListener {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf(TAG, "onCreate called");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = SomeFragment.newInstance("a", "b");
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.container, fragment, SomeFragment.class.getSimpleName());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
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

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
