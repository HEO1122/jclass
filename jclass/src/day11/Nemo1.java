package day11;

public class Nemo1 {
	public int garo, sero;
	//���� ���ΰ� �����ϰ� ������ �Ǵ� �⺻ ������
	public Nemo1() {
		//��ȯ�� Ÿ���� ���� ���� ������ �Լ�
		garo =(int)(Math.random()*15+1);
		sero =(int)(Math.random()*15+1);
	}
	//���� ���θ� �̿��ؼ� ������ ��ȯ���ִ� �Լ�
	public int getArea() {//�̹� ��ü�� �� �̵��� ��ɽ���
		return garo*sero;
	}
}
