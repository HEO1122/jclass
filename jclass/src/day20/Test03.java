package day20;
/*
 * �л��� �̸��� �̿��ؼ� ����(java, db, web, jsp, spring, total)�� �����ϴ� Map�� ���� ����غ���
 */
import static java.lang.Math.*;
import java.util.*;
public class Test03 {
	private HashMap map;
	
	//������
	public Test03() {
		map= setData();
		//����Ѵ�.
		toPrint();
		System.out.println();
		toPrint(map);
	}
	
	//map �ʱ�ȭ �Լ�
	public HashMap setData() {
		//��ȯ�� ���� �����	//map �����
		HashMap map = new HashMap();
			
		//������ ä���
		map.put("�ڿ��", new Student("�ڿ��",getScore(),getScore(),getScore(),getScore(),getScore()));
		map.put("���¼�", new Student("���¼�",getScore(),getScore(),getScore(),getScore(),getScore()));
		map.put("�����", new Student("�����",getScore(),getScore(),getScore(),getScore(),getScore()));
		map.put("������", new Student("������",getScore(),getScore(),getScore(),getScore(),getScore()));
		map.put("������", new Student("������",getScore(),getScore(),getScore(),getScore(),getScore()));
		//Map��ȯ
		return map;
	}
	//������ ������ ���
	public void toPrint() {
		//Ű���� �˾ƾ� �����͸� ���� �� �����Ƿ� Ű������ ��� ������.
		Set keys = map.keySet();
		//iterator�� ��ȯ �� ó��
		Iterator itor = keys.iterator();
		//�Ѱ��� ������ ����Ѵ�.
		while(itor.hasNext()) {
			//�ϳ� ������
			Object o = itor.next();
			//������ ������
			Object obj = map.get(o);
			//���� Ÿ������ ��������ȯ
			Student stud = (Student) obj;
			//toPrint()ȣ��
			stud.toPirnt();
		}
	}
	//HashMap�� �Է��ϰ� ȣ���ϸ� Map�� ������ ������ִ� �Լ�
	public void toPrint(HashMap m) {
		Set set = m.entrySet();
		/*
		 * set�ȿ��� Map.Entry Ÿ���� �����Ͱ� ä�����ִ�.
		 * 	Map.Entry�� �̸��׸� VOŬ�����̴�.
		 * 
		 */
		Iterator itor =set.iterator();
		//�����͸� �ϳ��� ������ ����Ѵ�.
		while(itor.hasNext()) {
			Object o = itor.next();
			Map.Entry en = (Map.Entry) o;
			String key =(String)en.getKey();
			Student val = (Student) en.getValue();
			System.out.println("key :"+key);
			System.out.println(val);
		}
	}
		
		
	
	//������ȯ
	public int getScore() {
		return (int)(random()*41+60);
	}
	// getter, setter
	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}


	public static void main(String[] args) {
		new Test03();

	}

}
