import React from "react";
import styled from "styled-components";

const Container = styled.View`
  flex: 1;
  justify-content: center;
  align-items: center;
  width: 100%;
`;
const StyledText = styled.Text`
  flex-direction: row; 
  justify-content: flex-start; 
  align-items: center;  
  margin-bottom: 10px; 
  width: 100%;
  padding-left: 60px; 
`;
const TextContainer = styled.View`
  width: 80%;  /* 텍스트가 차지할 너비 */
`;

const ButtonText = styled.Text`
  font-size: 30px;
  color: brown;
  margin-bottom: 40px;
  padding-Right: 60px; 
`;

const HighlightText = styled.Text`
  font-size: 20px;
  color: gray; 
  font-weight: bold;
`;

const UserProfileScreen = ({route}) => {

    return (
        <Container>
            <ButtonText>상세페이지</ButtonText>
            <TextContainer>
            <StyledText>
                    <HighlightText>아이디 :</HighlightText>  {route.params.id}
            </StyledText>
            <StyledText>
                     <HighlightText>이름 :</HighlightText>  {route.params.name}
            </StyledText>
            <StyledText>
                    <HighlightText>이메일 :</HighlightText>  {route.params.email}
            </StyledText>
            </TextContainer>

        </Container>
    )
}

export default UserProfileScreen;