package day6.ex;
// 1 ~ 100 ������ ���� ���ϴµ� Ȧ���鸸�� ���� ���ϼ���.
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
		System.out.println("1 ~ 100 ������ Ȧ���鸸�� �� : " + sum);
			
	}
}
