package day10;

/* �� ��(����)�� �Է��ϸ� �� ���� ���� ���(����)�� �˷��ִ� �Լ�(add01)�� �����ϰ�
 * ���ڸ� �Է��ؼ� �����ϰ� ������ �߻����Ѽ� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Test02{
	public Test02() {
		//���� ������ �����ϰ� �����
		int no1= (int)(Math.random()* 10+1);
		int no2= (int)(Math.random()* 10+1);
		int no3= (int)(Math.random()* 10+1);
		//�� ���� ������� ���� �����غ�
		int result =add01(no1,no2,no3);
		//��� ����� ����ϰ�
		System.out.println("3���� ���� : "+no1+","+no2+","+no3+"�����Ѱ��:"+result);
	}


	public static void main(String[] args) {
		new Test02();
	}
	
	//�� ���� ���ϴ� ����� �Լ�
	int add01(int a, int b, int c) {
		//��ȯ�� ���� �غ�
		int result =0;
		//�� �� ����ؼ� ��ȯ�� ������ ����
		result = a+b+c;
		
		//��� ��ȯ
		return result;
	}
}
