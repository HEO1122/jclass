package day04;
/*
 * String 클래스의 equals()함수를 사용해서 처리하세요.
 * 
 * 문자열을  입력받아서 'M'이 입력되면 "남자입니다." 'F'= 여자입니다.
 * "남" -"남자입니다" 남자- "남자입니다." "여" =여자입니다. "여자"= 여자입니다. 여성 =여성입니다.
 * 남성 = 남자입니다.
 * 이외의 경우는 잘못입력했습니다.가 출력되는 프로그램을 작성하세요
 * if else if/ switch ~case 구문으로 처리
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		//문자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		
		String gen = sc.nextLine();
		String result = "";
		//구분
		/*if( gen.equals("M")) {
			result = "남자입니다.";
		}else if(gen.equals("남")) {
			result ="남자입니다.";	
		}else if( gen.equals("남자")) {
			result ="남자입니다.";
		}else if(gen.equals("남성")) {
			result ="남자입니다.";
		}else if(gen.equals("F")) {
			result ="여자입니다.";
		}else if(gen.equals("여")) {
			result = "여자입니다";
		}else if(gen.equals("여자")) {
			result ="여자입니다.";
		}else if(gen.equals("여성")) {
			result = "여자입니다.";
		}else { result ="잘못입력했습니다.";}
		//출력
		System.out.println(result);*/
		
		switch(gen) {
		case "M":
			result ="남자입니다.";
			break;
		case "남":
			result ="남자입니다.";
			break;
		case "남자":
			result = "남자입니다.";
			break;
		case "남성":
			result = "남자입니다.";
			break;
		case "F":
			result = "여자입니다.";
			break;
		case "여자":
			result = "여자입니다.";
			break;
		case "여성":
			result = "여자입니다.";
			break;
		case "여":
			result ="여자입니다.";
			break;
		default: result ="잘못입력했습니다.";
		}
		//출력
		System.out.println(result);
	}

}
