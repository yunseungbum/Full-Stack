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

export default lightThemeStyles;