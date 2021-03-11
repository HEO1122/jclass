package day18;
/*
 * 아이디 8글자 첫글자 소문자, 뒷글자 숫자만들기
 */
import java.util.regex.*;

public class Test1_2 {

	public Test1_2() {
		String id = "adfdd2f2";
		Pattern pattern = Pattern.compile("[a-z][a-zA-Z0-9]{6}[0-9]");
		Matcher mat = pattern.matcher(id);
		
		boolean bool = mat.matches();
		if(bool) {
			System.out.println("올바른 아이디 입니다.");
		}else {
			System.out.println("올바른 아이디가 아닙니다.");
		}
	}

	public static void main(String[] args) {
		new Test1_2();

	}

}
