package day18;

//휴대폰번호의 정규식 검사를 해보자
import java.util.regex.*;
public class Test01 {

	public Test01() {
		/* 
		 * 문자열안에 "를 표현할려면 곤란한 상황이 발생한다
		 * 이때 사용하는 문자가 이스케이프 문자이다.
		 * 표현하려는 특수문자 앞에 \를 붙여주면 된다.
		 * 
		 * 문자의 경우도 마찬가지다
		 */
		/*
		String str = "\"abcd\"";
		System.out.println("str: "+str);
		char ch = '\'';
		*/
		
		//핸드폰 번호
		String phone = "010-3175-9042";
		/* 
		 * 1.Pattern 클래스르 이용해서 검사하고 싶은 정규식 문법을 만든다.
		 * 	참고) 이 클래스는 생성자 함수의 접근지정자가 private로 감춰놓은 경우에 해당한다.
		 * 그리고 이 클래스는 속성이 final 속성이 적용되어있고
		 * 의미는 이 클래스를 더이상 상속받은 클래스는 만들 수 없다는 의미이다.
		 * 따라서 이 클래스는 외부에서  new 시켜서 사용할 수 없는 클래스이고
		 * 상속 시켜서 그 클래스의 인스턴스를 변수로 받아서 사용할 수 도없다.
		 * 이 경우 이 클래스의 객체를 사용하려면 소속 함수중 속성이 static이면서 
		 * 반환값이 Pattern 인 함수를 사용하면 된다.
		 * 그런 함수가 compile()가 있다.
		 */
		
		Pattern pattern = Pattern.compile("01[0-9]-[0-9]{4}-[0-9]{4}");
		/*
		 * 2.이 클래스에게 정규식 문법에 맞는지 검사해 달라고 요청해야 한다.
		 * 문법검사하는 함수는 matcher()
		 * 이 함수는 검사결과를  Matcher라는 클래스로 
		 * 결과에 대한 모든 정보를 묶어서 반환하도록 되어있다.
		 */
		//정규식 검사결과 받는 변수
		Matcher mat = pattern.matcher(phone);
		//이제 Matcher 객체에는 검사결과의 정보가 기억되어 있다.
		//검사결과를 알려주는 함수가 존재하는데 
		//Matcher 클래스의 멤버중 matches() 함수이다.
		boolean bool = mat.matches();
		if(bool) {
			System.out.println("##올바른 휴대폰 번호입니다.");
		}else {
			System.out.println("올바른 휴대폰 번호가 아닙니다.");
		}
	/*
	 * 정리) 정규식 검사방법
	 * 1. 정규식 패턴을 Pattern 객체로 만든다.
	 * Pattern pattern = Pattern.compile("정규식패턴");
	 * 
	 * 2. 문자열이 패턴에 맞는지 검사한다.
	 * 	Matcher mat = pattern.matcher("검사할 데이터");
	 * 
	 * 3. 검사결과를 꺼내서 사용한다.
	 * boolean bool = mat.matches();
	 * 
	 */
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test01();
	}

}
