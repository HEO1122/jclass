package day16.ex;

public class Nemo implements Dohyung {
	private int width, height, area;
	
	//�����Լ�
	public Nemo() {
		
	}
	public Nemo(int width, int height) {//�����ε�
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
	//�������̽� �������̵�
	public double getArea() {
		 area = width*height;
		return area;
		
	}
		public void  toPrint() {
			System.out.printf("�׸��� ���� : %d, ���� : %d, ���� :%d",width,height, area);
	}
}
