package day16.ex;

public class Nemo implements Dohyung {
	private int width, height, area;
	
	//세팅함수
	public Nemo() {
		
	}
	public Nemo(int width, int height) {//오버로딩
		this.width=width;
		this.height=height;
	}
	//getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return height;
	}

	public void setHeigth(int height) {
		this.height = height;
	}
	//인터페이스 오버라이드
	public double getArea() {
		 area = width*height;
		return area;
		
	}
		public void  toPrint() {
			System.out.printf("네모의 가로 : %d, 세로 : %d, 넓이 :%d",width,height, area);
	}
}
