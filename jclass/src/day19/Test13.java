package day19;

import static java.lang.Math.*;
import java.util.*;
public class Test13 {

	public Test13() {
		//트리셋만들고
		TreeSet set = new TreeSet();
		//데이터 10개 넣고
		while(set.size()<=10) {
			
			set.add((int)(random()*20+1));
		}
		//내용살펴보고
		System.out.println(set);
		
		TreeSet set2 = new TreeSet();
		set2.add("루피");
		set2.add("쵸파");
		set2.add("상지");
		set2.add("조로");
		set2.add("보아핸콕");
		set2.add("로빈");
		set2.add("나미");
		set2.add("우솝");
		set2.add("브룩");
		set2.add("프랭키");
		
		//출력
		Iterator itor = set2.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next()+"|");
		}
		TreeSet set3 = new TreeSet();
		//Semo5개 입ㄹ겨
		while(set3.size()<=5) {
			set3.add(new Semo((int)(random()*20+1),(int)(random()*20+1)));
		}
		//출력
		itor =set3.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next()+"|");
		}
	}

	public static void main(String[] args) {
		new Test13();

	}

}
