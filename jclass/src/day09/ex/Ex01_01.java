package day09.ex;


import java. util. *;
public class Ex01_01 {
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
	  
	  --------------------------------
	  이름 	국어		영어		수학		총점		평균		석차
	 홍길동	95		75		100 
	 고길동	80		60		50 
	 ...
	 총점		
	 평균	
	 */
public static void main(String[] args) {
	Object[] title = new Object[] {"이름","국어","영어","수학", "총점","평균", "석차"};
	
	String[] name = {
		"홍길동", "고길동", "둘리", "희동이", "마이콜", "총점", "평균"	
	};
	
	Object[][] stud = new Object[8][7];
	
	// 제목 채우고
	stud[0] = title;
	
	//stud i=1~7,0에 이름 집어넣기
	for(int i=1; i<8;i++) {
		stud[i][0]= name[i - 1];
	}
	
	// 석차 초기화
	for(int i = 1 ; i < stud.length - 2; i++) {
		stud[i][stud[i].length - 1] = 1;
	}
	//stud 배열에 점수 입력
	for(int i=1; i<stud.length-2; i++) {//i번째 학생
		int total1=0; //학생 총점 변수
		double avg1=0.;//학생평균 변수
//		System.out.println("**************");
		for(int j =1; j<stud[i].length-3; j++) {//j번째 과목
			int score= (int)(Math.random()*(100-0+1));//점수변수
			stud[i][j]= score;//점수대입
			total1 += (int)stud[i][j];//학생 총점구하기
			avg1= total1/3;//학생평균 구하기
			stud[i][stud[i].length-3]=total1;// 학생 총점대입
			stud[i][stud[i].length-2]= avg1;//학생 평균 대입
			
		}
	}
	
	// 과목별 총점과 평균 구하기
	for(int i=0; i<stud.length-2;i++) {
		int total =0;
		double avg =0.;//과목평균변수
		for(int j=0; j<stud[i].length; j++) {
			total += (int)stud[i][j];//과목총점
			stud[stud.length-2][j] = total;// 과목총점대입
			avg= total/5;//과목 평균구하기
			stud[stud.length-1][j]=avg;//과목평균 대입
			
		}
	}
	
	
	for(Object[] o : stud) {
		System.out.println(Arrays.toString(o));
	}
	
	/*//석차
	for(int i =0; i<10; i++) {// 석차
		for(int j=0; j<10; j++) {//비교 대상
			if(i==j) continue;//i와 j가 같은 경우 다시 진행
			
			if(no[i][0]<no[j][0]) {
				no[i][1]+=1; //석차에 1 더한다.
			}
		}
	}
	System.out.println(Arrays.deepToString(no));
	*/
	}
}
