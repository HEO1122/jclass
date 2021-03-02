package day11;

import java. util. *;
public class Test01 {
	public int num = 999;
//	public void Test01() { 
	//-반환값이 있는 함수중 클래스 이름과 동일한 함수는 생성자 함수가아니라 일반함수이다.
//		System.out.println("$$$$$$$");
//	}
	/*"1234-56"과 같이 숫자부호숫자 문자열 계산해 주는 함수
	 * 1. 입력받는 함수
	 * 2. 연산기호를 반화해주는 함수
	 * 2-0. 연산기호 인덱스 반환해주는 함수
		2-1. 연산기호를 반환해주는 함수
	 * 3. 수식을 입력하면 숫자를 배열로 반환해 주는 함수
	 * 4. 계산처리해주는 함수
	 * 
	 */
	public Test01() {
		String str =inStr();
		double result =calc(str);
		System.out.println("입력한 수식 "+ str +" :" + result);
	}
	//1. 문자열 입력 전담처리도구
	public String inStr() {
		String str = "";
		//입력도구 준비
		Scanner sc= new Scanner(System.in);
		//메세지 출력하고 
		System.out.println("수식입력 :");
		//입력받은 데이터 변수에 기억하고
		str =sc.nextLine();
		//문자열 반환해주기
		return str;
	}
	//2. 문자열에서 연산기호의 인덱스 반환해주는 함수
	public int getIdx(String str) {
		//반환값 변수 만들고
		int idx=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='+') {
				idx=i;
				break;
			}else if(str.charAt(i)=='-') {
				idx =i;
				break;
			}else if(str.charAt(i)=='%') {
				idx =i;
				break;
			}else if(str.charAt(i)=='/') {
				idx =i;
				break;
			}else if(str.charAt(i)=='*') {
				idx =i;
				break;
			}
		}
		return idx;
	}
	//2-0연산기호 문자로 반환해주는함수
	public String getBuho(String str, int idx) {
		String result = "";
		result = str.substring(idx,idx+1);
		return result;
	}
	/*
	 * 문자열처리함수
	 * charAt() = 반환값 :char
	 * indexOf() = 반환값 : int
	 * subString() =반환값 : String
	 * legth() =반환값 : int 문자열의 길이 반환 마지막 인덱스 보다 1이크다.
	 */
	
	//3. 수식을 입력하면 숫자만 배열로 반환해 주는 함수
	public int[] getNums(String str, int idx) {
		int[] num = new int[2];
		//문자열을 잘라서
		String sno1= str.substring(0,idx);
		int no1=	Integer.parseInt(sno1);
		String sno2 = str.substring(idx+1); //123-45에서 45추출
		int no2= Integer.parseInt(sno2);
		//배열에 채우기
		num[0] = no1;
		num[1] =no2;
		//완성된 배열 반환해주고
		return num;
	}
	//4.계산처리 하는 함수
	public double calc(String str) {
		double result = 0;
		//연산기호 인덱스 추출
		int idx =getIdx(str);
		//연산기호 추출
		String buho =getBuho(str, idx);
		//숫자만 배열로 추출
		int[] nums = getNums(str, idx);
		// 부호에 따라서 계산하고 
		switch(buho) {
		case "+" :
			result = nums[0] +nums[1];
			break;
		case "-" :
			result = nums[0]-nums[1];
			break;
		case" *":
			result = nums[0]*nums[1];
			break;
		case"/" :
			result = (double)(nums[0]/nums[1]);
			break;
		case"%" :
			result = nums[0]%nums[1];
		}
		return result;
	}
	public static void main(String[] args) {
		new Test01();//new 다음에는 생성자만 호출할 수 있따.

	}

}
