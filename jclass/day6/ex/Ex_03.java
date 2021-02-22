package day6.ex;
// 1 ~ 100 까지의 합을 구하는데 홀수들만의 합을 구하세요.
public class Ex_03 {

	public static void main(String[] args) {
		int no=0;
		int sum=0;
		while(true) {
			if(no == 100) break;
			no++;
			if(no%2 == 0) {
				continue;
			}
			sum = sum + no;
			
		}
		System.out.println("1 ~ 100 까지의 홀수들만의 합 : " + sum);
			
	}
}
