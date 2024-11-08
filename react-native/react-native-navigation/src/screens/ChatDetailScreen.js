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

const ChatDetailScreen = ({route}) => {

    return(
        <Container>
            <StyledText>{route.params.name}</StyledText>
        </Container>
    )
}

export default ChatDetailScreen;