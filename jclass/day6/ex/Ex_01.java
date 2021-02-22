package day6.ex;

//주사위 두개를 던져서 합이 6이 나오는 경우를 모두 출력하세요.
public class Ex_01 {
	public static void main(String[] args) {
		int no1 = 1;
		int no2 = 1;
		for(no1=1; no1<=6; no1++) {
			for(no2=1; no2<=6; no2++) {
				if(no1+no2 ==6) {
				System.out.println("합이 6인 경우"+no1+","+no2);}
				
			}
		}
	}
}
