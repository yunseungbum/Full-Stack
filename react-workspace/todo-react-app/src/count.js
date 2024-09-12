import React,{useState} from "react";


export default function Example(){
    const [count,setCount] = useState(0);
    
    return(
        <div>
            <p>clicked {count} times</p>
            {/* 버튼을 누르면 count값을 변화시키고 Example 컴포넌트에 넘기며 재렌더링을 한다 */}
            <button onClick={() => setCount(count+1)}>Click me</button>
        </div>
    )

}
