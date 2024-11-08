import React from "react";
import { Button, View } from "react-native";
import styled from "styled-components";

const Container = styled.View`
    background-color : #ffffff;
    align-items:center;
    flex:1;
    justify-content:center;
`  
const StyledText = styled.Text`
    font-size : 30px;
    margin-bottom: 40px;
`
const chat = [
{ id: '1', name: 'John Doe' },
{ id: '2', name: 'Jane Smith'},
{ id: '3', name: 'Alice Johnson'},
]

const ChatListScreen = ({navigation}) => {

    const _onPress = item => {
        navigation.navigate('ChatDetailScreen',{id: item.id, name : item.name})
    }

    return(
        <Container>
            {chat.map((item) => (
                <View key={item.id} style={{ marginBottom: 20, alignItems: 'center' }}>
                    <Button title = {item.name} onPress={()=>_onPress(item)}/>
                </View>

            ))}
            
        </Container>
    )
}

export default ChatListScreen;