import React from "react";
import { Button, Pressable } from "react-native";
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

const UserHomeScreen = ({navigation}) => {


    return(
        <Container>
        <StyledText>UserHomeScreen</StyledText>
        <Button
            title = '유저목록보기'
            onPress={() => navigation.navigate('UserListScreen')}/>
    </Container>
    )
   
}

export default UserHomeScreen;

