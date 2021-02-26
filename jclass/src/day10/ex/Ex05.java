package day10.ex;
/*두 수를 이용해서 더하는 프로그램을 작성하세요.
		
		1. 랜덤한 숫자를 반환해주는 함수(5~15)
		2. 숫자 두개를 입력하면 더해준 값을 반환해주는 함수
		3. 출력해주는 함수
		
	세개의 만든 함수를 이용해서 출력하세요.
*/	
public class Ex05 {
	public Ex05() {
		//toPrint(getNum(10,20), getNum(10,20));
		int no1 = getNum(10,20);
		int no2 = getNum(10,20);
		toPrint(no1,no2);
	}
	public static void main(String[] args) {
		new Ex05();

	}
	//1. 랜덤한 숫자를 반환해주는 함수
	public int getNum(int min, int max) {
		
		int result =(int)(Math.random()*(max-min +1)+min);
		return result;
	}
	//2.숫자 두개를 입력하면 더해준 값을 반환해주는 함수
	public int plus(int no1, int no2) {
		int result =no1 +no2;
		return result;
	}
	public void toPrint(int no1, int no2) {
		System.out.println(no1 + "+" +no2 +"="+ plus(no1,no2));
	}
}
