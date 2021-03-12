package day19;

public class Test01 {

	public Test01() {
		Grand g1 = new Father();
		Grand g2 = new Uncle();
		
		Father f1 = (Father)g2;
	}

	public static void main(String[] args) {
		new Test01();

	}

}

class Grand{
	int a;
	void abc() {
		System.out.println("여기는 그랜드");
	}
}
class Father extends Grand {
	
}

class Uncle extends Grand{
	
}