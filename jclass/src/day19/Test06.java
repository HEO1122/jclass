package day19;

import java.util.*;
public class Test06 {

	public Test06() {
	ArrayList list = new ArrayList();
	list.add("홍길동");//이름
	list.add(18); //나이
	list.add('M'); //성별
	list.add(175.5); // 키,신장
	//여러 데이터가 입력되어도 된다.
	//Object 타입으로 자동 형변환이 되서 기억된다.
	
	/*
	 * 리스트의 데이터를 꺼내서 
	 * 이름 : 홍길동,
	 * 나이 : 19세,
	 * 성별 : 남자,
	 * 신장 : 177.5cm
	 * 로 연산해서 출력하세요
	 */
	//리스트 데이터 갯수 알아내고
	int len = list.size();
	for(int i =0; i<len; i++) {
		Object o = list.get(i);
		String msg ="";
		
		if(o instanceof String) {
			String name = (String)o;
			msg="이름 :"+ name+",";
		}else if(o instanceof Integer) {
			int age =(int)o;
			age= age+1;
			msg="나이 :"+age+"세,";
		}else if(o instanceof Character) {
			char gen = (char)o;
			String sgen=(gen=='M')? "남자" : "여자";
			msg = "성별 :"+sgen +",";
		}else if(o instanceof Double) {
			double height =(double)o;
			height =height+2;
			msg= "신장 :"+height+"cm";
		}System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		new Test06();

	}

}
