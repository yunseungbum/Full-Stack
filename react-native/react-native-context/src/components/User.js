import React,{useContext} from "react";
import styled from "styled-components";
import UserContext from "../contexts/User";
import { UserConsumer } from '../contexts/User';

const StyledText = styled.Text`
    font-size : 24px;
    margin: 10px;

`;

const User = () => {

    const {user} = useContext(UserContext);//매개변수에 우리가 생성한 UserContext를 전달해줘야함
    
    return(
    // <UserConsumer>
    //     {({user}) => <StyledText>Name: {user.name}</StyledText>}
    // </UserConsumer>

    //useContext를 임포트하면 위에 주석을 사용하지 않고 user변수 선언으로 아래처럼 쉽게 사용할 수 있다.
    <StyledText>Name: {user.name}</StyledText>
    )
}
export default User;