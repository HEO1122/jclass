package day11.ex;
/*
 * ��2 ���� ������ ����� Ŭ����(Circle)�� �����ϰ� 
 * �� Ŭ������ 10���� ������ �迭�� ����
 * ������, �ѷ�, ���̸� ����ϼ��� 
 */
public class Ex02 {
		public static void main(String[] args) {
	//�� Ŭ���� 10�� ������ �迭 �����
	Circle[] circle = new Circle[10];
	//�迭 ä���ֱ�
	for(int i=0; i<circle.length; i++) {
		circle[i]= new Circle();
	}
	//������, �ѷ�, ���� ���
//	for(int i=0; i<circle.length; i++) {
//		int ban= circle[i].ban;
//		double dool1 = circle[i].dool;
//		double nulb1 = circle[i].nulb;
//		double dool = circle[i].getDool();
//		double nulb = circle[i].getNulb();
//		System.out.printf("������ : %2d,�ѷ� : %5.2f, ���� : %5.2f\n", ban, dool1,nulb1);
		for(Circle c : circle) {
			c.toPrint();
		}
	}
}