package day08.ex;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		String[] f1 = {"ȫ�浿","hong","hong@increpas.com","010-1111-2222","M"};
		String[] f2 = {"��浿","gho","gho@increpas.com","010-3333-2222","M"};
		String[] f3 = {"�Ѹ�","dooly","dooly@increpas.com","010-2211-2211","M"};
		String[] f4 = {"����","dong","dong@increpas.com","010-8888-9999","M"};
		String[] f5 = {"������","call","call@increpas.com","010-8787-3232","M"};
		
		String[][] friend = new String[5][5];
		/*
		 	f1 ~ f5 �����͸� �̿��ؼ�
		 	friend �迭�� �����͸� ä�켼��.
		 				ģ��1	ģ��2	ģ��3	ģ��4	ģ��5
		 	�̸�		:
		 	���̵�	:
		 	����		:
		 	��ȭ��ȣ	:
		 	����		:
		 	
		 */
		for(int i =0; i<f1.length; i++) {
			friend[i][0] = f1[i];
			friend[i][1]= f2[i];
			friend[i][2] = f3[i];
			friend[i][3]= f4[i];
			friend[i][4] =f5[i];
		}
		for(String f[]: friend) {
		System.out.println(Arrays.toString(f));}
}
}
