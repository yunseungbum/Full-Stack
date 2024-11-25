import React, { useContext } from 'react';
import { Button } from 'react-native';
import { ThemeContext } from '../context/ThemeContext';


const ThemeToggleButton = () => {
  const { toggleTheme, isDarkMode } = useContext(ThemeContext);
  return (
    <Button
      title={isDarkMode ? 'Switch to Light Mode' : 'Switch to Dark Mode'}
      onPress={toggleTheme}
    />
  );
};

export default ThemeToggleButton;