package day17.ex;
//이때 학생번호가 같으면 같은 학생으로 처리되게 하세요.
// 			이 클래스의 변수를 출력할 때 해당 학생의 정보(기본정보 + 점수)가 출력되도록 하세요. 
public class Student {
	//변수
	private int sno;
	private String sname;
	private int java, db, web, jsp, total;
	
	//세팅
	public Student() {}
	// 기본정보 생성자 함수
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
	public void setTotal() {// 총점 세팅
		total=java+db+web+jsp;
	}
	//출력함수
	
	public String toString() {
		return sno+ sname+ java+db+web+jsp+total+"\n";
	}
	//학생 번호가 같으면 같은 학생으로 처리
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return sno== s1.sno;
	}

}
