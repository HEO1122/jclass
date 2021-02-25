package day09.ex;

import java.util.Arrays;

/*문제 1 ]
		5학생의 3과목 점수를 기억하는 배열을 만드세요.
		단, 점수는 70~ 99점 사이로 랜덤하게 만들고
		 하나의 배열로 처리하세요.
		 int[][] stud =new int[5][3];
		 3과목의 5학생의 점수를 기억할 배열을 만들고
		 위 배열에서 데이터를  복사해서 채워넣는다.
		 => int[][] score = new int[3][5];
		  -------------------------------
		  stud와 score배열을 복사하는데 총점도 같이 기억하도록 배열을 
		  만들어서 복사하세요.
		  
		  1. 학생들의 총점 계산
		  int[][] stud1 =new int[5][4];
		  2. 과목별 총점..
		  int[][] score1 = new int[3][6];
		  -------------------------------
		  학생별 총점과 과목별 총점을 같이 기억할 배열을 만들어서 복사해서 처리하세요
		 */
public class Ex01 {

	public static void main(String[] args) {
		//5학생의 3과목 배열
		int[][] stud = new int[5][3];
		
		//인덱스에 반복문으로 채워넣기
		for(int i=0; i<5;i++) {//학생 5명
			for(int j=0;j<3;j++) {// 과목3개
			//랜덤점수 만들기
		int score = (int)(Math.random()*(99-70+1)+70);	
		//배열에 하나씩 집어넣기
		stud[i][j] = score;
			}
			
			
		}//향상된 for문으로 정수 데이터 출력하기
		System.out.println("1) 5학생의 3과목 점수를 기억하는 배열");
		for( int[] s : stud) {
			System.out.println(Arrays.toString(s));
			}
		//3과목의 5학생 배열 만들기
		int[][] score = new int[3][5];
		
		//반복문으로배열을 옮기기
		//i번째 학생의  점수를 꺼낸다.
		for(int i=0; i<stud.length;i++) {
			/*
			//i번째 학생의 첫번째과목을 score 배열의 첫번째 과목 배열에 한명씩 넣기
			stud[i][0] = score[0][i]; 
			//i번째 학생의 두번째 과목을 score 배열의 두번쨰 과목 배열에 한명씩 넣기
			stud[i][1] = score[1][i];
			//i번째 학생의 세번째 과목을 score 배열의 세번째 과목 배열에 한명씩 넣기
			stud[i][2] =score[2][i];
			*/
			
			for(int j = 0 ; j < stud[i].length; j++ ) {//j번째 과목을 넣기
				score[j][i] = stud[i][j];//stud의 i번째 학생의 j번째 과목을
			}							//score의 j번째 과목을 i번째 학생에 넣기
		}
		System.out.println("2) 3과목을 5학생만큼 기억하는 배열");
		//향상된 for문으로 새로운 배열 만들어서 데이터 출력하기
		for(int[] ss : score ) {
			System.out.println(Arrays.toString(ss));
		}
		int[][] stud1 = new int[5][4];//stud를 복사해서 총점을 기억할 배열
		//stud의 점수를 for문을 이용해서 총점 계산하기& stud를 stud1에 옮기기
		for(int i=0; i<stud.length; i++) { //학생 5명 만큼 반복
			int total=0;
			for(int j =0; j<stud[j].length; j++) {// 3과목을 반복해서 누적
				stud1[i][j]=stud[i][j];
				total = total + stud[i][j];
				//만든 총점을 stud1배열에 복사해서 넣기
				stud1[i][3]=total;
			}
		}
		
	
			
		System.out.println("3)학생들의 총점 계산 ");
			for(int[] s1 : stud1) {
				System.out.println(Arrays.toString(s1));
			}
	
		//score 배열을 이용해서 score1배열에 과목 총점 계산
		//score1배열 만듦
		int[][] score1 = new int[3][6];
		//반복문으로 score 데이터 score1 에 옮기기
		for(int i =0; i<score.length;i++) { //3과목
			int total =0;
			for(int j =0; j<score[i].length; j++) {//5학생
				score1[i][j]= score[i][j];// 점수 옮김
				//총점 계산하기
				total = total + score[i][j];
				//총점을 마지막 인덱스에 넣기
				score1[i][5]=total;
			}
		}
		System.out.println("4) 과목의 총점 계산");	
		//for문으로 배열 출력
		for(int[] s : score1) {
			System.out.println(Arrays.toString(s));	
		}
	}	
}

