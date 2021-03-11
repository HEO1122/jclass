package day18;

/*
 *  문자열을 공백을 기준으로 단어를 나누어서 출력해보자
 */
import java.util.*;
public class Test04 {

	public Test04() {
		String str = "죽는 날까지 하늘을 우러러 한 점 부끄러움이 없기를";
/*
 * 위 문자열을 공백을 기준으로 분리하려면 
 * StringTokenizer를 이용해서 처리하면 간단하게 처리 할 수 있따.
 */
		
		StringTokenizer token = new StringTokenizer(str);
		/*
		 * 이렇게 문자열만 입력하면서 객체를 만들면 문자열 중 공백을
		 * 중심으로 단어들을 잘라서 기억하게 된다.
		 * 
		 * 이 결과 분리된 단어들이 순차적으로 임시 버퍼메모리에 기억이 된다.
		 * 
		 */
		int count = token.countTokens();
		/*
		 * 위의 문자열은 공백을 기준으로 7개로나눠져있다.
		 * 나눠진 단어를 출력하려면 반복해서 꺼내야 하는데...
		 */
//		String[] words = new String[count];
//		for(int i =0; i<count; i++) {
//			String tmp = (String)token.nextElement();
//			words[i] = tmp;
//			System.out.println(tmp);
//			}
//		for(String s : words) {
//			System.out.print(s +",");
//		}
		/* 이 때 꺼내온 단어는 임시 메모리에서 꺼내는 순간 삭제 된다.
			따라서 필요하면 배열등을 이용해서 다시 저장한 후 사용해야 한다.
		*/

		/*
		 * 나눠진 단어의 갯수를 몰라도 되는 경우
		 * 이 경우 각 단어들을 배열에 
		 */
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("잘려진 갯수 : "+ count);
		while(token.hasMoreTokens()) {
			//hasMoreTokens() : 임시 메모리에 꺼낼 데이터가 존재하는지 묻는 함수
			String tmp = token.nextToken();
			list.add(tmp);
			System.out.println(token.nextToken());
		}
		for(String s : list) {
			System.out.print(s +"|");
		}
	}

	public static void main(String[] args) {
		new Test04();

	}

}
