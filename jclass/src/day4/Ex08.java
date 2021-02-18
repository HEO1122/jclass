package day4;
/*알파벳 문자 하나를 입력한 후
	그 문자가 대문자이면 소문자로
	소문자이면 대문자로 변환시켜서 
	출력해주는 프로그램을 작성하세요.
	a
문자열 입력 방법 
1. 문자열을 입력받고 sc.nextLine(),scNext()
2.문자열의 첫번째 위치의 문자를 뽑아낸다.
 문자열 데이터.charAt(0)	

 (참고)
 charAt(index)
 문자열의 특정위치의 문자를 반환해주는 함수
 -String str="abcd";
 3번쨰 위치 문자
 char ch= str.charAt(2);
 데이터베이스에서는 위치갑이 1부터 시작이었지만 다른 모든 언어는 위치값이 0부터 시작한다.
 
 */

import java.util.*;
public class Ex08 {
	public static void main (String[] args) {
	
	//알파벳 입력	
	Scanner sc = new Scanner(System.in);
	System.out.println("알파벳을 입력하세요");
	
	String a = sc.nextLine();
	char ch =  a.charAt(0);
	char ch1=0;
	//대소문자 판별//if else 처리법
	
	if (ch>='A' | ch <='Z') {
		ch1= (char) (ch + ('a' - 'A'));
	}else {
		ch1 = (char)(ch - ('a' - 'A'));
	}
	
	System.out.println("알파벳변환:"+ch);
	/*3항연산자 해결방법
	 * ch1 =(ch<='Z')?(char)(ch+('a'-'A')) : (char)(ch-('a'-'A'));
	 * 
	 * 
	 * 
	 */
	
	
	}
	

}
