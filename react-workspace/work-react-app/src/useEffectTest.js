import React, { useEffect, useState } from 'react';

function MyComponent() {
    const [count, setCount] = useState(0);

    useEffect(() => {
        console.log(`You clicked ${count} times`);
    }, [count]);

    return (
        <div>
            <p>You clicked {count} times</p>
            <button onClick={() => setCount(count + 1)}>Click me</button>
        </div>
    );
}

export default MyComponent;