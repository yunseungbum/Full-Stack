import React from 'react';
import { View, Text,  StyleSheet } from 'react-native';

const ProfileScreen = () => {
    return (
        <View style={styles.container}>
            <Text style={styles.title}>Profile Screen</Text>
        </View>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
        backgroundColor: 'black',
    },
    title: {
        fontSize: 24,
        marginBottom: 20,
        color: 'blue',   
    },
});

export default ProfileScreen;