package day18;

/*
 * 특정문자열을 입력한 후 그 문자열 중
 * 규칙에 맞는부분만 골라서 출력해보자
 * 
 */
import java.util.regex.*;
public class Test02 {

	public Test02() {
		String tel ="전은석 : 010-3175-9042";
		//이 문자열 중에서 전화번호만 꺼내서 보고 싶다.
		//방법
		//1. 정규식 검사를 진행한다.
		Pattern pat = Pattern.compile("01[0-9]-[0-9]{4}-[0-9]{4}");
		Matcher mat = pat.matcher(tel);
		//2. 규칙에 맞는 부분이 있는지 확인한다.
		 // => Matcher클래스의find() 함수를 사용해서 맞는 부분이 있는지 확인한다.
		if(mat.find()) {
			//3. 규칙에 맞는 부분만 꺼내서 출력한다.
			String group = mat.group();
			//출력
			System.out.println("선생님 전화번호 : "+ group);
		}
	}

	public static void main(String[] args) {
		new Test02();

	}

}
