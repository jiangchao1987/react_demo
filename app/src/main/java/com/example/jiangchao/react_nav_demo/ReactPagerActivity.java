package com.example.jiangchao.react_nav_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

import com.facebook.react.LifecycleState;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;

/**
 * Created by jiangchao on 9/6/16.
 */
public class ReactPagerActivity extends FragmentActivity implements DefaultHardwareBackBtnHandler {
    private ReactRootView mReactRootView;
    private ReactInstanceManager mReactInstanceManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.react_activity_pager);
        mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setBundleAssetName("index.android.bundle")
                .setJSMainModuleName("index.android")
                .addPackage(new MainReactPackage())
                .addPackage(new OursPackage())
//                .addPackage(new LinearGradientPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();
        mReactRootView = (ReactRootView)findViewById(R.id.reactview);
        Bundle bundle = new Bundle();
//        bundle.putString("config", "\"ak\": \"av\"\n");
        bundle.putString("cfg", "{\"code\":200,\"msg\":\"成功\",\"data\":{\"tab_bg_url\":\"http://cdn.fds.api.xiaomi.com/b2c-bbs/cn/BbsApp/icon/main_bottom_tab_bg.png\",\"tabs\":[{\"icon_n_url\":\"http://cdn.fds.api.xiaomi.com/b2c-bbs/cn/BbsApp/icon/home_normal.png\",\"icon_p_url\":\"http://cdn.fds.api.xiaomi.com/b2c-bbs/cn/BbsApp/icon/home_selected.png\",\"is_show\":true,\"type\":\"home\",\"name\":\"首页\"},{\"icon_n_url\":\"http://cdn.fds.api.xiaomi.com/b2c-bbs/cn/BbsApp/icon/gallery_normal.png\",\"icon_p_url\":\"http://cdn.fds.api.xiaomi.com/b2c-bbs/cn/BbsApp/icon/gallery_selected.png\",\"is_show\":true,\"type\":\"gallery\",\"name\":\"摄影馆\"},{\"icon_n_url\":\"http://cdn.fds.api.xiaomi.com/b2c-bbs/cn/BbsApp/icon/mine_normal.png\",\"icon_p_url\":\"http://cdn.fds.api.xiaomi.com/b2c-bbs/cn/BbsApp/icon/mine_selected.png\",\"is_show\":true,\"type\":\"user_central\",\"name\":\"我的\"}]}}");
        mReactRootView.startReactApplication(mReactInstanceManager, "ReactPager", bundle);
    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onHostPause();
        }
    }

    @Override
    protected void onResume() {
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

    @Override
    public void onBackPressed() {
        if (mReactInstanceManager != null) {
            mReactInstanceManager.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_MENU && mReactInstanceManager != null) {
            mReactInstanceManager.showDevOptionsDialog();
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}
