package day04;
/* 0에서 25까지의 수를 랜덤하게 하나를 발생시켜서
 * 0 - 0 입니다.
 * 2의 배수 - 2의 배수입니다
 * 3의배수 - 3의배수입니다.
 * 2와 3의 배수인 경우- 2와 3의 배수입니다.
 * 그외 나머지 수입니다.로 촐력해주는 프로그램을 작성하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
		//랜덤 숫자 생성
		int ran = (int)(Math.random()*(25-0+1)+0);
		String result = "";
		// 처리
		/*if( ran%2==0 & ran %3==0) {
			result ="2와 3의 배수입니다.";
			
		}else if(ran%2 ==0) {
			result ="2의 배수입니다.";
		}else if(ran %3 ==0) {
			result = "3의 배수입니다.";
		}else if(ran==0){
		 	result ="0입니다.";
		//출력
		System.out.println(ran);
		System.out.println(result);*/
		int code = 0;
		if(ran ==0) {
			code =0;
		}else if(ran %6==0) {
			code =1;
		}else if(ran%2==0) {
			code =3;
		}else if(ran%3==0) {
			code =2;
		}else {code =4;}
		
		switch(code) {
		case 0:
			result ="0입니다.";
			break;
		case 1:
			result ="6의 배수입니다.";
			break;
		case 2:
			result ="3의 배수입니다.";
			break;
		case 3:
			result ="2의 배수입니다.";
			break;
		default :
			result ="나머지 경우입니다.";
		}
		
		System.out.println("발생한수"+ ran + result);
		}
		
	}

