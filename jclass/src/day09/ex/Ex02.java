package day09.ex;
/* 5개의 원의 정보를 기억할 배열을만드세여
 * 원의 정보는 반지름, 둘레, 넙이를 기억하도록 
 * 반지름은 랜덤하게 만들어서 입력하세요
 * 
 * 2. 위 배열을 90 도 회전시킨 배열을 만드세요
 */
import java.util. *;
public class Ex02 {

	public static void main(String[] args) {
		// 5개의 원 , 원(반지름,둘레, 넓이) 배열
		double[][] circle = new double[5][3];
		//랜덤한 반지름 배열에 집어넣기
		for(int i =0;i<circle.length; i++) {//5개 원
			
				circle[i][0]=(int)(Math.random()*(100-1+1)+1);
				circle[i][1]=(double)((circle[i][0])*2*3.14);
				circle[i][2]=(double)((circle[i][0])*(circle[i][0])*3.14);
		
			}
		for( double[] c : circle) {
		System.out.println(Arrays.toString(c));	
		}
		//옮길 배열 생성
		double[][] circle1 = new double[3][5];
		for(int i =0; i<circle1.length; i++) {
			circle1[0][i]= circle [i][0];
			circle1[1][i] = circle [i][1];
			circle1[2][i] =circle[i][2]; 		
		}
		//출력
		for(double[] c1 : circle1) {
			System.out.println(Arrays.toString(circle1));
		}
	}

}


