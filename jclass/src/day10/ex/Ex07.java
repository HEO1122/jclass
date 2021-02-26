package day10.ex;
/* 문7
 * 두 정수와 연산기호(+,-,*,/,%) 문자를 입력하면 해당 연산의 결과를
 * 처리해주는 함수 (calc)를 만들어서 실행하고 출력해주세요
 */
public class Ex07 {
	public Ex07() {
	int no1 =0;
	char buho =0;
	int no2 =0;
	double result =0;
	System.out.println("정수 연산을 입력하세요.");
	}
	public static void main(String[] args) {
		new Ex07();
	}
	public double calc(int a, char b, int c) {
		no1= a;
		buho= b;
		no2 =c;
		result= (no1+buho+no2);
		return result;
	}

}
