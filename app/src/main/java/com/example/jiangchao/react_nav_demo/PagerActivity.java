package com.example.jiangchao.react_nav_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;

import com.example.jiangchao.react_nav_demo.fragment.PagerFragment2;
import com.example.jiangchao.react_nav_demo.fragment.ReactPagerFragment1;
import com.example.jiangchao.react_nav_demo.fragment.ReactPagerFragment3;
import com.facebook.react.LifecycleState;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;

/**
 * Created by jiangchao on 9/6/16.
 */
public class PagerActivity extends FragmentActivity implements DefaultHardwareBackBtnHandler {
    private ReactInstanceManager mReactInstanceManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);
        mReactInstanceManager = ReactInstanceManager.builder()
                .setCurrentActivity(this)
                .setApplication(getApplication())
                .setBundleAssetName("index.android.bundle")
                .setJSMainModuleName("index.android")
                .addPackage(new MainReactPackage())
                .addPackage(new OursPackage())
//                .addPackage(new LinearGradientPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();
        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        AhPagerAdapter adapter = new AhPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
    }

    @Override protected void onResume() {
        super.onResume();
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onHostResume(this, this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onHostDestroy();
        }
    }

//    @Override
//    public void onBackPressed() {
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onBackPressed();
//        } else {
//            super.onBackPressed();
//        }
//    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_MENU && mReactInstanceManager != null) {
            mReactInstanceManager.showDevOptionsDialog();
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onHostPause();
        }
    }

    public ReactInstanceManager getReactInstanceManager()
    {
        return mReactInstanceManager;
    }

    @Override
    public void invokeDefaultOnBackPressed() {

    }

    public class AhPagerAdapter extends FragmentPagerAdapter {

        private final String[] TITLES = { "AAAAAA", "BBBBB", "CCCCCC" };

        public AhPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position)
            {
                case 0:
                    fragment = new ReactPagerFragment1();
                    break;
                case 1:
                    fragment = new PagerFragment2();
                    break;
                case 2:
                    fragment = new ReactPagerFragment3();
                    break;
            }
            return fragment;
        }

    }
}
