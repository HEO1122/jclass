package day14;

public class Test02 {
	public static int no=1;
	public int num=2; //명시적 초기화
	{
		no=10;
		num=20; //클래스 블럭을 사용한 초기화
	}
	
	static {//static 블럭을 이용한 초기화 : static 멤버에 한해서만 초기화 하는 방법
		no=50;
//		num=50; static멤버가 아니기 때문에 에러가 발생한다.
	}
	public Test02() {
//		num=100;
//		no=200;
		System.out.println(no);
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		new Test02();

		System.out.println(no);
//		System.out.println(num);
	}

}
