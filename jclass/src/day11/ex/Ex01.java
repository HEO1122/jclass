package day11.ex;
/*
 * ��1 �ﰢ���� ������ ����� Ŭ����(Semo)�� �����ϰ� 
 * �� Ŭ���� Ÿ���� ������ �ټ����� ����� �迭�� ����
 * �غ�  : xx- ���� :  xx -���� :xxx�� �������� ����ϼ���
 * �غ��� ���̴� �ν��Ͻ��� ������� ��  5~15������ ������ �����ϰ� �Է��� �ǵ���
 * ó���ϼ���
 * ������ �Լ��� ó���ϼ���
 */
public class Ex01 {
	public Ex01() {
		//5���� �迭�� �����
		Semo[] semo = new Semo[5];
		//�迭��  ���� ��ü ä���ֱ�
		for(int i=0; i<semo.length; i++) {
			semo[i]= new Semo();
		}
		//�غ�, ����, ���� ���
		for(int i=0; i<semo.length;i++) {
			int width = semo[i].width;//�迭�� ���θ� ������ ����
			int height = semo[i].height;//�迭�� ���θ� ������ ����
			double area = semo[i].semArea();//���� ���ϴ� �Լ��� ���� �迭�� ����
			System.out.printf("�غ� : %2d - ���� : %2d - ���� : %5.2f\n", width, height, area);
		}
		
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
