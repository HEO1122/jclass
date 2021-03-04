package day13.ex;
//학생한명을 기억할 클래스
public class Student {
	//변수 생성
		private String name;
		private int ban, no, kor, eng, math, total;
		private double avg;
		
	//생성자 함수
	//1. 기본생성자
	public Student() {}
	
	//2. 이름, 반, 번호만 입력하는 생성자
	public Student(String n ,int b, int c) {
		name =n;
		ban=b;
		no=c;
		
	}
	//3. 2+과목 점수
	public Student(String n, int b, int c, int d, int e, int f) {
//		name =n;
//		ban=b;
//		no=c;
		this(n,b,c);
		kor=d;
		eng=e;
		math =f;
		setTotal();
		setAvg();
	}
	//4. 3+ 총점+평균 
	public Student(String n, int b, int c, int d, int e, int f,int t, double a) {
//		name =n;
//		ban=b;
//		no=c;
		this(n,b,c);
		kor=d;
		eng=e;
		math =f;
		total= t;
		avg=a;
	}
	
	//get ,set 함수	
		public String getName() {
			return name;
		}
	
		public void setName(String n) {
			name = n;
		}	
		
		public int getBan() {
				return ban;
		}

		public void setBan(int b) {
			ban = b;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int n) {
			no = n;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int k) {
			kor = k;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int e) {
			eng = e;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int m) {
			math = m;
		}

		public int getTotal() {
			return total;
		}
		public double getAvg() {
			return avg;
		}
		public void setTotal(int t) {
			total = t;
		}
		
		//오버로딩 총점 채워주는 함수
		public void setTotal() {
			total = kor+eng+math;
		}
		public void setAvg(double a) {
			avg = a;
		}
		//평균구하는 함수
		public void setAvg() {
			avg = total/3.0;
		}
		
		public String toString() {
			return "이름" +name +"반"+ban+"번호"+no+"국어"+kor+
					"영어"+eng+"수학"+math+"총점"+total+"평균"+Math.round(avg*100)/100.0;
			/*
			 * 3.145
			 * => 3.145*100 =314.5
			 * =>round(314.5)=315
			 * => 315/100.0 = 3.15
			 */
		}
	
	
	//출력해주는 함수
	public void toPrint() {
		System.out.printf("이름: %s, 반 :%d, 번호 : %d, 국어 : %d, 영어 ; %d, 수학 : %d, 총점 : %d",
				name, ban, no, kor, eng, math, total);
	}
	

}
