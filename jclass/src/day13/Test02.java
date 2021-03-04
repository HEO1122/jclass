package day13;

public class Test02 {
	int[] num;
	public Test02() {
		//기본생성자
		num = new int[10];
	}
	
	public Test02(int cnt) {
		num = new int[cnt];
	}
	public Test02(int ... no) {//배열로 만듦 //가변인수
		num=no;
	}
	/*
	 * public Test02(int[] no) {// 위와 같은 형태이기 때문에 오버로딩에 실패
		}
	 */
	public void Test02() {
		//이 함수의 경우는 생성자 함수가 아닌 일반함수를 정의한 것이다.
		//생성자 함수는 절대로 반환값을 가지면 안된다.
	}
		
	public static void main(String[] args) {
		new Test02();
	}

}
