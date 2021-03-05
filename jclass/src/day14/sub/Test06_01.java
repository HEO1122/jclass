package day14.sub;

public class Test06_01 {

	public Test06_01() {
//		Sub01 s1 = new Sub01();
		Sub02 s2 = new Sub02();
//		s2.no1=100;  -no1의 접근지정자가 private기 때문에 안됨
		s2.no2 =200;
		s2.no3 =300;
	}

	public static void main(String[] args) {
		new Test06_01();

	}

}
