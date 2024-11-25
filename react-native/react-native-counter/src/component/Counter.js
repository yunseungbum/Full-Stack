import React, { useState } from "react";
import { View, Text } from "react-native";
import MyButton from "./Mycomponent";

const Counter = () => {
    const [count,setCount] = useState(0);
   


    return(
        <View style={{alignItems: 'center'}}>
            <Text style={{margin:10,fontSize:40}}>{count}</Text>
            <MyButton title = "+1" onPress={() => setCount(count+1)}/> 
            <MyButton title = "-1" onPress={() => setCount(count-1)}/>
        </View>
    )
}
export default Counter;