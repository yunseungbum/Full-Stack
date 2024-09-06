//document 객체를 대상으로 하는 이벤트리스너를 추가한다.
//이벤트의 종류는 DOMContentLoaded이다.
// DOMContentLoaded : 문서의 콘텐츠 로딩이 완료되었음을 읨하는 이벤트
document.addEventListener("DOMContentLoaded",function(e){
    //HTML코드가 로딩된 다음 처리할 작업
    let button = document.querySelector("input");
button.addEventListener("input",
    function (e) {
        console.log(e.target.value);
    });
})



    function hi(){
        alert('hi');
    }

    //<p>태그에서 인라인 이벤트 모델로 호출할 함수를 정의한다.
    //함수의 이름은 hi이다.
    //alert()띄워 "hi"라는 글자를 출력하기
