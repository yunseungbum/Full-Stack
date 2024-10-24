import React, {useState}  from 'react';
import axios from 'axios';
import '../css/news.css'

function NewsSearch(){
    const [query,setQuery] = useState(''); //검색어 state
    const [result,setResult] = useState([]); //검색 결과 state
    const [loading,setLoading] = useState(false); //로딩상태
    const [error,setError] = useState(null); 

    const newsSearch = () => {
        try {
            const response = axios.get('http://localhost:9090/api/newsSearch',{
                params : {query}
            });
            response.then(res => setResult(res.data.items));


        } catch (err) {
            setError('뉴스 검색 실패');
        }
    }

    const handleNewsSearch = (e) =>{
        if(!query){
            alert('검색어 입력해주세요');
            return;
        }
        e.preventDefault();
        newsSearch();
    }

    return(
        <div>
            <h1>네이버 뉴스 검색</h1>
            <form onSubmit={handleNewsSearch}>
                <input
                    type='text'
                    value={query}
                    onChange={(e) => setQuery(e.target.value)}
                    placeholder='뉴스 검색'
                    />

            <button type='submit'> 검색 </button>
            </form>
            <ul>
            {result.map((news,index) =>(
                    <li key={news.rss}>
                        <p>총 검색 결과 수 : {news.total}</p>
                        <p>제 목 : {news.title}</p>
                        
                        <a href={news.originallink} target='_blank' rel='noopener noreferrer'>더보기</a>
                    </li>
                ))}
                
            </ul>
            {result.length > 0 && <p>검색 : {result.length}</p>}
        </div>

    )


}
export default NewsSearch;