import React,{useState} from "react";
import styled from "styled-components";//스타일링 할 수 있게 import -> npm install styeld-component 설치
import Button from "./Button";


const StyledText = styled.Text`
    font-size: 24px;
    margin: 10px;
`;
//``(백틱)의 의미
// 여러 줄 문자열
// 변수 삽입 가능  -> ${} 구문을 사용하여 문자열 내에 변수를 삽입
// 스타일 정의  CSS스타일을 정의 

const Counter = () => {
    const[count,setCount] = useState(0);



    return(
        <>
        <StyledText>
            count : {count}
            </StyledText>
        <Button
            title= "+"
            onPress = {() => {
                setCount(count => count+1);
                setCount(count => count+1);
                console.log(`count:${count}`)
            }}
            />
            <Button
            title = "-"
            onPress = {() => {
                setCount(count-1);
            }}
            />
    </>
            
    )
}

export default Counter;