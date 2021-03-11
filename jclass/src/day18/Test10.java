package day18;
/*
 * 학생의 점수를 입력받아서 학점을 출력하는 프로그램을 작성하세요
 */
import java.text.*;
public class Test10 {

	public Test10() {
		//switch case 대신해서 만들수 있음
		double[] limits = {0,60,70,80,90};
		/*
		 * limits 배열을 만들때 주의사항
		 * 반드시 오름차순으로 정렬되어야 한다.
		 * 이것의 의미는 0~59 사이는 하나의 문자로 바꾸고
		 * 				60~69 사이는 하나의 문자로 바꾸고
		 * 				70~79 사이는 하나의 문자로 바꾸고
		 * 					...
		 * 				90~ 하나의 문자로 바꾸세요
		 */
		String[] formats = {"F","D","C","B","A"};
		/*
		 * formats을 만들 때 주의사항
		 * 	limits 갯수와 반드시 일치해야 한다.
		 */
		ChoiceFormat form = new ChoiceFormat(limits,formats);
		//특정점수를 받은 학생의 학점을 출력해보자
		int score = 59;
		String grade = form.format(score);
		//출력
		System.out.println(score +":"+grade+"학점");
	}
	public static void main(String[] args) {
		new Test10();
	}
}
