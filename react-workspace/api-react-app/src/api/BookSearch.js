import React, {useState}  from 'react';
import axios from 'axios';

export default function BookSearch(){
    const [query,setQuery] = useState(''); //검색어 state
    const [result,setResult] = useState([]); //검색 결과 state
    const [loading,setLoading] = useState(false); //로딩상태
    const [error,setError] = useState(null); 

    //네이버 도서 검색 API호출 함수
    const searchBooks = () =>{
        try{
            const response = axios.get('http://localhost:9090/api/books',{
                params : {query}
            });
       //axios.get을 사용해 특정 URL(http://localhost:9090/api/books)에 GET 요청을 보냅니다. 
       //params로는 query 변수를 전달하여 검색 쿼리를 포함시킵니다. 이 요청의 결과는 response 변수에 저장됩니다. 


            //검색 결과를 result 상태에 저장
            response.then(res => setResult(res.data.items));
            //결과 처리: response가 성공적으로 반환되면, .then() 메소드를 사용하여 결과(res.data.items)를 setResult 함수를 통해 상태에 저장합니다. 
            //이렇게 하면 검색 결과가 화면에 표시될 수 있습니다.

        }catch(err){
            setError('도서 검색 실패띠');
            //오류 처리: 오류가 발생했을 경우, setError 함수를 호출하여 오류 메시지('도서 검색 실패띠')를 상태에 저장합니다. 
            //이 메시지는 사용자에게 표시됩니다.
        }
    }

    //검색 버튼 클릭시 호출
    const handleSearch = (e) =>{
        if(!query){
            alert('검색어 입력해라잉');
            return;
        }
        e.preventDefault();
        searchBooks();
    }

    return(
        <div>
            <h1>네이버 도서 검색</h1>
            <form onSubmit={handleSearch}>
                <input 
                    type='text'
                    value={query}
                    onChange={(e) => setQuery(e.target.value)}
                    placeholder='책이름 입력해라'
                />
                <button type='submit'> 검  색 </button>
            </form>
            <ul>
                {result.map((book) =>(
                    <li key={book.isbn}>
                        <img src={book.image} alt={book.title}/>
                        <p>제 목 : {book.title}</p>
                        <p>저 자 : {book.author}</p>
                        <p>출판사 : {book.publisher}</p>
                        <p>가 격 : {book.discount ? `${book.discount}원`: '가격 정보 없음'}</p>
                        <a href={book.link} target='_blank' rel='noopener noreferrer'>더보기</a>
                    </li>
                ))}
            </ul>
        </div>
    );
}
