import React, { useContext } from 'react';
import { View, Text } from 'react-native';
import { ThemeContext } from '../context/ThemeContext';
import { StyleSheet } from 'react-native';


const lightThemeStyles = StyleSheet.create({
    container: {
      flex: 1,
      justifyContent: 'center',
      alignItems: 'center',
    },
    box: {
      backgroundColor: '#fff',
      padding: 20,
      borderRadius: 8,
    },
    text: {
      color: '#000',
      fontSize: 18,
    },
  });
  
  // 다크 테마 스타일
  const darkThemeStyles = StyleSheet.create({
    container: {
      flex: 1,
      justifyContent: 'center',
      alignItems: 'center',
    },
    box: {
      backgroundColor: '#333',
      padding: 20,
      borderRadius: 8,
    },
    text: {
      color: '#fff',
      fontSize: 18,
    },
  });


const ThemedComponent = () => {
  const { isDarkMode } = useContext(ThemeContext);
  const styles = isDarkMode ? darkThemeStyles : lightThemeStyles;

  return (
    <View style={[styles.container, styles.box]}>
      <Text style={styles.text}>This is a themed box!</Text>
    </View>
  );
};

export default ThemedComponent;