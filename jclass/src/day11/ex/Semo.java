package day11.ex;

public class Semo {
	public int width, height;
	//�⺻ ������ : �� Ŭ������ ��ü�� �� �� �������� �⺻���� �������ִ� ����
	public Semo() {
		width= (int)(Math.random()*(15-5+1)+5);
		height = (int)(Math.random()*(15-5+1)+5);
	}
	//�������ϴ� �Լ�
	public double semArea() {
		return width * height* 0.5;
	}

}
