package day04;
/*
 * String Ŭ������ equals()�Լ��� ����ؼ� ó���ϼ���.
 * 
 * ���ڿ���  �Է¹޾Ƽ� 'M'�� �ԷµǸ� "�����Դϴ�." 'F'= �����Դϴ�.
 * "��" -"�����Դϴ�" ����- "�����Դϴ�." "��" =�����Դϴ�. "����"= �����Դϴ�. ���� =�����Դϴ�.
 * ���� = �����Դϴ�.
 * �̿��� ���� �߸��Է��߽��ϴ�.�� ��µǴ� ���α׷��� �ۼ��ϼ���
 * if else if/ switch ~case �������� ó��
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		//���� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���");
		
		String gen = sc.nextLine();
		String result = "";
		//����
		/*if( gen.equals("M")) {
			result = "�����Դϴ�.";
		}else if(gen.equals("��")) {
			result ="�����Դϴ�.";	
		}else if( gen.equals("����")) {
			result ="�����Դϴ�.";
		}else if(gen.equals("����")) {
			result ="�����Դϴ�.";
		}else if(gen.equals("F")) {
			result ="�����Դϴ�.";
		}else if(gen.equals("��")) {
			result = "�����Դϴ�";
		}else if(gen.equals("����")) {
			result ="�����Դϴ�.";
		}else if(gen.equals("����")) {
			result = "�����Դϴ�.";
		}else { result ="�߸��Է��߽��ϴ�.";}
		//���
		System.out.println(result);*/
		
		switch(gen) {
		case "M":
			result ="�����Դϴ�.";
			break;
		case "��":
			result ="�����Դϴ�.";
			break;
		case "����":
			result = "�����Դϴ�.";
			break;
		case "����":
			result = "�����Դϴ�.";
			break;
		case "F":
			result = "�����Դϴ�.";
			break;
		case "����":
			result = "�����Դϴ�.";
			break;
		case "����":
			result = "�����Դϴ�.";
			break;
		case "��":
			result ="�����Դϴ�.";
			break;
		default: result ="�߸��Է��߽��ϴ�.";
		}
		//���
		System.out.println(result);
	}

}
