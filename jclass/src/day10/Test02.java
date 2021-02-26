package day10;

/* 세 수(정수)를 입력하면 세 수를 더한 결과(정수)를 알려주는 함수(add01)를 정의하고
 * 숫자를 입력해서 랜덤하게 세개를 발생시켜서 결과를 출력하는 프로그램을 작성하세요.
 */
public class Test02{
	public Test02() {
		//정수 세개를 랜덤하게 만들고
		int no1= (int)(Math.random()* 10+1);
		int no2= (int)(Math.random()* 10+1);
		int no3= (int)(Math.random()* 10+1);
		//세 수의 계산결과를 담을 변수준비
		int result =add01(no1,no2,no3);
		//계산 결과를 출력하고
		System.out.println("3개의 숫자 : "+no1+","+no2+","+no3+"를더한결과:"+result);
	}


	public static void main(String[] args) {
		new Test02();
	}
	
	//세 수를 더하는 기능의 함수
	int add01(int a, int b, int c) {
		//반환값 변수 준비
		int result =0;
		//세 수 계산해서 반환값 변수에 대입
		result = a+b+c;
		
		//결과 반환
		return result;
	}
}
