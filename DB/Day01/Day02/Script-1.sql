/*USER      
U_ID(PK)   VARCHAR2(100)
U_PW       VARCHAR2(100)
U_NAME     VARCHAR2(200)
U_ADDRESS  VARCHAR2(300)
U_EMAIL    VARCHAR2(300)   
U_BIRTH	   DATE
--------------
ORDER      
O_NUM      NUMBER
O_DATE     DATE 
U_ID(FK)   VARCHAR2(100)   
P_NUM(FK)  NUMBER
--------------
PRODUCT   
P_NUM(PK)   NUMBER
P_NAME      VARCHAR2(100)
P_PRICE     NUMBER
P_COUNT	    NUMBER
*/

CREATE TABLE "USER"(
U_ID   	   VARCHAR2(100) PRIMARY KEY,
U_PW       VARCHAR2(100),
U_NAME     VARCHAR2(200),
U_ADDRESS  VARCHAR2(300),
U_EMAIL    VARCHAR2(300),
U_BIRTH	   DATE
);

CREATE TABLE PRODUCT(
P_NUM       NUMBER PRIMARY KEY,
P_NAME      VARCHAR2(100),
P_PRICE     NUMBER,
P_COUNT	    NUMBER
);

CREATE TABLE "ORDER"(
O_NUM      NUMBER PRIMARY KEY,
O_DATE     DATE,
U_ID       VARCHAR2(100), 
P_NUM      NUMBER,
CONSTRAINT U_FK FOREIGN KEY(U_ID) REFERENCES "USER"(U_ID),
CONSTRAINT P_FK FOREIGN KEY(P_NUM) REFERENCES PRODUCT(P_NUM)
);

DROP TABLE "ORDER";



/*
 * 		꽃			화분
 * ----------------------------
 *   꽃 이름(PK) 	 제품번호(PK)
 * ----------------------------
 * 	  꽃색깔		   화분색깔
 * 	  꽃가격		   화분모양
 * 				    꽃이름
 */

CREATE TABLE FLOWER(
F_NAME VARCHAR2(100) PRIMARY KEY,
F_PRICE NUMBER,
F_COLOR VARCHAR2(100)
);

CREATE TABLE POT(
P_ID VARCHAR2(100),
P_COLOR VARCHAR2(100),
P_SHAPE VARCHAR2(100),
F_NAME VARCHAR2(100),
CONSTRAINT P_PK FOREIGN KEY(F_NAME) REFERENCES FLOWER(F_NAME)
);


-------------------------------------------------------------------
/*3.CD 정보를 데이터베이스에 저장하려고 한다.
CD는 타이틀, 가격, 장르, 트랙 리스트 등의 정보를 가지고 있다.
각 CD는 아티스트가 있으며 아티스트는 여러 CD를 출반한다.
트랙은 타이틀, 러닝타임(초)이 있다.
개체와 관계

개체(Entity)
-CD : 타이틀, 가격, 장르, 트랙 리스트 
-아티스트 : 이름, 국적, 데뷔년도
-트랙 : 타이틀, 러닝타임 
관계(Relationship)
-CD와 아티스트는 N:1(한명의 아티스트는 여러 CD를 낼 수 있다.)
-CD와 트랙은 1:N(하나의 CD에는 여러 트랙이 포함될 수 있다.)

 * 
 */


CREATE TABLE ARTIST(
A_NAME VARCHAR2(100) PRIMARY KEY,
A_NATION VARCHAR2(100),
A_START DATE
);

CREATE TABLE CD(
C_TITLE VARCHAR2(200) PRIMARY KEY,
C_PRICE NUMBER,
C_GENRE VARCHAR2(100),
C_ARTISTNAME VARCHAR2(100),
C_TRACKLIST VARCHAR(200),
CONSTRAINT C_ARTIST FOREIGN KEY(C_ARTISTNAME) REFERENCES ARTIST(A_NAME)
);



CREATE TABLE TRACK(
T_TITLE VARCHAR2(200)PRIMARY KEY,
T_RUNNINGTIME NUMBER,
T_C_TITLE VARCHAR2(200),
CONSTRAINT C_TRACKLIST FOREIGN KEY(T_C_TITLE) REFERENCES CD(C_TITLE)
);


---------------------------------------------------------------------------
/*회사의 정보를 DB에 저장하려고 한다.
 * -회사는 네개의 부서를 운영한다. 부서는(부서번호,부서이름)을 저장한다.
 * -부서는 1명이상의 직원(직원번호,직원이름,직책)을 두고 있다. 각 직원은 하나의 부서에 소속된다.
 * -직원은 부양가족(이름,나이)가 있을 수 있다.(누구의 가족인지)
 * -각 직원은 근무했던 부서에 대한 근무기록(기간,직책)이 있다.(누가 일했는지)
 * 
 * 
 * CLASS1 	 	CLASS2		CLASS3		CLASS4		직원			부양가족 		 근무기록
 * 부서번호(PK)	부서번호(PK)	부서번호(PK)	부서번호(PK)	직원번호(PK)	이름			 직원번호(FK)
 * 부서이름		부서이름		부서이름		부서이름		직원이름		나이			 기간
 * 													직책			직원번호(FK)
 * 													
 */

CREATE TABLE CLASS(
C_ID NUMBER PRIMARY KEY,
C_NAME VARCHAR2(100)
);


CREATE TABLE PERSON(
P_ID NUMBER PRIMARY KEY,
P_NAME VARCHAR2(100),
P_POSITION VARCHAR2(100),
C_ID NUMBER,
CONSTRAINT P_ID FOREIGN KEY(C_ID) REFERENCES CLASS(C_ID)
);


CREATE TABLE FAMILY(
F_NAME VARCHAR2(100),
F_AGE NUMBER,
P_ID NUMBER,
CONSTRAINT C_ID FOREIGN KEY(P_ID) REFERENCES PERSON(P_ID)
);




CREATE TABLE POSITION(
P1_DATE DATE PRIMARY KEY,
P_ID NUMBER,
CONSTRAINT P1_ID FOREIGN KEY(P_ID) REFERENCES PERSON(P_ID)
);


--데이터 조회
SELECT EMPLOYEE_ID,FIRST_NAME FROM EMPLOYEES;

--컬럼조회
SELECT * FROM COLS WHERE TABLE_NAME = 'EMPLOYEES';

--사원테이블에서 모든 정보를 조회하세요
SELECT * FROM EMPLOYEES;

--DEPARTMENT(부서) 테이블의 모든 정보를 조회하세요

SELECT * FROM DEPARTMENTS;

--사원테이블에서 이름,직종,급여를 조회해보세요
SELECT FIRST_NAME,JOB_ID,SALARY FROM EMPLOYEES;

--컬럼에 실제로 없는 정보도 출력할 수 있다.
SELECT EMPLOYEE_ID,FIRST_NAME,JOB_ID,SALARY,COMMISSION_PCT,SALARY*COMMISSION_PCT 
FROM EMPLOYEES;

--사원테이블에서 급여가 10000이상인 사원들의 정보를 사번,이름,급여순으로 출력

SELECT EMPLOYEE_ID,FIRST_NAME,SALARY 
FROM EMPLOYEES
WHERE SALARY >= 10000;

--사원테이블에서 이름이 Michael인 사원의 사번,이름을 조회
--문자열 데이터는 ''에 넣어서 표현

SELECT EMPLOYEE_ID,FIRST_NAME 
FROM EMPLOYEES
WHERE FIRST_NAME ='Michael';

--사원테이블에서 직종이 IT_PROG인 사원들의 정보를 사번,이름,직종,급여 순으로 조회

SELECT EMPLOYEE_ID,FIRST_NAME,JOB_ID,SALARY
FROM EMPLOYEES
WHERE JOB_ID ='IT_PROG';


--사원테이블에서 급여가 10000이상 13000이하인 사원의 정보를 이름,급여 순으로 조회하세요.

SELECT EMPLOYEE_ID,SALARY
FROM EMPLOYEES
WHERE SALARY >= 10000 AND SALARY <= 13000;

사원테이블에서 입사일이 05년9월21일 이후에 입사한 사원의 정보를 사번,이름,입사일 순으로 출력

SELECT EMPLOYEE_ID,FIRST_NAME,HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >= '2005-09-21';

--사원테이블에서 06년도에 입사한 사원들의 정보를 사번, 이름, 직종, 입사일 순으로 출력

select employee_id, first_name, job_id, hire_date 
from employees 
where hire_date>='2006-01-01' and hire_date<='2006-12-31';

--원테이블에서 직종이 SA_MAN이거나 IT_PROG인 사원들의 모든정보를 출력하시오
select * 
from employees 
where job_id = 'SA_MAN' or job_id='IT_PROG';

--사원테이블에서 급여가 2200, 3200, 5000, 6800를 받는 사원들의 정보를 사번, 이름 직종, 급여 순으로 출력
select employee_id, first_name, job_id, salary 
from employees 
where salary='2200' or salary = '3200' or salary='5000' or salary='6800';


--사원테이블에서 06년도에 입사한 사원들의 정보를 사번, 이름, 직종, 입사일 순으로 출력

select employee_id, first_name, job_id, hire_date 
from employees 
where hire_date BETWEEN'2006-01-01' and '2006-12-31';


--사원테이블에서 급여가 2200, 3200, 5000, 6800를 받는 사원들의 정보를 사번, 이름 직종, 급여 순으로 출력
select employee_id, first_name, job_id, salary 
from employees 
where salary IN (2200,3200,5000,6000);

--직종이 'SA_MAN', 'IT_PROG'가 아닌 모든 사원들의 정보를 출력
select * from employees where job_id not in('SA_MAN','IT_PROG');

--LIKE 유사검색
--쿼리문에 WHERE절에 주로 사용되며 부분적으로 일치하는 속성을 찾을 때 사용된다.
--% : 모든값
--_ : 하나의 값

--사원테이블에서 사원들의 이름 중 M으로 시작하는 사원들의 정보를 사번,이름,직종순으로 출력
SELECT employee_id, first_name, job_id
FROM EMPLOYEES
WHERE first_name LIKE 'M%';


--사원테이블에서 사원들의 이름 d로 끝나는 사원들의 정보를 사번,이름,직종순으로 출력
SELECT employee_id, first_name, job_id
FROM EMPLOYEES
WHERE first_name LIKE '%d';

--이름의 첫글자가 M이면서 총 7글자의 이름을 가진 사원정보를 사번,이름순으로 출력
select employee_id, first_name 
from employees 
WHERE  first_name LIKE 'M______';

--사원테이블에서 이름의 세번째 글자에 a가들어가는 사원들의 정보를 사번, 이름 순으로 출력
select employee_id, first_name 
from employees 
WHERE  first_name LIKE '__a%'

--이름에 소문자 o가 들어가면서 a로 끝나는 사원들의 정보를 이름,급여순으로 조회
SELECT first_name,salary 
from employees 
WHERE first_name LIKE '%o%a'; 

--이름이 H로 시작하면서 6글자 이상인 사원들의 정보를 사번,이름순으로 조회
SELECT employee_id,first_name
FROM employees 
WHERE  first_name LIKE 'H_____%';

--사원테이블에서 이름에 s가 들어있지 않은 사원들만 사번,이름으로 검색하세요
SELECT employee_id,first_name
FROM employees 
WHERE  first_name NOT LIKE '%s%';

--언더바 자체를 조회하고 싶으면 이스케이프문자 '%\_%'를 써야한다.


