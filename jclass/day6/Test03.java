package day6;

/*1~10���� ���� ����� ����ϼ���*/
public class Test03 {
	public static void main(String[] args) {
		int sum=1;
		for( int i=1; i<=10; i++){
			sum=i*sum;
		}
		System.out.println(sum);
	}
}
