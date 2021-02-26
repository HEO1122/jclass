package day10.ex;

/* ����1
 * ������ �Է��ϸ� �Է��� ������ ���������� �ϴ� ���� �η�,
 * ���̸� �Ѳ����� ��ȯ���ִ� �Լ�(setCircle)�� ����� �����ؼ� ����� ����ϼ���.
 * �������� 15~45 ���̷� �����ϰ� �Էµǰ� �ϼ���. 
 */
public class Ex01 {
	public Ex01() {
		//String str = new String();
		//������ �����ϰ� �����
		int rad =(int)(Math.random()*31+15);
		//������� ���ڸ� ���������� �ϴ� ���� ���� �迭 �����
		double[] circle = setCircle(rad);
		//������� �迭 ���
		System.out.println("���� ������"+circle[0]);
		System.out.println("���� �ѷ�"+circle[1]);
		System.out.println("���� ����"+circle[2]);

	}
	public static void main(String[] args) {
		new Ex01();
	}
	//���� ������ ����ϴ� �迭�� ��ȯ���ִ� �Լ�
	public double[] setCircle(int r) {
		//��ȯ������ �����
		double[] result = new double[3];
		result[0]= r;
		result[1]= 2*r*Math.PI;
		result[2]= r*r*Math.PI;
		return result;
	}
}
