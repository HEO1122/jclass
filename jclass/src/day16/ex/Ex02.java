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
	int[] nums;
	public Ex02() {
		exec1();
	}

	public String exec1() {
		try {
			setString();
			stoInt();
			sum();
			avg();
		} catch (ArrayIndexOutOfBoundsException e) {
			String s ="배열의 인덱스를 벗어났습니다.";
			return s;
		} catch(NumberFormatException e) {
			String s1 ="숫자로 변환이 불가능합니다.";
			return s1;
		} catch(ArithmeticException e) {
			String s2 = "0으로 나눌 수 없습니다.";
			return s2;
		} catch(Exception e) {
			String s = "알 수 없는 에러입니다.";
			return s;
		}
		
		return "";
	}
	public static void main(String[] args) {
		new Ex02();
	}
	// 스트링 배열 채우기
	public void setString() throws ArrayIndexOutOfBoundsException {
		str = new String[]{"123","456","789", "101112","131415","161718"};
		nums = new int[str.length];
	}
	//각 문자열을 정수로 변환
	public void stoInt() throws NumberFormatException{
		for(int i =0; i<6; i++) {
			nums[i] = Integer.parseInt(str[i]);}
		}
	//각 변환한 수의 합 구하는 함수
	public int sum()  {
		int tmp =0;
		for(int i=0;i<nums.length; i++) {
			tmp +=	(int)nums[i];
		}
		return tmp;
	}
	//각 변환한 수의 평균을 구하는 함수
	public void avg() throws ArithmeticException {
		int tmp =sum();
		tmp = tmp/nums.length;
	}


}
