package day11.ex;

public class Circle {

	public int ban;
	public double dool, nulb;

	public Circle() {//������ �������� ����
		ban =(int)(Math.random()*(15-5+1)+5);
		getDool();
		getNulb();
	}
	
	//�ѷ� ���ϴ� �Լ�
	public double getDool() {
		dool =ban *2*3.14;
		return dool;
				
	}
	//���� ���ϴ� �Լ�
	public double getNulb() {
		nulb=ban*ban*3.14;
		return nulb;
	}
	//����ϴ� �Լ�
	public void toPrint() {
		System.out.printf("������ %2d, �ѷ� : %5.2f, ���� : %5.2f\n",ban,dool,nulb);
	}
}
