package day19;

import java.util.*;
public class Test04 {

	public Test04() {
	Vector vec1 = new Vector();
	vec1.add("둘리");
	vec1.add("홍길동");
	vec1.add("고길동");
	vec1.add("희동이");
	vec1.add("도우너");
	
	Vector vec2 = new Vector(vec1);
	for(int i = 0; i< vec2.size(); i++) {
		System.out.println(vec2.get(i)+"|");
	}
	System.out.println();
	//다시 vec1데이터 추가 5번째 부터
	vec2.addAll(4,vec1); //5번째 부터 데이터 추가. 5번째에 있던 데이터는 나중으로 이동..
	
	for(int i = 0; i< vec2.size(); i++) {
		System.out.println(vec2.get(i)+"|");
	}
	System.out.println();
	System.out.println(vec2);
	}
	

	public static void main(String[] args) {
new Test04();

	}

}
