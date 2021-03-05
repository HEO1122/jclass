package day14;

public class Father extends Grand {
	int no =100;
	public Father() {
		System.out.println("##여기는 Father Class");
		
		

}
public void abc() {//그랜드 클래스의 abc()함수를 오버라이딩
	System.out.println("***여기는 Father.abc()***");
	
	}
}