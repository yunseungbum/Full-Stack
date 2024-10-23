import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import { useState } from 'react';
import { useEffect } from 'react';

function App() {

  const [movie, setMovie] = useState([]);
  const [showTable, setShowTable] = useState(false);

  //useEffect
  //컴포넌트가 렌더링 된 후에 실행된다.
  //useEffect(() =>{
  //렌더링에 영향을 주지않는 코드들이 들어온다.
  //},[])

  //버튼을 누르기전까진 절때 실행이 안됨

  let options = {
    headers:{
    "Content-Type":"application/json"
   },
    url : 'http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=82ca741a2844c5c180a208137bb92bd7&targetDt=20241001',
    method : 'get'
}

const handleClick = () => {
  axios(options)
    .then(response => {
      console.log(response.data.boxOfficeResult.dailyBoxOfficeList);
      setMovie(response.data.boxOfficeResult.dailyBoxOfficeList);
      setShowTable(true); // 테이블 표시 상태 변경
    })
    .catch(error => {
      console.error("데이터 가져오기 오류:", error);
    });
}

const movieTable = (
  <table border="1" align='center'>
    <thead>
      <tr>
        <th>제목</th>
        <th>개봉날짜</th>
        <th>박스오피스순위</th>
        <th>관객수</th>
      </tr>
    </thead>
    <tbody>
      {movie.map((item, index) => (
        <tr key={index}>
          <td>{item.movieNm}</td>
          <td>{item.openDt}</td>
          <td>{item.rank}</td>
          <td>{item.audiAcc}</td>
        </tr>
      ))}
    </tbody>
  </table>
)

  return (
    <div className="App">

      <button onClick={handleClick}>일별 박스오피스 내용 가져오기</button>
      {showTable && movie.length > 0 && movieTable}
    </div>
  );
}

export default App;
