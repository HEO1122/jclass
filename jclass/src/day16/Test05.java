package day16;

import java.util.*;
public class Test05 {

	public Test05() {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		//메시지 출력
		System.out.print("정수 입력 :");
		String str = sc.nextLine();
		int[] num = new int[1];
		int no = 0;
	
		try {
			no	=	Integer.parseInt(str);
			num[0]=no;
			
		}/*
		상위 예외가 먼저 기술되면 이후의 catch블럭은 실행할 수 없는 상태가 된다.
			e.printStackTrace();
		}*/
		catch(NumberFormatException e) {
			//예외 정보 출력하는 방법
			//1. 변수를 출력하는 방법
//			System.out.println(e);//예외정보만 출력
			//2. 예외의 정보와 위치까지 출력하는 방법
		}
			catch(Exception e){ 
			e.printStackTrace();
			}
			no=-999;
		}
		System.out.println("no:"+ no);
	}

	public static void main(String[] args) {
	new Test05();
	}

}
