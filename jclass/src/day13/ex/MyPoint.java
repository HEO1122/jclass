package day13.ex;

public class MyPoint {
	private int x,y;//1. 두 변수(int x,int y)를 기억하는 클래스 MyPoint
	
	//2.1 기본생성자 함수
	public MyPoint() {
		
	}
	//2.2 이 클래스를 new 시킬 수 있는 생성자 함수를 만들고
	public MyPoint(int x1, int y1) {
		x =x1; // ==> setX(x1);
		y = y1;
	}
	//2.3두 수를 배열로 알려주면 그 수를 x, y에 기억하는 생성자 함수
	public MyPoint(int[] a) {
		/*x=a[0];
		y=a[1];
		*/
		this(a[0],a[1]);
	}
	//3/ 겟터 셋터 만들기
	public void setX(int x) {
		this.x =x;
	}
	public int getX() {
		return x;
	}
	//3.3 x,y를 동시에 셋팅해주는 함수
	public void setXy(int x, int y) {
		//this(a,b); this()는 생성자 함수에서만 사용할 수 있고 맨 첫문장으로 사용해야한다. 
		setX(x);
		setY(y);
	}
	
	public void setY(int y) {
		this.y =y;
	}
	public int getY() {
		return y;
	}
	//3.6) x와 y값을 출력해주는 함수(display)
	public void display() {
		System.out.println("x : " + x+ ", y : " +y);
	}
}
