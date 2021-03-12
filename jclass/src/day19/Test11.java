package day19;

import java.util.*;
import java.lang.Math.*;
public class Test11 {
/*
 * ArrayList�� 10���� Semo�� ������ �غ��� ���̷� ä������
 * �׸��� �������� �����ؼ� ����غ���.
 * �׸��� ��������
 */
	public Test11() {
		ArrayList list = new ArrayList();
		
		//list �� �����ϰ� ������ ����ä���
		for(int i =0; i<10;i++) {
			list.add(new Semo(getSize(),getSize()));
		}
		//�������
		for(Object o : list) {
//			Semo s =(Semo)o;
//			s.toPrint();
			System.out.println(o);
		}
		
		//��������
		Collections.sort(list, new MySort());
		for(Object o : list) {
			Semo s =(Semo)o;
			s.toPrint();}
		
	}
	//���� 1~20������ ���ڹ�ȯ�Լ�
	public int getSize() {
		return (int)(random()*20+1);
	}

	//�������� ����
	public class MySort implements Comparator{
		public int compare(Object o1,Object 02) {
			//�� �� �ԷµǴ� Object o1,o2�� ���� Ÿ���� ����Ÿ���̴�.
			//���󼭼���Ÿ������ ���� ����ȯ ���ش�.
			Semo s1 =(Semo) o1;
			Semo s2 =(Semo) o1;
			
			double area1= s1.getArea();
			double area2= s2.getArea();
			
			//�׷��� �� ��� ���� �����Ͱ� �Ǽ� Ÿ������ ��ȯ���ִ� �� Ÿ������ ������ ��
			//���� �ٸ� �����Ͷ� ���� �����ͷ� ��މ� �� �ֵ�.
			//���� �𶧴� ������ 1,-1�� ��� ������ ��ȯ���ֵ��� �Ѵ�.
			int result = (area2 -area1<0)? -1 : (area2 -area1 ==0)>0 : 1;
			return 0;
		}
	}
	public static void main(String[] args) {
		new Test11();
	}

}
