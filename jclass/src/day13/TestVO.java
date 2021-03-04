package day13;

public class TestVO {
	private String sno, name;
	private int[] num;
	
	public TestVO() {
		sno = "0000";
		name ="noname";
		num = new int[5];
		/*이처럼
		 * 이 클래스가 객체가 될때 기본적인 사항들이 세팅이 될 필요가 있을 때
		 * 그 작업을 해주는 함수가 생성자 함수이다.
		 * 
		 * =정리를 하자면 생성자 함수의 역할은 초기화 작업이다.
		 */
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
}
