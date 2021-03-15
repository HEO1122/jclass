package day20;
/*
 *1. �̸��� ���̸� �ѽ����� �� �����͸� Map�� ������ �� 
 *2. ����� �����͸�����ϰ�
 * 3. ���� ������� �������� ������ �� 
 * 4. ����ϼ���
 */
import java.util.*;
public class Test05 {
	private HashMap map;
	public Test05() {
		setData();
		ArrayList list = getList();
		Collections.sort(list, new MySort());
		//����Ʈ ���
		printList(list);
		
		//��������
		Collections.sort(list, new comperator());
		public int compare(Object o1, Object o2) {
			
			int result =0;
			
			int age1 = (int)((Map.Entry) o1).getValue();
			int age2 = (int)((Map.Entry) o2).getValue();
			
		return age2 - age1;
		}
	}
	public class MySort implements Comperator{
		public int compare(Object o1, Object o2) {
			//�̶� 1,2 map.entryŸ���� ��ü
			//���� ���� Map.Entry Ÿ������ ��������ȯ 
			
		Map.Entry e1 =(Map.Entry) o1;
		Map.Entry e2 =(Map.Entry) o2;
		
		//���� ������ �� ������ ������. �츮�� ��� ����
		Object tmp1= e1.getValue();
		Object tmp2 =e2.getValue();
		
		//������ �����͸� ������ ���� ����ȯ
		int age1 = (int)tmp1;
		int age2= (int)tmp2;
		
		int result = age2 -age1;
		return -result;
		}
	}
	//���ʱ�ȭ
	public void setData() {
		map =new HashMap();
		//������
		map.put("ȫ�浿",16);
		map.put("��浿",36);
		map.put("��",3);
		map.put("������",22);
		map.put("��ġ",5);
	}
	//map�� �����͸� list�� ��ȯ���ִ� �Լ�
	public ArrayList getList() {
		Set set = map.entrySet();
		ArrayList list =new ArrayList();	
		return list;
	}
	
	
	//list�� �Է��ϸ� ������ ����ϴ� �Լ�
	public void printList(ArrayList list) {
		for(int i =0; i<list.size();i++) {
			Map.Entry ent = (Map.Entry) list.get(i);
			String name = (String) ent.getKey();
			int age =(int) ent.getValue();
			
			//���
			System.out.println(name + ": "+ age);
		}
	}
//getter, setter
	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}

	
	public static void main(String[] args) {
	new Test05();

	}

}
