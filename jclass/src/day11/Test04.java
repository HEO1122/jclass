package day11;

public class Test04 {
	int code =0; //�� ������ �� Ŭ���� ������ ��� �������� ����� �� �ִ� ���������̴�.
	public Test04() {
		System.out.println("����� Test04Ŭ����");
		Test01 t = new Test01();// Test01 Ŭ���� Ÿ���� ���� ���� , ���� �ʱ�ȭ = object
								//�̶� heap type�� Test01
		double result = t.calc("12*2");
		System.out.println("12*2" +result);
		System.out.println("Test01.num"+ t.num);
		Test01 t1 =new Test01();
		System.out.println();
	}
	public void abc() {
		System.out.println(code);
		if( true) {
			System.out.println(code);
		}
	}
	
	public static void main(String[] args) {
		new Test04();
		//System.out.println(code); static ����� ��� ���� static�� ���� �޸𸮿� �ö� ����
	}
}
