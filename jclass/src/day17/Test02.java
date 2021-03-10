package day17;

import java.util.*;
public class Test02 {

	public Test02() {
		Scanner sc = new Scanner(System.in);
		
		try{//이 경우는 강제로 MyException예외를 발생시켜야 한다.
			while(true) {
					System.out.print("정수입력 : ");
					int no =sc.nextInt();
					if(no==0) {
						throw new MyException();
					}
					else if(no ==-1) {
						break;}
					System.out.println("no : "+no);
		
				}
			}catch(MyException e) {
			System.out.println(e);}
	}
		

	public static void main(String[] args) {
		new Test02();

	}
	public class MyException extends Exception{
		//전역 내부 클래스
		//이 클래스는 0이 입력되면 발생되는 사용자 정의 예외를 처리해 주는 클래스
		//따라서 예외의 원인은 0이 입력되었다는 것을 알려주는 것이된다.
		public String toString() {
			return "ㅇㅖ외 0이 입력되었습니다.";
		}
	}

}
