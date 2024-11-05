import { useState,useEffect } from "react";

//특정API에 GET요청을 보내고 응답을 받아보자.


export const useFetch = url => {
    const[data,setData] =useState(null);
    const[error,setError] = useState(null);
    const[inProgress,setInProgress] = useState(false);

    useEffect(() => {
        const fetchData = async () => {
            try {
                setInProgress(true);
                const res = await fetch(url);//url에 비동기 통신 요청(default get방식)
                const result = await res.json();//fetch를 통해 얻어온 데이터는 json 형식으로 변환해야 한다.
        
                if(res.ok){
                    setData(result);
                    setError(null);
                }else{
                    throw result;
                }
               } catch (error) {
                setError(error);
               }finally{
                setInProgress(false);
               }
        }//fetchData end


        fetchData();//fetchData() 호출
     
    },[])
    return { data,error,inProgress};
}