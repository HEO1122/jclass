package day13.ex;
//�л��Ѹ��� ����� Ŭ����
public class Student {
	//���� ����
		private String name;
		private int ban, no, kor, eng, math, total;
		private double avg;
		
	//������ �Լ�
	//1. �⺻������
	public Student() {}
	
	//2. �̸�, ��, ��ȣ�� �Է��ϴ� ������
	public Student(String n ,int b, int c) {
		name =n;
		ban=b;
		no=c;
		
	}
	//3. 2+���� ����
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
	//4. 3+ ����+��� 
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
	
	//get ,set �Լ�	
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
		
		//�����ε� ���� ä���ִ� �Լ�
		public void setTotal() {
			total = kor+eng+math;
		}
		public void setAvg(double a) {
			avg = a;
		}
		//��ձ��ϴ� �Լ�
		public void setAvg() {
			avg = total/3.0;
		}
		
		public String toString() {
			return "�̸�" +name +"��"+ban+"��ȣ"+no+"����"+kor+
					"����"+eng+"����"+math+"����"+total+"���"+Math.round(avg*100)/100.0;
			/*
			 * 3.145
			 * => 3.145*100 =314.5
			 * =>round(314.5)=315
			 * => 315/100.0 = 3.15
			 */
		}
	
	
	//������ִ� �Լ�
	public void toPrint() {
		System.out.printf("�̸�: %s, �� :%d, ��ȣ : %d, ���� : %d, ���� ; %d, ���� : %d, ���� : %d",
				name, ban, no, kor, eng, math, total);
	}
	

}
