package day14;

public class Test01 {
	int no1 =100;
	{
		no1=200;
	}
	
	public Test01() {
		System.out.println("no1 :"+no1);
	}

	public static void main(String[] args) {
		new Test01();

	}

}
