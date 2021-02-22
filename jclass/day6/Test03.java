package day6;

/*1~10까지 곱한 결과를 출력하세요*/
public class Test03 {
	public static void main(String[] args) {
		int sum=1;
		for( int i=1; i<=10; i++){
			sum=i*sum;
		}
		System.out.println(sum);
	}
}
