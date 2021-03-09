package day16.ex;

public class Semo  implements Dohyung{
	private int width, height;
	private double area;
	
	//getter, setter�Լ�
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


	//�����Լ�
	public Semo() {}
	
	public Semo(int width, int height) {//�Է¹��� �� ����
		this.width = width;
		this.height = height;
		area = getArea();
	}
	//�������̽� �������̵�
	public double getArea() {
		return width*height*0.5;
	}
	public void  toPrint() {
		System.out.printf("������ ���� : %2d, ���� : %2d, ���� : %4.2f\n",width, height, area);
	}
}
