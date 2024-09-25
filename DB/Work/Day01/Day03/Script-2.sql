--10번 및 30번 부서에 속하는 모든 사원 중 급여가 1500을 너믄 사원의
--사원번호, 이름 및 급여를 조회하세요
SELECT EMPLOYEE_ID ,FIRST_NAME ,SALARY 
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN(10,30) AND SALARY > 1500;


--관리자가 없는 모든 사원에 이름 및 직종을 출력하세요
SELECT FIRST_NAME,JOB_ID 
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;


--직업이 IT_PROG 또는 SA_MAN이면서 급여가 1000,3000,5000이 아닌 사원들의 이름,직종 및 급여를 조회하세요
SELECT FIRST_NAME,JOB_ID,SALARY
FROM EMPLOYEES
WHERE JOB_ID IN('IT_PROG','SA_MAN') AND SALARY NOT IN(1000,3000,5000);


--TBL_STUDENT 
--학번,이름,전공,성별,생일
--INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER,BIRTH)
--VALUES (0,'홍길동','컴퓨터공학과','A','1980-01-02');
--ban_char 위반 오류 뜸


INSERT INTO TBL_STUDENT(ID, NAME, MAJOR, GENDER, BIRTH)
VALUES(1,'박디비','컴퓨터공학과','W','1990-02-06');


SELECT * FROM TBL_STUDENT;


--DEFUALT값 사용해보기
INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,BIRTH)
VALUES(2,'홍길동','컴퓨터공학과','1994-02-06');

--INSERT할때 컬럼명을 생략하면 DEFAULT값을 넣을 수 없다.
--INSERT INTO TBL_STUDENT 
--VALUES(3,'이자바','컴퓨터공학과','1994-02-06');

--FLOWER테이블에 데이터 넣기
--꽃이름
--꽃색깔
--가격
--장미꽃,빨간색,3000
INSERT INTO FLOWER (F_NAME,F_COLOR,F_PRICE)
VALUES('장미꽃','레드',3000);
INSERT INTO FLOWER (F_NAME,F_COLOR,F_PRICE) 
VALUES('해바라기','옐로우',5000);
INSERT INTO FLOWER (F_NAME,F_COLOR,F_PRICE) 
VALUES('튤립','그린',3000);

SELECT * FROM FLOWER;

--POT테이블에 데이터 추가하기
--화분번호, 화분색깔, 화분모양, 꽃이름
--화분테이블에 데이터를 추가할 때 꽃 테이블에 있는 꽃만 추가할 수 있다.
INSERT INTO POT
VALUES('2024094231','레드','타원형','해바라기');

SELECT * FROM POT;

CREATE TABLE FLOWER2(
F_NAME2 VARCHAR2(200) PRIMARY KEY,
F_COLOR2 VARCHAR2(100),
F_PRICE2 NUMBER
);

--다른 테이블에 있는 데이터를 조회해서 추가하는 것이 가능하다.
INSERT INTO FLOWER2(F_NAME2,F_COLOR2,F_PRICE2)
SELECT F_NAME,F_COLOR,F_PRICE
FROM FLOWER;

SELECT * FROM FLOWER2;


--여러 테이블에 한번에 데이터를 추가하는 것도 가능하다
INSERT ALL
	INTO FLOWER VALUES('할미꽃',5000,'보라색')
	INTO FLOWER2 VALUES('백합','흰색',7000)
	SELECT*FROM DUAL;

SELECT * FROM FLOWER;
SELECT * FROM FLOWER2;


---------------------------------------
SELECT * FROM POT;
DELETE FROM POT WHERE F_NAME = '장미꽃';
SELECT * FROM FLOWER;
DELETE FROM FLOWER WHERE F_NAME= '장미꽃';

--PK와 FK로 연결된 테이블에서 외래키로 참조되고 있는 데이터는
--부모테이블에서 삭제가 불가능하다.


--STUDENT테이블에서 이름이 홍길동인 사람 삭제하기
DELETE FROM TBL_STUDENT WHERE NAME = '홍길동';
SELECT * FROM TBL_STUDENT;


--학생테이블에서 학번 1번인 학생의 이름을 홍길동으로,성별을 남자로 수정하기
UPDATE TBL_STUDENT SET 
NAME ='홍길동', 
GENDER='M'
WHERE ID = 1 ;

SELECT * FROM TBL_STUDENT;


--회원과 관련된 기능
--로그인 -> SELECT
--회원가입 ->INSERT
--회원정보수정 -> UPDATE
--회원탈퇴 -> DELETE

--상품과 관련된 기능
--검색 -> SELECT
--상품추가 ->INSERT
--재고처리(100 -> 99) -> UPDATE
--상품삭제 ->DELETE

--사원테이블에서 급여를 많이 받는 순서대로 사번,이름,급여 입사일순으로 출력하되,
--급여가 같은 경우 입사일이 빠른 순으로 정렬

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY,HIRE_DATE 
FROM EMPLOYEES
ORDER BY SALARY DESC,HIRE_DATE; 


--사원테이블에서 부서번호가 빠른순,부서번호가 같다면 직종이 빠른순,직종도 같다면 급여를 많이 받는 순
--정렬해서 사번,이름,부서번호,직종,급여순으로 출력


SELECT EMPLOYEE_ID, FIRST_NAME,DEPARTMENT_ID,JOB_ID ,SALARY
FROM EMPLOYEES
ORDER BY DEPARTMENT_ID,JOB_ID ,SALARY DESC;

--입사일이 빠른순으로 급여가 15000이상인 사원들이 사번,이름,급여,입사일을 조회

SELECT EMPLOYEE_ID, FIRST_NAME,SALARY,HIRE_DATE 
FROM EMPLOYEES
WHERE SALARY >= 15000
ORDER BY HIRE_DATE;



--문자와 관련된 함수
--ASCII()
-- 지정된 문자 ASCII값을 반환한다.
SELECT ASCII('A') FROM DUAL;

--CHR()
-- 지정된 수치와 일치하는 ASCII코드를 반환한다.
SELECT CHR(65) FROM DUAL;



--RPAD(데이터,고정길이,문자)
--왼쪽 정렬 후 오른쪽에 생긴 빈 공백에 특정 문자를 채워 반환한다.
SELECT RPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS;


-- LPAD(데이터,고정길이,문자)
-- 오른쪽 정렬 후 왼쪽에 생긴 빈 공백에 특정 문자를 채워 반환한다.
SELECT LPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS;

--TRIM()
-- 문자열 공백 문자들을 삭제한다
SELECT TRIM('  TRIM  ') FROM DUAL;


--INSTR()
-- 특정문자의 위치를 반환한다.
SELECT INSTR('HELLOW','O') FROM DUAL;

--INSTR(데이터,찾을문자,검색위치,몇번째 나오는지)
SELECT INSTR('HELLOW','L',1,2) FROM DUAL;

--찾는 문자열이 없으면 0을 반환한다.
SELECT INSTR('HELLOW','Z') FROM DUAL;


--initcap()
--첫 문자를 대문자로 변환하는 함수 공백이나 /를 구분자로 인식함
select initcap('good morning') from dual;
select initcap('good/morning') from dual;


--length()
-- 문자열의 길이를 반환한다.
select length('john') from dual;


--SUBSTR()
-- 문자열의 시작 위치부터 길이만큼 자른 후 반환한다.
-- 길이는 생략 가능하며, 생략 시 문자열의 끝까지 반환한다.
SELECT SUBSTR('Hello Oracle', 2) AS CASE1,
    SUBSTR('Hello Oracle', 7, 5) AS CASE2
FROM dual;

--REPLACE()
-- 첫 번째 지정한 문자를 두번째 지정한 문자로 바꿔 반환한다.
SELECT REPLACE('GOOD MORNING','MORNING','EVENUNG') FROM DUAL;

-- UPPER()
-- 문자열을 모두 대문자로 변환하여 반환한다.
SELECT UPPER('good morning') FROM dual;

--------------------------------------------------------------------------

--부서번호가 50번인 사원들의 이름을 출력하되 이름이'el'을 모두 '**'로 대체하여 출력하세요
SELECT  REPLACE(FIRST_NAME,'el','**') 
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;

--이름이 6글자 이상인 사원의 사번과 이름,급여를 출력하세요
SELECT EMPLOYEE_ID,FIRST_NAME,SALARY
FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) >= 6;



----'H E L L O'의 공백을 모두 제거하여 출력하세요
SELECT REPLACE('H E L L O','H E L L O','HELLO') FROM DUAL;


-----------------------------------------------------------------------------

CREATE TABLE PRODUCT2(
"NO" NUMBER PRIMARY KEY,
NAME VARCHAR2(100) NOT NULL,
PRICE NUMBER,
P_DATE DATE
);

DROP TABLE PRODUCT2;

1)모든 칼럼의 타입에 맞는 데이터를 삽입하고, 모든 칼럼에 널 값이 없도록 작성하세요
3)P_NAME 칼럼의 데이터 중 하나 이상은 반드시 현재 날짜를 호출하는 오라클 함수를 사용하세요

INSERT INTO PRODUCT2 
VALUES(1000,'컴퓨터',100,SYSDATE);
INSERT INTO PRODUCT2 
VALUES(1002,'냉장고',200,SYSDATE);
INSERT INTO PRODUCT2 
VALUES(1003,'에어컨',300,SYSDATE);
INSERT INTO PRODUCT2 
VALUES(1004,'냉장고',20,SYSDATE);
INSERT INTO PRODUCT2 
VALUES(1001,'세탁기',60,SYSDATE);

SELECT * FROM PRODUCT2;

UPDATE PRODUCT2 
SET PRICE = PRICE +20
WHERE "NO" = 1000;

DELETE FROM PRODUCT2
WHERE NAME ='세탁기';

SELECT * FROM  PRODUCT2
ORDER BY PRICE DESC;

















