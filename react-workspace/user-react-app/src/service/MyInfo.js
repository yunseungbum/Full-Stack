import React from "react";
import { call } from "./ApiService";
import { useState,useEffect } from "react";
function MyInfo(){

    const[user,setUser] = useState({
        userId:'',
        pwd:'',
        name:'',
        email:''
    });
    useEffect(() => {
        call("/users/name","GET")
        .then(result => setUser(result.data[0]))
    },[])
    
    const handleChange = (e) =>{
        const {name,value} = e.target;
        
        setUser(prevState => ({
            ...prevState,
            [name] : value
        }))
    }
   
    if(!user.userId){
        return <div>Loading...</div>
    }

    const handlesubmit = (e) => {
        e.preventDefault();
        const data = new FormData(e.target);//form태그의 정보를 얻어온다.
        let userId = user.userId;
        let pwd = data.get("pwd");
        let name = data.get("name");
        let email =data.get("email");

        console.log('userId: ',userId);
        console.log('pwd: ',pwd);
        console.log('name: ',name);
        console.log('email: ',email);
        call("/users","PUT",{userId:userId,pwd:pwd,name:name,email:email})
        .then(result => {
            window.location.href="/main";
        })


    }

    return(
        <div className="App">   
            <form noValidate  onSubmit={handlesubmit}>
                <table border="1"align="center" >
                    <caption>내정보</caption>
                    <tr>
                        <th>아이디</th>
                        <td>{user.userId}</td> 
                    </tr>
                    <tr>
                        <th>비밀번호</th>
                        <td><input name = "pwd" value={user.pwd} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <th>이름</th>
                        <td><input name = "name" value={user.name} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <th>이메일</th>
                        <td><input name = "email" value={user.email} onChange={handleChange}/></td>
                    </tr>
                    <tr>
                        <td colSpan={2} align="center">
                            <input type="submit" value="수정" />
                            <input type="button" value="취소" ></input>
                        </td>
                    
                    </tr>

                </table>
            </form>
        </div>


    )
}
export default MyInfo;