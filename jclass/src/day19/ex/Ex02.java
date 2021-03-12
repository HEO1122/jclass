package day19.ex;


import java.util.*;

/*
 * 문제2) 
 *  Ex01에서 만든 Vector를 이용해서 
 *  ArrayList를 만들고
 *  데이터를 하나씩 꺼내서 출력하세요.
 */
public class Ex02 {

	public Ex02() {
		Ex01 v = new Ex01();
		Vector vec = v.vec;
		ArrayList list =new ArrayList(vec);
		
		System.out.print(list);
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
