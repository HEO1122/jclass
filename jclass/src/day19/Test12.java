package day19;

import java.util.*;
import static java.lang.Math.*;

public class Test12 {

	public Test12() {//같은데이터는 삭제,중복데이터 불허
		HashSet set = new HashSet();
		
		for(int i =0; i<5;i++) {
			set.add("홍길동");
			
		}
		//데이터 내용 출력
		System.out.println(set);
		HashSet set2 = new HashSet();
		//set2에 랜덤하게 데이터를 10개 저장하자. 단 중복은 없도록한다.
		while(set2.size()<10) {
			int no =(int)(random()*20+1);
			set2.add(no);
		}
		System.out.println(set2);
		//데이터를 하나씩 꺼내서 출력해보자
		//1. Iterator로 변환시켜서 처리하는 방법
		Iterator itor = set2.iterator();
		while(itor.hasNext()) {
			//hasNext() - 더이상 꺼낼 데이터가 있는지 물어보는 함수
			Object o =itor.next();//다음 데이터 꺼내는 함수
			int no =(int)o;
			System.out.print(no +"|");
			
		}
		System.out.println();
		//2. ArrayList로 변환해서 처리하는 방법
		ArrayList list= new ArrayList(set2);
		//정렬
		Collections.sort(list);//오름차순 정렬
		//내용출력
		System.out.println(list);
		//내림차순
		Collections.reverse(list);
		//내용출력
				System.out.println(list);
		
	}

	public static void main(String[] args) {
	new Test12();
	}

}
