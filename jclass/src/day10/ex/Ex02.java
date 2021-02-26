package day10.ex;
/*문제 2)
 * 2차원 정수 배열의 멤버변수 score를 만들고(10학생 5과목) 
 * 1.score에 점수를 랜덤하게 입력해주는 함수를 만들고
 * 2. score에 입력된 점수를 더해서 학생별 총점을 계산해주는 함수
 * 3. score의 학생들을 총점을 기준으로 내림차순 정렬해주는 함수를 제작해서
 * 실행하고 결과를 출력하세요.
 */
import java.util.*;
public class Ex02 {
	int[][] score= new int[10][6];
	
	public Ex02(){
		arrayFill(); 			// 배열채우는 함수호출
		total();            //총점 채우는 함수 호출
		line();
		for(int[] s : score) {
			System.out.println(Arrays.toString(s));
		}
			// 배열 출력
	}
	
	public static void main(String[] args) {
		new Ex02();
	}	
	//배열을 채워주는 함수 만들기
	void arrayFill() {
		for(int i=0; i<score.length; i++) {//i번째 학생
			for(int j=0; j<score[i].length-1; j++) { //j번째 과목
				//랜덤 점수 만들기
				int sc = (int)(Math.random()*100 +1);
				//배열에 채워주기
				score[i][j]=sc;
			}
		}
	}
	void total() {//총점을 계산해주는 함수
		for(int i=0; i<score.length; i++) {
			int total=0;
			for(int j =0; j<score[i].length-1; j++) {
				score[i][5] += score[i][j]; //총점 계산
//				total=total + score[i][j]; //총점 계산
//				score[i][5]=total;// 총점 대입
			}
		}
	}
	void line() {// 순서 정렬해주는 함수 
		for(int i=0; i<9;i++) {//첫번째 점수를 끄낸다음
			for(int j = i + 1; j<10;j++) {//비교할 점수를 끄낸다.
				if((int)score[i][5]<(int)score[j][5]) {
					int[] tmp= score[i];
					score[i]=score[j];
					score[j]=tmp;	
				}	
			}
		}
	}
}
