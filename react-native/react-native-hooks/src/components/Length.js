import React,{useState,useMemo} from 'react'
import styled from 'styled-components'
import Button from './Button'

//문자열의 길이를 계산하는 컴포넌트 만들기
const StyledText = styled.Text`
    font-size : 24px;
`

const list = ['JavaScript','Expo','Expo','React Native']

let idx = 0;
const Length = () => {
    const [text,setText] = useState(list[0]);
    const[length,setLength] = useState(list[0].length);

    const getLength = text => {
        console.log(`Target Text: ${text}`);
        return text.length;
    }
    
    const _onPress = () => {
        setLength(getLength(text));
        ++idx;
        if(idx < list.length) setText(list[idx]);
        
    }

    //useMemo의 역할
    // 특정 값이 변경될 때만 계산된 결과를 재사용할 수 있도록 한다.
    //const length = useMemo(()=>getLength(text),[text]);

    return(
        <>
            <StyledText>Text: {text}</StyledText>
            <StyledText>Length: {length}</StyledText>

            {/* button 컴포넌트에서 title,onPress를 props로 전달하기에 선언 */}
            <Button title="get Length" onPress={_onPress}/>
        </>
    )
}

export default Length;