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

const users = [
    { id: '1', name: 'John Doe', email: 'john@example.com' },
    { id: '2', name: 'Jane Smith', email: 'jane@example.com' },
    { id: '3', name: 'Alice Johnson', email: 'alice@example.com' },
  ];


const UserListScreen = ({navigation}) => {


        const _onPress = item => {
            navigation.navigate('UserProfileScreen',{id : item.id, name : item.name , email : item.email})
        }

    return(
        <Container>
            <StyledText>유저목록</StyledText>
            {users.map((item) => (
                <View key={item.id} style={{ marginBottom: 20, alignItems: 'center' }}>
                    <Button title = {`프로필보기 - ${item.name}`} onPress={()=>_onPress(item)}/>
                </View>

            ))}
        </Container>
    )

}

export default UserListScreen;