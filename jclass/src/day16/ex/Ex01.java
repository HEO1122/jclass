package day16.ex;

/*
 * �������̽�Dohyung�� ������ Ŭ���� Semo, Nemo, Won�� �����
 * �迭�� �����ϰ� 10���� ���� ä���
 * �� ������ ������ ����ϼ���.
 */
public class Ex01 {
	double[] d = new double[10];
	public Ex01() {
		setD();
	}

	public static void main(String[] args) {
		new Ex01();

	}
	//�����ϰ� �迭�� Ŭ���� ä���ֱ�
	public void setD(){
		for(int i=0; i<10;i++) {
		int no =(int)Math.random()*3;
			if(no==0) {
				d[i]= Semo();
			}else if(no==1) {
				d[i]=Nemo();
			}else if(no==2) {
				d[i]=Won();
			}
		}
	}

}
