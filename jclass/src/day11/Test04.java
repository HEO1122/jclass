package day11;

public class Test04 {
	int code =0; //이 변수는 이 클래스 내에서 어느 곳에서나 사용할 수 있는 전역변수이다.
	public Test04() {
		System.out.println("여기는 Test04클래스");
		Test01 t = new Test01();// Test01 클래스 타입의 변수 선언 , 변수 초기화 = object
								//이때 heap type은 Test01
		double result = t.calc("12*2");
		System.out.println("12*2" +result);
		System.out.println("Test01.num"+ t.num);
		Test01 t1 =new Test01();
		System.out.println();
	}
	public void abc() {
		System.out.println(code);
		if( true) {
			System.out.println(code);
		}
	}
	
	public static void main(String[] args) {
		new Test04();
		//System.out.println(code); static 멤버의 경우 예외 static은 먼저 메모리에 올라가 있음
	}
}
