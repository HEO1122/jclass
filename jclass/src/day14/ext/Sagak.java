package day14.ext;

public class Sagak extends Figure {
	private int width,height,area;// ���� ����
	
	public Sagak() {}//�⺻ ������ �Լ�
	public Sagak(int width, int height) {
		this.width =width; //�Ű����� ����
		this.height =height;
		setArea();
	}
	//private���� ���� �Լ������
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
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {//area ���� �ʱ�ȭ
		this.area = height *width;
	}
	public void toPrint() {//Figure.toPrint()�Լ� �������̵�
		System.out.printf("�簢���� �غ� : %2d, ���� :%2d, ���� : %4d\n", width, height,area);
	}

}
