package day08;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// �ѻ������ �迭�� �����.
		String[] f1={"ȫ�浿" ,"hong", "hong@increaps.com" ,"010-7777-7777","M"};
		String[] f2={"��浿" ,"Gho", "gho@increaps.com" ,"010-8888-8888","M"};
		String[] f3={"�Ѹ�" ,"dooly", "dooly@increaps.com" ,"010-2222-2222","M"};
		String[] f4={"��" ,"dongee", "dongee@increaps.com" ,"010-1111-1111","M"};
		String[] f5={"������" ,"mikol", "mikol@increaps.com" ,"010-3333-3333","M"};
	//��ü�� ����� �迭�� �����.
	String[][] friend = new String[5][];
	
	//�̷��� �迭�� ����� �ȿ� ����ִ� �迭�� ������ ������ �ʰԵȴ�.
	friend[0]= f1;
	friend[1]= f2;
	friend[2]= f3;
	friend[3]= f4;
	friend[4]= f5;
	
	System.out.println(Arrays.toString(friend[3]));
	
	/*String[] str = new String[] {"a","b", "c"};
	
	friend[0]= str;
	friend[1] =f1;
	/*
	 * new String[5][6]; = �ȿ� ����ִ� �迭�� �������� ����� �ȴ�.
	 * 
	 */
	
	}

}
