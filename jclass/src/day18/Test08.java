package day18;

import java.text.*;
public class Test08 {

	public Test08() {
		float no = 32456.45678f;
		/*
		 * �� ���ڸ� 3�ڸ� ���� , �� ���̰� �Ҽ��� ���ϴ� 3�ڸ�������
		 * ����ϵ��� �ϰ�ʹ�.
		 */
		//form1
		
		//���� ������ ���ϰ�
		DecimalFormat form = new DecimalFormat("00,000,000.000");
		//���Ŀ� �´� ���ڿ��� ������ش�.
		String str =form.format(no);
		//format(double number) => ���ڸ� �����ִ� ���ڿ��� ��ȯ�����ִ� �Լ�
		System.out.println(str);
		
		//form2
		
		//���� ������ ���ϰ�
				DecimalFormat form1 = new DecimalFormat("##,###,###.###");
				//���Ŀ� �´� ���ڿ��� ������ش�.
				String str1 =form1.format(no);
				//format(double number) => ���ڸ� �����ִ� ���ڿ��� ��ȯ�����ִ� �Լ�
				System.out.println(str1);
	}

	public static void main(String[] args) {
		new Test08();

	}

}
