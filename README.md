## init步骤
```
1、安装python、node、watchman
参照https://facebook.github.io/react-native/docs/getting-started.html
2、根目录执行npm install
参照https://facebook.github.io/react-native/docs/integration-with-existing-apps.html
3、根目录执行react-native start
```

## dev&release
```
DEV
1、App设置开启悬浮窗权限
2、Menu Dev输入$IP:8081
RELEASE
1、react-native bundle --entry-file index.android.js --bundle-output ./react_nav_demo/assets/index.android.bundle --platform android --assets-dest ./react_nav_demo/res/ --dev false
2、MainActivity setUseDeveloperSupport(false)
```


## issues
```
1、...Watchman needs your help!...increase the fs.inotify.max_user_watches sysctl
watchman watch-del-all
watchman shutdown-server
如果还不行
echo 256 | sudo tee -a /proc/sys/fs/inotify/max_user_instances
echo 32768 | sudo tee -a /proc/sys/fs/inotify/max_queued_events
echo 65536 | sudo tee -a /proc/sys/fs/inotify/max_user_watches
watchman shutdown-server

参考
https://facebook.github.io/watchman/docs/troubleshooting.html#poison-inotify-add-watch
https://github.com/facebook/react-native/issues/3199
```
