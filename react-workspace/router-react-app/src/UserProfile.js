import React from 'react';
import { useParams } from 'react-router-dom';

function UserProfile(){
    const {id} = useParams();

    //실제로는 받아온 id 값을 가지고 서버에 요청을 해서 데이터를 가져온다.
    const user = {
        id,
        name: id ==='1' ? '홍길동' : id === '2' ? '이순신' : '김유신',
        age : id === '1' ? 30 : id === '2' ? 45 : 50
    };

    return (
        <div>
          <h2>{user.name}님의 프로필</h2>
          <p>사용자 ID: {user.id}</p>
          <p>나이: {user.age}</p>
        </div>
      );
}
export default UserProfile;