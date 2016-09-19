import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
  name: 'NativeView2',
  propTypes: {
    ...View.propTypes // 包含默认的View的属性
  },
};

console.log("NView2,NView2,NView2,NView2,NView2//////////////");

module.exports = requireNativeComponent('NativeView2', iface);
