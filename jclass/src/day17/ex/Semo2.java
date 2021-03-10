package day17.ex;

public class Semo2 {
//삼각형의 밑변이 같으면 같은 삼각형으로 처리되도록 하세요(2)
	//변수
	private int width, height;
	private double area;
	
	//세팅
	public Semo2() {
	}
	public Semo2(int width, int height) {
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
	

public boolean equals(Object obj) {
	boolean bool = false;
	Semo2 tmp = (Semo2) obj;
	bool = this.width == tmp.width;
	return bool;
}
}
