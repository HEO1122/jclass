package day09;

import java.util.Arrays;

//깊은 복사
public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i =0; i<10; i++) {
			num[i] =i +1;
		}
		System.out.println(Arrays.toString(num));
		
		int[] no = new int[5];
		//3~7까지 복사
		for(int i =0; i<no.length; i++) {
			no[i]= num[i+2];
		}
		System.out.println(Arrays.toString(no));
		no[1]=10;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(no));
		/* 
		 * System.arraycopy(데이터가 있는 배열, 추출할 시작위치, 데이터를 채울 배열, 채우기 시작할 위치, 채울갯수);
		 */
		
		int[] no2= new int[5];
		System.arraycopy(num,2,no2,0,no2.length);
		System.out.println(Arrays.toString(no2));
		System.out.println();
		no2[1] =1000;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(no2));
	}

}
