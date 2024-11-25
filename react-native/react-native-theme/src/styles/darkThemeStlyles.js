import { StyleSheet } from 'react-native';

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

export default darkThemeStyles;