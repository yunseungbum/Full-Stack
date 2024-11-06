import React, {useContext } from 'react';
import { Button, View, Text, StyleSheet } from 'react-native';
import {ThemeContext} from '../contexts/ThemeContext';


const ThemedComponent = () => {
    const {isDarkMode,toggleTheme} = useContext(ThemeContext);

    return(
        <View style = {isDarkMode ? styles.darkContainer : styles.lightContainer}>
            <Text style = {isDarkMode ? styles.darkText : styles.lightText}>
                {isDarkMode ? 'Dark Mode' : 'Light Mode'}
            </Text>
            <Button title = "Toggle Theme" onPress={toggleTheme}/>
        </View>
    )
}

const styles = StyleSheet.create({
    darkContainer : {
        flex : 1, 
        width : '100%',
        backgroundColor : "#333", 
        justifyContent : 'center', 
        alignItems:'center'},

    lightContainer : {
        flex : 1,   
        textAlign : 'center',
        backgroundColor : "#fff", 
        justifyContent : 'center', 
        lignItems:'center'},
    
    darkText : {color : '#fff',textAlign: 'center'},
    lightText : {color : '#000',textAlign: 'center'}
})

export default ThemedComponent;

