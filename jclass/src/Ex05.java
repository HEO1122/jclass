package day08.ex;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		String[] f1 = {"ȫ�浿","hong","hong@increpas.com","010-1111-2222","  M"};
		String[] f2 = {"��浿","gho"," gho@increpas.com","010-3333-2222","   M"};
		String[] f3 = {"�Ѹ�"," doly","dooly@increpas.com","010-2211-2211","  M"};
		String[] f4 = {"����","dong","dong@increpas.com","010-8888-9999","  M"};
		String[] f5 = {"������","call","call@increpas.com","010-8787-3232","  M"};
		
		String[][] friend = new String[5][5];
		/*
		 
		 //�ذ��� 1
		for(int i = 0 ; i < friend[0].length; i++) {
			friend[0][i] = f1[i];
			friend[1][i] = f2[i];
			friend[2][i]= f3[i];
			friend[3][i] = f4[i];
			friend[4][i] = f5[i];	
		}
		*/
		
		// �ذ��� 2 : ��������� �ذ�
		System.arraycopy(f1,0, friend[0], 0, f1.length);
		System.arraycopy(f2,0, friend[1], 0, f2.length);
		System.arraycopy(f3,0, friend[2], 0, f3.length);
		System.arraycopy(f4,0, friend[3], 0, f4.length);
		System.arraycopy(f5,0, friend[4], 0, f5.length);
		
		
		System.out.println("| �̸� " + " | " + " ���̵�  " + " | " + "     ����     " + 
							"       | " + "    ��ȭ��ȣ      " + " | " + " ����    |");
	for(String[] f : friend) {
		System.out.println(Arrays.toString(f));
		/*
		 	f1 ~ f5 �����͸� �̿��ؼ�
		 	friend �迭�� �����͸� ä�켼��.
		 				�̸�		���̵�	����		��ȭ��ȣ		����
		 	ģ��1	:
		 	ģ��2	:
		 	ģ��3	:
		 	ģ��4	:
		 	ģ��5	:
		 */
	}

}
}