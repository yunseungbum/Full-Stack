/*
 * CREATE TABLE 테이블명(
 * 컬럼명 타입(길이),
 * 컬럼명 타입(길이),
 * 컬럼명 타입(길이)
 * );
 * 
 * 	 주의점
	 칼럼이 여러개일때 콤마(,)잘 써야 함
	 사이에 공백 두지 않기
	 같은 이름으로는 안만들어짐
	 마지막에는 콤마 안붙힘
 */

-- 이름 
-- VARCHAR2(100)
-- 나이
--NUMBER 
CREATE TABLE TBL_MEMBER(
	NAME VARCHAR2(100),
	AGE NUMBER
);





CREATE TABLE TBL_CAR(
	ID NUMBER,--차량 식별번호
	BRAND VARCHAR2(100), --브랜드
	COLOR VARCHAR2(100), --색깔
	PRICE NUMBER, --가격
	CONSTRAINT CAR_PK PRIMARY KEY(ID) -- 테이블을 생성하면서 제약조건을 지정
);

/* 테이블 삭제
 * DROP TABLE 테이블명; 
 * 
 * 주의점
 * 영구삭제이기 때문에 조심해야한다.
 * 
 * 테이블 변경
 * CREATE문으로 테이블을 생성한 후 불가피하게 수정해야 할 상황이 발생할 때가 많다.
   -최초설계를 잘못한 원인도 있고 요구사항이 변경되기 때문이기도 하다.
   -여러 원인으로 기존에 생성했던 컬럼의 데이터 타입을 수정하거나 삭제, 새로운 컬럼을 넣어야 하는 경우가 발생하는데, 이때마다 테이블을 삭제하고 다시 생성하는 것은 여러 문제를 만들 수 있다.
   -이럴때 ALTER TABLE문을 사용해 테이블을 수정할 수 있다.
*/

DROP TABLE TBL_CAR;
DROP TABLE TBL_MEMBER;

--테이블명:ex2_10
--속성1:Col1 문자형 길이는 10 NULL값 비허용
--속성2 Col2 문자형 길이 10 null값 혀용
--속성3 Create_date 날짜타입 기본값 현재날짜(SYSDATE)

CREATE TABLE ex2_10(
	Col1 VARCHAR2(10) NOT NULL,
	Col2 VARCHAR2(10) NULL,
	Create_date DATE DEFAULT SYSDATE
);

--컬럼명 변경 Col1 -> Col11
-- ALTER TABLE 테이블명 RENAME COLUMN 기존 컬럼명 TO 새로운 컬럼명
ALTER TABLE ex2_10 RENAME COLUMN Col1 TO Col11;

--컬럼타입 변경
--ALTER TABLE 테이블명 MODIFY 컬럼명 데이터타입;
ALTER TABLE ex2_10 MODIFY Col2 VARCHAR2(30);


--컬럼삭제
--ALTER TABLE 테이블명 DORP COIUMN 컬럼명;
ALTER TABLE ex2_10 DROP COLUMN Col3;

--컬럼추가
--ALTER TABLE 테이블명 ADD 컬럼명 데이터타입;
ALTER TABLE ex2_10 ADD Col3 NUMBER;

--제약 조건 추가
--테이블이 이미 생성된 뒤 제약조건 추가를 해보자
--ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 제약조건종류(컬럼명);
ALTER TABLE ex2_10 ADD CONSTRAINT PRIMARY KEY(Col1);

--제약 조건 삭제
--ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명;
ALTER TABLE ex2_10 DROP CONSTRAINT PRIMARY KEY;

--테이블생성
--테이블명 TBL_ANIMAL
--ID 숫자 기본키
--"TYPE"문자형 길이 100
--AGE 숫자형 길이 3
--FEED 문자형 길이 100
CREATE TABLE TBL_ANIMAL(
ID NUMBER PRIMARY KEY,
TYPE VARCHAR2(100),
AGE NUMBER(3),
FEED VARCHAR2(100)
);

--제약조건삭제
ALTER TABLE TBL_ANIMAL DROP CONSTRAINT SYS_C007001;

--제약조건추가
--ID 컬럼에 ANIMAL_PK라는 이름으로 기본키 설정하기
ALTER TABLE TBL_ANIMAL ADD CONSTRAINT ANIMAL_PK PRIMARY KEY(ID);

--TBL_ANIMAL테이블 삭제하기
DROP TABLE TBL_ANIMAL;



--- DEFAULT 와 CHECK제약조건
CREATE TABLE TBL_STUDENT(
	ID NUMBER,
	NAME VARCHAR2(100),
	MAJOR VARCHAR2(100),
	GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CHAR CHECK(GENDER = 'M' OR GENDER ='W'),
	BIRTH DATE CONSTRAINT BAN_DATE CHECK(BIRTH >= TO_DATE('1980-01-01','YYYY-MM-DD')),
	CONSTRAINT STD_PK PRIMARY KEY(ID)
);



















