package day10.ex;

import java.util.Arrays;

/*
 * 5���� ���ڸ� �����ϴ� �����迭�� �Է¹޾Ƽ� �迭�� ���� ��� ���ڸ� ���ϴ� ����� 
		�Լ��� �����ϰ� ����� ����ϼ���.
		
		1. �迭�� �Է����ָ� �հ踦 ��ȯ���ִ� �Լ�
		
		�߰��۾� ]
			�� �濡 ���ڸ� �������ִ� �Լ�
			������ �Է��ϸ� ������ŭ�� ������ ����ϴ� �迭�� ���� ��ȯ���ִ� �Լ�
			
			�迭�� ���ڸ� �Է��ϸ� �迭�� ����� ���ڸ� ������ִ� �Լ�
 */
public class Ex06 {
	public Ex06() {
		int[] num = setData();
		System.out.println(Arrays.toString(num));
		System.out.println("�հ� : " + getSum(num));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
		//�迭�� �Է����ָ� ���� ��ȯ���ִ� �Լ�
		public int getSum(int[] num) {
			//��ȯ�� ���� ����� 
			int sum =0;
			//�հ� ����ϰ�
			for(int i =0; i<num.length; i++) {
				sum=sum+num[i];//������ ������ �̾Ƽ� �������
			}
			//������ �հ� ��ȯ
			return sum;
		}
		//�迭 �����Լ�
		public int[] setData() { 
			//��ȯ���� �迭 �����
			int[] num= new int[5];
			//������ �����ϰ�
			for(int i =0; i<5; i++) {
				num[i] =(int)(Math.random()*90 +10);
				
			}
			//�迭��ȯ
			return num;
		}
		//�迭 ������ִ� �Լ�
		public int[] getArray(int cnt) {
			return new int[cnt];
		}
		//�迭�� �Է¹޾Ƽ� �����͸� �����ϰ� �����ϰ� ��ȯ���ִ� �Լ�
		public int[] setData(int[] num) {
			return num[];}
		}
	}

}
