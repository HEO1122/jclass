package day19;


import java.util.*;
public class Test05 {

	public Test05() {
		Vector vec = new Vector();
		vec.add("�Ѹ�");
		vec.add("ȫ�浿");
		vec.add("��浿");
		vec.add("����");
		vec.add("�����");
		
		ArrayList list = new ArrayList(vec);
		//�����Ͱ��� ���
		int tcnt= list.size();
		
		//���� ���
		System.out.println(list);//toString()�� �ڵ�ȣ��..
		
		//������ �߰�
		list.add("����");
		
		//������ ������ ������ ���
		System.out.println("list ������ ������ : "+ list.get(list.size()-1));
		System.out.println(list);//toString()�� �ڵ�ȣ��..
		
	}

	public static void main(String[] args) {
		new Test05();

	}

}
