package day10;

import java.util.Arrays;

/*
 * ���� 5���� ����� �迭�� �����
 * �� �迭�� ������ ������ �߻����Ѽ� ä���ִ� ����� �Լ��� �ۼ��ؼ� ����
 * �迭�� ������ ����ϼ���.
 */
public class Test04 {
	int no;
	int[] num = new int[5];
	public Test04() {
	System.out.println(Arrays.toString(num));
	System.out.println(no);
	
	abc();
	//�迭 ä���ִ��Լ� ����
	setNum();
	//���
	System.out.println(Arrays.toString(num));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test04();
	}
	
	//num�迭�� ������ �����ϰ� ä���ִ� �Լ�
	void setNum() {
		for(int i =0; i<5; i++) {
			int tmp= (int)(Math.random()*50+1);
			num[i] =tmp;
		}
		//�� �Լ� ���� ���� ������ �迭�� �����͸� ä���ֱ⸸ �ϸ� �Ǳ⶧����
		//��ȯ���� �ʿ����.
	}
	void abc() {
		System.out.println(Arrays.toString(num));
	}
}
