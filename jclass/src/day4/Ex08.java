package day4;
/*���ĺ� ���� �ϳ��� �Է��� ��
	�� ���ڰ� �빮���̸� �ҹ��ڷ�
	�ҹ����̸� �빮�ڷ� ��ȯ���Ѽ� 
	������ִ� ���α׷��� �ۼ��ϼ���.
	a
���ڿ� �Է� ��� 
1. ���ڿ��� �Է¹ް� sc.nextLine(),scNext()
2.���ڿ��� ù��° ��ġ�� ���ڸ� �̾Ƴ���.
 ���ڿ� ������.charAt(0)	

 (����)
 charAt(index)
 ���ڿ��� Ư����ġ�� ���ڸ� ��ȯ���ִ� �Լ�
 -String str="abcd";
 3���� ��ġ ����
 char ch= str.charAt(2);
 �����ͺ��̽������� ��ġ���� 1���� �����̾����� �ٸ� ��� ���� ��ġ���� 0���� �����Ѵ�.
 
 */

import java.util.*;
public class Ex08 {
	public static void main (String[] args) {
	
	//���ĺ� �Է�	
	Scanner sc = new Scanner(System.in);
	System.out.println("���ĺ��� �Է��ϼ���");
	
	String a = sc.nextLine();
	char ch =  a.charAt(0);
	char ch1=0;
	//��ҹ��� �Ǻ�//if else ó����
	
	if (ch>='A' | ch <='Z') {
		ch1= (char) (ch + ('a' - 'A'));
	}else {
		ch1 = (char)(ch - ('a' - 'A'));
	}
	
	System.out.println("���ĺ���ȯ:"+ch);
	/*3�׿����� �ذ���
	 * ch1 =(ch<='Z')?(char)(ch+('a'-'A')) : (char)(ch-('a'-'A'));
	 * 
	 * 
	 * 
	 */
	
	
	}
	

}
