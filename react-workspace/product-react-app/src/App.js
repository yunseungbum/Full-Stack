import logo from './logo.svg';

import P_info from './Product/p_info';
import AddProduct from './Product/AddProduct';
import { call } from './service/ApiService';
import React from 'react';
import { useState,useEffect } from 'react';

function App() {
  

  return (
    <div className="App">
      <P_info />
    </div>
  );
}

export default App;