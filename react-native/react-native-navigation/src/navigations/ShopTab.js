import React from "react";
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { HomeScreen, CartScreen,ProfileScreen } from "../screens/TabShopScreens";
import { MaterialCommunityIcons } from '@expo/vector-icons';


const TabIcon = ({ name, color }) =>{
    return <MaterialCommunityIcons name={name} size={24} color={color} />
}


const Tab = createBottomTabNavigator();

const ShopTabNavitaion = () => {
    return(
        <Tab.Navigator
        initialRouteName='HomeScreen'
        screenOptions={({route}) => ({
            tabBarIcon : props => {
                let name = ' ';
                if (route.name === 'HomeScreen') name = 'HomeScreen';
              else if (route.name === 'CartScreen') name = 'CartScreen';
              else name = 'ProfileScreen';
              return TabIcon({ ...props, name });
            },
            headerStyle: {backgroundColor : 'black'},
            headerTitleAlign : 'center',
            headerTintColor : 'gray',
            tabBarShowLabel:true,
            tabBarStyle: {
                backgroundColor: 'black'
            },
            tabBarActiveTintColor: 'blue',
            tabBarInactiveTintColor : 'gray'
        })}
        >
            <Tab.Screen 
            name="HomeScreen" 
            component={HomeScreen} 
            options={{
                tabBarLabel : "home",
                tabBarIcon: props =>
                    TabIcon({
                        ...props,
                        name: props.focused ? 'home':'home-outline',
                    })
                }} 
        />
        <Tab.Screen 
            name="CartScreen" 
            component={CartScreen}
            options={{
                tabBarLabel : "cart",
                tabBarIcon: props =>
                    TabIcon({
                        ...props,
                        name: props.focused ? 'cart':'cart-outline',

                    })
                }} />
        <Tab.Screen 
            name="ProfileScreen" 
            component={ProfileScreen}
            options={{
                tabBarLabel : "profile",
                tabBarIcon: props =>
                    TabIcon({
                        ...props,
                        name: props.focused ? 'account':'account-outline',
                    })
                }} />



        </Tab.Navigator>
    )
}

export default ShopTabNavitaion;