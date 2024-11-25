import React from 'react';
import { View } from 'react-native';
import { ThemeProvider } from './context/ThemeContext';
import ThemedComponent from './components/ThemedComponent';
import ThemeToggleButton from './components/ThemeToggleButton';

const App = () => {
  return (
    <ThemeProvider>
      <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
        <ThemedComponent />
        <ThemeToggleButton />
      </View>
    </ThemeProvider>
  );
};

export default App;