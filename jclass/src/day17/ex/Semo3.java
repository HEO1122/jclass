package day17.ex;

public class Semo3 {

	//����
	private int width, height;
	private double area;
	
	//����
	public Semo3() {
	}
	public Semo3(int width, int height) {
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
	public void setArea() { // �����ε�
		this.area = width*height*0.5;
	}
	
	//����Լ�
	public String toString() {
		return "�غ�" +width +"����"+ height+ "����"+area;
	}
	

public boolean equals(Object obj) {
	boolean bool = false;
	Semo3 tmp = (Semo3) obj;
	bool = this.height == tmp.height;
	return bool;
}
}
