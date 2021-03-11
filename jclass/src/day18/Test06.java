package day18;

/*
 * 현재 컴퓨터의 날짜와 시간을 출력해보자
 */
import java.util.*;
public class Test06 {

	public Test06() {
	Date date = new Date();
	try {
	Thread.sleep(3000);
	}catch(Exception e) {}
	
	for(int i = 0; i<10;i++) {
		try {
		Thread.sleep(1000);
		}catch(Exception e) {}
		date= new Date();
	}
	;
	//년도, 월, 일 , 요일 ,시간, 분 , 초를 출력하자
	int year= date.getYear()+1900;
	//년도의 기준은 1900년 기준으로 하기 때문에 꺼내온 데이터에 1900을 
	//더해줘야 정확한 년도가 나온다
	int month =date.getMonth()+1;
	System.out.println(year+"년");
	//월의 시작을 0 부터 계산하기 때문에 정확한 달은 +1을 해줘야 한다.
	System.out.println(month+"월");
	
	int day = date.getDate();
	System.out.println(day+"일");
	
	int week =date.getDay();
	String sweek= getSweek(week);
	//요일은 0~6까지의 숫자로 반환해주고 각각 일요일부터 토요일 까지를 의미한다.
	System.out.println(week);
	System.out.println(sweek+",");
	//시간
	int hour =date.getHours();
	System.out.println(hour+"시");
	//분
	int min =date.getMinutes();
	System.out.println(min);
	//초
	int sec =date.getSeconds();
	System.out.println(sec);
	
	}
	public String getSweek(int week) {
		String sweek="";
		switch(week) {
		case 0 :
			sweek= "일요일";
			break;
		case 1 :
			sweek= "월요일";
			break;
		case 2 :
			sweek= "화요일";
			break;
		case 3 :
			sweek= "수요일";
			break;
		case 4 :
			sweek= "목요일";
			break;
		case 5 :
			sweek= "금요일";
			break;
		case 6 :
			sweek= "토요일";
			break;
		}
		
		return sweek;
	}

	public static void main(String[] args) {
		new Test06();

	}

}
