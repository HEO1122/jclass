package day11.ex;

public class Sam {
	public int garo, sero;
	public double  nulb;
	
	public void samSet() {//���� ���� �����Լ�
		garo = (int)(Math.random()*(15-5+1)+5);
		sero = (int)(Math.random()*(15-5+1)+5);
	}

	public void nulbSet() {
		nulb = garo*sero *0.5;
	}
	public void print() {
		System.out.printf("�ﰢ���� ���� %2d, ���� %2d, ����%5.2f\n",garo,sero, nulb);
	}
}
