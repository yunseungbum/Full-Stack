import React from "react";
import styled from "styled-components";
import { Button } from "react-native";

const Container = styled.View`
    flex:1;
    justify-content: center;
    background-color : white;
    align-items: center;
`;

const StyledText = styled.Text`
    font-size:30px;
`

export const HomeScreen = () => {

    return(
        <Container>
            <StyledText>Welcome to ShopApp</StyledText>
        </Container>
    )

}
export const CartScreen = () => {
 

    return(
        <Container>
            <StyledText>Your Cart is Empty</StyledText>
            <Button
            title = 'Additem'
            onPress={()=> alert('장바구에 아이템이 추가 되었습니다.')}
            />
        </Container>
    )
}

export const ProfileScreen = () => {

        return(
            <Container>
                <StyledText>your Profile</StyledText>
            </Container>
        )
    }   
  

    