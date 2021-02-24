package day08;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// 한사람마다 배열을 만든다.
		String[] f1={"홍길동" ,"hong", "hong@increaps.com" ,"010-7777-7777","M"};
		String[] f2={"고길동" ,"Gho", "gho@increaps.com" ,"010-8888-8888","M"};
		String[] f3={"둘리" ,"dooly", "dooly@increaps.com" ,"010-2222-2222","M"};
		String[] f4={"희동" ,"dongee", "dongee@increaps.com" ,"010-1111-1111","M"};
		String[] f5={"마이콜" ,"mikol", "mikol@increaps.com" ,"010-3333-3333","M"};
	//전체를 기억할 배열을 만든다.
	String[][] friend = new String[5][];
	
	//이렇게 배열을 만들면 안에 들어있는 배열의 공간은 만들지 않게된다.
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
	 * new String[5][6]; = 안에 들어있는 배열의 공간까지 만들게 된다.
	 * 
	 */
	
	}

}
