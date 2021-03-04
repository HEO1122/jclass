package day13.ex;
/*
 * ����2�� 
 * 1. �� ����(int x,int y)�� ����ϴ� Ŭ���� MyPoint�� �ۼ��ϰ�
 * 2. ����ڰ� �� Ŭ������ new ��ų �� �ִ� ������ �Լ��� �����
 *  1)�⺻������ �Լ�
 *  2) �� ���� �˷��ָ� �� ���� x,y�� ����ϴ� ������ �Լ�
 *  3)�� ���� �迭�� �˷��ָ� 
 *    �� ���� x,y�� ����ϴ� ������ �Լ��� ���弼��
 * 3. �Լ��� �߰�
 *  1)x���� �������ִ� �Լ�
 *  2)y���� �V�����ִ� �Լ�
 *  3)x,y�� ���ÿ� �������ִ� �Լ�
 *  4)x���� �������� �Լ�
 *  5)y���� �������� �Լ�
 *  6)x�� y���� ������ִ� �Լ�(display)
 */
public class Ex02 {

	public Ex02() {
		MyPoint p1 = new MyPoint();
		p1.display();
		
		// ���� ����
		p1.setX(10);
		System.out.println("p1.x : " + p1.getX());
		
		MyPoint p2 = new MyPoint(3, 5);
		p2.display();
		System.out.println("p1.x : " + p2.getX());
		//�迭�� ��ü�����
		int[] no = {5,10};
		MyPoint p3 = new MyPoint(no);
		MyPoint p4 = new MyPoint(new int[] {5,10});
		
		p3.display();
		p4.display();
	}	

	public static void main(String[] args) {
		new Ex02();
	}

}
