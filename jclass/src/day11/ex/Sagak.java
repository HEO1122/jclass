package day11.ex;

public class Sagak {
	public int garo, sero;
	public int dool, nulb;
	
	public void setGS() {//���� ���� �����ϴ� �Լ�
		garo = (int)(Math.random()*(15-5+1)+5);
		sero = (int)(Math.random()*(15-5+1)+5);
	}
	
	public void setDool() {//�ѷ� �����ϴ� �Լ�
		dool= 2*garo + 2*sero;
	}
	public void setNulb() {//���� �����ϴ� �Լ�
		nulb = garo*sero;
	}
	public void print() {//����Լ�
		System.out.printf("���� :%2d , ����:%2d , �ѷ�: %2d ,  ����: %2d\n", garo, sero, dool, nulb);
	}
	
	
}
