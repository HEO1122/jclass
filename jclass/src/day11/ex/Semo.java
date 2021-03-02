package day11.ex;

public class Semo {
	public int width, height;
	//기본 생성자 : 이 클래스가 객체가 될 때 변수들의 기본값을 셋팅해주는 역할
	public Semo() {
		width= (int)(Math.random()*(15-5+1)+5);
		height = (int)(Math.random()*(15-5+1)+5);
	}
	//면적구하는 함수
	public double semArea() {
		return width * height* 0.5;
	}

}
