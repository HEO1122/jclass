package day19.ex;


import java.util.*;

/*
 * ����2) 
 *  Ex01���� ���� Vector�� �̿��ؼ� 
 *  ArrayList�� �����
 *  �����͸� �ϳ��� ������ ����ϼ���.
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
