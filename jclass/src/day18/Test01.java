package day18;

//�޴�����ȣ�� ���Խ� �˻縦 �غ���
import java.util.regex.*;
public class Test01 {

	public Test01() {
		/* 
		 * ���ڿ��ȿ� "�� ǥ���ҷ��� ����� ��Ȳ�� �߻��Ѵ�
		 * �̶� ����ϴ� ���ڰ� �̽������� �����̴�.
		 * ǥ���Ϸ��� Ư������ �տ� \�� �ٿ��ָ� �ȴ�.
		 * 
		 * ������ ��쵵 ����������
		 */
		/*
		String str = "\"abcd\"";
		System.out.println("str: "+str);
		char ch = '\'';
		*/
		
		//�ڵ��� ��ȣ
		String phone = "010-3175-9042";
		/* 
		 * 1.Pattern Ŭ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����.
		 * 	����) �� Ŭ������ ������ �Լ��� ���������ڰ� private�� ������� ��쿡 �ش��Ѵ�.
		 * �׸��� �� Ŭ������ �Ӽ��� final �Ӽ��� ����Ǿ��ְ�
		 * �ǹ̴� �� Ŭ������ ���̻� ��ӹ��� Ŭ������ ���� �� ���ٴ� �ǹ��̴�.
		 * ���� �� Ŭ������ �ܺο���  new ���Ѽ� ����� �� ���� Ŭ�����̰�
		 * ��� ���Ѽ� �� Ŭ������ �ν��Ͻ��� ������ �޾Ƽ� ����� �� ������.
		 * �� ��� �� Ŭ������ ��ü�� ����Ϸ��� �Ҽ� �Լ��� �Ӽ��� static�̸鼭 
		 * ��ȯ���� Pattern �� �Լ��� ����ϸ� �ȴ�.
		 * �׷� �Լ��� compile()�� �ִ�.
		 */
		
		Pattern pattern = Pattern.compile("01[0-9]-[0-9]{4}-[0-9]{4}");
		/*
		 * 2.�� Ŭ�������� ���Խ� ������ �´��� �˻��� �޶�� ��û�ؾ� �Ѵ�.
		 * �����˻��ϴ� �Լ��� matcher()
		 * �� �Լ��� �˻�����  Matcher��� Ŭ������ 
		 * ����� ���� ��� ������ ��� ��ȯ�ϵ��� �Ǿ��ִ�.
		 */
		//���Խ� �˻��� �޴� ����
		Matcher mat = pattern.matcher(phone);
		//���� Matcher ��ü���� �˻����� ������ ���Ǿ� �ִ�.
		//�˻����� �˷��ִ� �Լ��� �����ϴµ� 
		//Matcher Ŭ������ ����� matches() �Լ��̴�.
		boolean bool = mat.matches();
		if(bool) {
			System.out.println("##�ùٸ� �޴��� ��ȣ�Դϴ�.");
		}else {
			System.out.println("�ùٸ� �޴��� ��ȣ�� �ƴմϴ�.");
		}
	/*
	 * ����) ���Խ� �˻���
	 * 1. ���Խ� ������ Pattern ��ü�� �����.
	 * Pattern pattern = Pattern.compile("���Խ�����");
	 * 
	 * 2. ���ڿ��� ���Ͽ� �´��� �˻��Ѵ�.
	 * 	Matcher mat = pattern.matcher("�˻��� ������");
	 * 
	 * 3. �˻����� ������ ����Ѵ�.
	 * boolean bool = mat.matches();
	 * 
	 */
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test01();
	}

}