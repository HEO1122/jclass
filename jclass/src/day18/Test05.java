package day18;
/*
 * 특정 사이트 주소를 입력한 후 : / .을 중심으로 분리해서 처리해보자
 */
import java.util.*;
public class Test05 {

	public Test05() {
		String url = "http://www.increpas.com:8080/ex/example.tst";
		StringTokenizer token = new StringTokenizer(url,":/.", true);
		/*
		 * 참고) 
		 * 	나눌 문자열은 여러개 입력하더라도 그 중 하나만 만족하면 
		 * 토큰분리가 된다.
		 */
		int count = token.countTokens();
		System.out.println(count);
//		for(int i =0; i<count; i++) {
//			String tmp = token.nextToken();
//			System.out.print(tmp +"|");
		while(token.hasMoreTokens()) {
			System.out.print(to);
		}
	}
	public static void main(String[] args) {
		new		Test05();
	}
}
