package day15;

public class Test04 {

	public Test04() {
		System.out.println("여기는 테스트04 생성자");
	}
	 public void abc() {
		 System.out.println("#######여기는 테스트 04 abc 함수");
	 }
	public static void main(String[] args) {
		Object o = new Test04();
		
//		o.abc(); 오브젝트 클래스에 abc 함수가 없어서 호출불가

	}

}
