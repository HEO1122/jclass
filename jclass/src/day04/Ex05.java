package day04;
/*컴퓨터와 가위바위보 게임을 할 프로그램을 제작하세요.

컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생해서
	1 - 가위
	2 - 바위
	3 - 보
로 가정하고
사용자 역시 1 ~ 3 사이의 숫자를 입력하도록 한다.

누가 이겼는지 확인하는 프로그램을 작성하세요.
컴퓨터가 이기면 -1을 반환하도록하고
사용자가 이기면 1을 반환하도록 하고
비기면 0을 반환하도록한다.

힌트 ]
		컴퓨터		가위		바위		보
	사용자	가위		0		-1		1
			바위		1		0		-1
			보		-1		1		0*/
import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		//숫자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 가위\r\n" + 
				"	2 - 바위\r\n" + 
				"	3 - 보 중에 하나를 입력하세요");
		int user = sc.nextInt();
		//컴퓨터 숫자 생성
		int com = (int)(Math.random()*(3-1+1)+1);
		//반환값
		int retun = 0; 
		// 둘이 비교
		if (user ==1 & com ==1) {
			retun =0;
		}else if( user ==1 & com==2) {
			retun = -1;
		}else if(user==1& com==3) {
			retun =1;
		}else if(user ==2& com==1) {
			retun=1;
		}else if(user ==2 & com==2) {
			retun =0;
		}else if(user ==2 & com ==3) {
			retun =-1;
		}else if(user ==3 & com==1) {
			retun =-1;
		}else if(user ==3 & com==2) {
			retun =1;
		}else if(user ==3 & com ==3) {
			retun=0;
		}
		
		//반환 출력
		System.out.println
	}

}
