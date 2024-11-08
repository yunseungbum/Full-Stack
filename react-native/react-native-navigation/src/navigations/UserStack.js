import React from "react";
import { createStackNavigator } from "@react-navigation/stack";
import UserHomeScreen from "../screens/UserHomeScreen";
import UserListScreen from "../screens/UserListScreen";
import UserProfileScreen from "../screens/UserProfileScreen";

const UserStack = createStackNavigator();

const UserStackNavigation = () =>{

    return(
        <UserStack.Navigator>
            <UserStack.Screen name = "UserHomeScreen" component={UserHomeScreen}/>
            <UserStack.Screen name = "UserListScreen" component={UserListScreen}/>
            <UserStack.Screen name = "UserProfileScreen" component={UserProfileScreen}/>
        </UserStack.Navigator>
    )
}
export default UserStackNavigation;