package day6.ex;

/*5자리 숫자를 (10000-99999)랜덤하게 발생한 후 각 자리 숫자의 합을 구하는 프로그램을 작성하세요
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
