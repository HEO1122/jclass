package day18;

import java.util.*;
public class Test07 {

	public Test07() {
		Calendar cal = Calendar.getInstance();
		//년도
		int year = cal.get(Calendar.YEAR);
		//월
		int month = cal.get(Calendar.MONTH)+1;
		//일
		int date = cal.get(Calendar.DATE);
		System.out.println(year +"년"+month+"월"+date+"일");
		
	}

	public static void main(String[] args) {
	 new Test07();
	}

}
