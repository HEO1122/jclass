package day15;

public class Test05 {

	public Test05() {
		Grand g1 = new Son();
		g1.abc(); // fatherŬ������ abc �Լ�
		
		
		Grand g2 = new Father();
		g2.abc(); //fatherŬ������ abc �Լ�
		
		Grand g3 = new Son();
		//g3.xyz(); //Grand Ŭ�������� xyz()�Լ��� ����� �������� �ʱ� ������ ���Ұ�
		
		System.out.println("g1 instanceof Grand : "+(g1 instanceof Grand));
		System.out.println("g1 instanceof Father : "+(g1 instanceof Father));
		System.out.println("g2 instanceof Father : "+(g2 instanceof Son));
		System.out.println(g1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test05();

	}

}
