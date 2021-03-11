package day18;
//심플데이터포맷

import java.text.*;
import java.util.*;
public class Test09 {

	public Test09() {
	Calendar cal = Calendar.getInstance();
	
	Date date = cal.getTime(); // Date 타입으로 변환
	
	SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH : mm :ss");
	String sdate = form.format(date);
	System.out.println(sdate);
	}

	public static void main(String[] args) {
		new Test09();

	}

}
