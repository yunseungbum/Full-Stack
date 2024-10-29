import React, { useState } from "react";
import { View, Text, Button } from "react-native";



//Toggle Text 버튼을 누를때마다
//<p> This text can be toggled</p>
//보였다 안보였다 하게 만들기

const ToggleText = () => {

    const [toggle,setToggle] = useState('This text can be toggled');

   

    return(
        <View>
             <Button title="Toggle" onPress={() => 
                    {toggle==='This text can be toggled' ? setToggle(''): setToggle('This text can be toggled')    
                    }} />
            {toggle ? <Text>{toggle}</Text> : null}
        </View>

    )
}
export default ToggleText;