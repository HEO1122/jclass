package day6.ex;

/*
 * 어느 농장에 닭과 양을 사육
 * 총 마리수는 52
 * 다리 수는 144
 * 닭, 양 각각 몇마리인지 출력
 */
public class Ex_05 {
	public static void main(String[] args) {
		int chic = 2;
		int sheep =4;
		
		for(int i=1;i<=52 ;i++) {
			for(int j=1; j<=52 ;j++) {
			if(chic*i+sheep*j==144) {
				
				break;
				
			}
			System.out.println("닭" + i);
			System.out.println("양" + j);
			}
			
			
		}
	}
}
