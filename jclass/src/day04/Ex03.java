package day04;
/*10���� 49������ �� �� ���� �ϳ��� �Է¹޾Ƽ�
 * 10-19 : �ѹ���
 * 20-29 : ������
 * 30-39 : ȸ���
 * 40-49 : ���ߺ�
 * �� ������ִ� ���α׷��� �ۼ��ϼ���.
 * 
 * if ~ else if �������� switch ~case ���� 2���� ��� ó���ϼ���.
 */
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		//10-49 ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		//�����Է�
		System.out.println("���ڸ� �Է��ϼ���");
		int no = sc.nextInt();
		
		String result ="";
		
		//��ȣ�� �μ� ������
		if( no>=10 & no<20) {
			result ="�ѹ���";
		}else if(no>=20 & no<30) {
			result ="������";
		}else if(no>=30 & no<40) {
			result ="ȸ���";
		}else if(no>=40 & no<50) {
			result ="���ߺ�";
		}else { result ="���� �μ��Դϴ�.";}
		
		//���
		System.out.println(no + result);
	}
}
