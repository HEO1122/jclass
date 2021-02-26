package day10;
/*위 배열에서 내부 배열의 2번째 데이터들로 만든배열 5번째 데이터들로 만든
 * 배열을 만드세요
 * 
 */
import java.util.*;
public class Test00 {

	public static void main(String[] args) {
		int[][] no = {
				
					{1,2,3,4,5},
					{2,3,4,5,6},
					{3,4,5,6,7},
					{4,5,6,7,8},
					{5,6,7,8,9},
					{4,5,6,7,8},
					{3,4,5,6,7}
				};
		int[] no1 =new int[7];
		int[] no2 = new int[7];
	//반복해서 뽑기
		
		for(int i=0;i<no.length; i++){//no의 길이만큼 반복
			for(int j=0; j<no[i].length;j++) { //no 배열에서 2번째 5번째 데이터 뽑기 반복
				if(j==0|j==2|j==3) {
					continue;
					no1[i]= no[i][j];//no1에 2번째 방 데이터 채우기
					no2[i]= no[i][j];//no2에 4번째 방 데이터 채우기
				
				}
			}for(int[] n : no1) {
				System.out.println(Arrays.toString(n));
			for(int[] n2 : no2) {
				System.out.println(Arrays.toString(n2));
			}
			}
		}
	
	}

}
