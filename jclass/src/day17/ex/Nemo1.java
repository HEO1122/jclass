package day17.ex;
//�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(1)
public class Nemo1 {
	
	//����
	private int width, height;
	private int area;
	
	//Nemo ����
	public Nemo1() {}
	public Nemo1(int width, int height) {
		this. width = width;
		this. height = height;
		setArea();
	}
	
	//getter, setter
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {//�����ε� ,area����
		this.area = width * height;
	}
	
	//����Լ�
	public String toString() {
		return "�غ�" + width +"����"+ height + "����"+ area;
	}
	
	//equals �Լ� �������̵�
	public boolean equals(Object obj) {
		boolean bool = false;
		Nemo1 tmp =(Nemo1) obj;
		bool =this.area == tmp.area;
		return bool;
	}

}
