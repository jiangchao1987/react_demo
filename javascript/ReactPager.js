'use strict';

import React from 'react';

// ours...
import BottomTabBar from '../javascript/BottomTabBar.js';
import RView1 from '../javascript/RView1.js';
import NView2 from '../javascript/NView2.js';
import RView3 from '../javascript/RView3.js';
// third libs
import ScrollableTabView from 'react-native-scrollable-tab-view';

import {
	View,
	StatusBar,
	StyleSheet,
	Text,
	Dimensions
} from 'react-native';

const {width, height} = Dimensions.get('window');

var ReactPager = React.createClass({
	render : function() {
		var cfg = JSON.parse(this.props.cfg).data;
		return (
			<View style = {[this.props.style,]}>
				<StatusBar translucent={true}
				backgroundColor={'#00000000'}/>
				<ScrollableTabView
					style={{flex:1,}}
					locked={false}
					scrollWithoutAnimation={true}
					tabBarPosition='bottom'
					renderTabBar={() => <BottomTabBar config={cfg}/>}
					>
					<RView1 tabLabel='RView1' style={styles.page}/>
					<NView2 style={styles.page}/>
					<RView3 tabLabel='RView3' style={styles.page}/>
				</ScrollableTabView>
			</View>
			);
	}
});

var styles = StyleSheet.create({
	container: {
		flex: 1,
	},
	page: {
		flex: 1,
		backgroundColor: 'white',
	},
	button: {
		padding: 10,
	},
	overlay: {
		flex: 1,
		position: 'absolute',
		left: 0,
		top: 0,
		width: width,
	}
});

module.exports = ReactPager;