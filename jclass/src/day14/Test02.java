package day14;

public class Test02 {
	public static int no=1;
	public int num=2; //����� �ʱ�ȭ
	{
		no=10;
		num=20; //Ŭ���� ���� ����� �ʱ�ȭ
	}
	
	static {//static ���� �̿��� �ʱ�ȭ : static ����� ���ؼ��� �ʱ�ȭ �ϴ� ���
		no=50;
//		num=50; static����� �ƴϱ� ������ ������ �߻��Ѵ�.
	}
	public Test02() {
//		num=100;
//		no=200;
		System.out.println(no);
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		new Test02();

		System.out.println(no);
//		System.out.println(num);
	}

}
