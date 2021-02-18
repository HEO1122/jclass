package day04;
/*전기요금을 계산하는 프로그램을 작성하세요.
	
	전기요금은 용도별로 
				코드		기본요금	사용요금
		가정용	1		3800	245
		산업용	2		2400	157
		교육용	3		2900	169
		상업용	4		3200	174
		
		전기요금 계산식 : 기본요금 + 사용량 * 사용요금
		
	용도 코드와 사용량을 입력받아서 전기요금을 계산해주는 프로그램을 작성하세요.*/

import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		//코드 사용량 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("용도코드와 사용량을 입력하세요");
		
		int code = sc.nextInt();
		int use = sc.nextInt();
		int total=0 ;
		//요금 계산
		if (code ==1) {
			total=3800+ (use*245);
		}else if(code ==2) {
			total =2400 +(use*157);
		}else if(code==3) {
			total= 2900 +(use*169);
		}else if(code==4) {
			total=3200+(use*174);
		}
		//요금출력
		System.out.println("전기요금은 "+ total);
	}
}
