package day16;
	
import java.util.*;
public class Test08 {
int num;
	public Test08() {
		int no = 0;
		/*try {
			no =addNum();
			
		}catch(NumberFormatException e) {
			System.out.println("숫자형식이 아니에요");
		}catch(Exception e) {
			System.out.println("알수없는 예외가 발생했어요");
		}*/
		System.out.println(addNum1());
	}

	public static void main(String[] args) {
		new Test08();
	}
	//숫자를 입력받아서 정수로 변환 후 10을 더해서 반환해주는 함수
	public int addNum() throws NumberFormatException, Exception {
		int result =0;
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//메시지 출력
		System.out.println("정수입력 : ");
		//문자열 변수에 입력데이터 저장
		String sno = sc.nextLine();
		//만약 5가 입력되면 강제로 예외를 발생시켜주자.
		if(sno.equals("5")) {
			throw new Exception();
		}
		//정수변환
		int no =Integer.parseInt(sno);
		
		//계산하고
		result = no =10;
		return result;
	}
	public int addNum1() {
		int result =0;
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//메시지 출력
		System.out.println("정수입력 : ");
		//문자열 변수에 입력데이터 저장
		String sno = sc.nextLine();
		int no =0;
		try {
			//만약 5가 입력되면 강제로 예외를 발생시켜주자.
			if(sno.equals("5")) {
				throw new Exception();
			}
			//정수변환
			no =Integer.parseInt(sno);
		}catch(NumberFormatException e) {return no+1;}
		catch(Exception e) {return no+5;}
		finally {
			num=90;
		}
		
		//계산하고
		result = no +10;
		return result;
	}
}
