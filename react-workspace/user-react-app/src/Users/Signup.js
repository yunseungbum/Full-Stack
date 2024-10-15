import React from "react";
import { useState,useRef,useEffect } from "react";
import { call,signup} from "../service/ApiService";

function Signup(){

    const userIdRef = useRef();

    //아이디 중복체크 여부를 저장하는 state
    const [idCheck,setIdCheck] = useState(false);
    //중복체크 버튼을 눌러서 아이디 중복을 확인한다.
    function isIdCheck(){
        const userId = userIdRef.current.value;

            call("/users/idCheck","POST",{userId:userId})
            .then(result => {
                //지역변수
                const isAvailable =result.value;
                setIdCheck(isAvailable)
               
            if(userId === ''){
                alert("아이디를 입력하세요");
                return;
            }
            if(isAvailable === true){
                alert("사용가능한 아이디입니다.")
                return;
            }
            if(isAvailable === false){
                alert("중복되는 아이디입니다.")
                return;
            }
            })
    }
  

     //내용을 다 입력하고 가입 버튼을 누르면 db에 저장
        const handlesubmit = (e) => {
        e.preventDefault();
        const data = new FormData(e.target);//form태그의 정보를 얻어온다.
        let userId = data.get("userId");
        let pwd = data.get("pwd");
        let name = data.get("name");
        let email =data.get("email");

        let user = {userId:userId,pwd:pwd,name:name,email:email}

        //idCheck의 값이 true면 생성가능
        //false면 중복됐거나 or 체크를 안했다는 뜻
        if(idCheck){
            //id,pwd,name,eamil정보를 가지고 db에 추가 요청
            signup(user)
                .then(result => {
                    window.location.href="/";
                })
        }else{
            alert("아이디 중복체크를 하세요")
            return;
        }
     }

    //중복체크를 안할 시 넘어가면 안된다.
    //alert('중복체크하세요')를 띄운다.
  



    

    return(
        <form noValidate onSubmit={handlesubmit}>
            <table border="1" >
                <caption>:::회원가입:::</caption>
                <tr>
                    <td>아이디</td>
                    <td>
                        <input name = "userId" id = "userId" ref={userIdRef}/>
                        <input type="button" value="중복체크" onClick={isIdCheck}/>
                    </td>
                    
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input name = "pwd"/></td>
                </tr>
                <tr>
                    <td>이름</td>
                    <td><input name = "name"/></td>
                </tr>
                <tr>
                    <td>이메일</td>
                    <td><input name = "email"/></td>
                </tr>
                <tr>
                    <td colSpan={2} align="center">
                        <input type="submit" value="가입" />
                        <input type="button" value="취소" onClick={() => {window.location.href="/"}}></input>
                    </td>
                
                </tr>

            </table>
        </form>
    )
}
export default Signup;