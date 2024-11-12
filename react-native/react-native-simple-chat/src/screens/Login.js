import React,{useState,useRef} from 'react';
import styled from 'styled-components';
import Image from '../components/Image';
import Input from '../components/input';
import { images } from '../utils/images';
import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view';

const Container = styled.View`
  flex: 1;
  justify-content: center;
  align-items: center;
  background-color: ${({ theme }) => theme.background};
  padding : 20px;
`;

const Login = ({ navigation }) => {
    const[email, setEmail] = useState('');
    const[password,setPassword] = useState('');
    const passwordRef = useRef();
    
    return (
      <KeyboardAwareScrollView 
        contentContainerStyle={{flex :1}}
        extraScrollHeight={20}>
        <Container>
          <Image url={images.logo} imageStyle={{borderRadius : 0}}/>
          <Input
          label="Email"
          value={email}
          onChangeText={text => setEmail(text)}
          onSubmitEditing={() => passwordRef.current.focus()}
          placeholder="Email"
          returnKeyType="next"        
        />
        <Input
          ref={passwordRef}
          label="Password"
          value={password}
          onChangeText={text=>setPassword(text)}
          onSubmitEditing={() => passwordRef.current.focus()}
          placeholder="Password"
          returnKeyType="done"
          isPassword
        />
        </Container>
        </KeyboardAwareScrollView>

    );
  };
  
  export default Login;