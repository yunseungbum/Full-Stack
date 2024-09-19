import React, {useState,useRef} from "react";

function RefSample(){

    const refNum = useRef(0);

    const [stateNum,setStateNum] = useState(0);

    console.log('랜더링 발생');

    const increaseRefNum = () => {
        refNum.current = refNum.current +1;
        console.log(`refNum " ${refNum.current}`)
    }
 
    const increaseStateNum = () => {
        setStateNum(stateNum => stateNum +1)
    }

    return(
        <div>
            <h1>refNum : {refNum.current}</h1>
            <h1>stateNum : {stateNum}</h1>
            <button onClick={increaseRefNum}>refNum + 1</button>
            <button onClick={increaseStateNum}>stateNum +1</button>
        </div>
    )

}
export default RefSample;