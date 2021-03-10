package day17.ex;
//삼각형의 정보를 기억할 Semo 클래스를 제작
public class Semo {
	//변수
	private int width, height;
	private double area;
	
	//세팅
	public Semo() {
	}
	public Semo(int width, int height) {
		this.width = width;
		this.height =height;
		setArea();
	}
	
	//getter,setter
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() { // 오버로딩
		this.area = width*height*0.5;
	}
	
	//출력함수
	public String toString() {
		return "밑변" +width +"높이"+ height+ "넓이"+area;
	}
	
	//equals 함수 오버라이드
	public boolean equals(Object obj) {
		boolean bool = false;
		Semo tmp =(Semo) obj;
		
				return bool;
	}
	

}
