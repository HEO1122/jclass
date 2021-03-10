package day17.ex;
//�̶� �л���ȣ�� ������ ���� �л����� ó���ǰ� �ϼ���.
// 			�� Ŭ������ ������ ����� �� �ش� �л��� ����(�⺻���� + ����)�� ��µǵ��� �ϼ���. 
public class Student {
	//����
	private int sno;
	private String sname;
	private int java, db, web, jsp, total;
	
	//����
	public Student() {}
	// �⺻���� ������ �Լ�
	public Student(int sno, String sname) {
		this(sno, sname, getScore(), getScore(), getScore(), getScore());
	}
	public Student(int sno, String sname, int java, int db, int web, int jsp) {
		this.sno =sno;
		this.sname =sname;
		this.java = java;
		this.db = db;
		this.web = web;
		this.jsp = jsp;
		setTotal();
		
	}
	
	public static int getScore() {
		int score = (int)(Math.random() * 41 + 60);
		return score;
	}
	
	//getter,setter
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {// ���� ����
		total=java+db+web+jsp;
	}
	//����Լ�
	
	public String toString() {
		return sno+ sname+ java+db+web+jsp+total+"\n";
	}
	//�л� ��ȣ�� ������ ���� �л����� ó��
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return sno== s1.sno;
	}

}
