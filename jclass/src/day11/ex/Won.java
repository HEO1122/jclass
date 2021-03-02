package day11.ex;

public class Won {
	public int rad;
	public double dool,nulb;
	
	public void radSet() {
		//반지름 세팅해주는 함수
		rad= (int)(Math.random()*(15-5+1)+5);
	}
	public void doolSet() {
		//둘레 세팅해주는 함수
		dool=rad*2*Math.PI;
	}
	public void nulbSet() {
		//넓이 세팅해주는 함수
		nulb= rad*rad*Math.PI;
	}
	public void print() {
		//프린트 해주는 함수
		System.out.printf("반지름 :%2d ,둘레 :%5.2f , 넓이 :%5.2f \n", rad, dool,nulb);
	}
	
}
