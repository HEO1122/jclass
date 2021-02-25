package day08.ex;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		String[] f1 = {"홍길동","hong","hong@increpas.com","010-1111-2222","  M"};
		String[] f2 = {"고길동","gho"," gho@increpas.com","010-3333-2222","   M"};
		String[] f3 = {"둘리"," doly","dooly@increpas.com","010-2211-2211","  M"};
		String[] f4 = {"희동이","dong","dong@increpas.com","010-8888-9999","  M"};
		String[] f5 = {"마이콜","call","call@increpas.com","010-8787-3232","  M"};
		
		String[][] friend = new String[5][5];
		/*
		 
		 //해결방법 1
		for(int i = 0 ; i < friend[0].length; i++) {
			friend[0][i] = f1[i];
			friend[1][i] = f2[i];
			friend[2][i]= f3[i];
			friend[3][i] = f4[i];
			friend[4][i] = f5[i];	
		}
		*/
		
		// 해결방법 2 : 깊은복사로 해결
		System.arraycopy(f1,0, friend[0], 0, f1.length);
		System.arraycopy(f2,0, friend[1], 0, f2.length);
		System.arraycopy(f3,0, friend[2], 0, f3.length);
		System.arraycopy(f4,0, friend[3], 0, f4.length);
		System.arraycopy(f5,0, friend[4], 0, f5.length);
		
		
		System.out.println("| 이름 " + " | " + " 아이디  " + " | " + "     메일     " + 
							"       | " + "    전화번호      " + " | " + " 성별    |");
	for(String[] f : friend) {
		System.out.println(Arrays.toString(f));
		/*
		 	f1 ~ f5 데이터를 이용해서
		 	friend 배열의 데이터를 채우세요.
		 				이름		아이디	메일		전화번호		성별
		 	친구1	:
		 	친구2	:
		 	친구3	:
		 	친구4	:
		 	친구5	:
		 */
	}

}
}