package day04;
/*��ǻ�Ϳ� ���������� ������ �� ���α׷��� �����ϼ���.

��ǻ�ʹ� �����ϰ� 1 ~ 3 ������ ���ڸ� �߻��ؼ�
	1 - ����
	2 - ����
	3 - ��
�� �����ϰ�
����� ���� 1 ~ 3 ������ ���ڸ� �Է��ϵ��� �Ѵ�.

���� �̰���� Ȯ���ϴ� ���α׷��� �ۼ��ϼ���.
��ǻ�Ͱ� �̱�� -1�� ��ȯ�ϵ����ϰ�
����ڰ� �̱�� 1�� ��ȯ�ϵ��� �ϰ�
���� 0�� ��ȯ�ϵ����Ѵ�.

��Ʈ ]
		��ǻ��		����		����		��
	�����	����		0		-1		1
			����		1		0		-1
			��		-1		1		0*/
import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		//���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - ����\r\n" + 
				"	2 - ����\r\n" + 
				"	3 - �� �߿� �ϳ��� �Է��ϼ���");
		int user = sc.nextInt();
		//��ǻ�� ���� ����
		int com = (int)(Math.random()*(3-1+1)+1);
		//��ȯ��
		int retun = 0; 
		// ���� ��
		if (user ==1 & com ==1) {
			retun =0;
		}else if( user ==1 & com==2) {
			retun = -1;
		}else if(user==1& com==3) {
			retun =1;
		}else if(user ==2& com==1) {
			retun=1;
		}else if(user ==2 & com==2) {
			retun =0;
		}else if(user ==2 & com ==3) {
			retun =-1;
		}else if(user ==3 & com==1) {
			retun =-1;
		}else if(user ==3 & com==2) {
			retun =1;
		}else if(user ==3 & com ==3) {
			retun=0;
		}
		
		//��ȯ ���
		System.out.println
	}

}
