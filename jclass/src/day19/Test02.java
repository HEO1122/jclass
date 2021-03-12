package day19;

import java.util.*;
public class Test02 {

	public Test02() {
		Vector vec = new Vector();
		System.out.println(vec.capacity()); //capacity() ������� ���� �˷��ִ� �Լ�
		
		for(int i =0; i<5; i++) {
			vec.add(i); 
		}
		System.out.println(vec.capacity());
		//������ ù��° ���� ������ ���
		int no = (int)vec.get(0);
		/*
		 * �÷��ǿ� �����͸� �����ϸ� �⺻������ �����Ͱ�
		 * ObjectŸ������ �ڵ� ����ȯ�� �Ǽ�����ȴ�.
		 * ���� ������ ����� ���� ���� ����ȯ���� ���� Ÿ�Կ� �´� ���·� ��ȯ
		 * ��������Ѵ�.
		 */
		System.out.println(no);
		//������ ���� ��� ���
		for(Object o : vec) {
			System.out.print(o+",");
		}
		System.out.println();
		//����� ������ ���� ���
		int cnt =vec.size();// ���Ϳ� ���� ������ ������ ��ȯ���ִ� �Լ�
		System.out.println(cnt);
		//������ 5�� �߰�
		for(int i =0; i<5; i++) {
			vec.add(i); 
		}
		System.out.println(vec.capacity());
		//���Ϳ� "ȫ�浿"�߰�
		vec.add("ȫ�浿");
		cnt= vec.size();
		System.out.println(vec.capacity());
		
		for(int i =0; i<10; i++) {
			vec.add("�Ѹ�");
		}
		cnt= vec.size();
		System.out.println(vec.capacity());
	}

	public static void main(String[] args) {
		new Test02();

	}

}
