package day20;

import java.util.*;

import day18.Test04;
public class Test01 {
	public Hashtable tab;
	
	public Test01() {
		//Hashtable�����
		tab= new Hashtable();
		//������ä���
		tab.put("�̸�", "ȫ�浿");
		/*
		 * Map �迭�� �����͸� �Է��� �� �� �����͸� �����ϴ� 
		 * Ű���� �����͸� �ѽ����� ���� �Է��ؾ��Ѵ�.
		 */
		tab.put("����", 18);
		tab.put("��ȭ", "010-1111-1111");
		tab.put("Ű", 173.0);
		
		System.out.println("�̸� : "+ tab.get("�̸�"));
		tab.put("�̸�", "���浿");
		System.out.println("�̸� : "+ tab.get("�̸�"));
		/*
		 * ���� Ű������ �����͸� �Է��ϸ� ���� ����� �����ʹ� 
		 * �����ǰ� ���ο� �����Ͱ� �Էµȴ�.
		 * ��, ���� Ű������ �Ѱ��� �����͸� ����� �� �ִ�.
		 * 
		 */
		tab.put("����","���浿");
		//Ű���� �޶����� ���� �����͵� �Է��� �� �ִ�.
		System.out.println("���� : "+ tab.get("����"));
		
		int len =tab.size();
		System.out.println("tab length : "+ len);
		
		//�����͸� ����
		Collection con = tab.values();
		//Iterator�� ��������
		Iterator itor = con.iterator();
		//�ϳ��� ������ ���
		while(itor.hasNext()) {
			Object o = itor.next();
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("���ڿ�������: " + str);
			}else if(o instanceof Integer) {
				int no =(int) o;
				System.out.println("������������: " + no);
			}else if(o instanceof Double) {
				Double num = (double) o; //Unboxing�� �ڵ� ó����
				System.out.println("�Ǽ�������: "+ num);
			}
		}
		//Ű���� ����..
		//Ű���� �����ϴ� �Լ���  keys(), keySet()
		Enumeration en = tab.keys();
		//���
		while(en.hasMoreElements()) {
			Object obj =en.nextElement();
			//�츮�� ��� Ű���� ��� ���ڿ��̱� ������ ���� ����ȯ ������
			String skey = (String)obj;
			System.out.println("key :" + skey);
			//������ ���
			System.out.println("value : "+ tab.get(skey));
			
		}
		keyNval();
		System.out.println();
		keyNval2();
	}
	//key�� value�� �ѽ����� ������ ������ִ� �Լ�
	public void keyNval() {
		//�������� tab�� ���� �����͸� Map.Entry Ÿ������ ��������
		Set data =tab.entrySet();
		//�� ��� Set������ �ȿ� tab�� ��� �ִ� Ű���� �����Ͱ� �� ������ Map.EntryŬ������ ����Ǿ��ִ�.
		//Set���� �����͸� ������ �Լ��� �������� �����Ƿ� 
		//Iterator�� ArrayList�� ��ȯ �� �Ѱ��� ������ ����ؾ� �Ѵ�.
		
		//Iterator�� ������ ���
		Iterator itor = data.iterator();
		while(itor.hasNext()) {
			Object o = itor.next();
			Map.Entry ent = (Map.Entry)o;
			/*
			 * Map.Entry�� Ű���� �����͸� ������ ������ VOŬ�����̴�.
			 * ���� ent�ȿ� ���� Ű���� ����(������)�� �Լ��� ȣ���ؼ� ������ �ȴ�.
			 */
			System.out.println(ent.getKey() + "|" + ent.getValue());
		}
	}
	//entrySet()�� ����� ArrayList�� ��ȯ�ؼ� ó���ϴ� �Լ�
	public void keyNval2() {
		Set data = tab.entrySet();
		
		//Set��ArrayList�� ��ȯ
		ArrayList list= new ArrayList(data);
		//�̶� list���� Map.EntryŸ���� �����͵��� ����ִ�.
		for(int i =0; i<list.size(); i++) {
			//������ ������
			Map.Entry ent =(Map.Entry) list.get(i);
			//������ ������ ����ϰ�
			System.out.println(ent.getKey()+"|"+ent.getValue());
		}
	}
	public static void main(String[] args) {
		new Test01();
	}

}