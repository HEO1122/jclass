package day13.ex;
/*
 * 문제1번 
 * 다음 변수를 멤버로 하는 Student 클래스를 만드세요
 * 필요한 생성자 함수들을 모두 작성해서 만드세요
 * toString() 함수도 추가하세요
 * String name;
 * int ban, no, kor, eng, math,total;
 * 
 *5명의 학생의 데이터를 배열에 담고 내용도 출력하세요.
 *
 *작업순서)
 *1 필요한 변수를 가지는 클래스를 작성한다.
 *2 필요한 생성자를 정의한다.
 *3 Ex01클래스 내에서 5 학생의 데이터를 배열로 만든다.
 *4 출력한다.
 */

public class Ex01 {
	public Ex01() {
		Student[] stud = getStud();
		for(int i =0; i<stud.length; i++) {
			System.out.println(stud[i]);
			/*
			 * println()함수는 toString()함수를 자동 호출해서 사용한다.
			 */
		}
	}
	public Student[] getStud() {
		Student[] s = new Student[5];
		String[] name = { 
				"홍길동","둘리","고길동", "희동이","도우너"};
		int ban =2;
		int no=1;
		//배열 셋팅
		for(int i =0; i<s.length; i++) {
			//먼저 과목별 점수 랜덤하게 만들고
			int k =(int)(Math.random()*41+60);
			int e =(int)(Math.random()*41+60);
			int m =(int)(Math.random()*41+60);
			//먼저 각 방에 인스턴스를 만들어서 기억시키고
		/*	2)
		 * 	s[i]= new Student(name[i],ban,no++,k,e,m);
			s[i].setTotal();
			s[i]
			3)
			s[i]= new Student();
			s[i].setName(name[i]);
			s[i].setBan(ban);
			s[i].setNo(no++);
			*/
		}
		return s;
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
