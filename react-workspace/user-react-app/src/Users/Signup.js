import React from "react";

function Signup(){
    return(
        <table border="1" align="center">
            <tr>
                <td>아이디</td>
                <td><input name = "userId"/></td>
                <td><button>중복체크</button></td>
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
                    <input type="button" value="가입"/>
                    <input type="button" value="취소"/>
                </td>
             
            </tr>

        </table>
    )
}
export default Signup;