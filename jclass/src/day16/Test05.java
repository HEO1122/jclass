package day16;

import java.util.*;
public class Test05 {

	public Test05() {
		//�Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		
		//�޽��� ���
		System.out.print("���� �Է� :");
		String str = sc.nextLine();
		int[] num = new int[1];
		int no = 0;
	
		try {
			no	=	Integer.parseInt(str);
			num[0]=no;
			
		}/*
		���� ���ܰ� ���� ����Ǹ� ������ catch���� ������ �� ���� ���°� �ȴ�.
			e.printStackTrace();
		}*/
		catch(NumberFormatException e) {
			//���� ���� ����ϴ� ���
			//1. ������ ����ϴ� ���
//			System.out.println(e);//���������� ���
			//2. ������ ������ ��ġ���� ����ϴ� ���
		}
			catch(Exception e){ 
			e.printStackTrace();
			}
			no=-999;
		}
		System.out.println("no:"+ no);
	}

	public static void main(String[] args) {
	new Test05();
	}

}
