package day21;

import java.util.*;
public class Test01 {
/*
 * ���ʸ��� ������ ���ϵ� ī�� 
 * => � �Լ��� ���ʸ� ����� �÷����� �Ű������� ���� �� 
 * �ڱ� �ڽ� �̿��� �ٸ� Ŭ������ ���ʸ� ����� �͵� ���� �� �ֵ��� �Ѵ�.
 */
	public Test01() {
		ArrayList<Object> list0 = new ArrayList<Object>();
		ArrayList<Son> list1 = new ArrayList<Son>();
		ArrayList<Father> list2 = new ArrayList<Father>();
		ArrayList<Grand> list3 = new ArrayList<Grand>();
		
//		abc(list1); ����Ʈ ���ʸ��� ������ �ٸ���.
		abc(list2);
//		abc(list3);  ����Ʈ ���ʸ��� ������ �ٸ���.
		
		//xyz() ȣ��
		xyz(list1); //ArrayList�� ����� �����Ͱ� �ٸ���
		xyz(list2);
		xyz(list3);
		xyz(list0);
		
		//lmn()
//		lmn(list0); Object �̱� ������ �ȵ�
		lmn(list1); // Father�� ���� Ŭ�����̱� ������ ����
		lmn(list2);
//		lmn(list3);//Father�� ���� Ŭ�����̱� ������ �ȵ�
		
		//qwer() ���ʸ��� �������� �����Ͱ� �Ȱ��� �ǹ�
		qwer(list0);
		qwer(list1);
		qwer(list2);
		qwer(list3);
	}

	public void abc(ArrayList<Father> l){
 	/*
 	 * �� �Լ��� ArrayList�� �Ű������� �޾Ƽ� ����Ѵ�.
 	 * �� �Լ��� �ݵ�� Father�� ���ʸ� ����� ArrayList�� �Ű������� ���� �� �ִ�.
 	 */
		
		
	}
	public void xyz(ArrayList<? super Father > l) {
		/*
		 * �� �Լ��� ArrayList�� �Ű������� �Է¹޾Ƽ� �����ؾ� �Ѵ�.
		 * �� �� �ԷµǴ� ArrayList�� Father�� ���ʸ� ����� �Ͱ� 
		 * �� ����Ŭ���� ���ʸ� ����� ���� �Ű������� ���� �� �ֵ�.
		 */
	}
	public void lmn(ArrayList<? extends Father> l) {
		//FathrŬ������ ���� Ŭ������ ���ʸ� ����� ArrayList�� ���� �� �ִ�.
		
	}
	public void qwer(ArrayList<?> l) {
		//�̷� ������ ���ʸ��� ������ ��� ������ ���ʸ��� ����� ArrayList�� �� ���� �� �ִ�.
	}
	public static void main(String[] args) {
		new Test01();
	}
	class Grand{ 
		
	}
	class Father extends Grand{
		
	}
	class Son extends Father{
		
	}
}