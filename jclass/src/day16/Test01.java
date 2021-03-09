package day16;

public class Test01 implements Myinterface01 {
	/* 
	 * 인터페이스를 상속받는 경우는 특별히 구현한다고 표현
	 * 반드시, 인터페이스 소속의 함수를 오버라이드 해야한다.
	 */
	public Test01() {
		Myinterface01 i1= this;//생성자함수는 메모리에 올릴때 실행된다. 인스턴스 생성
						// ㄴ현재 실행중인 자기자신의 예약된 변수
	i1.toPrint();	
	}
	
	
	public void toPrint() {
		//인터페이스 소속의 함수는 자동적으로 public abstract가 붙기 때문에
		//오버라이드 규칙 2번을 반드시 지켜야한다.
		System.out.println("여기는 인터페이스 구현 클래스");
	}
		public static void main(String[] args) {
			new Test01();
		}
	
}
