package day4;

public class Ex07 {
	public static void main(String[] args) {
		//3개 숫자 랜덤하게 발생
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double result;
		// 숫자 크기 비교
		result=(a>b) ? ((a>c) ? (a) : (c)) : ((b>c) ? (b) : (c));
		//숫자 출력
		System.out.println("1:" + a); 
		System.out.println("2 :" + b); 
		System.out.println("3 :" + c); 
		System.out.println("중제일큰 수는 :" + result); 
		
		
	}
}
