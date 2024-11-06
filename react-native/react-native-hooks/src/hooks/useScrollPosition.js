import { useState } from "react";

export const useScrollPosition = () =>{//스크롤 위치를 추적하는데 사용할 예정

    //스크롤 위치를 저장하는 state
    const[scrollPosition,setScrollPosition] = useState(0);


    //스크롤 위치를 얻어와서 state 저장할 함수
    const handleScroll = (event) => {//이 함수는 스크롤 이벤트를 처리하기 위해 사용

        //스크롤 위치를 나타내는 값
        //contentOffset은 y 값으로 수직 스크롤 위치를 나타낸다.
        //이것을 setScrollPosion을 통해 상태 값으로 저장
        //이렇게 하면 자동으로 업데이트 됨
        setScrollPosition(event.nativeEvent.contentOffset.y);
    }

    //스크롤 위치와 함수를 반환
    return{scrollPosition,handleScroll};
} 