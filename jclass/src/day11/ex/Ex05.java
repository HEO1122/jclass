package day11.ex;
/*
 * ��5 ���� ������ 5�� ����� �迭�� ���� ������ ������ִ� ���α׷��� �ۼ��ϼ���
 * ���ó���� ��3�� �����ϰ� �ϼ���
 */
public class Ex05 {
	public Ex05() {
	//5�� �迭 �����
	Won[] won = new Won[5];
	//�迭�� �ν��Ͻ� ����
	for(int i =0; i<won.length;i++) {
		won[i]= new Won();
	}
	//�ν��Ͻ� ä���
	for(int i=0; i<won.length; i++) {
		won[i].radSet();
		won[i].doolSet();
		won[i].nulbSet();
		won[i].print();
	}
//	//���
//	for(Won w : won) {
//		w.print();
//	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}
}
