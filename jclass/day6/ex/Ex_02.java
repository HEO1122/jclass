package day6.ex;

//���ڸ��� ������ ���� 10���� �߻����Ѽ� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.

public class Ex_02 {
	public static void main(String[] args) {
		
		
	
		int sum=0;
	
		
		for(int i=0; i<10;i++) {
			int rand =(int)(Math.random()*(99-10+1)+10);
			System.out.println("�������� :"+rand);
			 sum=sum+rand;
		}
		System.out.println("�� : "+sum);
		
	}
}
