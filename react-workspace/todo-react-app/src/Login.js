import React from "react";
import { Container, Grid, Typography, TextField, Button } from "@mui/material"; // Material UI 컴포넌트들
import { signin, socialLogin } from "./service/ApiService"; // 로그인 API 호출 함수
import { Link } from "react-router-dom";

function Login() {
    // 폼 제출 시 호출되는 함수
    const handleSubmit = (event) => {
        event.preventDefault(); // 페이지가 새로고침되지 않도록 기본 동작을 막음
        const data = new FormData(event.target); // 제출된 폼 데이터 가져옴
        const username = data.get("username"); // username 필드 값 가져오기
        const password = data.get("password"); // password 필드 값 가져오기
        console.log(username); // 콘솔에 이메일 출력 (디버깅용)
        console.log(password); // 콘솔에 비밀번호 출력 (디버깅용)
        // ApiService의 signin 메서드를 사용해 로그인 요청을 서버에 보냄
        signin({ username: username, password: password });
    };

    const handleSocialLogin = (provider) => {
       socialLogin(provider);
    }

    return (
        <Container component="main" maxWidth="xs" style={{ marginTop: "8%" }}>
            <Grid container spacing={2}>
                <Grid item xs={12}>
                    <Typography component="h1" variant="h5">
                        로그인
                    </Typography>
                </Grid>
            </Grid>
            {/* 폼을 제출하면 handleSubmit 함수가 실행됨 */}
            <form noValidate onSubmit={handleSubmit}>
                <Grid container spacing={2} marginTop="0.5px">
                    {/* 이메일 입력 필드 */}
                    <Grid item xs={12}>
                        <TextField
                            variant="outlined"
                            required
                            fullWidth
                            id="username"
                            label="이메일 주소"
                            name="username"
                            autoComplete="username" // 브라우저가 자동완성할 때 사용할 값
                        />
                    </Grid>
                    {/* 비밀번호 입력 필드 */}
                    <Grid item xs={12}>
                        <TextField
                            variant="outlined"
                            required
                            fullWidth
                            name="password"
                            label="패스워드"
                            type="password" // 비밀번호 입력 시 문자가 가려짐
                            id="password"
                            autoComplete="current-password" // 브라우저 자동완성 사용
                        />
                    </Grid>
                    {/* 제출 버튼 */}
                    <Grid item xs={12}>
                        <Button
                            type="submit"
                            fullWidth
                            variant="contained"
                            color="primary"
                        >
                            로그인
                        </Button>
                    </Grid>
                    <Grid item xs={12}>
                        <Button onClick={ () => {handleSocialLogin("github")}}
                            fullWidth
                            variant="contained"
                           style={{background: '#000'}}
                        >깃허브 로그인하기</Button>
                    </Grid>
            
                </Grid>
                <Grid container justifyContent="center">
                    <Grid item marginTop="5px" >
                        <Link to="/Signup" variant="body2" >
                            회원가입하기
                        </Link>
                    </Grid>
                </Grid>
            </form>
        </Container>
    );
}
export default Login;