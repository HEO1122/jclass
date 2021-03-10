package day17;

public class Test01 {

	public Test01() {
		Circle won1 =new Circle(5);
		System.out.println(won1);
		
		Circle won2 = new Circle();
		
		System.out.println(won1.equals(won2));//주소값으로 비교하기때문에false
		System.out.println(won1==won2);
	}
	public static void main(String[] args) {
			new Test01();
	}

}
