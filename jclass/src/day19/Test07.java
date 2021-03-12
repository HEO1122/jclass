package day19;

import java.util.*;
public class Test07 {

	public Test07() {
	LinkedList list =new LinkedList();
	list.add("루피");
	list.add("쵸파");
	list.add("상지");
	list.add("조로");
	list.add("보아핸콕");
	list.add("로빈");
	list.add("나미");
	list.add("우솝");
	list.add("브룩");
	list.add("프랭키");
	
	int len =list.size();
	for(int i =0; i<len;i++) {
		String name =(String)list.get(i);
		if(name.equals("루피")) {
			name = name + "선장";
		}else {
			name =name+"선원";
		}
		System.out.println(name);
	}
	//list의 데이터를 이름기준 오름차순 정렬
	Collections.sort(list);
	for(int i =0; i<len;i++) {
		String name =(String)list.get(i);
		if(name.equals("루피")) {
			name = name + "선장";
		}else {
			name =name+"선원";
		}System.out.println(name);
	}
	}

	public static void main(String[] args) {
		new Test07();

	}
}
