package day16;

public class Test07 {

	public Test07() {
		//1~10 사이의 정수를 랜덤하게 발생시켜서
		//5가 발생하면 강제로 예외를 발생시켜 보자 
		int no =0;
		try {
			while(true) {
				 no =(int)(Math.random()*10+1);
				 System.out.println("no"+no);
			
			if(no==5) {
				throw new Exception();}
			System.out.println("2.no"+no);
			}
		}catch(Exception e) {
			System.out.println("*****예외 발생*****");
			e.printStackTrace();
		}
		System.out.println("no"+no);
	}

	public static void main(String[] args) {
		new Test07();

	}

}
