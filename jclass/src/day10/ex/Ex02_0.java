package day10.ex;

import java.util.Arrays;

/*
 * 5������ ������ �����ϰ� �߻����Ѽ� �迭�� ��ȯ���ִ� �Լ��� �ۼ��ϰ�
 * �����ؼ� ����� ����ϼ���
 * ���������� �迭������ ���� �����ϴ� ���� �ƴϴ�.
 */
public class Ex02_0 {
		
	int[] score = new int[5];

	public Ex02_0() {//�迭�� ä��� score�� ����ϴ� �Լ�
		arrayFill();
		System.out.println(Arrays.toString(score));
		//2.������ ��ȯ���� �����Ѽ� ����ϴ� ���
		
	}
	
	public static void main(String[] args) {
		new Ex02_0();//�����Լ����� Ex02_0�� ����
	}
	
	void arrayFill() { //�迭 ä��� �Լ�
		for(int i=0; i<5; i++) { 
			int sc = (int)(Math.random()*100+1);
			score[i] =sc;
		}
		
	}
}

