import React from "react";
import App from "./App";
import Login from "./Users/Login";
import { BrowserRouter,Routes,Route } from "react-router-dom";
import Signup from './Users/Signup';


function AppRouter(){
    return(
        <div>
            <BrowserRouter>
                <Routes>
                    <Route path="/main" element = {<App/>}/>
                    <Route path="/" element = {<Login/>}/>
                     <Route path="/signup" element = {<Signup/>}/> 
                </Routes>
            </BrowserRouter>
        </div>
    )
}

export default AppRouter;