package day11.ex;

public class Won {
	public int rad;
	public double dool,nulb;
	
	public void radSet() {
		//������ �������ִ� �Լ�
		rad= (int)(Math.random()*(15-5+1)+5);
	}
	public void doolSet() {
		//�ѷ� �������ִ� �Լ�
		dool=rad*2*Math.PI;
	}
	public void nulbSet() {
		//���� �������ִ� �Լ�
		nulb= rad*rad*Math.PI;
	}
	public void print() {
		//����Ʈ ���ִ� �Լ�
		System.out.printf("������ :%2d ,�ѷ� :%5.2f , ���� :%5.2f \n", rad, dool,nulb);
	}
	
}
