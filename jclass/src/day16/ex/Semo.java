package day16.ex;

public class Semo  implements Dohyung{
	private int width, height;
	private double area;
	
	//getter, setter함수
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	//세팅함수
	public Semo() {}
	
	public Semo(int width, int height) {//입력받은 값 세팅
		this.width = width;
		this.height = height;
		area = getArea();
	}
	//인터페이스 오버라이드
	public double getArea() {
		return width*height*0.5;
	}
	public void  toPrint() {
		System.out.printf("세모의 가로 : %2d, 세로 : %2d, 넓이 : %4.2f\n",width, height, area);
	}
}
