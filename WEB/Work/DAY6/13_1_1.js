document.addEventListener("DOMContentLoaded",function(e){
    let keydown = document.querySelector("#keydown");
    keydown.addEventListener("keydown", function(e){
        //input태그 안에 담겨있는 값을 console에 출력
        //key라는 키는 누른 버튼에 대한 정보를 가지고 있다.
        console.log(e.key);
       if(e.key ==="q"){
        alert("This is Q");
       }
        //q를 눌렀을 때 "This is Q"라는 문구를 가진 경고창 띄우기

    })
    //change 이벤트 만들고 e.target.value 콘솔에 출력하기
    //change의 경우 내용이 변경되고 포커스가 벗어나면 적용
    let change = document.querySelector("#change");
    change.addEventListener("change",function(e){
        console.log(e.target.value);
    })

    let input = document.querySelector("#input");
    input.addEventListener("input",function(e){
        console.log(e.target.value);
    })
})




    



