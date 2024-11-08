import React from "react";
import styled from "styled-components";


const Container = styled.View`
    flex:1;
    justify-content: center;
    background-color : white;
    align-items: center;
`;

const StyledText = styled.Text`
    font-size:30px;
`

export const FriendScreen = () => {

    return(
        <Container>
        <StyledText>친구</StyledText>
    </Container>
    )
}

export const ChatingScreen = () => {
 

    return(
        <Container>
            <StyledText>채팅</StyledText>
        </Container>
    )
}

export const SettingScreen = () => {

        return(
            <Container>
                <StyledText>설정</StyledText>
            </Container>
        )
    }   