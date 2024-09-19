import React, {useEffect, useState} from 'react'

function MyComponent2(){
    const [count, setCount] = useState(0)
    const [renderCount, setRenderCount] = useState(0);

    const ClickHandler = () => {
        setCount(count+1)
    }

    useEffect(() => {
        setRenderCount(renderCount +1);
        console.log("렌더링 완료")
    },[count])


    return(
        <div>
            <h1>Count : {count}</h1>
            <h1>렌더링 횟수 : {renderCount}</h1>
            <button onClick={ClickHandler}>클릭</button>
        </div>
    );
}
export default  MyComponent2;