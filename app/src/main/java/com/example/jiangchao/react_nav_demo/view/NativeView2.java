package com.example.jiangchao.react_nav_demo.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.jiangchao.react_nav_demo.R;

/**
 * Created by jiangchao on 9/6/16.
 */
public class NativeView2 extends LinearLayout {
    private View rootView;
    public NativeView2(Context context) {
        this(context, null);
    }

    public NativeView2(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NativeView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initReactView(context);
    }

    private void initReactView(Context ctx)
    {
        Log.d(NativeView2.class.getSimpleName(), "hahahahahahahaha:initReactView");
        setBackgroundColor(Color.parseColor("#424242"));
        rootView = LayoutInflater.from(ctx).inflate(R.layout.native_view2, this, true);
    }

}
