package day16;
	
import java.util.*;
public class Test08 {
int num;
	public Test08() {
		int no = 0;
		/*try {
			no =addNum();
			
		}catch(NumberFormatException e) {
			System.out.println("���������� �ƴϿ���");
		}catch(Exception e) {
			System.out.println("�˼����� ���ܰ� �߻��߾��");
		}*/
		System.out.println(addNum1());
	}

	public static void main(String[] args) {
		new Test08();
	}
	//���ڸ� �Է¹޾Ƽ� ������ ��ȯ �� 10�� ���ؼ� ��ȯ���ִ� �Լ�
	public int addNum() throws NumberFormatException, Exception {
		int result =0;
		//�Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		//�޽��� ���
		System.out.println("�����Է� : ");
		//���ڿ� ������ �Էµ����� ����
		String sno = sc.nextLine();
		//���� 5�� �ԷµǸ� ������ ���ܸ� �߻���������.
		if(sno.equals("5")) {
			throw new Exception();
		}
		//������ȯ
		int no =Integer.parseInt(sno);
		
		//����ϰ�
		result = no =10;
		return result;
	}
	public int addNum1() {
		int result =0;
		//�Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		//�޽��� ���
		System.out.println("�����Է� : ");
		//���ڿ� ������ �Էµ����� ����
		String sno = sc.nextLine();
		int no =0;
		try {
			//���� 5�� �ԷµǸ� ������ ���ܸ� �߻���������.
			if(sno.equals("5")) {
				throw new Exception();
			}
			//������ȯ
			no =Integer.parseInt(sno);
		}catch(NumberFormatException e) {return no+1;}
		catch(Exception e) {return no+5;}
		finally {
			num=90;
		}
		
		//����ϰ�
		result = no +10;
		return result;
	}
}
