package day17;

import java.util.*;
public class Test02 {

	public Test02() {
		Scanner sc = new Scanner(System.in);
		
		try{//�� ���� ������ MyException���ܸ� �߻����Ѿ� �Ѵ�.
			while(true) {
					System.out.print("�����Է� : ");
					int no =sc.nextInt();
					if(no==0) {
						throw new MyException();
					}
					else if(no ==-1) {
						break;}
					System.out.println("no : "+no);
		
				}
			}catch(MyException e) {
			System.out.println(e);}
	}
		

	public static void main(String[] args) {
		new Test02();

	}
	public class MyException extends Exception{
		//���� ���� Ŭ����
		//�� Ŭ������ 0�� �ԷµǸ� �߻��Ǵ� ����� ���� ���ܸ� ó���� �ִ� Ŭ����
		//���� ������ ������ 0�� �ԷµǾ��ٴ� ���� �˷��ִ� ���̵ȴ�.
		public String toString() {
			return "���ƿ� 0�� �ԷµǾ����ϴ�.";
		}
	}

}
