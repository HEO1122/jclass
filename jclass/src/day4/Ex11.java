package day4;
//���� 11 ]
//		3�ڸ� ���ڸ� �Է¹޾Ƽ�
//		�� ���ڿ��� ���� ����� 100�� ����� ����� ���ؼ���
//		�󸶰� �ʿ������� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
//		
//		�� ]
//			241		- 200�� �����Ƿ� 41 ���� �Ѵ�.
//100���� ���� �������� 50���� ������ �������� ���ָ� �ǰ� 50���� ũ�� 100���� �������� �� ���� �����ش�.
//������ 50, 50���� ���� ��� ������ ���ָ�ǰ� �� �ܴ� 100���� �������� �A ���� �����ָ�ȴ�.
import java.util.*;
public class Ex11 {
	public static void main(String[] args) {
		//�Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		//�Է¹޾� ������ ����
		System.out.println("3�ڸ� ���ڸ� �Է��ϼ���");
		int no= sc.nextInt();
		//������ ������ ����Ű��
		int rest = no %100;
		
		int result = 0;
		String msg = "";
		//���ǿ� ���� ó��
		/*int result = (rest <50) ? (no-rest) : (no+(100-rest));
		String msg =(rest<50) ? result +"�� �����Ƿ�"+(no - result) + "������Ѵ�." :
			result +"�� �����Ƿ�" + (no+result)
			+"��������Ѵ�";
		//��� ���\
		System.out.println("�Է��� ����: " + no + "-"+ msg);
		*/
		
		if( rest <50) {
			result = no -rest;
			msg = result + " �� �����Ƿ� " + rest + " �� ������Ѵ�.";
		}
		else {
			result = no+(100-rest);
			msg = result + " �� �����Ƿ� " + (100- rest) + " �� ������� �Ѵ�. ";
		}
		System.out.println("�Է��� ����: " + no + "-"+ msg);
	}
}
