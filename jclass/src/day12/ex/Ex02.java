package day12.ex;

/*
 * 5~20������ ������ �����ϰ� �߻����Ѽ� �� ������ ��ŭ�� 1~10 ������ 
 * ������ �߻����Ѽ� ���� ���ϴ� ���α׷��� �ۼ��ϼ���
 */
public class Ex02 {
	int no, sum, cycle;
	int[] narray =  new int[no];// �ݺ��� Ƚ����ŭ�� �迭
	public Ex02() {
		ranNum();
		getSum(no);//,�ձ��ϴ� �Լ�ȣ��
	}
	public void ranNum() {//1~10������ ���� ����
		no= (int)(Math.random()*(10-1+1)+1);
	}
	
	public void getSum(int ...no){//�ݺ��� Ƚ�� ������ �ձ��ϰ� ���
		cycle =(int)(Math.random()*(20-5+1)+5);
		for(int i=0; i<cycle; i++) {
			sum= sum+no[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		new Ex02();//�Լ�����

	}

}
