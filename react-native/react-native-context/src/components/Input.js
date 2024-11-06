import React,{useState,useContext} from "react";
import styled from "styled-components";
import UserContext, { UserConsumer } from "../contexts/User";//Provider에서 제공하는 disPatch(setName)을 사용하려고 import


const StyledInput = styled.TextInput`
    border: 1px solid #606060;
    width : 250px;
    padding : 10px 15px;
    margin : 10px;
    font-size : 24px;

`

const Input = () => {
    const[name,setName] = useState('');//빈 문자열로 초기화

     //UserContext로부터 dispatch를 받아온다.
     const {dispatch} = useContext(UserContext);



    return(

        // //UserConsumer : UserContext에서 값을 읽어노는 역할하는 컴포넌트
        // <UserConsumer> 
        //     {({dispatch}) => {
        //         return(
        //             <StyledInput
        //                 value = {name}
        //                 onChangeText = {text => setName(text)}
        //                 onSubmitEditing =  {() => {
        //                     dispatch(name);
        //                     setName('');
        //                 }}
        //                 placeholder = "Enter a name ..."
        //                 autoCapitalize = "none"
        //                 autoCorrect = {false}
        //                 returnKeyType = "done"
        //             /> 
        //         )
        //     }}
        // </UserConsumer>


        //userContext 임포트하고 난 후
                    <StyledInput
                         //value는 텍스트 입력 필드에 표시되는 값을 설정하는 속성
                         //name 상태가 입력 필드의 값으로 표시된다.
                         value = {name}

                         //onChangeText는 사용자가 텍스트를 입력할 때마다 호출되는 이벤트 핸들러 
                         //사용자가 텍스트를 입력할 때마다 setName 함수가 호출되어 name 상태가 업데이트
                         onChangeText = {text => setName(text)}

                         //onSubmitEditing : 사용자가 키보드에서 완료 부턴을 누를 때 이 이벤트 핸들러가 호출됨
                         onSubmitEditing =  {() => {
                             dispatch(name);//dispatch는 setName 함수
                             setName('');// 입력 필드 초기화
                         }}
                         placeholder = "Enter a name ..."
                         autoCapitalize = "none"
                         autoCorrect = {false}
                         returnKeyType = "done"
                    /> 

    )

}

export default Input;



