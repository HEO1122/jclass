package day6.ex;

/*5�ڸ� ���ڸ� (10000-99999)�����ϰ� �߻��� �� �� �ڸ� ������ ���� ���ϴ� ���α׷��� �ۼ��ϼ���
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		int sum=0;
		int mok;
		int rand = (int)(Math.random()*(99999-10000+1)+10000);
		mok = rand;
		for(int i=0;i<5;i++) {
			System.out.println("### rand : " + rand);
			System.out.println("### rand%10 : " + rand%10);
			sum=mok%10+sum;
			mok=mok/10;
		}
		System.out.println(rand+" - "+sum);
	}

}
