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

public class MainActivity extends AppCompatActivity implements AddFragment.OnFragmentInteractionListener, ReplaceFragment.OnFragmentInteractionListener {
    private static final String TAG = MainActivity.class.getSimpleName();

    private int addClickCount = 0;
    private int replaceClickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf(TAG, "onCreate called");

        Button buttonAdd = findViewById(R.id.addFragmentButton);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addClickCount++;
                Fragment fragment = AddFragment.newInstance("MainActivity", "AddFragmentClicked" + addClickCount);
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.addFragmentContainer, fragment, AddFragment.class.getSimpleName());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        Button buttonReplace = findViewById(R.id.replaceFragmentButton);
        buttonReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceClickCount++;
                Fragment fragment = ReplaceFragment.newInstance("MainActivity", "ReplaceFragmentClicked" + replaceClickCount);
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.replaceFragmentContainer, fragment, ReplaceFragment.class.getSimpleName());
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
