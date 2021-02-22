package day6.ex;

//두자리의 랜덤한 숫자 10개를 발생시켜서 합을 구하는 프로그램을 작성하세요.

public class Ex_02 {
	public static void main(String[] args) {
		
		
	
		int sum=0;
	
		
		for(int i=0; i<10;i++) {
			int rand =(int)(Math.random()*(99-10+1)+10);
			System.out.println("랜덤숫자 :"+rand);
			 sum=sum+rand;
		}
		System.out.println("합 : "+sum);
		
	}
}
