package day15.ex;


//���� ) Figure Ŭ������ ��ӹ��� Semo, Nemo, Won Ŭ������ �����
//* �� ������ ������ ����ϼ���.
/*
 * �۾�����
 * 1. ��ӹ��� Ŭ������ �����Ѵ�.
 * 2. ��ӹ��� Ŭ������ ��ü�� ���� Figure Ŭ������ ������ �޾Ƽ� ����Ѵ�.
 * 3. ������ ����Ѵ�.
 */
public class Ex01 {
	
	public Ex01() {
		Figure f1 = new Semo((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
		Figure f2 = new Nemo((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
		Figure f3 = new Won((int)(Math.random()*10 + 1));
		
		//���
		f1.toPrint();
		f2.toPrint();
		f3.toPrint();
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
