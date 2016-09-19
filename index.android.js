'use strict'

import React from 'react';
import { AppRegistry, StyleSheet } from 'react-native';

// React的Navigator
 import NavDemo from './javascript/NavDemo';
// React的ViewPager，内嵌两个React的js View和一个用js包了一下的原生View
 import ReactPager from './javascript/ReactPager';
// 原生ViewPager，内嵌两个React的Fragment和一个原生的Fragment
import RPager1 from './javascript/RPager1'
 AppRegistry.registerComponent('NavDemo', () => NavDemo);

 class Index extends React.Component {
     render() {
         return (
             <ReactPager style={styles.container} {...this.props}/>
         );
     }
 }

AppRegistry.registerComponent('ReactPager', () => Index);
AppRegistry.registerComponent('RPager1', () => RPager1);

var styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
    },
    hello: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
});
