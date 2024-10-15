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
        console.log(e.target.value);
        
        setUser(prevState => ({
            ...prevState,
            [name] : value
        }))
    }
   
    if(!user.userId){
        return <div>Loading...</div>
    }

    return(
        <div>   
            <form noValidate>
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