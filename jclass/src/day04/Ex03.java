package day04;
/*10부터 49까지의 수 중 정수 하나를 입력받아서
 * 10-19 : 총무부
 * 20-29 : 영업부
 * 30-39 : 회계부
 * 40-49 : 개발부
 * 로 출력해주는 프로그램을 작성하세요.
 * 
 * if ~ else if 구문으로 switch ~case 구문 2가지 모두 처리하세요.
 */
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		//10-49 숫자 입력받기
		Scanner sc = new Scanner(System.in);
		//숫자입력
		System.out.println("숫자를 입력하세요");
		int no = sc.nextInt();
		
		String result ="";
		
		//번호별 부서 나누기
		if( no>=10 & no<20) {
			result ="총무부";
		}else if(no>=20 & no<30) {
			result ="영업부";
		}else if(no>=30 & no<40) {
			result ="회계부";
		}else if(no>=40 & no<50) {
			result ="개발부";
		}else { result ="없는 부서입니다.";}
		
		//출력
		System.out.println(no + result);
	}
}
