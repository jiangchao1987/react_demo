import React, { Component } from 'react';
import{ AppRegistry, ScrollView, Image, Text, View, Dimensions } from 'react-native'

const {width, height} = Dimensions.get('window');

var RView1 = React.createClass({
  render() {
      return(
        <ScrollView>
          <Text style={{fontSize:24}}>Scroll me plz</Text>
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Text style={{fontSize:24}}>If you like</Text>
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Text style={{fontSize:24}}>Scrolling down</Text>
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Text style={{fontSize:24}}>What's the best</Text>
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
          <Image source={require('../images/rabbit.png')} style={[{width:width}, {height:250}]} resizeMode={Image.resizeMode.stretch} />
        </ScrollView>
    );
  }
});

module.exports = RView1;
