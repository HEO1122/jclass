package day11.ex;
/*��3
 * ������������ 5���� ����� �迭�� �����
 * �� �ﰢ���� ������ ����ϼ���
 * ��, �ﰢ���� ���� ���� ������ �Լ��� ���� ó���ϼ���.
 * (=> �����ڿ��� ó������ �ʵ��� �ϼ���.)
 * ����Լ��� �ﰢ��Ŭ�������� ����Լ��� ������ ����
 * �Լ��� ȣ���ؼ� ó���ϵ��� �ϼ���.
 */
public class Ex03 {
	public Ex03() {
		//�迭 �����
		Sam[] sam = new Sam[5];
		
		//�ﰢ�� �ν��Ͻ�����
		for(int i=0; i<sam.length; i++) {
			sam[i] = new Sam();
		}
		//��������
		for(int i=0; i<sam.length; i++) {
			sam[i].samSet();
			sam[i].nulbSet();
		}
		
		//���
		for(Sam s : sam) {
			s.print();
		}
	}
	
	public static void main(String[] args) {
		new Ex03();

	}

}
