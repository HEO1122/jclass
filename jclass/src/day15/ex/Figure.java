package day15.ex;

/* 
 * 추상 클래스 형식)
 * [접근지정자] abstract class 클래스이름 {}
 * 
 * 
 */
public abstract class Figure {
	public abstract double getArea();
	/* 
	 * 추상함수 형식 )
	 * [접근지정자] abstract 반환값타입 함수이름( 매개변수);
	 * ==> 절대로 블럭{}이 생기면 안된다.
	 */
	public abstract void toPrint();
}
