import React,{useState, useEffect} from "react";
import styled from "styled-components";

const StyledTextInput = styled.TextInput.attrs({
    autoCapitalize : 'none',
    autoCorrect : false
})`
        border : 1px solid #757575;
        padding : 10px;
        margin : 10px 0;
        width : 200px;
        font-size : 20px;
`;

const StyledText = styled.Text`
        font-size : 24px;
        margin : 10px;
`

const Form = () => {

    const[name,setName] = useState('');
    const[email,setEmail] = useState('');

    useEffect(() => {
        console.log('\n===========Form component Mount===========\n')

        //clean up : useEffect의 실행 조건이 빈 배열인 경우 컴포넌트가 언마운트 될 때 정리함수를 실행
        return () =>
        console.log('\n===========Form component UnMount===========\n')
    },[])//useEffect(() => {},[]) []이 부분에 아무것도 없으면 한번만 실행

    return(
        //<> -> Fragment 사용
        <>
    <StyledText>name : {name}</StyledText>
    <StyledText>email : {email}</StyledText>
    <StyledTextInput
        value = {name}
        onChangeText={text => setName(text)}
        placeholder="name"/>
    <StyledTextInput
        value = {email}
        onChangeText={text => setEmail(text)}
        placeholder="email"/>
    </>
    )
    
}

export default Form;
