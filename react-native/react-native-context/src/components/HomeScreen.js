import React, { useContext } from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';
import UserContext from '../contexts/UserContext2';  

const HomeScreen = () => {
  const { user, login,logout } = useContext(UserContext);

  return (
    <View style={styles.container}>
        {user ? (
            <>
            <Text>welcome,{user.name}</Text>
            <Button title = "logout" onPress={logout}/>
            </>
        ) : (
            <Button title='login' onPress = {login}/>
        )}
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default HomeScreen;