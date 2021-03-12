package day19;

import java.util.*;
import java.lang.Math.*;
public class Test11 {
/*
 * ArrayList에 10개의 Semo를 랜덤한 밑변과 높이로 채워보자
 * 그리고 오름차순 정렬해서 출력해보자.
 * 그리고 내림차순
 */
	public Test11() {
		ArrayList list = new ArrayList();
		
		//list 에 랜덤하게 열개의 세모채우기
		for(int i =0; i<10;i++) {
			list.add(new Semo(getSize(),getSize()));
		}
		//내용출력
		for(Object o : list) {
//			Semo s =(Semo)o;
//			s.toPrint();
			System.out.println(o);
		}
		
		//내림차순
		Collections.sort(list, new MySort());
		for(Object o : list) {
			Semo s =(Semo)o;
			s.toPrint();}
		
	}
	//정수 1~20사이의 숫자반환함수
	public int getSize() {
		return (int)(random()*20+1);
	}

	//오름차순 정렬
	public class MySort implements Comparator{
		public int compare(Object o1,Object 02) {
			//이 때 입력되는 Object o1,o2는 원래 타입이 세모타입이다.
			//따라서세모타입으로 강제 형병환 해준다.
			Semo s1 =(Semo) o1;
			Semo s2 =(Semo) o1;
			
			double area1= s1.getArea();
			double area2= s2.getArea();
			
			//그런데 이 경우 비교할 데이터가 실수 타입으로 변환해주는 값 타입으로 변경할 때
			//서로 다른 데이터라도 같은 데이터로 취급됭 수 있따.
			//따라서 디때는 강제로 1,-1을 결과 값으로 반환해주도록 한다.
			int result = (area2 -area1<0)? -1 : (area2 -area1 ==0)>0 : 1;
			return 0;
		}
	}
	public static void main(String[] args) {
		new Test11();
	}

}
