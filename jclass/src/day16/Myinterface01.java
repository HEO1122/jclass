package day16;

public interface Myinterface01 {
/*
 * 인터페이스는 이제까지 우리가 사용했던 클래스와는 조금다른 특수한 클래스의 한 종류이다.
 * 내부에는 변수와 함수를 가질 수있다. 
 * 변수의 경우 자동적으로 public static final 변수가 되고
 * 함수의 경우 몸체가 있는 함수는 절대로 올 수 없고
 * 자동적으로 public abstract 함수가 된다.
 */
	int num=10;//이 변수는 자동적으로 static final 변수가 되므로 초기화가 필요하다.
//	void toPrint() {}; 
	/* 인터페이스 내부에는 몸체가 있는 함수가 절대로 오면 안된다.
	 * 
	 */
	void toPrint();//이때 이 함수는 자동적으로 public abstract가 붙게된다.
}
