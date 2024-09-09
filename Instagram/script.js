document.addEventListener("DOMContentLoaded", 
    function(e){
        var configID = document.querySelector("#id i")
        var idText = document.querySelector("#id span")

        configID.addEventListener("click",
            function(e){
                idText.textContent = prompt("새로운 아이디를 입력하세요")
            }
        )
        
        var profileEditButton = document.querySelector("#profile_info button")
        var userInfo = document.querySelector("#userInfo")
        var summary = document.querySelector("#summary") 
        var profileDetail = document.querySelector("#profileDetail") 
        var changing = false

        profileEditButton.addEventListener("click",
            function (e) {
                if (changing) {
                    var _userInfo = userInfo.querySelector("input").value
                    var _summary = summary.querySelector("input").value
                    var _profileDetail = profileDetail.querySelector("input").value

                    userInfo.innerHTML = _userInfo
                    summary.innerHTML = _summary
                    
                    //url의 경우 http로 시작하면 a태그를 단다.
                    //http가 아닐경우 그냥 넣는다.
                    if (_profileDetail.startsWith("http")){
                        _profileDetail = "<a href=" + _profileDetail + ">" + _profileDetail + "</a>"
                    } 

                    profileDetail.innerHTML = _profileDetail

                    //버튼의 글자를 프로필 편집으로 바꾼다.
                    e.target.textContent = "프로필 편집"
                    changing = false

                } else {
                    //각각의 태그에 들어있는 내용을 변수에 저장
                    var _userInfo = userInfo.textContent;
                    var _summary = summary.textContent;
                    var _profileDetail = profileDetail.textContent;

                    //<input value = half_bottle"></input>
                    userInfo.innerHTML = "<input value=" + _userInfo + "></input>"
                    summary.innerHTML = "<input value=" + _summary + "></input>"
                    profileDetail.innerHTML = "<input value=" + _profileDetail + "></input>"
                    //버튼의 글자를 "프로필 편집 완료"로 수정
                    e.target.textContent = "프로필 편집 완료"

                    changing  =true
                }
            }
        )

        var profile_pic = document.querySelector("#profile_pic .circle_pic")
        profile_pic.addEventListener("mouseover",
            function (e){
                //filter는 사진에 필터를 씌우는 css속성
                //사진의 색조를 조절하는 도구
                //grayscale()을 사용하여 흑백화시킨다.



                
                e.target.style.filter = "grayscale(50%)"
            }
        )
        
        profile_pic.addEventListener("mouseleave",
            function (e){
                e.target.style.filter = "grayscale(0%)"
            }
        )
        
        profile_pic.addEventListener("click",
            function (e){
                profile_pic.setAttribute("src", prompt("이미지 url을 입력해 주세요!"))
            }
        )





    }
)