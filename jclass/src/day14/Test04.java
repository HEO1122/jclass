package day14;

/*
 * Grand Ŭ������ ����� GrandŬ������ ��ӹ��� Father Ŭ������ �����
 * Father Ŭ������ ��ӹ��� SonŬ������ ������.
 */
public class Test04 {

	public Test04() {
//		Grand g = new Grand();
//		Father f = new Father();
		Son s = new Son();
//		Grand g = new Father();
		//Father Ŭ������ �ν��Ͻ��� Grand�� ����� ������ �����Ƿ� �����ϴ�.
		Father f = (Father)new Grand();
		//Grand �ν��Ͻ����� Father�� ����� ���� ������ ����
	
		Grand g = new Son();
		
		Son s1 = new Son();
		//���۷��� + �ν��Ͻ� = ������Ʈ(��ü, Object)
		
//		Father f = s;
//		Grand g = s;
//		g.abc();
		
//		Father f= new Father(); 
//		Grand g =f;
//		g.abc();
//		System.out.println(g.no);
		
	}

	public static void main(String[] args) {
		new Test04();

	}

}
