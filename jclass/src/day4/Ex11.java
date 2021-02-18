package day4;
//문제 11 ]
//		3자리 숫자를 입력받아서
//		이 숫자에서 가장 가까운 100의 배수를 만들기 위해서는
//		얼마가 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
//		
//		예 ]
//			241		- 200이 가까우므로 41 빼야 한다.
//100으로 나눈 나머지가 50보다 작으면 나머지를 빼주면 되고 50보다 크면 100에서 나머지를 뺀 수를 더해준다.
//기준은 50, 50보다 작은 경우 나머지 빼주면되고 그 외는 100에서 나머지를 뺸 값을 더해주면된다.
import java.util.*;
public class Ex11 {
	public static void main(String[] args) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//입력받아 변수에 저장
		System.out.println("3자리 숫자를 입력하세요");
		int no= sc.nextInt();
		//나머지 변수에 기억시키기
		int rest = no %100;
		
		int result = 0;
		String msg = "";
		//조건에 따라 처리
		/*int result = (rest <50) ? (no-rest) : (no+(100-rest));
		String msg =(rest<50) ? result +"와 가까우므로"+(no - result) + "빼줘야한다." :
			result +"와 가까우므로" + (no+result)
			+"더해줘야한다";
		//결과 출력\
		System.out.println("입력한 숫자: " + no + "-"+ msg);
		*/
		
		if( rest <50) {
			result = no -rest;
			msg = result + " 와 가까우므로 " + rest + " 를 빼줘야한다.";
		}
		else {
			result = no+(100-rest);
			msg = result + " 와 가까우므로 " + (100- rest) + " 를 더해줘야 한다. ";
		}
		System.out.println("입력한 숫자: " + no + "-"+ msg);
	}
}
