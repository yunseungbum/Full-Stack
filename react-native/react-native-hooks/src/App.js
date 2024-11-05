import React, { useState } from 'react'
import styled from 'styled-components'
import Counter from './components/Counter'
import Button from './components/Button'
import Form from './components/Form'
import Length from './components/Length'
import Dog from './components/Dog'
import MakeBread from './components/MakeBread'


const Container = styled.View`
    flex:1;
    background-color: #fff;
    justify-content : center;
    align-items: center;
`

const App = () => {

    const[isVisible,setIsVisible] = useState(true);

    return(
    <Container>
         {/* <Counter/> */}

        {/* 버튼을 누르면 Form 컴포넌트를 보였다가 숨겼다가 만들기
            버튼의 타이틀은 hide 또는 show로 바꾸기 */}
         {/* <Button 
         //title = { isVisible ? 'Hide' : 'Show'}
         //isVisible이 true일 때 버튼의 텍스트는 'Hide'로 설정되고, false일 때는 'Show'로 설정
        title = { isVisible ? 'Hide' : 'Show'} */}

        {/* //이 부분은 버튼이 클릭될 때 실행되는 함수
        //setIsVisible은 상태를 업데이트하는 함수로, isVisible의 현재 값을 반전
        //prev => !prev는 이전 상태를 가져와서 그 반대 값을 반환하는 함수
        //즉, 현재 상태가 true이면 false로, false이면 true로 바꿔준다.
        // onPress={() => setIsVisible(prev => !prev)}/> */}

    {/* 이 구문은 논리 AND 연산자를 사용하여 조건부 렌더링을 구현
        isVisible이 false이면 Form은 렌더링되지 않는다 */}
        {/* {isVisible && <Form/>}
        <Length/> */}


          <Dog/> 
         {/* <MakeBread/> */}
    </Container>
    
    )
}

export default App;