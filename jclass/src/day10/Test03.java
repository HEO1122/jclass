package day10;
/*�غ��� ���̸� ������ ������ ������ �ﰢ����
 * ���̸� ������ִ� ����� �Լ�(samgak)�� �����
 * �����ϼ���.
 */


public class Test03 {
	public Test03() {
	
	}
	public static void main(String[] args) {
		new Test03();
		new Test03();
	}
	void samgak() {
		//�����ϰ� �غ��� ���� ���
		int width =(int)(Math.random()*21+5);
		int height =(int)(Math.random()*21+5);
		//���� ����ϰ�
		double area = width*height/2.;
		//����ϰ�
		System.out.println("�غ� :"+width);
		System.out.println("���� :"+height);
		System.out.println("���� :"+ area);
	}
}
