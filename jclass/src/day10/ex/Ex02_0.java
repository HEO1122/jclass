package day10.ex;

import java.util.Arrays;

/*
 * 5과목의 점수를 랜덤하게 발생시켜서 배열로 반환해주는 함수를 작성하고
 * 실행해서 결과를 출력하세요
 * 전역변수로 배열변수를 만들어서 실행하는 것이 아니다.
 */
public class Ex02_0 {
		
	int[] score = new int[5];

	public Ex02_0() {//배열을 채우고 score를 출력하는 함수
		arrayFill();
		System.out.println(Arrays.toString(score));
		//2.변수에 반환값을 기억시켜서 출력하는 방법
		
	}
	
	public static void main(String[] args) {
		new Ex02_0();//메인함수에서 Ex02_0을 실행
	}
	
	void arrayFill() { //배열 채우는 함수
		for(int i=0; i<5; i++) { 
			int sc = (int)(Math.random()*100+1);
			score[i] =sc;
		}
		
	}
}

