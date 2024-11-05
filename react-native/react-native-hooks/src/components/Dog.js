import React,{useState} from "react";
import styled from "styled-components";
import { useFetch } from "../hooks/useFetch";

const StyledImage = styled.Image`
    background-color : #7f8c8d;
    width : 300px;
    height : 300px;
`;

const ErrorMessage = styled.Text`
    font-size : 18px;
    color : #e74c3c;
`;

const LoadingMessage = styled.Text`
    font-size : 18px;
    color: #2ecc71;
`

const URL = 'https://dog.ceo/api/breeds/image/random';
const Dog = () => {
    const {data, error,inProgress} = useFetch(URL);

   


    return(
        <>
            {/* ?. : 옵셔널 체이닝 
                 JavaScript에서 객체의 속성에 안전하게 접근하기 위한 문법
                 코드가 중단되지 않고 안전하게 실행 */}
            {inProgress && (<LoadingMessage> The API request is in progress</LoadingMessage>)}
            <StyledImage source={data?.message ? { uri : data.message} : null} />
            <ErrorMessage>{error ?.message} </ErrorMessage>
        </>
    )
}

export default Dog;