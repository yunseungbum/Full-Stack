import React from 'react';
import { Routes, Route } from 'react-router-dom';
import Dashboard from './Dashboard';
import Login from './Login';
import PrivateRoute from './PrivateRoute';


function App() {
  const isAuthenticated = false; 
  return (
    <div className="App">
      
      {/* <Navbar/>
      <Routes>
        {/* Routes : 모든 route를 그룹화 하여 ,URL의 경로에 따라 적절한 Route를 렌더링한다. 
            Route : URL 경로와 컴포넌트를 매핑하여, 특정 경로에 맞는 컴포넌트를 렌더링한다.
        <Route path="/" element={<User />} />
        <Route path="/users/:id" element={<UserProfile />} />
    </Routes> */}
    {/* <Routes>
      <Route path="/dashboard/*" element={<Dashboard />} />
    </Routes> */}
     <Routes>
      <Route path="/login" element={<Login />} />
      <Route
        path="/dashboard"
        element={<PrivateRoute element={<Dashboard />} isAuthenticated={isAuthenticated} />}
      />
    </Routes>
    </div>
  );
}

export default App;
