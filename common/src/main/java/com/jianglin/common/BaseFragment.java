package com.jianglin.common;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    private static final String TAG = "BaseFragment";

    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "[NAIPIQ]onCreate: " + tag());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "[NAIPIQ]onCreateView: " + tag());
        return inflater.inflate(getLayout(), container, false);
    }

    @LayoutRes
    protected abstract int getLayout();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "[NAIPIQ]onDestroyView: " + tag());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "[NAIPIQ]onDestroy: " + tag());
    }

    protected String tag() {
        return TAG;
    }
}