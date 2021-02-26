package day10.ex;

import java.util.Arrays;

/*
 * 5개의 숫자를 관리하는 정수배열을 입력받아서 배열에 기억되 모든 숫자를 더하는 기능의 
		함수를 제작하고 결과를 출력하세요.
		
		1. 배열을 입력해주면 합계를 반환해주는 함수
		
		추가작업 ]
			각 방에 숫자를 셋팅해주는 함수
			정수를 입력하면 정수만큼의 정수를 기억하는 배열을 만들어서 반환해주는 함수
			
			배열과 숫자를 입력하면 배열의 내용과 숫자를 출력해주는 함수
 */
public class Ex06 {
	public Ex06() {
		int[] num = setData();
		System.out.println(Arrays.toString(num));
		System.out.println("합계 : " + getSum(num));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
		//배열을 입력해주면 합을 반환해주는 함수
		public int getSum(int[] num) {
			//반환값 변수 만들고 
			int sum =0;
			//합계 계산하고
			for(int i =0; i<num.length; i++) {
				sum=sum+num[i];//각방의 데이터 뽑아서 누적계산
			}
			//데이터 합계 반환
			return sum;
		}
		//배열 셋팅함수
		public int[] setData() { 
			//반환해줄 배열 만들고
			int[] num= new int[5];
			//데이터 셋팅하고
			for(int i =0; i<5; i++) {
				num[i] =(int)(Math.random()*90 +10);
				
			}
			//배열반환
			return num;
		}
		//배열 만들어주는 함수
		public int[] getArray(int cnt) {
			return new int[cnt];
		}
		//배열을 입력받아서 데이터를 랜덤하게 셋팅하고 반환해주는 함수
		public int[] setData(int[] num) {
			return num[];}
		}
	}

}
