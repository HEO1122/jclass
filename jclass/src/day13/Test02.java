package day13;

public class Test02 {
	int[] num;
	public Test02() {
		//�⺻������
		num = new int[10];
	}
	
	public Test02(int cnt) {
		num = new int[cnt];
	}
	public Test02(int ... no) {//�迭�� ���� //�����μ�
		num=no;
	}
	/*
	 * public Test02(int[] no) {// ���� ���� �����̱� ������ �����ε��� ����
		}
	 */
	public void Test02() {
		//�� �Լ��� ���� ������ �Լ��� �ƴ� �Ϲ��Լ��� ������ ���̴�.
		//������ �Լ��� ����� ��ȯ���� ������ �ȵȴ�.
	}
		
	public static void main(String[] args) {
		new Test02();
	}

}
