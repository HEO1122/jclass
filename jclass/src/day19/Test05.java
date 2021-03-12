package day19;


import java.util.*;
public class Test05 {

	public Test05() {
		Vector vec = new Vector();
		vec.add("둘리");
		vec.add("홍길동");
		vec.add("고길동");
		vec.add("희동이");
		vec.add("도우너");
		
		ArrayList list = new ArrayList(vec);
		//데이터갯수 출력
		int tcnt= list.size();
		
		//내용 출력
		System.out.println(list);//toString()가 자동호출..
		
		//데이터 추가
		list.add("쵸파");
		
		//마지막 데이터 꺼내서 출력
		System.out.println("list 마지막 데이터 : "+ list.get(list.size()-1));
		System.out.println(list);//toString()가 자동호출..
		
	}

	public static void main(String[] args) {
		new Test05();

	}

}
