package com.jianglin.modulecommon;

import android.os.Bundle;

import com.jianglin.common.BaseActivity;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected String tag() {
        return TAG;
    }


}