import React from "react";
import { createStackNavigator } from "@react-navigation/stack";
import ChatListScreen from "../screens/ChatListScreen";
import ChatDetailScreen from "../screens/ChatDetailScreen";


const ChatStack = createStackNavigator();

const ChatStackNavigaion = () => {


    return(
        <ChatStack.Navigator>
            <ChatStack.Screen name = "ChatListScreen" component={ChatListScreen}/>
            <ChatStack.Screen name = "ChatDetailScreen" component={ChatDetailScreen}/>
        </ChatStack.Navigator>
    )
}
export default ChatStackNavigaion;
