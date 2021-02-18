package day4;
//1000 ~ 3000 년 사이의 년도를 랜덤하게 발생시켜서
//해당 년도가 윤년인지 평년인지를 구분해서 출력해주는 프로그램을 작성하세요.
//
//참고 ]
//	윤년은 4로 나누어 떨어지는 해는 윤년
//	100으로 나누어 떨어지면 평면
//	100으로 나눠 떨어지는 해중 400으로 나눠 떨어지는 해는 윤년이라 한다.
//	

public class Ex10 {
	public static void main(String[] args) {
		//년도 발생
		int year = (int)(Math.random()*(3000-1000+1)+1000);
		//년도 출력
		System.out.println(year);
		//년도 변별 출력
		if ((year%4==0)|(year/400==0) & !(year%100 == 0))
		{
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}
}
