package day4;

public class Ex07 {
	public static void main(String[] args) {
		//3�� ���� �����ϰ� �߻�
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double result;
		// ���� ũ�� ��
		result=(a>b) ? ((a>c) ? (a) : (c)) : ((b>c) ? (b) : (c));
		//���� ���
		System.out.println("1:" + a); 
		System.out.println("2 :" + b); 
		System.out.println("3 :" + c); 
		System.out.println("������ū ���� :" + result); 
		
		
	}
}
