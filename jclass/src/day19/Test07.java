package day19;

import java.util.*;
public class Test07 {

	public Test07() {
	LinkedList list =new LinkedList();
	list.add("����");
	list.add("����");
	list.add("����");
	list.add("����");
	list.add("��������");
	list.add("�κ�");
	list.add("����");
	list.add("���");
	list.add("���");
	list.add("����Ű");
	
	int len =list.size();
	for(int i =0; i<len;i++) {
		String name =(String)list.get(i);
		if(name.equals("����")) {
			name = name + "����";
		}else {
			name =name+"����";
		}
		System.out.println(name);
	}
	//list�� �����͸� �̸����� �������� ����
	Collections.sort(list);
	for(int i =0; i<len;i++) {
		String name =(String)list.get(i);
		if(name.equals("����")) {
			name = name + "����";
		}else {
			name =name+"����";
		}System.out.println(name);
	}
	}

	public static void main(String[] args) {
		new Test07();

	}
}
