package com.example.jiangchao.react_nav_demo.view;

import android.util.Log;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by jiangchao on 9/6/16.
 */
public class NativeView2Manager extends SimpleViewManager<NativeView2> {
    private static final String NATIVE_VIEW2 = "NativeView2";

    @Override
    public String getName() {
        return NATIVE_VIEW2;
    }

    @Override
    protected NativeView2 createViewInstance(ThemedReactContext reactContext) {
        return new NativeView2(reactContext.getBaseContext());
    }
}
