
import React, { useState } from "react";

function Sol1() {
    const [food, setFood] = useState([]);
    const [num, setNum] = useState("");

    const inputHandler = (e) => {
        setNum(e.target.value);
    }

    const clickHandler = () => {
      
            setFood(prev => [num, ...prev]);
            setNum(""); 
        
    }

    const enterKeyEventHandler =(e) => {
        if(e.key === 'Enter'){
            clickHandler();
           
        }
    }

    return (
        <div>
            <input  
            value={num}
            onChange={inputHandler} 
            type="text"
            onKeyPress={enterKeyEventHandler} />
            <button onClick={clickHandler}>추가</button>
            <ul>
                {food.map((item, idx) => (



                    <li key={idx}>{item}</li>
                ))}
            </ul>
        </div>
    );
}

export default Sol1;