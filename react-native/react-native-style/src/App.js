import React,{useState} from 'react';
import { Text, View,StyleSheet } from 'react-native';
import { textStyles,viewStyles } from './Styles';
import { Header, Contents, Footer } from './Components/Layout';
import FlexDirectionTest from './Components/FlextDirectionTest';
import JustifyContentTest from './Components/JustifyContentTest';
import AlignItemsTest from './Components/AlignItemsTest';
import ShandowBox from './Components/ShandowBox';
import { StyledComponent } from './Components/StyledComponent';
import Button from './Components/Button';
import styled from 'styled-components';
import {Signup,Headers,LoginCheck} from './Components/Signup';

const Container = styled.View`
  flex:1;
  background-color: #ffffff;
  align-items: center;
  justify-content:center;
`

const App = () => {
  return (
    <View style={viewStyles.container}>
      {/* <Text style={[textStyles.text, { color: 'green' }]}>
        Inline Styling - Text
      </Text>
      <Text style={[textStyles.text, textStyles.error]}>
        Inline Styling - Error
      </Text> */}
       {/* <Header />
      <Contents />
      <Footer /> */}
      {/* <FlexDirectionTest/> */}
       {/* <JustifyContentTest/>
      <AlignItemsTest/>  */}
      {/* <ShandowBox/>  */}
       {/* <StyledComponent/> */}
       {/* <Container>
      <Button title='yun'/>
      <Button title='jonna hard'/>
      </Container>  */}
      
      <Headers/>
      <Signup/>
      <LoginCheck/>
      
      
    </View>
  );
};

export default App;