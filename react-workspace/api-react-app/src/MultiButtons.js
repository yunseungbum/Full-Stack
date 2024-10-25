import { Navigate, useNavigate } from "react-router-dom";

function MultiButtons(){

    //useNavigate()는 React Router에서 제공하는 훅으로, 컴포넌트에서 다른 페이지로 이동할 수 있게 해주는 함수
    const navigate = useNavigate();
    

    //함수 정의: handleButtonClick이라는 함수를 정의하고, event 매개변수를 받습니다. 이 함수는 버튼 클릭 시 호출됩니다.
    const handleButtonClick= (event) => {
        

        
        //버튼 ID 가져오기: 클릭한 버튼의 ID를 buttonId 변수에 저장합니다. event.target은 클릭한 요소를 나타내며, 그 요소의 ID를 가져옵니다.
        const buttonId = event.target.id;
        
        //조건문 시작: switch 문을 사용하여 buttonId에 따라 다른 동작을 수행합니다. 여러 경우를 쉽게 관리할 수 있습니다.
        switch(buttonId){
            case 'address':
                navigate('/address');
                //주소 페이지로 이동: 위의 경우가 참이면, navigate 함수를 호출하여 /address 경로로 이동합니다.
                break;

            case 'bookSearch':
                navigate('/search');
                break;
                
            case 'newsSearch':
                navigate('/newsSearch');
                break;

            case 'map':
                navigate('/map');
                break;

                case 'map2':
                navigate('/map2');
                break;

        }
    }

    return(
        <div>
            <button id="address" onClick={handleButtonClick}>
                주소찾기 api
            </button>
            <button id="bookSearch" onClick={handleButtonClick}>
                도서찾기 api
            </button>
            <button id="newsSearch" onClick={handleButtonClick}>
                뉴스 검색 api
            </button>
            <button id="map" onClick={handleButtonClick}>
                카카오 지도 api
            </button>
            <button id="map2" onClick={handleButtonClick}>
                카카오 지도2 api
            </button>
        </div>
    );
}
export default MultiButtons;