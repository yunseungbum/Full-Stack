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
import Input from './Components/Input';
import { ThemeProvider } from 'styled-components/native';
import { theme,lightTheme, darkTheme  } from './Components/Theme';
import { Switch } from 'react-native';

const Container = styled.View`
  flex: 1;
  background-color: ${props => props.theme.background};
  align-items: center;
  justify-content: center;
`;

const App = () => {
  const [isDark, setIsDark] = useState(false);
  const _toggleSwitch = () => setIsDark(!isDark);

  return (
    <ThemeProvider theme={isDark ? darkTheme : lightTheme}>
      <Container>
        <Switch value={isDark} onValueChange={_toggleSwitch} />
        <Button title="Hanbit" />
        <Button title="React Native" />
        <Input borderColor="#3498db" />
        <Input borderColor="#9b59b6" />
      </Container>
    </ThemeProvider>
  );
};

export default App;




// <View style={viewStyles.container}>
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
      
      
      {/* 회원가입 시스템 만들기
      <Headers/>
      <Signup/>
      <LoginCheck/> */}

       // </View>