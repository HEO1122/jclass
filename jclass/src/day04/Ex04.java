package day04;
/*�������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	�������� �뵵���� 
				�ڵ�		�⺻���	�����
		������	1		3800	245
		�����	2		2400	157
		������	3		2900	169
		�����	4		3200	174
		
		������ ���� : �⺻��� + ��뷮 * �����
		
	�뵵 �ڵ�� ��뷮�� �Է¹޾Ƽ� �������� ������ִ� ���α׷��� �ۼ��ϼ���.*/

import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		//�ڵ� ��뷮 �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("�뵵�ڵ�� ��뷮�� �Է��ϼ���");
		
		int code = sc.nextInt();
		int use = sc.nextInt();
		int total=0 ;
		//��� ���
		if (code ==1) {
			total=3800+ (use*245);
		}else if(code ==2) {
			total =2400 +(use*157);
		}else if(code==3) {
			total= 2900 +(use*169);
		}else if(code==4) {
			total=3200+(use*174);
		}
		//������
		System.out.println("�������� "+ total);
	}
}
