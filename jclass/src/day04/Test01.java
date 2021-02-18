package day04;
/*
 * 문자열 비교하는 방법
 * ==문자열은 자바의 기본 데이터 타입이 아니기 때문에 동등비교나 대소비교가 불가능하다.
 * -> 연산자를 사용할 수 없기 때문에
 * 
 * 문자열은 자주 사용하기 때문에 기본 데이터타입으로 혼동하기 쉬우나 
 * 절대 기본 데이터 타입이 아니다.
 * 
 * 따라서 연산자를 사용한 산술연산이나 비교연산이 불가능하다.
 	
 * 그런데 문자열끼리 동등비교 연산자로 연산은 가능하다.
 * 
 * 이때 비교하는 것은 문자열 데이터를 비교하는 것이 아니고 
 * 문자열 데이터가 저장된 메모리 주소를 비교한다.
 * 
 * 참고) 문자열 만드는 방법) 
 * 
 * 1) String str1 = "데이터"; 
 * 
 * 2)String str2 = new String("데이터");
 * 
 * 문자열 데이터 비교하는 방법
 * 데이터1.equals (데이터2)
 * 
 * ****중요
 * 문자열 데이터를 비교할때는 반드시 equals()함수를 사용해서 비교해야 한다.
 */
public class Test01 {
	public static void main(String[] args) {
		String str1 ="홍길동";
		String str2 = new String("홍길동");
		String str3 = "홍길동";
		String str4 = new String("홍길동");
		
		System.out.println("str1 == str2 : " + (str1==str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str2 == str4 :" + (str2 ==str4));
		
		System.out.println("str1.equals(str2) : "+ str1.equals(str2));
	}
}
