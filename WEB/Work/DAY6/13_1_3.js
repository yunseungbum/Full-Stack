document.addEventListener("DOMContentLoaded",function(e){
    let input = document.querySelector("#input");
    input.addEventListener("click",function(e){
        //속성을 조회
        //console.log(e.target.getAttribute("type"));

        //속성을 변경
        //e.target.setAttribute("type","text");

        //속성값 토글
        if(e.target.getAttribute("type")==="button"){
            e.target.setAttribute("type","text");
        }
    })


    input.addEventListener("change",function(e){
            e.target.setAttribute("type","button");
        
    })
})