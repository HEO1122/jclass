package day04;
/* 0���� 25������ ���� �����ϰ� �ϳ��� �߻����Ѽ�
 * 0 - 0 �Դϴ�.
 * 2�� ��� - 2�� ����Դϴ�
 * 3�ǹ�� - 3�ǹ���Դϴ�.
 * 2�� 3�� ����� ���- 2�� 3�� ����Դϴ�.
 * �׿� ������ ���Դϴ�.�� �ͷ����ִ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex02 {
	public static void main(String[] args) {
		//���� ���� ����
		int ran = (int)(Math.random()*(25-0+1)+0);
		String result = "";
		// ó��
		/*if( ran%2==0 & ran %3==0) {
			result ="2�� 3�� ����Դϴ�.";
			
		}else if(ran%2 ==0) {
			result ="2�� ����Դϴ�.";
		}else if(ran %3 ==0) {
			result = "3�� ����Դϴ�.";
		}else if(ran==0){
		 	result ="0�Դϴ�.";
		//���
		System.out.println(ran);
		System.out.println(result);*/
		int code = 0;
		if(ran ==0) {
			code =0;
		}else if(ran %6==0) {
			code =1;
		}else if(ran%2==0) {
			code =3;
		}else if(ran%3==0) {
			code =2;
		}else {code =4;}
		
		switch(code) {
		case 0:
			result ="0�Դϴ�.";
			break;
		case 1:
			result ="6�� ����Դϴ�.";
			break;
		case 2:
			result ="3�� ����Դϴ�.";
			break;
		case 3:
			result ="2�� ����Դϴ�.";
			break;
		default :
			result ="������ ����Դϴ�.";
		}
		
		System.out.println("�߻��Ѽ�"+ ran + result);
		}
		
	}

