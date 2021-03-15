package day20;
/*
 *1. 이름과 나이를 한쌍으로 한 데이터를 Map에 저장한 후 
 *2. 저장된 데이터를출력하고
 * 3. 나이 순서대로 오름차순 정렬한 후 
 * 4. 출력하세요
 */
import java.util.*;
public class Test05 {
	private HashMap map;
	public Test05() {
		setData();
		ArrayList list = getList();
		Collections.sort(list, new MySort());
		//리스트 출력
		printList(list);
		
		//내림차순
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
			//이때 1,2 map.entry타입의 객체
			//따라서 둘을 Map.Entry 타입으로 강제형변환 
			
		Map.Entry e1 =(Map.Entry) o1;
		Map.Entry e2 =(Map.Entry) o2;
		
		//정렬 기준이 될 변수를 꺼낸다. 우리의 경우 나이
		Object tmp1= e1.getValue();
		Object tmp2 =e2.getValue();
		
		//꺼내온 데이터를 정수로 강제 형변환
		int age1 = (int)tmp1;
		int age2= (int)tmp2;
		
		int result = age2 -age1;
		return -result;
		}
	}
	//맵초기화
	public void setData() {
		map =new HashMap();
		//데이터
		map.put("홍길동",16);
		map.put("고길동",36);
		map.put("희동",3);
		map.put("마이콜",22);
		map.put("또치",5);
	}
	//map의 데이터를 list로 반환해주는 함수
	public ArrayList getList() {
		Set set = map.entrySet();
		ArrayList list =new ArrayList();	
		return list;
	}
	
	
	//list를 입력하면 내요을 출력하는 함수
	public void printList(ArrayList list) {
		for(int i =0; i<list.size();i++) {
			Map.Entry ent = (Map.Entry) list.get(i);
			String name = (String) ent.getKey();
			int age =(int) ent.getValue();
			
			//출력
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
