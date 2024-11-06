import React from 'react';
import styled, { ThemeContext } from 'styled-components';
import User from './components/User';
//import UserContext,{UserProvider,UserConsumer} from './contexts/User';
import Input from './components/Input';
import ThemedComponent from './components/ThemedComponent';
import ThemeProvider from './contexts/ThemeContext';
import { CartProvider } from './contexts/CartContext';
import CartScreen from './components/cartScreen';
import UserContext from './contexts/UserContext2';
import { UserProvider } from './contexts/UserContext2';
import HomeScreen from './components/HomeScreen';



const Container = styled.View`
    flex : 1;
    background-color : #ffffff;
    justify-content : center;
    align-items : center;
`;

const App = () => {
    return (
    //  <UserProvider>
    //      <Container>
    //          {/* <User/>
    //          <Input/> */}
          
    //      </Container>
    //  </UserProvider>


    // <ThemeProvider>
    //     <Container>
    //     <ThemedComponent/>
    //     </Container>
    // </ThemeProvider>

    // <CartProvider>
    //     <Container>
    //     <CartScreen/>
    //     </Container>
    // </CartProvider>

    <UserProvider>
        <Container>
            <HomeScreen/>
        </Container>
    </UserProvider>

    )
}

export default App;