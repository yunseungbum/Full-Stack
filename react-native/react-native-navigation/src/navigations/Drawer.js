import React from "react";
import { createDrawerNavigator } from '@react-navigation/drawer';
import HomeScreen from "../screens/HomeScreens";
import ProfileScreen from "../screens/ProfileScreens";
import { TouchableOpacity } from "react-native-gesture-handler";
import { Ionicons } from '@expo/vector-icons'; 

const Drawer = createDrawerNavigator();

const DrawerNavigation = () => {




    return(
        <Drawer.Navigator
        screenOptions={{
            drawerStyle: { backgroundColor: 'white', width: 150 },
            drawerLabelStyle: { fontSize: 15 },
            drawerActiveTintColor: 'red',
            drawerInactiveTintColor: 'black',
            headerTitle :"드로어테스트",
            drawerPosition : " right",
            headerRight: () => (
                <TouchableOpacity onPress={() => alert('오른쪽 버튼 클릭')}>
                    <Ionicons name="ios-settings" size={24} color="black" />
                </TouchableOpacity>
            ),
            headerShown: true,
            }}
        >
            <Drawer.Screen name="Home" component={HomeScreen} />


            <Drawer.Screen name="Profile" component={ProfileScreen} />
        </Drawer.Navigator>
    )
}

export default DrawerNavigation;