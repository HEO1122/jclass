package day16;

public class Test07 {

	public Test07() {
		//1~10 ������ ������ �����ϰ� �߻����Ѽ�
		//5�� �߻��ϸ� ������ ���ܸ� �߻����� ���� 
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
			System.out.println("*****���� �߻�*****");
			e.printStackTrace();
		}
		System.out.println("no"+no);
	}

	public static void main(String[] args) {
		new Test07();

	}

}
