package Ex06_Calendar;

import java.util.Calendar;

public class Ex01_Calendar {
	//java.util 패키지에 있는 날짜와 시간 정보를 제공해주는 클래스
	//객체를 만들 때 new와 생성자를 이용하여 선언하지 않고
	//생성된 객체를 받아오는 형식으로 선언한다.
	public static void main(String[] args) {
		
	
	Calendar cal = Calendar.getInstance();
	/*
	 *  YEAR,MONTH,DATE	연도,월(0-11),일(1-31)을 나타내는 상수
		DAY_OF_MONTH	현재 달의 몇 번째 날인지를 나타내는 상수(1-31)
		DAY_OF_WEEK	현재 주의 몇 번째 날인지를 나타내는 상수(1-7),1은 일요일을 의미
		HOUR,MINUTE	시(0-11),분(0-59)을 나타내는 상수
		SECOND,MILLISECOND	초(0-59)와 1/1000초를 나타내는 상수
		HOUR_OF_DAY	현재 날의 시각을 의미하는 상수(0-23)
		AM_PM	HOUR가 정오보다 이전이면 0을, 이후이면 1의 값을 가지는 상수
		WEEK_OF_MONTH	현재 달의 몇 번째 주인지를 나타내는 상수
		WEEK_OF_YEAR	현재 해의 몇 번째 주인지를 나타내는 상수
	 */
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH)+1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	
	System.out.println("오늘 날짜는 " + year + "년 " + month+"월 " + day+"일 입니다.");
}
}


