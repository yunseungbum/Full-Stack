import React from "react";
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { FriendScreen,ChatingScreen,SettingScreen } from "../screens/TabChatScreen";
import { MaterialCommunityIcons } from '@expo/vector-icons';
import ChatStackNavigaion from "./StackChat";


const Tab = createBottomTabNavigator();

const TabIcon = ({ name, color }) =>{
    return <MaterialCommunityIcons name={name} size={24} color={color} />
}



const ChatTabNavigation = () => {
    return(
        <Tab.Navigator
        initialRouteName='FriendScreen'
        screenOptions={({route}) => ({
            tabBarIcon : props => {
                let name = ' ';
                if (route.name === 'FriendScreen') name = 'FriendScreen';
              else if (route.name === 'ChatingScreen') name = 'ChatingScreen';
              else name = 'SettingScreen';
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
            name="FriendScreen" 
            component={FriendScreen} 
            options={{
                tabBarIcon: props =>
                    TabIcon({
                        ...props,
                        name: props.focused ? 'account':'account-outline',
                    })
                }} 
        />
        <Tab.Screen 
            name="ChatingScreen" 
            component={ChatStackNavigaion}
            options={{
                tabBarIcon: props =>
                    TabIcon({
                        ...props,
                        name: props.focused ? 'chat':'chat-outline',

                    })
                }} />
        <Tab.Screen 
            name="SettingScreen" 
            component={SettingScreen}
            options={{
                tabBarIcon: props =>
                    TabIcon({
                        ...props,
                        name: props.focused ? 'cog':'cog-outline',
                    })
                }} />



        </Tab.Navigator>
    )
}
export default ChatTabNavigation;