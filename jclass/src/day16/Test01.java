package day16;

public class Test01 implements Myinterface01 {
	/* 
	 * �������̽��� ��ӹ޴� ���� Ư���� �����Ѵٰ� ǥ��
	 * �ݵ��, �������̽� �Ҽ��� �Լ��� �������̵� �ؾ��Ѵ�.
	 */
	public Test01() {
		Myinterface01 i1= this;//�������Լ��� �޸𸮿� �ø��� ����ȴ�. �ν��Ͻ� ����
						// ������ �������� �ڱ��ڽ��� ����� ����
	i1.toPrint();	
	}
	
	
	public void toPrint() {
		//�������̽� �Ҽ��� �Լ��� �ڵ������� public abstract�� �ٱ� ������
		//�������̵� ��Ģ 2���� �ݵ�� ���Ѿ��Ѵ�.
		System.out.println("����� �������̽� ���� Ŭ����");
	}
		public static void main(String[] args) {
			new Test01();
		}
	
}
