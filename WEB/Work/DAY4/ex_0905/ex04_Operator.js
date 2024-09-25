//산술연산자
let l1=10;
let l2=7;

console.log(l1+l2);
console.log(l1-l2);
console.log(l1*l2);
console.log(l1/l2);
console.log(l1%l2);

//대입연산자
//연산된 데이터를 변수에 저장할 때 사용
let A =3;
let B =A;
console.log('B : ' + B);


//증감연산자 - ++,--
//증가연산자(++) - 숫자형 데이터를 1씩 증가
//감소연산자(--) - 숫자형 데이터를 1씩 감소

var a =5;
var b = ++a;
console.log(b);
var b = a++;
console.log(b);

//비교연산자
//두 데이터를 '크다', '작다', '같다'와 같이 비교할때 사용
//연산된 결과는 논리형데이터(true - 참, false - 거짓)

var a=10;
var b=7;

console.log(a>b);
console.log(10 =="10");//값이 일치하면 true
console.log(10 ==="10");//값과 데이터 타입이 일치할 때 true
console.log(10 !="10");
console.log(10 !=="10");


//논리연산자
//&&
//||
//!
console.log(true&&false);
console.log(true||false);
console.log(!true);

//조건문
//조건에 따라 컴퓨터가 어떻게 행동해야 하는지 명령을 결정하는 문법이다.

//자바에서 조건식에 넣었던것
//비교연산자,논리연산자
//0,null,'',underfined -> 모두 false로 인식
//그 이외의 값은 true로 인식

//if(조건식){
//  수행할 명령
//}

if(3){
    console.log('실행문 출력')
}

//switch문
//여러 케이스 중 하나를 선택
var a =3;
var String;
switch(a){
    case 1:
    string ='1선택'
    break;
    case 2:
    string ='2선택'
    break;

case 3:
    string ='선택'
    break;


}

































