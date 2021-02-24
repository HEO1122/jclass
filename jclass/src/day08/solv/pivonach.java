package day08.solv;
import java.util.*;
public class pivonach {

	public static void main(String[] args) {
		int[] num = new int[20];
		num[0] =1;
		num[1]= 1;
		for(int i =2;i<20;i++) {
			int no1= num[i -2];
			int no2 = num[i-1];
			num[i] =no1 +no2;
		}
		System.out.println(Arrays.toString(num));
	}

}
