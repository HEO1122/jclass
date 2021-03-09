package day16;

 class Calculator1 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	public void divide() {
		try{System.out.println("계산결과는 ");
		System.out.println(this.left/this.right);
		System.out.println("입니다.");}
		catch(Exception e) {
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			System.out.println("\n\ne.toString()\n"+e.getMessage());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}
public class Calculator {
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.setOprands(10, 0);
		c1.divide();
		
		Calculator1 c2 = new Calculator1();
		c2.setOprands(10, 5);
		c2.divide();
		
		
	}
}
