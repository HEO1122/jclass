package day6;
/*
 * 1-2+3-4+5-6+...�����ϴٰ� 100�� �ѱ�� ����� ������ ȸ���� ����ϼ���
 */
public class Test02 {
	public static void main(String[] args) {
		int sum =0;
		int gop=-1;
		int num=0;
		for(int i =1; ;i++) {
			gop= gop*-1;
			int no=i*gop;
			sum=sum+no;
			num=i;
			if(sum>100) break;
		}//���ȿ� ����� �ϳ��� ��� ����ȣ�� �����ص� �ȴ�. if ���ǹ��� ���
		System.out.println(num+"���� ����� �����" + sum+"���� ó�� 100�� �ѱ�Եȴ�.");
	}
}
