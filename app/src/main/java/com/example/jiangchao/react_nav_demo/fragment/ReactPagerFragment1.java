package com.example.jiangchao.react_nav_demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jiangchao.react_nav_demo.PagerActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;

/**
 * Created by jiangchao on 9/6/16.
 */
public class ReactPagerFragment1 extends Fragment {
    private ReactRootView mReactRootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mReactRootView = new ReactRootView(getActivity());
        mReactRootView.startReactApplication(((PagerActivity) getActivity()).getReactInstanceManager(), "RPager1", null);
        return mReactRootView;
    }
}
