package day13.ex;

public class MyPoint {
	private int x,y;//1. �� ����(int x,int y)�� ����ϴ� Ŭ���� MyPoint
	
	//2.1 �⺻������ �Լ�
	public MyPoint() {
		
	}
	//2.2 �� Ŭ������ new ��ų �� �ִ� ������ �Լ��� �����
	public MyPoint(int x1, int y1) {
		x =x1; // ==> setX(x1);
		y = y1;
	}
	//2.3�� ���� �迭�� �˷��ָ� �� ���� x, y�� ����ϴ� ������ �Լ�
	public MyPoint(int[] a) {
		/*x=a[0];
		y=a[1];
		*/
		this(a[0],a[1]);
	}
	//3/ ���� ���� �����
	public void setX(int x) {
		this.x =x;
	}
	public int getX() {
		return x;
	}
	//3.3 x,y�� ���ÿ� �������ִ� �Լ�
	public void setXy(int x, int y) {
		//this(a,b); this()�� ������ �Լ������� ����� �� �ְ� �� ù�������� ����ؾ��Ѵ�. 
		setX(x);
		setY(y);
	}
	
	public void setY(int y) {
		this.y =y;
	}
	public int getY() {
		return y;
	}
	//3.6) x�� y���� ������ִ� �Լ�(display)
	public void display() {
		System.out.println("x : " + x+ ", y : " +y);
	}
}
