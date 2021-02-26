package day10;

public class Test01 {
	/*
	 * 참고) static(정적속성) =>변수나 함수에 붙을 수 있는 속성이다.
	 * 		특징) static 함수에서는 static 멤버만 호출할 수 있다.
	 * 
	 */
	int num1=100;
	public Test01() { //기본생성자함수
		num1=200;
		//System.out.println(num1);
		
		int[] result =calc(2,5);
		calc(10,5);//함수의 실행결과를 사용하지 않을 경우는 변수로 기억시키지 않는 경우도 있따.
		
		System.out.println("2와5의 + 연산"+result[0]);
		System.out.println("2와5의 - 연산"+result[1]);
		System.out.println("2와5의 * 연산"+result[2]);
		System.out.println("2와5의 / 연산"+result[3]);
		System.out.println("2와5의 % 연산"+result[4]);
	}
	
	
	//System.out.println(num);클래스 블럭 바로 아래에서는 일반명령을 실행하면 안된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test01();
		
		Math.random()=
		/*static 함수내에서는 static멤버(변수,함수0와 메모리에 올려진 것만 사용할 수 있다.
	}
//두 수를 입력받아서 + - * / % 연산의 결과(정수)를 알려주는 함수를 제작하고 실행하세요
//두 수를 계산해주는 함수
	int[] calc(int a, int b) {
		//반환값 변수 선언
		int[] no = new int[5];
		
		//순서대로 결과값 배열에 넣는다.
		no[0]= a+b;
		no[1]= a-b;
		no[2]= a*b;
		no[3]= (b==0)? 0 : a/b;
		no[4]= a%b;
		
		return no; 
		/*
		 * return => 함수에서 사용하는 명령어로 의미는 
		 * 현재 실행중인 함수를 즉시종료
		 * 만약 반환값이 있으면 반환값을 반환하고 즉시 종료하세요.의 의미이다.
		 */
		
	}
}
