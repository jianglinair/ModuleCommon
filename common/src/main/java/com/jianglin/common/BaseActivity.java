package com.jianglin.common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "[NAIPIQ]onCreate: " + tag());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "[NAIPIQ]onStart: " + tag());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "[NAIPIQ]onResume: "  + tag());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "[NAIPIQ]onPause: " + tag());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "[NAIPIQ]onStop: " + tag());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "[NAIPIQ]onDestroy: " + tag());
    }

    protected String tag() {
        return TAG;
    }
}