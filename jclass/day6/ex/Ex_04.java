package day6.ex;
/* 첫날은 1원을 저축하고 다음날은 전날의 2배를 저축한다면
   몇일째 1억원을 저축할 수 있는지 출력해주는 프로그램을 작성하세요.
    
*/    
public class Ex_04 {
	public static void main(String[] args) {
		int day=1;
		int money =1;
		for(day=1; ;day++) {
			money=money*2;
			if(money>100000000) {break;}
		}System.out.println("1억원 모으는데 걸리는 날짜 : "+ day);
		System.out.println("1억원 모으는데 걸리는 날짜금액 : "+money);
	}
}
