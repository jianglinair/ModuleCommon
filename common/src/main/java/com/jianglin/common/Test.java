package com.jianglin.common;

import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: Jianglin
 * Time: 2021/2/1
 * Description: todo
 *
 * @author jiang
 */
public class Test {
    private static final String TAG = "Test";

    public static void test() {
        Log.d(TAG, "[NAIPIQ]test: called");
        ARouter.debuggable();
    }
}
