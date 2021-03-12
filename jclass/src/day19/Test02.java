package day19;

import java.util.*;
public class Test02 {

	public Test02() {
		Vector vec = new Vector();
		System.out.println(vec.capacity()); //capacity() 저장공간 갯수 알려주느 함수
		
		for(int i =0; i<5; i++) {
			vec.add(i); 
		}
		System.out.println(vec.capacity());
		//벡터의 첫번째 방의 데이터 출력
		int no = (int)vec.get(0);
		/*
		 * 컬렉션에 데이터를 저장하면 기본적으로 데이터가
		 * Object타입으로 자동 형변환이 되서저장된다.
		 * 따라서 꺼내서 사용할 때는 강제 형변환으로 원래 타입에 맞는 형태로 변환
		 * 시켜줘야한다.
		 */
		System.out.println(no);
		//벡터의 내용 모두 출력
		for(Object o : vec) {
			System.out.print(o+",");
		}
		System.out.println();
		//저장된 데이터 갯수 출력
		int cnt =vec.size();// 벡터에 기억된 데이터 갯수를 반환해주는 함수
		System.out.println(cnt);
		//데이터 5개 추가
		for(int i =0; i<5; i++) {
			vec.add(i); 
		}
		System.out.println(vec.capacity());
		//벡터에 "홍길동"추가
		vec.add("홍길동");
		cnt= vec.size();
		System.out.println(vec.capacity());
		
		for(int i =0; i<10; i++) {
			vec.add("둘리");
		}
		cnt= vec.size();
		System.out.println(vec.capacity());
	}

	public static void main(String[] args) {
		new Test02();

	}

}
