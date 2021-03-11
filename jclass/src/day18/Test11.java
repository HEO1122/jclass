package day18;

import java.text.*;
public class Test11 {

	public Test11() {
		/*
		 * ChoiceFormat을 만들 때 limits와 formats를 하나로 만들 수 있다.
		 * 만드는 형식)
		 * 60#D : 작거나 같다의 의미 =<
		 * 70<C : <의 의미이다.
		 * 
		 * 이것을 |를 이용해서 연결하여 사용하면된다.
		 */
		String pattern ="0#F|60#D|70#C|80<B|90#A";
		/*
		 * 60#D : 60<= 의미 다음 숫자보다 작은 경우는 D로 치환하세요
		 * 80<B : 80< 의미이고 다음 숫자보다 작은경우는 B로 처리하세요
		 */
		ChoiceFormat form = new ChoiceFormat(pattern);
		int score = 90;
		String grade = form.format(score);
		System.out.println(score + "| "+ grade);
	}

	public static void main(String[] args) {
		new Test11();
	}
}
