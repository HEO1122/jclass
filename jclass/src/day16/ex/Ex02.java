package day16.ex;

/* 
 * String[] str ={ "123", "456", "789",....};가 있는 경우
 * 각 문자열을 정수로 변환한 수의 합과 평균을 구하는 프로그램을 작성하세요
 * 
 * 단, 발생할 수 있는 예외를 가정하여 모두 처리하세요
 * 	1. 배열의 인덱스를 벗어난 경우
 * 	2. 숫자로 변환이 불가능한 경우
 * 	3. 평균을 계산하는데 0으로 나눠지는경우..
 */
public class Ex02 {
	String[] str;
	public Ex02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Ex02();
	}
	// 스트링 배열 채우기
	public void setString() {
	String[] str = { "123","456","789", "101112","131415","161718"};
	}
	//각 문자열을 정수로 변환
	public void stoInt() {
		for(int i =0; i<6; i++) {
		str = Integer.parseInt(str[i]);}
	}
	//예외 처리하기
	public int addNum() {
		try {
			//	1. 배열의 인덱스를 벗어난 경우
			if(str) {}
			
	}
	}
}
