package day17;
/*
 * 랜덤하게 난수를 발생하여 배열[20]에 저장한 후
 * 오름차순으로 정렬하여 출력하세요
 */
import java.util.*;
public class Test06 {

	public Test06() {
		int[] nums = new int[20];
		
		//Random클래스 사용준비
		Random rdn = new Random();
		
		for(int i=0; i<nums.length;i++) {
			//난수 꺼내오고
			int no = rdn.nextInt(100); //0~100 사이의 난수를 발생시키세요
			//배열 채우기
			nums[i] = no;
		}
		//배열내용 출력하고 
		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		Arrays.sort(nums);
		//출력
		System.out.println("|");
		for(int no : nums) {
			System.out.print(no+ "|");
		}
	}

	public static void main(String[] args) {
	new Test06();

	}

}
