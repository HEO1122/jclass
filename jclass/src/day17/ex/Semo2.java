package day17.ex;

public class Semo2 {
//�ﰢ���� �غ��� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(2)
	//����
	private int width, height;
	private double area;
	
	//����
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
	public void setArea() { // �����ε�
		this.area = width*height*0.5;
	}
	
	//����Լ�
	public String toString() {
		return "�غ�" +width +"����"+ height+ "����"+area;
	}
	

public boolean equals(Object obj) {
	boolean bool = false;
	Semo2 tmp = (Semo2) obj;
	bool = this.width == tmp.width;
	return bool;
}
}
