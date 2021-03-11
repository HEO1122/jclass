package day18;

import java.text.*;
public class Test08 {

	public Test08() {
		float no = 32456.45678f;
		/*
		 * 이 숫자를 3자리 마다 , 를 붙이고 소수점 이하는 3자리까지만
		 * 출력하도록 하고싶다.
		 */
		//form1
		
		//먼저 형식을 정하고
		DecimalFormat form = new DecimalFormat("00,000,000.000");
		//형식에 맞는 문자열을 만들어준다.
		String str =form.format(no);
		//format(double number) => 숫자를 형식있는 문자열로 변환시켜주는 함수
		System.out.println(str);
		
		//form2
		
		//먼저 형식을 정하고
				DecimalFormat form1 = new DecimalFormat("##,###,###.###");
				//형식에 맞는 문자열을 만들어준다.
				String str1 =form1.format(no);
				//format(double number) => 숫자를 형식있는 문자열로 변환시켜주는 함수
				System.out.println(str1);
	}

	public static void main(String[] args) {
		new Test08();

	}

}
