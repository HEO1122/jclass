package day10;

public class Test01 {
	/*
	 * ����) static(�����Ӽ�) =>������ �Լ��� ���� �� �ִ� �Ӽ��̴�.
	 * 		Ư¡) static �Լ������� static ����� ȣ���� �� �ִ�.
	 * 
	 */
	int num1=100;
	public Test01() { //�⺻�������Լ�
		num1=200;
		//System.out.println(num1);
		
		int[] result =calc(2,5);
		calc(10,5);//�Լ��� �������� ������� ���� ���� ������ ����Ű�� �ʴ� ��쵵 �ֵ�.
		
		System.out.println("2��5�� + ����"+result[0]);
		System.out.println("2��5�� - ����"+result[1]);
		System.out.println("2��5�� * ����"+result[2]);
		System.out.println("2��5�� / ����"+result[3]);
		System.out.println("2��5�� % ����"+result[4]);
	}
	
	
	//System.out.println(num);Ŭ���� �� �ٷ� �Ʒ������� �Ϲݸ���� �����ϸ� �ȵȴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test01();
		
		Math.random()=
		/*static �Լ��������� static���(����,�Լ�0�� �޸𸮿� �÷��� �͸� ����� �� �ִ�.
	}
//�� ���� �Է¹޾Ƽ� + - * / % ������ ���(����)�� �˷��ִ� �Լ��� �����ϰ� �����ϼ���
//�� ���� ������ִ� �Լ�
	int[] calc(int a, int b) {
		//��ȯ�� ���� ����
		int[] no = new int[5];
		
		//������� ����� �迭�� �ִ´�.
		no[0]= a+b;
		no[1]= a-b;
		no[2]= a*b;
		no[3]= (b==0)? 0 : a/b;
		no[4]= a%b;
		
		return no; 
		/*
		 * return => �Լ����� ����ϴ� ��ɾ�� �ǹ̴� 
		 * ���� �������� �Լ��� �������
		 * ���� ��ȯ���� ������ ��ȯ���� ��ȯ�ϰ� ��� �����ϼ���.�� �ǹ��̴�.
		 */
		
	}
}
