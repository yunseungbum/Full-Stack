//타입캐스팅
//데이터 타입의 종류를 바꾸는 행위
//String()
console.log(String(3)+1+3);

//Number()
console.log(Number(3)+1+3);
console.log(Number(false));
console.log(Number("abc"));//NaN: Not a Number

//Boolean()
console.log(Boolean(0));//false
console.log(Boolean(NaN));//false
console.log(Boolean(3));//true
console.log(Boolean("a"));//true
console.log(Boolean("false"));//ture

//인덱싱과 슬라이싱
//index: 0부터 순차적으로 증가는 정수 값
//데이터를 분석하여 우리가 원하는 순서에 위치한 데이터를 뽑는것
console.log("abcde"[2]);

//슬라이싱
//여러개의 값으로 자르고 싶다면 slice메서드를 이용한다.
console.log("abcdefgh".slice(3,5));