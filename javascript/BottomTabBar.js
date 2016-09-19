'use strict';

import React from 'react';

import {
    StyleSheet,
    Text,
    View,
    Image,
    TouchableOpacity,
    ToastAndroid,
} from 'react-native';

function isInteger(obj) {
    return Math.floor(obj) == obj;
}

const BottomTabBar = React.createClass({
    propTypes: {
        goToPage: React.PropTypes.func,
        activeTab: React.PropTypes.number,
        tabs: React.PropTypes.array,
    },
    getInitialState: function () {
        console.log('getInitialState');
        return {
            activeTab: 0,
        }
    },
    componentWillMount: function () {
        console.log('componentWillMount');
    },
    getDefaultProps: function () {
        console.log('getDefaultProps');
    },
    componentDidMount: function () {
        console.log('componentDidMount');
        this._listener = this.props.scrollValue.addListener(this.setAnimationValue);
    },
    setAnimationValue({ value, }) {
        if (isInteger(value))
        {
            this.setState({
                activeTab:value,
            })
        }
    },
    _handlerSelect(index)
    {
        this.setState({
            activeTab: index,
        })
        this.props.goToPage(index)
    },
    render: function () {
        console.log('render');
        return (
            <Image source={{uri: this.props.config.tab_bg_url}}>
                <View style={[styles.tabs,]}>
                    {
                        this.props.config.tabs.map((tab, i) => {
                            var icon;
                            var textStyle;
                            if (i === this.state.activeTab) {
                                icon = tab.icon_p_url;
                                textStyle = {
                                    color: '#ff5816',
                                    fontSize: 10,
                                }
                            } else {
                                icon = tab.icon_n_url;
                                textStyle = {
                                    color: '#757575',
                                    fontSize: 10,
                                }
                            }

                            return (
                                <TouchableOpacity key={tab.type} onPress={() => this._handlerSelect(i)}
                                                  style={styles.tab}>
                                    <Image source={{uri: icon}} style={[styles.icon,]} resizeMode='stretch'/>
                                    <Text style={textStyle}>{tab.name}</Text>
                                </TouchableOpacity>);
                        })
                    }
                </View>
            </Image>
        );
    },
    componentWillUpdate: function () {
        console.log('componentWillUpdate');
    },
    componentWillUnmount: function () {
        console.log('componentWillUnmount');
    },
});

var styles = StyleSheet.create({
    tab: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
    },
    tabs: {
        height: 46.67,
        flexDirection: 'row',
        justifyContent: 'center',
        alignItems: 'center',
    },
    icon :{
        width: 26,
        height: 26,
    }
});

module.exports = BottomTabBar;