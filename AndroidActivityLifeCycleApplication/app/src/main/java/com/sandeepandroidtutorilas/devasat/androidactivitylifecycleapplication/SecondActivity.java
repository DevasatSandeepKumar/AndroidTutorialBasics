package com.sandeepandroidtutorilas.devasat.androidactivitylifecycleapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends  Activity {
    String msg = "Android : ";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(msg, "The onCreate() event");
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_LONG).show();
    }

    /**
     * Called when the activity is about to become visible.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_LONG).show();

    }

    /**
     * Called when the activity has become visible.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_LONG).show();

    }

    /**
     * Called when another activity is taking focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_LONG).show();

    }

    /**
     * Called when the activity is no longer visible.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_LONG).show();

    }

    /**
     * Called just before the activity is destroyed.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_LONG).show();

    }
}