package day14.ext;

//그랜드 클래스를 상속받아서 만든 클래스
public class Father extends Grand {
	public void toPrint() {
		//Grand클래스의 함수를 재정의 한 것 (오버라이딩)
		System.out.println("***** ㅇㅕ기는 아버지클래스 ****");
	}
	
}
